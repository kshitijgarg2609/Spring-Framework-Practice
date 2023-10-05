package com.kgprojects.driver;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kgprojects.console.ConsoleHandler;
import com.kgprojects.javaconfig.JavaConfig;

public class OrmDriverCode
{
	private static Thread loop = new Thread()
	{
		public void run()
		{
			ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
			System.out.println("START");
			Scanner sc = context.getBean("scanner",Scanner.class);
			ConsoleHandler ch = context.getBean(ConsoleHandler.class);
			ch.printLine();
			inf:
			while(true)
			{
				ch.printLine();
				System.out.println("Enter a Choice");
				ch.printLine();
				printOptions();
				ch.printLine();
				String query=sc.next();
				char c = (query.length()==0)?'0':query.charAt(0);
				switch(c)
				{
				case '1':
				{
					ch.insert();
					break;
				}
				case '2':
				{
					ch.updateStr();
					break;
				}
				case '3':
				{
					ch.updateValue();
					break;
				}
				case '4':
				{
					ch.deleteRow();
					break;
				}
				case '5':
				{
					ch.printRow();
					break;
				}
				case '6':
				{
					ch.printRows();
					break;
				}
				case '7':
				{
					ch.printLine();
					System.out.println("EXIT ...");
					break inf;
				}
				default:
				{
					System.out.println("INVALID CHOICE");
				}
				}
				
			}
		}
	};
	public static void main(String[] args)
	{
		loop.start();
	}
	public static void printOptions()
	{
		System.out.println("Enter 1 to insert a row");
		System.out.println("Enter 2 to update str");
		System.out.println("Enter 3 to update value");
		System.out.println("Enter 4 to delete a row");
		System.out.println("Enter 5 to print a row");
		System.out.println("Enter 6 to print all rows");
		System.out.println("Enter 7 to exit the program");
	}
}
