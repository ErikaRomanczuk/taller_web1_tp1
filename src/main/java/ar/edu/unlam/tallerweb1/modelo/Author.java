package ar.edu.unlam.tallerweb1.modelo;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

// import antlr.collections.List;
@Entity
public class Author {

	@Id
	private long idAuthor;
	
	@OneToMany(mappedBy="author", cascade=CascadeType.ALL)
	private List <Book> myBooks = new ArrayList<Book>();
	

	private String name;
	private String nationality;
	
	public List<Book> getMyBooks() {
		return myBooks;
	}
	public void setMyBooks(List<Book> myBooks) {
		this.myBooks = myBooks;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	

	

	
}
