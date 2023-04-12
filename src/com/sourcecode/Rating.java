package com.sourcecode;

public class Rating
{
     
	public String rating(int rating)
	{
		if(rating==1)
		{
			return "Very Dissatisfied";
		}
		else if(rating == 2)
		{
			return "Dissatisfied";
		}
		else if(rating == 3)
		{
			return "Ok";
		}
		else if(rating == 4)
		{
			return "Satisfied";
		}
		else
		{
			return "very satisfied";
		}
	}
	
}
