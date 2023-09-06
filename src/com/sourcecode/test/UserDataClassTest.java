package com.sourcecode.test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.sourcecode.UserData;

public class UserDataClassTest {
	@Test
	void testUserDataConstructor()
	{
		HashSet<UserData> user=new HashSet<UserData>();
		boolean expected=true;
		int ref=656500;
		String status="booked";
		String email="test@heatmail.com";
		String lesson="yoga";
		String date="10:02:2023";
		String name="zhon";
		String day="sunday";
		int age=56;
		int rating = 0;
		UserData userDetails=new UserData(name,day,date,lesson,age,email,ref,rating,status);
		boolean output=user.add(userDetails);
		assertEquals(expected,output);	
	}
}
