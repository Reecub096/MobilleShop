package com.cg.mobshop.ui;

import java.util.Scanner;

import com.cg.mobshop.dto.PurchaseDetails;
import com.cg.mobshop.exception.PurchaseException;
import com.cg.mobshop.service.PurchaseService;
import com.cg.mobshop.service.PurchaseServiceImpl;

public class Main {

		public static void main(String[] args) throws PurchaseException {
			// TODO Auto-generated method stub
			PurchaseService service = new PurchaseServiceImpl(); 
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
		
			int ch=0;
			do{
				System.out.println("Enter choice:\n1.Add customer\n2.Exit");
				ch = sc.nextInt();
				switch(ch){
		
				case 1:
			
					System.out.println("Enter Customer Name : ");
					String name = sc.next();
					System.out.println("Enter Phone no : ");
					String phone = sc.next();
					System.out.println("Enter Mail id : ");
					String mail = sc.next();
					System.out.println("Enter mobile id : ");
					int mid = sc.nextInt();
		
					PurchaseDetails pi = new PurchaseDetails();
					pi.setCustName(name);
					pi.setMailId(mail);
					pi.setMobileId(mid);
					pi.setPhoneNo(phone);
					int pd = service.addPurchaseDetails(pi);
					System.out.println("Record added ... " + pd);
					break;
				}
		}while(ch != 2);
	}

}
