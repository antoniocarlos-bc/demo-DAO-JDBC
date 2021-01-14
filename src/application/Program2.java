package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		/*
		System.out.println("=== Test 1: department findById ===");
		Department department = departmentDao.findById(3);
		
		System.out.println(department);
		
		System.out.println("\n=== Test 3: department findAll ===");
		List<Department> list = new ArrayList<>();
		
		list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		/*
		System.out.println("\n=== Test 4: department insert ===");
		Department newDepartment = new Department(null, "GAMES");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted new id = " + newDepartment.getId());

		System.out.println("\n=== Test 5: ArrayListeller upDate ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Weine");
		sellerDao.update(seller);
		System.out.println("Update completed");
		*/
		System.out.println("\n=== Test 6: department deleteById ===");
		System.out.println("Enter id for delete test.");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
		
        
		

	}}


