package com.basics.context;

public class Doctor {

	private String qualification;

	private String specialization;

	public Doctor(String specialization) {
		this.specialization = specialization;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	private Nurse nurse;

	public Nurse getNurse() {
		return nurse;
	}

	public void setNurse(Nurse nurse) {
		this.nurse = nurse;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public void assist() {
		System.out.println("Doctor is assisting");
	}

}
