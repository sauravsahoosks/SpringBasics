package com.basics.context;

public class Doctor {

	private String qualification;

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
