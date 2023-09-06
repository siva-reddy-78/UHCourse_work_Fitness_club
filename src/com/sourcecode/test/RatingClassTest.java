package com.sourcecode.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sourcecode.Rating;

class RatingClassTest {

	@Test
	void testRating1()
	{
		int rating=1;
		 Rating test=new Rating();
	     String output=test.rating(rating);
	     assertEquals("Very Dissatisfied",output);	
	}
	@Test
	void testRating2()
	{
		int rating=2;
		 Rating test=new Rating();
	     String output=test.rating(rating);
	     assertEquals("Dissatisfied",output);	
	}
	@Test
	void testRating3()
	{
		int rating=3;
		 Rating test=new Rating();
	     String output=test.rating(rating);
	     assertEquals("Ok",output);	
	}
	@Test
	void testRating4()
	{
		int rating=4;
		 Rating test=new Rating();
	     String output=test.rating(rating);
	     assertEquals("Satisfied",output);	
	}
	@Test
	void testRating5()
	{
		int rating=5;
		 Rating test=new Rating();
	     String output=test.rating(rating);
	     assertEquals("very satisfied",output);	
	}
}
