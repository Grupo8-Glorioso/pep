

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName="contacts")
public class Contact implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;

	public Contact() {};
	
	@DatabaseField(generatedId=true)
	private int id;
	
	@DatabaseField
	private String type;
	
	@DatabaseField
	private String info;
	
	@DatabaseField(canBeNull=true, foreign=true)
	private Patient p;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

}
