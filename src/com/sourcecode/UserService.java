package com.sourcecode;
 

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class UserService {
	HashSet<UserData> user=new HashSet<UserData>();
	Random rand=new Random();
	Scanner sc=new Scanner(System.in);	
	
	LocalDate dateObj = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String date_Format=dateObj.format(formatter);
	
	String name;
	String day;
	String date;
	String lesson;
	int age;
	String email;
	int id=rand.nextInt(5000000);
	int ref=0;
	int rating;
	String status;
	
	public void demoUsers()
	{
		  UserData user_1=new UserData("siva reddy","saturday","04:02:2023","bodysclupt",22,"siva@gmail.com",id,3,"Attended");
		  UserData user_2=new UserData("prudhvi","Sunday","05:02:2023","Spin",22,"prudhvi@.com",id+1,5,"Attended");
		  UserData user_3=new UserData("Akhila","saturday","11:02:2023","Yoga",22,"vamc@gmail.com",id+2,2,"Attended");
		  UserData user_4=new UserData("teja","Sunday","12:02:2023","Zumba",22,"teja@gmail.com",id+3,3,"Attended");
		  UserData user_5=new UserData("vamsi","saturday","18:02:2023","Spin",22,"vamc@gmail.com",id+4,2,"Attended");
		  UserData user_6=new UserData("revi","sunday","19:02:2023","Bodysclupt",22,"vamc@gmail.com",id+5,3,"Attended"); 
		  UserData user_7=new UserData("kavya","Saturday","25:02:2023","Zumba",22,"vamc@gmail.com",id+6,5,"Attended"); 
		  UserData user_8=new UserData("sravya","Sunday","26:02:2023","Box fit",22,"vamc@gmail.com",id+7,3,"Attended");
		  UserData user_9=new UserData("revi","Saturday","04:03:2023","bodysclupt",22,"vamc@gmail.com",id+8,4,"Attended"); 
		  UserData user_10=new UserData("revi","sunday","05:03:2023","Yoga",22,"vamc@gmail.com",id+9,2,"Attended"); 
		  UserData user_13=new UserData("pavi","saturday","04:02:2023","bodysclupt",22,"vamc@gmail.com",id+11,3,"Attended");
		  UserData user_12=new UserData("thaliva","saturday","04:02:2023","bodysclupt",22,"vamc@gmail.com",id+12,5,"Attended");
		  UserData user_14=new UserData("rajini","saturday","04:02:2023","bodysclupt",22,"vamc@gmail.com",id+13,4,"Attended");
		  UserData user_15=new UserData("gajini","saturday","04:02:2023","bodysclupt",22,"vamc@gmail.com",id+14,3,"Attended");
		  UserData user_11=new UserData("balaya","Saturday","04:02:2023","box fit",22,"vamc@gmail.com",id+15,5,"Attended");
		  UserData user_16=new UserData("balu","Saturday","04:02:2023","box fit",22,"vamc@gmail.com",id+16,3,"Attended");
		  UserData user_17=new UserData("subbu","Saturday","04:02:2023","box fit",22,"vamc@gmail.com",id+17,2,"Attended");
		  UserData user_18=new UserData("srikanth","Saturday","04:02:2023","box fit",22,"vamc@gmail.com",id+10,4,"Attended");
		  UserData user_19=new UserData("ravi kanth","Saturday","04:02:2023","box fit",22,"vamc@gmail.com",id+18,3,"Attended");
		  UserData user_20=new UserData("singamalay","Sunday","20:03:2023","Bodysclupt",22,"lay@gmail.com",id+19,5,"Booked");
		  UserData user_21=new UserData("simhadhri","saturday","18:03:2023","spin",22,"lay@gmail.com",id+20,0,"booked");
		  UserData user_22=new UserData("siva","sunday","02:04:2023","Spin",22,"sivareddy78a@gmail.com",835029,0,"Attended");
		  
		  user.add(user_5);
		  user.add(user_4);
		  user.add(user_3);
		  user.add(user_2);
		  user.add(user_1); 
		  user.add(user_8);
		  user.add(user_7);
		  user.add(user_6);
		  user.add(user_9);
		  user.add(user_10);
		  user.add(user_11);
		  user.add(user_12);
		  user.add(user_13);
		  user.add(user_14);
		  user.add(user_15);
		  user.add(user_16);
		  user.add(user_17);
		  user.add(user_18);
		  user.add(user_19);
		  user.add(user_20);
		  user.add(user_21);
		  user.add(user_22);
	}
	public void display()
	{
		for(UserData user:user)
		  {
			  System.out.println(user);
		  }
	}
	public void bookLesson()
	{	
		
		/*
		 * Booking a lesson 
		 * 
		 * */
		//Taking your name as input 
		
		System.out.println();
		System.out.println("Your good name please ? : ");
		System.out.println("[USER INPUT (name)]");
		name=sc.next();
		
		//Checking the time table based on options 1 & 2.
		
		System.out.println();
		System.out.println("^Check the time table Before going to book a lesson ^");
		System.out.println("     1.Day wise timetable ");
		System.out.println("     2.Lesson wise timetable");
		boolean timeboolean=true;
		
		while(timeboolean)                          //Its keep on checking until the user input matches 1 and 2.
		{
		String timetable=sc.nextLine();
		if(timetable.equalsIgnoreCase("1"))
		{
			TimeTable day=new TimeTable();
			day.dayWiseTimeTable();                    //If 1 as input : timingsTime method invokes.
			timeboolean=false;
		}
		else if(timetable.equalsIgnoreCase("2"))
		{
			TimeTable day=new TimeTable();
			day.lessonWiseTimeTable();                   //If 2 as input : timingsLesson method invokes.
			timeboolean=false;
		}
		else
		{
			System.out.println("[USER INPUT 1 or 2]");  
			timeboolean=true;                        //else loop iterates until user input is valid.                   
		}
		}
		timeboolean=true;
		
		//based on time table you need to select the day.
		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------");
		System.out.println(" ^Which day you want to book the session ^");
		System.out.println("[USER INPUT (sunday or saturday)]");
		day=sc.nextLine();
		if(day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("Sunday"))
		{
			day=day+"";                                                //If day is saturday or sunday its fine.
		}
		else
		{                                                              //if wrong user input loop execute until valid user input.
			
			while(!day.equalsIgnoreCase("saturday") && !day.equalsIgnoreCase("sunday"))
			{
				System.out.println("[USER INPUT (sunday or saturday)]");
			    day=sc.nextLine();
			}
		}
		
		//checking the lesson types and price
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		System.out.print("press ENTER to list the lessons : ");
		lesson=sc.nextLine();
		if(lesson.equalsIgnoreCase("Spin") && lesson.equalsIgnoreCase("Yoga") && lesson.equalsIgnoreCase("Box fit") && lesson.equalsIgnoreCase("Zumba") && lesson.equalsIgnoreCase("bodysclupt"))
		{
			lesson=lesson+"";
		}
		else
		{
			boolean ifinner=true;
			System.out.println(" :please choose your lesson :");
			System.out.println();
			avgRating();
			while(ifinner)  
			{
			lesson=sc.nextLine();
			if(lesson.equalsIgnoreCase("spin") || lesson.equalsIgnoreCase("1"))
			{
				lesson="spin";
				System.out.println(lesson);
				ifinner=false;
			}
			else if(lesson.equalsIgnoreCase("yoga") || lesson.equalsIgnoreCase("2"))
			{
				lesson="yoga";
				System.out.println(lesson);
				ifinner=false;
			}
			else if(lesson.equalsIgnoreCase("Box fit") || lesson.equalsIgnoreCase("3"))
			{
				lesson="Box fit";
				System.out.println(lesson);
				ifinner=false;
			}
			else if(lesson.equalsIgnoreCase("Bodysclupt") || lesson.equalsIgnoreCase("4"))
			{
				lesson="Bodysclupt";
				System.out.println(lesson);
				ifinner=false;
			}
			else if(lesson.equalsIgnoreCase("Zumba") || lesson.equalsIgnoreCase("5"))
			{
				lesson="Zumba";
				System.out.println(lesson);
				ifinner=false;
			}
			else
			{
				System.out.println("please select a valid option ");
				ifinner=true;
			}
			}
		}
		//Enter valid Date based on the day and lesson
		System.out.println();
		System.out.println("please enter Date (DD:MM:YYYY)");
		TimeTable t=new TimeTable();
		t.daySelection(lesson);
		date=t.date_for_user_service_class;
		int classcount=1;
		for(UserData user :user)
		{
			if(user.getDate().equals(date) && user.getLesson().equals(lesson))
			{
				classcount++;
			}
		}
		if(classcount<=5)
		{
			System.out.println();
			System.out.println("Your age please ? : ");
			System.out.println("[USER INPUT (Age)]");
			age=sc.nextInt();
			System.out.println();
			//Enter your email 
			System.out.println("Your email please ? : ");
			System.out.println("[USER INPUT (email)]");
			email=sc.next();
			ref=rand.nextInt(id);
			status="Booked";
			UserData newuser=new UserData(name,day,date,lesson,age,email,ref,rating,status);
			user.add(newuser);
			
			//Booking details of the user
			System.out.println("__________________________________");
			System.out.println("|******BOOKING DETAILS********   |");
			System.out.println("__________________________________");
			System.out.println();
			System.out.println("     name      :"+name);
			System.out.println("     day       :"+day+" & "+date);
			System.out.println("     lesson    :"+lesson);
			System.out.println("     age       :"+age);
			System.out.println("     email     :"+email);
			Prices price = new Prices();
			System.out.println("    Total cost :£"+price.amounts(lesson)); 
			System.out.println("");
			System.out.println("----------------------------------------------");
			System.out.println("|    *** STATUS     : "+status+" : ***                |");
			System.out.println("|    *** REF NUMBER : "+ref+" : ***                |");
			System.out.println("----------------------------------------------");
			System.out.println("       ||||||||||||||||||||||||||             ");
			System.out.println("       ||||||||||||||||||||||||||             ");
		}
		else
		{
			System.out.println(" CLASS IS ALREADY FULL ");
			System.out.println("        THANK YOU ");
		}
		
		
	}
    
	public void modifyBooking()
	{
		boolean timeboolean=true;
		System.out.println(" ^Enter your reference number ^");
		System.out.println("[USER INPUT (Booking refrence number)]");
		ref=sc.nextInt();
		boolean found=false;
		for(UserData user : user)
		{
			if(user.getRefnumber()==ref && user.getStatus().equalsIgnoreCase("booked"))
			{
				System.out.println(" ^Check the time table Before Changing ^");
				System.out.println(" 1.Day wise timetable ");
				System.out.println(" 2.Lesson wise timetable");
				System.out.println("[USER INPUT (1 or 2)]");
				String timetable=sc.nextLine();
				while(timeboolean)                          //Its keep on checking until the user input matches 1 and 2.
				{
				timetable=sc.nextLine();	
				if(timetable.equalsIgnoreCase("1"))
				{
					
					TimeTable day=new TimeTable();
					day.dayWiseTimeTable();                      //If 1 as input : timingsTime method invokes.
					timeboolean=false;
				}
				else if(timetable.equalsIgnoreCase("2"))
				{
					TimeTable day=new TimeTable();
					day.lessonWiseTimeTable();                   //If 2 as input : timingsLesson method invokes.
					timeboolean=false;
				}
				else
				{
					System.out.println("[USER INPUT (1 or 2)]");	
					timeboolean=true;                        //else loop iterates until user input is valid.                   
				}
				}
				
				timeboolean=true;

			    System.out.println(" ^Enter your new lesson  ^");
			    System.out.println("[USER INPUT (yoga or spin or zumba or box fit or bodysclupt)]");
				lesson=sc.nextLine();
				if(lesson.equalsIgnoreCase("yoga") || lesson.equalsIgnoreCase("spin") || lesson.equalsIgnoreCase("Zumba") || lesson.equalsIgnoreCase("Box fit") || lesson.equalsIgnoreCase("Bodysclupt"))
				{
					lesson=lesson+"";
				}
				else
				{
					while(!lesson.equalsIgnoreCase("yoga") && !lesson.equalsIgnoreCase("spin") && !lesson.equalsIgnoreCase("Zumba") && !lesson.equalsIgnoreCase("Box fit") && !lesson.equalsIgnoreCase("Bodysclupt"))
					{
						System.out.println("[USER INPUT (yoga or spin or zumba or box fit or bodysclupt)]");
						lesson=sc.nextLine();
					}
				}
				
				System.out.println(" ^Enter your Day ^");
				System.out.println("[USER INPUT (sunday or saturday)]");
				day=sc.nextLine();
				if(day.equalsIgnoreCase("Sunday") || day.equalsIgnoreCase("saturday"))
				{
					day=day+"";
				}
				else
				{
					while(!day.equalsIgnoreCase("saturday") && !day.equalsIgnoreCase("sunday"))
					{
						System.out.println("[USER INPUT (sunday or saturday)]");
					day=sc.nextLine();
					}
				}
				TimeTable t=new TimeTable();
				t.daySelection(lesson);
				System.out.println();
				status="changed";
				user.setDay(day);
				user.setDate(t.date_for_user_service_class);
				user.setLesson(lesson);
				user.setStatus(status);
				System.out.println(user);
				found=true;
			}
		}
		if(found)
		{
			System.out.println("------------------------------------------|");
			System.out.println("---------- UPDATED SUCESSFULLY -----------|");
			System.out.println("------------------------------------------|");
		}
		else
		{
			System.out.println("[USER INPUT (reference number)]");
		}
	}
	public void deleteBooking()
	{
		System.out.println(" ^Enter your reference number ^");
		System.out.println("[USER INPUT (reference number)]");
		ref=sc.nextInt();
		boolean found=false;
		for(UserData user : user)
		{
			if(user.getRefnumber()==ref && (user.getStatus().equalsIgnoreCase("booked") || user.getStatus().equalsIgnoreCase("changed")))
			{
				status="Cancelled";
				user.setStatus(status);
				found=true;
			}
		}
		if(found)
		{
			System.out.println("CLASS CANCELLED SUCESSFULLY");
			System.out.println("*** Thank you , have a great day*****");
		}
		else
		{
			System.out.println("***** UNABLE TO CANCEL ********");
			System.out.println("");
		}
	}
	public void status_Of_Class()
	{
		System.out.println(" ^Enter your reference number ^");
		ref=sc.nextInt();
		boolean changed=false;
		int current_date=Integer.parseInt(date_Format.substring(8,10));
		int current_month=Integer.parseInt(date_Format.substring(5,7));
		int current_year=Integer.parseInt(date_Format.substring(0, 4));
		
		for(UserData user: user)
		{
			if(user.getRefnumber()==ref && (user.getStatus().equalsIgnoreCase("booked") || user.getStatus().equalsIgnoreCase("changed")))
			{
				int Date=Integer.parseInt(user.getDate().substring(0,2));
				int Month=Integer.parseInt(user.getDate().substring(3,5));
				int Year=Integer.parseInt(user.getDate().substring(6,10));
				if(current_year>=Year)
				{
					if(current_month>=Month)
					{
						if(current_date>=Date)
						{
							status="Attended";
							user.setStatus(status);
							System.out.println(user.getStatus());
							changed=true;
						}
					}
				}
				else {System.out.println("STATUS CHANGED AFTER CLASS ATTENDED");}
			}
		}
		if(!changed)
		{
			System.out.println("Status is unable to change");
		}
	}
	
	public void userRating()
	{
		TimeTable t=new TimeTable();
		t.twoMonthsWeekDays();
		boolean found=false;
		System.out.println(" ^Enter reference number ^");
        System.out.println("[USER INPUT (reference number)]");
		ref=sc.nextInt();
		for(UserData user : user)         
		{
			if(user.getRefnumber()==ref)
			{
					if(user.getStatus().equalsIgnoreCase("Attended"))
					{
						Rating r=new Rating();
						System.out.println("Please enter rating from 1 to 5 :");
						System.out.println("1. is Very Dissatisfied");
						System.out.println("2. is Dissatisfied");
						System.out.println("3. is OK.");
						System.out.println("4. is satisfied");
						System.out.println("5. is very satisfied");
						System.out.println("[USER INPUT (1 or 2 or 3 or 4 or 5)]");
						int review=sc.nextInt();
						boolean innerif=true;
						while(innerif)
						{
							if(review==1 || review==2 || review==3 || review==4 || review==5)
							{
								user.setRating(review);
								innerif=false;
							}
							else
							{
								System.out.println("[USER INPUT (1 or 2 or 3 or 4 or 5)]");
								review=sc.nextInt();
								innerif=true;
							}
						}
						System.out.println(" ________");
						System.out.print(" --------> ");
						r.rating(user.getRating());
						System.out.println(" "+user);
						found=true;
					}
			}
		}
		if(found)
		{
			System.out.println("Thanks for the review ");
		}
		else
		{
			System.out.println("Unable to provide rating");
		}
	}
	   public void avgRating()
	    {
	    	int yogasum=0;
	    	int spinsum=0;
	    	int boxfitsum=0;
	    	int bodyscluptsum=0;
	    	int zumbasum=0;
	    	int yogacount=0;
	    	int spincount=0;
	    	int boxfitcount=0;
	    	int bodyscluptcount=0;
	    	int zumbacount=0;    	
	    	for(UserData user :user)
	    	{
	    		if(user.getLesson().equalsIgnoreCase("yoga") && user.getStatus().equalsIgnoreCase("Attended"))
	    		{
	    			yogasum=yogasum+user.getRating();
	    			yogacount++;
	    		}
	    		else if(user.getLesson().equalsIgnoreCase("spin") && user.getStatus().equalsIgnoreCase("Attended"))
	    		{
	    			spinsum=spinsum+user.getRating();
	    			spincount++;
	    		}
	    		else if(user.getLesson().equalsIgnoreCase("Zumba") && user.getStatus().equalsIgnoreCase("Attended"))
	    		{
	    			zumbasum=zumbasum+user.getRating();
	    			zumbacount++;
	    		}
	    		else if(user.getLesson().equalsIgnoreCase("box fit") && user.getStatus().equalsIgnoreCase("Attended"))
	    		{
	    			boxfitsum=boxfitsum+user.getRating();
	    			boxfitcount++;
	    		}
	    		else if(user.getLesson().equalsIgnoreCase("bodysclupt") && user.getStatus().equalsIgnoreCase("Attended"))
	    		{
	    			bodyscluptsum=bodyscluptsum+user.getRating();
	    			bodyscluptcount++;
	    		}
	    		else
	    		{
	    			
	    		}
	    	}
	    	double avg=0;
	    	avg=spinsum/spincount;
	    	System.out.println(" 1. Spin       ---------->  £7.50  rating :"+String.format("%.2f", avg));
	    	avg=(double) yogasum/yogacount;
			System.out.println(" 2. yoga       ---------->  £8.50  rating :"+String.format("%.2f", avg));
			avg=(double) boxfitsum/boxfitcount;
	    	System.out.println(" 3. Box fit    ---------->  £9.50  rating :"+String.format("%.2f", avg));
	    	avg=(double) bodyscluptsum/bodyscluptcount;
	    	System.out.println(" 4. Bodysclupt ---------->  £8.00  rating :"+String.format("%.2f", avg));
	    	avg=(double) zumbasum/zumbacount;
	    	System.out.println(" 5. Zumba      ---------->  £9.00  rating :"+String.format("%.2f", avg));
	    	System.out.println("[USER INPUT (1 or 2 or 3 or 4 or 5)]");
	    }
	   
	   public void monthly_Champion_Report(int month)
	   {
		   int spincount=0;
		   int yogacount=0;
		   int zumbacount=0;
		   int boxfitcount=0;
		   int bodyscluptcount=0;
		   int current_month=Integer.parseInt(date_Format.substring(5,7));
		   if(month<current_month)
		   {
		   for(UserData user : user)
		   {
			  int user_month=Integer.parseInt(user.getDate().substring(3,5));
			  if(user_month==month)
			  {
			  if(user.getLesson().equalsIgnoreCase("Spin") && user.getStatus().equalsIgnoreCase("Attended"))
			  {
				  spincount++;
			  }
			  else if(user.getLesson().equalsIgnoreCase("yoga") && user.getStatus().equalsIgnoreCase("Attended"))
			  {
				  yogacount++;
			  }
			  else if(user.getLesson().equalsIgnoreCase("zumba") && user.getStatus().equalsIgnoreCase("Attended"))
			  {
				  zumbacount++;
			  }
			  else if(user.getLesson().equalsIgnoreCase("box fit") && user.getStatus().equalsIgnoreCase("Attended"))
			  {
				  boxfitcount++;
			  }
			  else if(user.getLesson().equalsIgnoreCase("bodysclupt") && user.getStatus().equalsIgnoreCase("Attended"))
			  {
				  bodyscluptcount++;
			  }
			  else
			  {}
			  }
		   }
		   
		   System.out.println("-------------------------------------------------------------------------");
		   System.out.println("|-----------------------------------------------------------------------");
		   System.out.print("|  LESSON           |");
		   System.out.println("      | INCOME ||");
		   System.out.println("-------------------------------------------------------------------------");
		   System.out.println("     Spin                     £"+(spincount*7.50));
		   System.out.println("     Yoga                     £"+(yogacount*8.50));
		   System.out.println("     Zumba                    £"+(zumbacount*9.00));
		   System.out.println("     Box fit                  £"+(boxfitcount*9.50));
		   System.out.println("     Bodysclupt               £"+(bodyscluptcount*8.00));
		   System.out.println("----------------------------------------------------------------------------------");
		   System.out.println("----------------------------------------------------------------------------------");
	   }
		   else 
		   {
			   System.out.println("The month you entered is not yet completed :");
			   System.out.println(".... Thank you ....");
		   }
	   }
	   public void monthly_Reports(int month)
	   {
		   int spincount=0,spinrating=0;
		   int yogacount=0,yogarating=0;
		   int zumbacount=0,zumbarating=0;
		   int boxfitcount=0,boxfitrating=0;
		   int bodyscluptcount=0,bodyscluptrating=0;
		   int current_month=Integer.parseInt(date_Format.substring(5,7));
		   int spin_saturday=0;
		   int spin_sunday=0;
		   int yoga_saturday=0;
		   int yoga_sunday=0;
		   int zumba_saturday=0;
		   int zumba_sunday=0;
		   int boxfit_saturday=0;
		   int boxfit_sunday=0;
		   int bodysclupt_saturday=0;
		   int bodysclupt_sunday=0;
		   
		   if(month<current_month)
		   {
		   for(UserData user : user)
		   {
			  int user_month=Integer.parseInt(user.getDate().substring(3,5));
			  if(user_month==month)
			  {
				  if(user.getLesson().equalsIgnoreCase("Spin") && user.getStatus().equalsIgnoreCase("Attended"))
				  {
					 if(user.getDay().equalsIgnoreCase("Sunday"))
					 {
						 spincount++;
						 spin_sunday++;
						 spinrating=spinrating+user.getRating();
					 }
					 else
					 {
						 spincount++;
						 spin_saturday++;
						 spinrating=spinrating+user.getRating(); 
					 }
				  }
				  else if(user.getLesson().equalsIgnoreCase("yoga") && user.getStatus().equalsIgnoreCase("Attended"))
				  {
					  if(user.getDay().equalsIgnoreCase("Sunday"))
						 {
							 yogacount++;
							 yoga_sunday++;
							 yogarating=yogarating+user.getRating();
						 }
						 else
						 {
							 yogacount++;
							 yoga_saturday++;
							 yogarating=yogarating+user.getRating();
						 }
				  }
				  else if(user.getLesson().equalsIgnoreCase("zumba") && user.getStatus().equalsIgnoreCase("Attended"))
				  {
					  if(user.getDay().equalsIgnoreCase("Sunday"))
						 {
							 zumbacount++;
							 zumba_sunday++;
							 zumbarating=zumbarating+user.getRating();
						 }
						 else
						 {
							 zumbacount++;
							 zumba_saturday++;
							 zumbarating=zumbarating+user.getRating();
						 }
				  }
				  else if(user.getLesson().equalsIgnoreCase("box fit") && user.getStatus().equalsIgnoreCase("Attended"))
				  {
					  if(user.getDay().equalsIgnoreCase("Sunday"))
						 {
							 boxfitcount++;
							 boxfit_sunday++;
							 boxfitrating=boxfitrating+user.getRating();
						 }
						 else
						 {
							 boxfitcount++;
							 boxfit_saturday++;
							 boxfitrating=boxfitrating+user.getRating();
						 }
				  }
				  else if(user.getLesson().equalsIgnoreCase("bodysclupt") && user.getStatus().equalsIgnoreCase("Attended"))
				  {
					  if(user.getDay().equalsIgnoreCase("Sunday"))
						 {
							 bodyscluptcount++;
							 bodysclupt_sunday++;
							 bodyscluptrating=bodyscluptrating+user.getRating();
						 }
						 else
						 {
							 bodyscluptcount++;
							 bodysclupt_saturday++;
							 bodyscluptrating=bodyscluptrating+user.getRating();
						 }
				  }
				  else {}
			  }
		   }
		   double avg=0;
		   System.out.println("-------------------------------------------------------------------------");
		   System.out.println("|-----------------------------------------------------------------------");
		   System.out.println("|		Spin        ======> saturday ("+spin_saturday+" members)");
		   System.out.println("|  	                    ======> sunday   ("+spin_sunday+" members)");
		   avg=(double) spinrating/spincount;
		   System.out.println("|    		  Average Rating  :"+String.format("%.2f",avg));
		   System.out.println("|-------------------------------------------------------------------------");
		   System.out.println("|		Yoga        ======> saturday ("+yoga_saturday+" members)");
		   System.out.println("|		            ======> sunday   ("+yoga_sunday+" members)");
		   avg=(double) yogarating/yogacount;
		   System.out.println("|		      Average Rating  :"+String.format("%.2f",avg));
		   System.out.println("|-------------------------------------------------------------------------");
		   System.out.println("|		Box fit     ======> saturday ("+boxfit_saturday+" members)");
		   System.out.println("|     	                    ======> sunday   ("+boxfit_sunday+" members)");
		   avg=(double)boxfitrating/boxfitcount;
		   System.out.println("|		      Average Rating  :"+String.format("%.2f",avg));
		   System.out.println("|-------------------------------------------------------------------------");
		   System.out.println("|		Bodysclupt  ======> saturday ("+bodysclupt_saturday+" members)");
		   System.out.println("|		            ======> sunday   ("+bodysclupt_sunday+" members)");
		   avg=(double)bodyscluptrating/bodyscluptcount;
		   System.out.println("|		      Average Rating  :"+String.format("%.2f",avg));
		   System.out.println("|-------------------------------------------------------------------------");
		   System.out.println("|		Zumba       ======> saturday ("+zumba_saturday+" members)");
		   System.out.println("|		            ======> sunday   ("+zumba_sunday+" members)");
		   avg=(double)zumbarating/zumbacount;
		   System.out.println("|		      Average Rating  :"+String.format("%.2f",avg));
		   System.out.println("|-------------------------------------------------------------------------");
		   }
		   else 
		   {
			   System.out.println("The month you entered is not yet completed :");
			   System.out.println(".... Thank you ....");
		   }
	   }
}
