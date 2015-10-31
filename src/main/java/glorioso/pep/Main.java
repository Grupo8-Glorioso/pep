package glorioso.pep;

import java.util.ArrayList;
import java.util.List;

//import glorioso.pep.model.dao.PatientDAO;
//import glorioso.pep.model.entity.Contact;
import glorioso.pep.model.entity.Patient;

public class Main {
	
	public static void main(String[] args) {
		
		Patient paciente = new Patient();
		paciente.setIdPatientOrg((long)218);
		paciente.setName("João da Silva");
		paciente.setMotherName("Maria da Silva");
		paciente.setCPF("123456789");
		paciente.setGender("M");
		
		//Contact contato1 = new Contact();
		//List<Contact> listaContatos = new ArrayList<Contact>();
		/*
		contato1.setType("email");
		contato1.setInfo("josesilva@mail.com");
		listaContatos.add(contato1);
		
		Contact contato2 = new Contact();
		contato2.setType("celular");
		contato2.setInfo("999999999");
		listaContatos.add(contato2);
		
		paciente.setContactList(listaContatos);*/
		
		//PatientDAO pacienteDAO = new PatientDAO(HibernateUtil.openSession());
		
		//if(pacienteDAO.registerPatient(paciente))
		//	System.out.println("deu bom");
		//else
		//	System.out.println("deu ruim");
	}
}
