package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Main2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("=== TEST 1: Department findById ===");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		System.out.println("\n=== TEST 2: Department findAll ===");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}

	}

}
