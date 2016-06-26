package com.worklog.entity;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;

@Entity
public class ProjectItem {

	@Id
	public String projectCode;
	@Id
	public String itemCode;
	public String itemTitle;
	public String itemStatus;
	public String itemType;
	public String itemOwner;
}
