package ar.edu.unlam.tallerweb1.modelo;                             
                                                                    
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;                                      
                                                                    
@Entity                                                             
public class Punto {                                                
                                                                    
	@Id                         
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;                                                
	                                                                
	private String latitud;                                         
	private String longitud;                                        
	       
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id")
	private Farmacia farmacia;
	
	// EMPTY CONSTRUCT                                              
	public Punto(){}
	
	// GETTERS AND SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}                                                
	                                                                
	                                                                
	                                                                
}                                                                   
                                                                    