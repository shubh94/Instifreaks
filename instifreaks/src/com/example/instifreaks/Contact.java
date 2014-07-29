package com.example.instifreaks;

public class Contact {
	
	//private variables
	int _id;
	String _course_name;
	String _phone_number;
	String _start_time;
	String _end_time;
	String _lecture_days;
	
	// Empty constructor
	public Contact(){
		
	}
	// constructor
	public Contact(int id, String _course_name,String _start_time, String _end_time, String _lecture_days, String _phone_number){
		this._id = id;
		this._course_name = _course_name;
		this._phone_number = _phone_number;
		this._start_time = _start_time;
		this._end_time = _end_time;
		this._lecture_days = _lecture_days;
	}
	
	// constructor
	public Contact(String course_name,String start_time, String end_time, String lecture_days,String phone_number){
		this._course_name = course_name;
		this._phone_number = phone_number;
		this._start_time = start_time;
		this._end_time = end_time;
		this._lecture_days = lecture_days;
	}
	// getting ID
	public int getID(){
		return this._id;
	}
	
	// setting id
	public void setID(int id){
		this._id = id;
	}
	
	// getting name
	public String getCourseName(){
		return this._course_name;
	}
	
	// setting name
	public void setCourseName(String course_name){
		this._course_name = course_name;
	}
	
	// getting phone number
	public String getPhoneNumber(){
		return this._phone_number;
	}
	
	// setting phone number
	public void setPhoneNumber(String phone_number){
		this._phone_number = phone_number;
	}
	
	// getting phone number
		public String getStartTime(){
			return this._start_time;
		}
		
		// setting phone number
		public void setStartTime(String start_time){
			this._start_time = start_time;
		}
		public String getEndTime(){
			return this._end_time;
		}
		
		// setting phone number
		public void setEndTime(String end_time){
			this._end_time = end_time;
		}
		public String getLectureDays(){
			return this._lecture_days;
		}
		
		// setting phone number
		public void setLectureDays(String lecture_days){
			this._lecture_days = lecture_days;
		}
	
}
