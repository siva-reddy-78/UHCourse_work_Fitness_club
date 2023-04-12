package com.sourcecode;

 

import java.util.Calendar;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeTable {
	String date_for_user_service_class;
	Calendar cal=Calendar.getInstance();
	String[] weekdays=new String[24];
	String[] dates=new String[24];
	UserData user=new UserData();

	Scanner sc=new Scanner(System.in);
	String day;
	String lesson; 
	
	public String dayInWeek(int day,int month,int year)
	{
		cal.set(year, month-1, day);
		String[] days= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int n=cal.get(Calendar.DAY_OF_WEEK);
		return (days[n-1]);
	}
	public void twoMonthsWeekDays()
	{
		LocalDate dateObj = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date=dateObj.format(formatter);
		int day=Integer.parseInt(date.substring(8,10));
		int year=Integer.parseInt(date.substring(0,4));
		int month=Integer.parseInt(date.substring(5,7));
		int count=0;
		int j=2;
		
		for(int i=day;i<=31;i++)
		{
			String str=dayInWeek(i,month,year);
			if(str.equalsIgnoreCase("sunday") || str.equalsIgnoreCase("saturday") && count<=18)
			{
			  weekdays[count]=str;
			  if(i<10)
			  {
			   if(month<10)
			   {
			    dates[count]="0"+i+":0"+month+":"+year;
			    count++;
			   }
			   else
			   {
				 dates[count]="0"+i+":"+month+":"+year;
				 count++;  
			   }
			  }
			  else if(i>=10)
			  {
				  if(month<10)
				   {
				    dates[count]=i+":0"+month+":"+year;
				    count++;
				   }
				   else
				   {
					 dates[count]=i+":"+month+":"+year;
					 count++;  
				   }
			  }
			}
			if(i==31 && j!=0)
			{
				day=1;
				month=month+1;
				j--;
				i=day;
			}
		}
		
		
	}
	public void dayWiseTimeTable()
	{
		twoMonthsWeekDays();
		System.out.println(" ^Which day time table you want to Know ^ ");
		System.out.println("[USER INPUT (sunday or saturday)]");
		boolean innerif=true;
		while(innerif)
		{
		day=sc.nextLine();
		if(day.equalsIgnoreCase("sunday"))
		{
			System.out.println("     *********sunday*******      ");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("     DAY              ||||      DATES (DD:MM:YYYY)    ||||      Lessons Type     ");
			System.out.println("----------------------------------------------------------------------------------");
			for(int i=0;i<15;i++)
			{
				if(weekdays[i]=="Sunday")
				{
					System.out.print(" "+weekdays[i]);
					System.out.print("                               "+dates[i]);
					int day=Integer.parseInt(dates[i].substring(0,2).trim());
					if(day<=7)
					{System.out.println("            Spin And Yoga");}
					else if(day>7 && day<=14)
					{System.out.println("            Zumba And Spin");}
					else if(day>14 && day<=21)
					{System.out.println("            Bodysclupt And Zumba");}
					else
					{System.out.println("            Boxfit And Bodysclupt");}
				}
			}
			innerif=false;
		}
		else if(day.equalsIgnoreCase("saturday"))
		{
			System.out.println("     *********saturday*******      ");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("     DAY              ||||      DATES (DD:MM:YYYY)    ||||      Lessons Type     ");
			System.out.println("----------------------------------------------------------------------------------");
			for(int i=0;i<15;i++)
			{
				if(weekdays[i]=="Saturday")
				{
					System.out.print(" "+weekdays[i]);
					System.out.print("                               "+dates[i]);
					int day=Integer.parseInt(dates[i].substring(0,2).trim());
					if(day<=7)
					{System.out.println("              Boxfit And Bodysclupt");}
					else if(day>7 && day<=14)
					{System.out.println("              yoga And Boxfit");}
					else if(day>14 && day<=21)
					{System.out.println("              Spin And Yoga");}
					else
					{System.out.println("              Zumba And Spin");}
					
				}
			}
			innerif=false;
		}
		else
		{
			System.out.println("[USER INPUT (sunday or saturday)]");
			innerif=true;
		}
		}
	    
	}
	public void lessonWiseTimeTable()
	{
		twoMonthsWeekDays();
		System.out.println(" ^Which lesson time table you want ^");
		System.out.println("[USER INPUT (yoga or spin or zumba or box fit or bodysclupt)]");
		boolean innerif=true;
		while(innerif)
		{
		lesson=sc.nextLine();
		if(lesson.equalsIgnoreCase("yoga"))
		{
			System.out.println("---------------------------------------------------------");
			System.out.println("     DAY              ||||      DATES (DD:MM:YYYY)    ");
			System.out.println("---------------------------------------------------------");
			for(int i=0;i<15;i++)
			{
				    while(dates[i]!=null && innerif)
				    {
					int day=Integer.parseInt(dates[i].substring(0,2).trim());
					if(day<=7 && weekdays[i]=="Sunday")
					{
						System.out.print("  "+weekdays[i]);
						System.out.println("                      "+dates[i]);
						innerif=false;
					} 
					else if((day>7 && day<=14) && weekdays[i]=="Saturday")
					{
						System.out.print("  "+weekdays[i]);
						System.out.println("                      "+dates[i]);
						innerif=false;
					}
					else if((day>14 && day<=21) && weekdays[i]=="Saturday")
					{
						System.out.print("  "+weekdays[i]);
						System.out.println("                      "+dates[i]);
						innerif=false;
					}
					else  
					{innerif=false;}
				    }
				    innerif=true;
			}
			
			innerif=false;
		}
		else if(lesson.equalsIgnoreCase("spin"))
		{
			System.out.println("---------------------------------------------------------");
			System.out.println("     DAY              ||||      DATES (DD:MM:YYYY)    ");
			System.out.println("---------------------------------------------------------");
			for(int i=0;i<15;i++)
			{
				    while(dates[i]!=null && innerif)
				    {
					int day=Integer.parseInt(dates[i].substring(0,2).trim());
					if(day<=7 && weekdays[i]=="Sunday")
					{
						System.out.print("  "+weekdays[i]);
						System.out.println("                      "+dates[i]);
						innerif=false;
					} 
					else if((day>7 && day<=14) && weekdays[i]=="Sunday")
					{
						System.out.print("  "+weekdays[i]);
						System.out.println("                      "+dates[i]);
						innerif=false;
					}
					else if((day>14 && day<=21) && weekdays[i]=="Saturday")
					{
						System.out.print("  "+weekdays[i]);
						System.out.println("                      "+dates[i]);
						innerif=false;
					}
					else if((day>21 && day<=31) && weekdays[i]=="Saturday")
					{
						System.out.print("  "+weekdays[i]);
						System.out.println("                      "+dates[i]);
						innerif=false;
					}
					else  
					{innerif=false;}
				    }
				    innerif=true;
			}
			
			innerif=false;
		}
		else if(lesson.equalsIgnoreCase("box fit"))
		{
			System.out.println("---------------------------------------------------------");
			System.out.println("     DAY              ||||      DATES (DD:MM:YYYY)    ");
			System.out.println("---------------------------------------------------------");
			for(int i=0;i<15;i++)
			{
				    while(dates[i]!=null && innerif)
				    {
					int day=Integer.parseInt(dates[i].substring(0,2).trim());
					if(day<=7 && weekdays[i]=="Saturday")
					{
						System.out.print("  "+weekdays[i]);
						System.out.println("                      "+dates[i]);
						innerif=false;
					} 
					else if((day>7 && day<=14) && weekdays[i]=="Saturday")
					{
						System.out.print("  "+weekdays[i]);
						System.out.println("                      "+dates[i]);
						innerif=false;
					}
					else if((day>21 && day<=31) && weekdays[i]=="Sunday")
					{
						System.out.print("  "+weekdays[i]);
						System.out.println("                      "+dates[i]);
						innerif=false;
					}
					else  
					{innerif=false;}
				    }
				    innerif=true;
			}
			
			innerif=false;
		}
		else if(lesson.equalsIgnoreCase("bodysclupt"))
		{
			System.out.println("---------------------------------------------------------");
			System.out.println("     DAY              ||||      DATES (DD:MM:YYYY)    ");
			System.out.println("---------------------------------------------------------");
			for(int i=0;i<15;i++)
			{
				    while(dates[i]!=null && innerif)
				    {
					int day=Integer.parseInt(dates[i].substring(0,2).trim());
					if(day<=7 && weekdays[i]=="Saturday")
					{
						System.out.print("  "+weekdays[i]);
						System.out.println("                      "+dates[i]);
						innerif=false;
					}
					else if((day>14 && day<=21) && weekdays[i]=="Sunday")
					{
						System.out.print("  "+weekdays[i]);
						System.out.println("                      "+dates[i]);
						innerif=false;
					}
					else if((day>21 && day<=31) && weekdays[i]=="Sunday")
					{
						System.out.print("  "+weekdays[i]);
						System.out.println("                      "+dates[i]);
						innerif=false;
					}
					else  
					{innerif=false;}
				    }
				    innerif=true;
			}
			
			innerif=false;
		}
		else if(lesson.equalsIgnoreCase("Zumba"))
		{
			System.out.println("---------------------------------------------------------");
			System.out.println("     DAY              ||||      DATES (DD:MM:YYYY)    ");
			System.out.println("---------------------------------------------------------");
			for(int i=0;i<15;i++)
			{
				    while(dates[i]!=null && innerif)
				    {
					int day=Integer.parseInt(dates[i].substring(0,2).trim());
					if((day>7 && day<=14) && weekdays[i]=="Sunday")
					{
						System.out.print("  "+weekdays[i]);
						System.out.println("                      "+dates[i]);
						innerif=false;
					}
					else if((day>14 && day<=21) && weekdays[i]=="Sunday")
					{
						System.out.print("  "+weekdays[i]);
						System.out.println("                      "+dates[i]);
						innerif=false;
					}
					else if((day>21 && day<=31) && weekdays[i]=="Saturday")
					{
						System.out.print("  "+weekdays[i]);
						System.out.println("                      "+dates[i]);
						innerif=false;
					}
					else  
					{innerif=false;}
				    }
				    innerif=true;
			}
			
			innerif=false;
		}
		else
		{
			System.out.println("[USER INPUT (yoga or spin or zumba or box fit or bodysclupt)]");
			innerif=true;
		}
		}
	}
	
	public void daySelection(String lesson)
	{
		LocalDate dateObj = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date=dateObj.format(formatter);
		int currentYear=Integer.parseInt(date.substring(0,4));
		int currentMonth=Integer.parseInt(date.substring(5,7));
		
		twoMonthsWeekDays();
		System.out.println(" ^ Enter date ^");
		System.out.println("[USER INPUT date format(DD:MM:YYYY)]");
		try {
		String str1=sc.nextLine();
		date_for_user_service_class=str1;
		int compareDate=Integer.parseInt(str1.substring(0,2));
		int compareMonth=Integer.parseInt(str1.substring(3,5));
		int compareYear=Integer.parseInt(str1.substring(6,10));
		for(int i=0;i<13;i++)
		{
			  if(dates[i].equals(str1) && dates[i]!=null)
			  {
                    if(weekdays[i].equalsIgnoreCase("sunday") && lesson.equalsIgnoreCase("spin"))
                    {
                    	if(compareDate<=14 && compareMonth>=currentMonth && compareYear>=currentYear)
                    	{
                    		System.out.println(lesson+"   "+str1 );
                    	}
                    	else 
                    	{
                    		System.out.println("Invalid date ");
                        	System.out.println("bye bye ...");
                        	System.out.println("You want to use :run again");
                    		System.exit(0);
                    	}
                    }
                    else if(weekdays[i].equalsIgnoreCase("saturday") && lesson.equalsIgnoreCase("spin"))
                    {
                    	if(compareDate>14 && compareMonth>=currentMonth && compareYear>=currentYear)
                    	{
                    		System.out.println(lesson+"   "+str1 );
                    	}
                    	else 
                    	{
                    		System.out.println("Invalid date ");
                        	System.out.println("bye bye ...");
                        	System.out.println("You want to use :run again");
                    		System.exit(0);
                    	}
                    }
                    else if(weekdays[i].equalsIgnoreCase("sunday") && lesson.equalsIgnoreCase("yoga"))
                    {
                    	if(compareDate<=7 && compareMonth>=currentMonth && compareYear>=currentYear)
                    	{
                    		System.out.println(lesson+"   "+str1 );
                    	}
                    	else 
                    	{
                    		System.out.println("Invalid date ");
                        	System.out.println("bye bye ...");
                        	System.out.println("You want to use :run again");
                    		System.exit(0);
                    	}
                    }
                    else if(weekdays[i].equalsIgnoreCase("saturday") && lesson.equalsIgnoreCase("yoga"))
                    {
                    	if(compareDate>7 && compareDate<=21 && compareMonth>=currentMonth && compareYear>=currentYear)
                    	{
                    		System.out.println(lesson+"   "+str1 );
                    	}
                    	else 
                    	{
                    		System.out.println("Invalid date ");
                        	System.out.println("bye bye ...");
                        	System.out.println("You want to use :run again");
                    		System.exit(0);
                    	}
                    }
                    else if(weekdays[i].equalsIgnoreCase("sunday") && lesson.equalsIgnoreCase("zumba"))
                    {
                    	if(compareDate>7 && compareDate<=21 && compareMonth>=currentMonth && compareYear>=currentYear)
                    	{
                    		System.out.println(lesson+"   "+str1 );
                    	}
                    	else 
                    	{
                    		System.out.println("Invalid date ");
                        	System.out.println("bye bye ...");
                        	System.out.println("You want to use :run again");
                    		System.exit(0);
                    	}
                    }
                    else if(weekdays[i].equalsIgnoreCase("saturday") && lesson.equalsIgnoreCase("zumba"))
                    {
                    	if(compareDate>21 &&  compareMonth>=currentMonth && compareYear>=currentYear)
                    	{
                    		System.out.println(lesson+"   "+str1 );
                    	}
                    	else 
                    	{
                    		System.out.println("Invalid date ");
                        	System.out.println("bye bye ...");
                        	System.out.println("You want to use :run again");
                    		System.exit(0);
                    	}
                    }
                    else if(weekdays[i].equalsIgnoreCase("sunday") && lesson.equalsIgnoreCase("box fit"))
                    {
                    	if(compareDate>21 && compareMonth>=currentMonth && compareYear>=currentYear)
                    	{
                    		System.out.println(lesson+"   "+str1 );
                    	}
                    	else 
                    	{
                    		System.out.println("Invalid date ");
                        	System.out.println("bye bye ...");
                        	System.out.println("You want to use :run again");
                    		System.exit(0);
                    	}
                    }
                    else if(weekdays[i].equalsIgnoreCase("saturday") && lesson.equalsIgnoreCase("box fit"))
                    {
                    	if(compareDate<=14 && compareMonth>=currentMonth && compareYear>=currentYear)
                    	{
                    		System.out.println(lesson+"   "+str1 );
                    	}
                    	else 
                    	{
                    		System.out.println("Invalid date ");
                        	System.out.println("bye bye ...");
                        	System.out.println("You want to use :run again");
                    		System.exit(0);
                    	}
                    }
                    else if(weekdays[i].equalsIgnoreCase("sunday") && lesson.equalsIgnoreCase("bodysclupt"))
                    {
                    	if(compareDate>14 && compareMonth>=currentMonth && compareYear>=currentYear)
                    	{
                    		System.out.println(lesson+"   "+str1 );
                    	}
                    	else 
                    	{
                    		System.out.println("Invalid date ");
                        	System.out.println("bye bye ...");
                        	System.out.println("You want to use :run again");
                    		System.exit(0);
                    	}
                    }
                    else if(weekdays[i].equalsIgnoreCase("saturday") && lesson.equalsIgnoreCase("bodysclupt"))
                    {
                    	if(compareDate<=7 && compareMonth>=currentMonth && compareYear>=currentYear)
                    	{
                    		System.out.println(lesson+"   "+str1 );
                    	}
                    	else 
                    	{
                    		System.out.println("Invalid date ");
                        	System.out.println("bye bye ...");
                        	System.out.println("You want to use :run again");
                    		System.exit(0);
                    	}
                    }
                    else
                    {
                    	System.exit(0);
                    }
			  }
		}
	}
		catch(StringIndexOutOfBoundsException ex)
		{
			System.out.println("Invalid format");
			System.out.println("bye bye..");
			System.out.println("You want to use :run again");
			System.exit(0);
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Invalid format");
			System.out.println("bye bye..");
			System.out.println("You want to use :run again");
			System.exit(0);
		}
	}
}

