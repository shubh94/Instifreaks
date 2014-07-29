package com.example.instifreaks;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class AndroidSQLiteTutorialActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update_activity);
    }
        
        public void updateInfo(View v)
    	{
    		String course, start, end, contact, days;
    		EditText courseName = (EditText)findViewById(R.id.editInfoCourse);
    		EditText startTime = (EditText)findViewById(R.id.editInfoTime);
    		EditText endTime = (EditText)findViewById(R.id.editInfoDuration);
    		EditText contacts  = (EditText)findViewById(R.id.editInfoContacts);
    		EditText lectDays = (EditText)findViewById(R.id.editInfoDays);
    		
    		course=courseName.getText().toString();
    		start=startTime.getText().toString();
    		end=endTime.getText().toString();
    		contact=contacts.getText().toString();
    		days=lectDays.getText().toString();
    		
    		/**
             * CRUD Operations
             * */
    		
    		// Inserting Contacts
    		DatabaseHandler db = new DatabaseHandler(this);
    		Log.d("Insert: ", "Inserting ..");
    	    db.addContact(new Contact(course, start, end, days, contact));        
    	       
    	       // Reading all contacts
    	    Log.d("Reading: ", "Reading all contacts..");
    	    List<Contact> test_list = db.getAllContacts(); 
    	    
    	    for (Contact cn : test_list) {
                String log = "Id: "+cn.getID()+" ,CourseName: " + cn.getCourseName() + " ,Starttime: " + cn.getStartTime() + " ,Endtime: " + cn.getEndTime() + " ,Lecturedays: " + cn.getLectureDays() + " ,Contacts: " + cn.getPhoneNumber();
                    // Writing Contacts to log
            Log.d("Name: ", log);
    	    }
        }    
}