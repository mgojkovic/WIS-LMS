package wis.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Where;

@Entity
@Where(clause = "deleted = 'false'")
public class StudyField {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	@ManyToOne(fetch = FetchType.LAZY)
	private Title title;
	


	@Size(max = 50)
	private String name;

	////
	@NotNull
	private Boolean deleted = false;

	@Version
	private int version = 0;
	////

	public StudyField(Long id, Title title, @Size(max = 50) String name) {
		super();
		this.id = id;
	//	this.title = title;
		this.name = name;
	}
	
	public StudyField() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

/*	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}
*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
