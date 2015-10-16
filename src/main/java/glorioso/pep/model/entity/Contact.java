package glorioso.pep.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Contact {
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<String> getTypes() {
	    List<String> tipVal = new ArrayList<String>();
	    tipVal.add(new String("Email"));
	    tipVal.add(new String("Endereço"));
	    tipVal.add(new String("Telefone Residencial"));
	    tipVal.add(new String("Telefone Comercial"));
	    tipVal.add(new String("Celular"));
	    return tipVal;
	}
	
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	private String type;
	private String info;
}
