package com.nerdwin15.demo.alarmdemo;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		  super.onCreate(savedInstanceState);
		  setContentView(R.layout.message);


	Button sendsms=(Button) findViewById(R.id.sendBt);
	final EditText msgtxt=(EditText) findViewById(R.id.messag);
	final EditText numtxt=(EditText) findViewById(R.id.numberTx);
	sendsms.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			String myMsg=msgtxt.getText().toString();
			String number=numtxt.getText().toString();
			sendMsg(number, myMsg);
			
		}
	});

	}
protected void sendMsg(String theNumber, String myMsg) {
// TODO Auto-generated method stub
SmsManager sms= SmsManager.getDefault();
sms.sendTextMessage(theNumber, null, myMsg , null , null );
}	
}
