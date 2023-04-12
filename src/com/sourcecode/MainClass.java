package com.sourcecode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
	public static void mainMenu()
    {
        System.out.println(" ****** Welcome to weekend fitness club ***********");
        System.out.println("-----------------------------------------------------");
        System.out.println(" 1.Book a group fitness lesson ");
        System.out.println("-----------------------------------------------------");
        System.out.println(" 2.Change or cancel a booking  ");
        System.out.println("-----------------------------------------------------");
        System.out.println(" 3.Attending a lesson ");
        System.out.println("-----------------------------------------------------");
        System.out.println(" 4.Monthly lesson Report");
        System.out.println("-----------------------------------------------------");
        System.out.println(" 5.Monthly champions fitness type report ");
        System.out.println("-----------------------------------------------------");
        System.out.println(" 6.User Rating ");
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------"); 
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        UserService service = new UserService();
        service.demoUsers();
        Scanner sc=new Scanner(System.in);
        boolean valid=true;
        boolean inner=true;
        
        do
        {
        	inner=true;
        	mainMenu();
            System.out.println("  Choose your option ---------------::> ");
            System.out.println(" (USER INPUT (1 or 2 or 3 or 4 or 5 or 6)");
            try {
            int option=sc.nextInt();
            
            while(inner)
            {
                if(option==1)
                 {
                       System.out.println("--Start booking a fitness lesson --");
                       service.bookLesson();
                       inner=false;
                  }
                else if(option==2)
                {
                	System.out.println(" ^Modifing User Data ^");
                    System.out.println(" 1.change booking");
                    System.out.println(" 2.delete a booking");
                    boolean value=true;
                    while(value)
                    {
                    String a=sc.nextLine();
                    if(a.equalsIgnoreCase("1"))
                    {
                    	service.modifyBooking();
                    	value=false;
                    }
                    else if(a.equalsIgnoreCase("2"))
                    {
                    	service.deleteBooking();
                    	value=false;
                    }
                    else
                    {
                    	System.out.println("[USER INPUT (1 or 2)]");
                    	value=true;
                    }
                    inner=false;
                }
                }
                else if(option==3)
                {
                    System.out.println("Attended a class");
                    service.status_Of_Class();
                    inner=false;
                }
                else if(option==4)
                {
                    System.out.println("monthly lesson report");
                    System.out.println("which month report you need :");
                    System.out.println("[USER INPUT (month number ex-1 jan, 2 feb etc..)]");
                    int month=sc.nextInt();
                    service.monthly_Reports(month);
                    inner=false;
                }
                else if(option==5)
                {
                    System.out.println("monthly champion fitness type report");
                    System.out.println("which month report you need :");
                    System.out.println("[USER INPUT (month number ex-1 jan, 2 feb etc..)]");
                    int month=sc.nextInt();
                    service.monthly_Champion_Report(month);
                    inner=false;
                }
                else if(option==6)
                {
                	System.out.println("Giving rating");
                	service.userRating();
                    inner=false;
                }
                else 
                {
                	System.out.println("Invalid date ");
                	System.out.println("bye bye ...");
                	System.out.println("You want to use :run again");
            		System.exit(0);
                }
            }
            }
            catch(InputMismatchException ex)
            {
            	System.out.println("Invalid option ");
            	System.out.println("bye bye ...");
            	System.out.println("You want to use :run again");
            	valid=false;
            }
           
        } while(valid);
        sc.close();

    }

}
