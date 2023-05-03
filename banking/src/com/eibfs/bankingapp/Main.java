package com.eibfs.bankingapp;

import java.time.LocalDate;

import com.eibfs.bankingapp.dto.Account;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for(int number=1; 
			//	number<=10;
        //        number++) {
			// System.out.println(number); 
		//}
		
		
       // addition of 2 numbers. 
		//int a = 11;
		// 11 is even or odd 
		
	//	int c = a % b; 
		// System.out.println(c); 
		
      Account account = new Account();
     // Account account2 = new Account(); 
      
    //  System.out.println(account);
      //System.out.println(account.toString());
      
      // when you will print the ref. then
      // it will call toString method implicitly. 
      account.setAccountNumber("AD001");
      account.setAccountHolderName("abhi");
      account.setAccountType("saving");
      account.setAddress("pune");
      account.setBalance(400);
      account.setContactNumber("9975477764");
//      account.setAccountCreated(LocalDate.now());
      account.setActive(true);
      System.out.println(account);
      System.out.println(account.toString());

	}

}
