package com.example.instifreaks;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class updateInfo extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.update_activity);	
	}
	public void updateInfo(View v)
	{
		String course, start, duration, contact, days;
		EditText courseName = (EditText)findViewById(R.id.editInfoCourse);
		EditText startTime = (EditText)findViewById(R.id.editInfoTime);
		EditText durationTime = (EditText)findViewById(R.id.editInfoDuration);
		EditText contacts  = (EditText)findViewById(R.id.editInfoContacts);
		EditText lectDays = (EditText)findViewById(R.id.editInfoDays);
		
		course=courseName.getText().toString();
		start=startTime.getText().toString();
		duration=durationTime.getText().toString();
		contact=contacts.getText().toString();
		days=lectDays.getText().toString();
	}

}
