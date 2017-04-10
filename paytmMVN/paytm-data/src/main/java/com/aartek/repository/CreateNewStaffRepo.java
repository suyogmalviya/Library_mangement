package com.aartek.repository;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.Createnewstaff;

@Repository
public class CreateNewStaffRepo {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public Createnewstaff SaveNewStaff(Createnewstaff createnewstaff1) {

		System.out.println(" inside create new staff repo");
		if (createnewstaff1 != null) {
			hibernateTemplate.save(createnewstaff1);
			System.out.println("data save inside data base new staff table");
			return createnewstaff1;
		} else {
			return null;
		}

	}

	public List<Object> Showstaffdetail(Createnewstaff Showstaff) {

		List<Object> l1 = hibernateTemplate.find("from Createnewstaff");
		return l1;

	}

	public void deletestaffbyID(Integer employee_id) {
		System.out.println("inside repo delete method");
		System.out.println(employee_id);

		hibernateTemplate.bulkUpdate("DELETE Createnewstaff where employee_id=?", employee_id);

	}

	/*
	 * HibernateTemplate.delete takes the object you want to delete as an
	 * argument (you pass a query).
	 * 
	 * Either change hibernateTemplate.delete("from User1 where USER_ID=:"
	 * +id1); to: hibernateTemplate.delete(hibernateTemplate.get(User1.class,
	 * id1));, or change it to:
	 * 
	 * hibernateTemplate.bulkUpdate("DELETE User1 where id=?", id1);
	 * 
	 */

	/*
	 * public List<Country> getAllCountries() { Session session =
	 * this.sessionFactory.getCurrentSession(); List<Country> countryList =
	 * session.createQuery("from Country").list(); return countryList; }
	 */
	// ************************************not used*****************
	public List<Createnewstaff> getallemployee() {

		Session session = this.sessionFactory.getCurrentSession();
		List<Createnewstaff> employeelist = session.createQuery("from Createnewstaff").list();

		return employeelist;
	}

	/*
	 * public Country getCountry(int id) { Session session =
	 * this.sessionFactory.getCurrentSession(); Country country = (Country)
	 * session.get(Country.class, new Integer(id)); return country; }
	 */

	public Createnewstaff getEmployee_id(int id) {

		Session session = this.sessionFactory.getCurrentSession();
		Createnewstaff createnewstaff = (Createnewstaff) session.get(Createnewstaff.class, new Integer(id));
		return createnewstaff;
	}

	public void updatestaff(Createnewstaff createnewstaff) {

		Session session = this.sessionFactory.getCurrentSession();
		session.update(createnewstaff);
	}

	/*
	 * public void updateCountry(Country country) { Session session =
	 * this.sessionFactory.getCurrentSession(); session.update(country); }
	 */

	/// *****/**************************not used ***************

	/// ****

	/*
	 * @Override public Employee getRowById(int id) { Session session =
	 * sessionFactory.openSession(); Employee employee = (Employee)
	 * session.load(Employee.class, id); return employee; }
	 */

	public Createnewstaff getRowById(int id) {

		System.out.println("inside edit method repo");
		Session session = sessionFactory.openSession();
		Createnewstaff createnewstaff = (Createnewstaff) session.load(Createnewstaff.class, id);
		return createnewstaff;
	}

	// ************update ********************

	/*
	 * @Override public int updateRow(Employee employee) { Session session =
	 * sessionFactory.openSession(); Transaction tx =
	 * session.beginTransaction(); session.saveOrUpdate(employee); tx.commit();
	 * Serializable id = session.getIdentifier(employee); session.close();
	 * return (Integer) id; }
	 */

	public int updatestaffrow(Createnewstaff createnewstaff) {

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.saveOrUpdate(createnewstaff);
		tx.commit();
		Serializable id = session.getIdentifier(createnewstaff);
		session.close();
		return (Integer) id;
	}

}
