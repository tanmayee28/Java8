package streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Barcs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ");
		int no=sc.nextInt();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String []s=str.split(" ");
		
		if(no==(s.length))
		{
		int j=0;
			while(no>j)
			{
				for(int i1=1;i1<=Integer.parseInt(s[j]);i1++)
				{
					if(i1%3==0 && i1%5==0)
					{
						System.out.println("fizzbuzz");
					}else if(i1%5==0)
					{
						System.out.println("buzz");
					}else if(i1%3==0 )
					{
						System.out.println("fizz");
					}else {
						System.out.println(i1);
					}
				}
				j++;
				}
			}
	}
		
		
		

	}

