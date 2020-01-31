package lealaitafea_p1;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args)
	 {
		 Encrypter.encrypt(); //calls Encrypter class, will encrypt a string first
		 Decrypter.decrypt(); //calls Decrypter class, will decrypt a string once one was encrypted
		 Scanner input = new Scanner( System.in ); //gets 4 digit string from user
		 System.out.print("Enter Number:");
		
		 input.close();
	 }
}

