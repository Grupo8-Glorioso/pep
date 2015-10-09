package controller;

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
	
	public void receivesMsg(){
		System.out.println("Mensagem recebida: " + msg);
	}
}
