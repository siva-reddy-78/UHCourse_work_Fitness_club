package com.sourcecode;


public class UserData {
	private String name;
	private String day;
	private String lesson;
	private String date;
	private int age;
	private String email;
	private int refnumber;
	private int rating;
	private String status;
	
	
	public UserData() {
		super();
		
		// TODO Auto-generated constructor stub
	}

	public UserData(String name, String day,String date, String lesson, int age, String email,int ref,int rating,String status) {
		super();
		this.name = name;
		this.day = day;
		this.lesson = lesson;
		this.age = age;
		this.email = email;
		this.refnumber=ref;
		this.date=date;
		this.rating=rating;
		this.status=status;
	}
	//getter and setter methods for private variables
     
	
	
	public String getName() {
		return name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getRefnumber() {
		return refnumber;
	}

	public void setRefnumber(int refnumber) {
		this.refnumber = refnumber;
	}

	@Override
	public String toString() {
		return "UserData [name=" + name + ", day=" + day +"  "+date+ " , lesson=" + lesson + ", age=" + age + ", email=" + email
				+" ,ref no. :"+refnumber+ "]"+"  RATING : "+rating+"   Status :"+status;
	}
	
	
}
