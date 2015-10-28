package controller;

//import glorioso.pep.model.entity.Patient;

public class TesteBean {

	private String text = "Ola JSF";
	private String msg;
	
	public String getText(){
		return text;
	}

	public String getMsg(){
		return msg;
	}
	
	public void setMsg(String str){
		msg = str;
	}
	
	public String recebeMsg(){
		System.out.println("Mensagem recebida: " + msg);
		return "confirmation";
	}
	
	public String getName() {
		return "";
		//return Patient.patient.getName();
	}
	public void setName(String name) {
		//Patient.patient.setName(name);
	}
	public String getMotherName() {
		return "";
		//return Patient.patient.getMotherName();
	}
	public void setMotherName(String motherName) {
		//Patient.patient.setMotherName(motherName);
	}
	public String getCPF() {
		return "";	
		//return Patient.patient.getCPF();
	}
	
		
	public void setCPF(String cpf) {
		//Patient.patient.setCPF(cpf);
	}
	
	
	//	receiveData 
	
	
}


