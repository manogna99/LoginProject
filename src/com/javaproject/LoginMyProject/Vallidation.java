package com.javaproject.LoginMyProject;

public class Vallidation {
	
	public Boolean  verification(String us, String pas){
		
		DateBase db= new DateBase();
		//db.getingUserPassword(us);
		if(pas.equals(db.getingUserPassword(us))){
			//System.out.println("the entered password and user name are correct");
			return true;
		}
		else
			//System.out.println("the entered password and user name are wrong");
			return false;
		
		
	}

}
