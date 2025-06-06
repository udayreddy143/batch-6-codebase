package org.jaswincodecraft.model;

public class Department {
	
      private int deptId; 
	
	  private String deptName;
	  
	  private String empName;

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

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Department {"+
				"deptId=" + deptId + '\'' +
				", deptName=" + deptName + '\'' +
				", empName=" + empName + '}';
	}
	  
	  
	  
	  
	
	
	

}
