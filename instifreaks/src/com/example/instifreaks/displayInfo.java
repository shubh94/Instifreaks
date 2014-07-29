package com.example.instifreaks;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class displayInfo extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.display_info);	
	}
	public void getInfo(View v)
	{
		String start, duration, contact, days,courseName;
		TextView startTime = (TextView)findViewById(R.id.displayStart);
		TextView durationTime = (TextView)findViewById(R.id.displayDuration);
		TextView contacts  = (TextView)findViewById(R.id.displayContact);
		TextView lectDays = (TextView)findViewById(R.id.dispalyLect);
		final EditText courseName1 = (EditText)findViewById(R.id.editDisplayCourse);
		courseName=courseName1.getText().toString();
		String course=courseName;
		Contact a = new Contact();
		DatabaseHandler db = new DatabaseHandler(this);
	a = db.getContact(course);
		
	startTime.setText(a.getStartTime());
		durationTime.setText(a.getEndTime());
		contacts.setText(a.getPhoneNumber());
		lectDays.setText(a.getLectureDays());
		/*startTime.setText("a");
		durationTime.setText("b");
			contacts.setText("c");
		lectDays.setText("c");*/
	}

}



