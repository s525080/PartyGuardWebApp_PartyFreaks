package com.nwmsu.srichaitanya.messenger.model;

import java.util.Date;

public class Profile {
	
	private long id;
	private String profileName;
	private String lastName;
	private Date created;
	
	public Profile(){
		
	}

	public Profile(long id, String profileName, String lastName) {
		super();
		this.id = id;
		this.profileName = profileName;
		this.lastName = lastName;
	}
	
	

}
