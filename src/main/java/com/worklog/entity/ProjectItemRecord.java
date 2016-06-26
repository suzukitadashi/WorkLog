package com.worklog.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;

@Entity
public class ProjectItemRecord {

	@Id
	public String projectCode;
	@Id
	public String itemCode;
	
	public LocalDate workDate;
	
	public String userId;
	
	public BigDecimal workTime;
}
