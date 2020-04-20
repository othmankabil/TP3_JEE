package EmsiMarrif.G3.hospitalapp.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity 
 
@ToString
public class patient 
{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private String name;	
	@Temporal(TemporalType.DATE)
	private java.util.Date dateNaissance;
	private boolean malade;
	public Long getId() {
		return id;
	}
	public patient() {
		super();
	}
	public void setId(Long id) {
		this.id = id;
	}
	public patient(String name, java.util.Date dateNaissance, boolean malade, int score) {
		super();
		this.name = name;
		this.dateNaissance = dateNaissance;
		this.malade = malade;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public java.util.Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(java.util.Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public boolean isMalade() {
		return malade;
	}
	public void setMalade(boolean malade) {
		this.malade = malade;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	private int score;
}
