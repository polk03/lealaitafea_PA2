package lealaitafea_p1;

import java.util.Scanner;

public class Decrypter  {
	public static void decrypt() {
		// TODO Auto-generated method stub
		{
			 int first,second,third,fourth,encryption;
			 int number,n;
					 		 
			 Scanner input = new Scanner( System.in );
			 System.out.print("Enter Number:");
			 number = input.nextInt();
			 n = number;
			 first=(n/1000+3)%10;		
			 n=n%1000;
			 second=(n/100+3)%10;		//replaced w/ 3 instead of 7 to reverse encrytion
			 n=n%100;
			 third=(n/10+3)%10;		   
			 n=n%10;
			 fourth=(n+3)%10;
			 
			 encryption = first;
		     first = third;
		     third = encryption;
		 
		     encryption = second;
		     second = fourth;
		     fourth = encryption;
			 System.out.printf("The decrypted number is:%d%d%d%d\n",first, second, third, fourth);
			 input.close();
		 }
	}		
	}
