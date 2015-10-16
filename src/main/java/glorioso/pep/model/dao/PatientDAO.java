package glorioso.pep.model.dao;

import java.util.List;

import org.hibernate.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import glorioso.pep.model.entity.Contact;
import glorioso.pep.model.entity.Patient;

public class PatientDAO {
	private Session session;
	
	public PatientDAO(Session session) {
		this.session = session;
	}
	
	public boolean registerPatient(Patient patient) {
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(patient);
			
			List<Contact> list = patient.getContactList();
			for (int i=0; i<list.size(); ++i) {
				session.save(list.get(i));
			}
			transaction.commit();
			return true;
		}
		catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
		}
	}
}
