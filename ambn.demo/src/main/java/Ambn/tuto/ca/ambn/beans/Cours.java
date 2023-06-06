package Ambn.tuto.ca.ambn.beans;
import javax.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
// Annotation to create table in db a boot
@Entity
@Table(name="Cours")
public class Cours {
	@Id
	private String id;
	public Cours() {
		super();
	}
	public Cours(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
