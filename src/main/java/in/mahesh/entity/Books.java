package in.mahesh.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bId;
	private String bName;
	private String bAuthor;
	private LocalDate publishedate;
	
	
	
	
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Books(String bName, String bAuthor, LocalDate publishedate) {
		super();
		this.bName = bName;
		this.bAuthor = bAuthor;
		this.publishedate = publishedate;
	}


	public Integer getbId() {
		return bId;
	}


	public void setbId(Integer bId) {
		this.bId = bId;
	}


	public String getbName() {
		return bName;
	}


	public void setbName(String bName) {
		this.bName = bName;
	}


	public String getbAuthor() {
		return bAuthor;
	}


	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}


	public LocalDate getPublishedate() {
		return publishedate;
	}


	public void setPublishedate(LocalDate publishedate) {
		this.publishedate = publishedate;
	}


	@Override
	public String toString() {
		return "Books [bId=" + bId + ", bName=" + bName + ", bAuthor=" + bAuthor + ", publishedate=" + publishedate
				+ "]";
	}
	
	
	
	

}
