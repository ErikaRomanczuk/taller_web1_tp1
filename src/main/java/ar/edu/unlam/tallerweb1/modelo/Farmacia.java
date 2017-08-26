package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Farmacia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private String telefono;
	private String diaDeTurno;
	
	@OneToMany(mappedBy="farmacia", cascade=CascadeType.ALL)
	private Punto punto;
	
	@OneToMany(mappedBy="farmacia", cascade=CascadeType.ALL)
	private Direccion direccion;
	
	// EMPTY CONSTRUCT
	public Farmacia(){}

	
	// 	GETTERS AND SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDiaDeTurno() {
		return diaDeTurno;
	}

	public void setDiaDeTurno(String diaDeTurno) {
		this.diaDeTurno = diaDeTurno;
	}
	

	// Relation Punto??
	public Punto getGeoLocalizacion(){
		return this.punto;
	}
	public void setGeoLocalizacion(Punto punto){
		this.punto = punto;
	}
	
	// Relation Direccion??
	public Direccion getDireccion(){
		return this.direccion;
	}
	
	public void setDireccion(Direccion direccion){
		this.direccion = direccion;
	}
	
	
}
