package com.service;

import com.dao.EmployeeDao;

public class EmployeeService {
	public void insertData() throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.insetData();
	}
	public void updateData() throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.updateData();
	}
	public void DeleteData() throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.deleteData();
	}
	public void getAllRecords() throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.getAllRecords();
	}
}
