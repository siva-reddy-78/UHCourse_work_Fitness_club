package com.sourcecode;

public class Prices{
      
	double amount;
	public double amounts(String lesson)
	{
		if(lesson.equalsIgnoreCase("spin"))
		{
		  return amount=7.50;
		}
		else if(lesson.equalsIgnoreCase("Yoga"))
		{
			return amount=8.50;
			
		}
		else if(lesson.equalsIgnoreCase("Box fit"))
		{
			return amount=9.50;
			
		}
		else if(lesson.equalsIgnoreCase("Bodysclupt"))
		{
			return amount=8.00;
			
		}
		else
		{
			return amount=9.00;
			
		}
	} 

}