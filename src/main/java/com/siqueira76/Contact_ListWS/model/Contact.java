package com.siqueira76.Contact_ListWS.model;

import javax.persistence.Embeddable;

@Embeddable
public class Contact {
		
	private String contactName;
	private String eMail;
	private String phone;
	
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	

}
