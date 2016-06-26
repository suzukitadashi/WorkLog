package com.worklog.entity;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;

@Entity
public class Project {

	@Id
    public String projectCode;
    public String projectTitle;
}
