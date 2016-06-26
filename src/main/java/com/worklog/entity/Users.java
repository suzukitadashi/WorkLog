package com.worklog.entity;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;

@Entity
public class Users {

	@Id
	public String userId;
	public String encodedPassword;
	public String userName;
	
}
