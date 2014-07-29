package com.nerdwin15.demo.alarmdemo;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.app.AlertDialog;;

public class alarm_final extends Activity{
	private AlertDialog alertD;
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
	AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(alarm_final.this);
    dialogBuilder.setTitle("Proxy!!");
    dialogBuilder.setMessage("Do you want to attend lecture??");
    dialogBuilder.setPositiveButton("YES", new DialogInterface.OnClickListener(){
    	public void onClick(DialogInterface args0, int args1)
    	{
    		TextView txtView = new TextView(alarm_final.this);
    		txtView.setText("Get Ready for your Lecture!!!");
				setContentView(txtView);
			}
    	}
    );
   dialogBuilder.setNegativeButton("NO", new DialogInterface.OnClickListener(){
    	public void onClick(DialogInterface args0, int args1)
    	{
    		Intent intent = new Intent (alarm_final.this,MainActivity.class); 
            startActivity(intent);

    		/*TextView txtView = new TextView(AlarmReceiverActivity.this);
    		txtView.setText("You clicked No");
    		setContentView(txtView);*/
    		alertD.cancel();
    	}
    });
   alertD = dialogBuilder.create();
   alertD.show();
	}}
