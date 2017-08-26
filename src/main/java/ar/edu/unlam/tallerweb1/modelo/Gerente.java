package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Gerente {
    
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    private String nombre;
    
    @OneToOne
    private Departamento departamento;
    
    public void setNombre(String nombre){
    	this.nombre = nombre;
    }
    
    public String getNombre(){
    	return this.nombre;
    }
    
    public void setDepartamento(Departamento depto){
    	this.departamento = depto;
    }
    
    public Departamento getDepartamento(){
    	return this.departamento;
    }
    
}
