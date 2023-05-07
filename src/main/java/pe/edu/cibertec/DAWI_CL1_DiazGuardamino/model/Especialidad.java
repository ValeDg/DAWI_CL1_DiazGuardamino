package pe.edu.cibertec.DAWI_CL1_DiazGuardamino.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

public class Especialidad {
	@Data
	@Entity
	@Table(name="especialida")
	public class especialidad {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer idEsp;
		@Column(name="nomEsp")
		private String nomEsp;
		@Column(name="costo")
		private String costo;
	}

}
