package lealaitafea_p1;

import java.util.Scanner;

public class Encrypter{
	public static void encrypt() {
		// TODO Auto-generated method stub
		{
			 int first,second,third,fourth,encryption;
			 int number,n;
					 		 
			 Scanner input = new Scanner( System.in );
			 System.out.print("Enter Number:");
			 number = input.nextInt(); //number = the integer string inputted by user
			 n = number;
			 first=(n/1000+7)%10;	   //(number divided by digit place  + 7) divided by 10
			 n=n%1000;
			 second=(n/100+7)%10;		
			 n=n%100;
			 third=(n/10+7)%10;		   
			 n=n%10;
			 fourth=(n+7)%10;
			 
			 encryption = first;		//swapping first digit w/ third
		     first = third;
		     third = encryption;
		 
		     encryption = second;		//swapping second digit w/ fourth
		     second = fourth;
		     fourth = encryption;
			 System.out.printf("The encrypted number is:%d%d%d%d\n",first, second, third, fourth);
			 input.close();
		 }
	}		
	}

