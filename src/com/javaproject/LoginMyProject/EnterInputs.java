package com.javaproject.LoginMyProject;

import java.util.Scanner;

public class EnterInputs {
	
	public static void main(String[] args) {
		
		String username;
		String password;
		boolean b;
		try{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the user name");
		username=scan.next();
		System.out.println("enter the password");
		password=scan.next();
		Vallidation va=new Vallidation();
		b=va.verification(username, password);
		if(b==true){
			System.out.println("the entered username and password are correct");
			}
			else
				System.out.println("the entered username and password are wrong");
		}catch(Exception e){

		System.out.println("the error is occured");
	}
	}}



