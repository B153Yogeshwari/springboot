package com.webapp.main.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	private int deptId;
	private String deptName;
	private String deptHead;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Student1> stu=new HashSet<>();
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptHead() {
		return deptHead;
	}
	public void setDeptHead(String deptHead) {
		this.deptHead = deptHead;
	}
	public Set<Student1> getStu() {
		return stu;
	}
	public void setStu(Set<Student1> stu) {
		this.stu = stu;
	}

}
