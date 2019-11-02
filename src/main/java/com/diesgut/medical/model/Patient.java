package com.diesgut.medical.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "dni")
	private String dni;

	@Column(name = "number_clinical_history")
	private String numberClinicalHistory;

	@OneToMany(mappedBy = "patient")
	private List<MedicalConsultation> medicalsConsultations;

	public Patient() {
	}

	public Patient(Long idPatient) {
		this.id = idPatient;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNumberClinicalHistory() {
		return numberClinicalHistory;
	}

	public void setNumberClinicalHistory(String numberClinicalHistory) {
		this.numberClinicalHistory = numberClinicalHistory;
	}

	public List<MedicalConsultation> getMedicalsConsultations() {
		return medicalsConsultations;
	}

	public void setMedicalsConsultations(List<MedicalConsultation> medicalsConsultations) {
		this.medicalsConsultations = medicalsConsultations;
	}

}
