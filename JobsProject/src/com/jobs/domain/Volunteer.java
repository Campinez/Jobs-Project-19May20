package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	protected String description;

	public Volunteer(String name, String address, String phone) throws Exception {
		super(name, address, phone);
	}
	public  String toString() {
		return "El voluntario "+name+", que reside en "+address+" y su tel�fono es "+phone+". Descripci�n: "+description+". \n";
		
	}
	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}
}
