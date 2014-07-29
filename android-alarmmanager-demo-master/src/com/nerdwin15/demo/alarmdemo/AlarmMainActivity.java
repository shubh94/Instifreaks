package com.nerdwin15.demo.alarmdemo;

import java.util.Calendar;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.TimePicker;

public class AlarmMainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            this.requestWindowFeature(Window.FEATURE_NO_TITLE);
       setContentView(R.layout.main);
       TimePicker timePicker1 = (TimePicker) findViewById(R.id.tpResult);
       DatePicker Date_Picker = (DatePicker)findViewById(R.id.dpResult);
       int day = Date_Picker.getDayOfMonth();
        int month = Date_Picker.getMonth();
        int year = Date_Picker.getYear();
        int Hour = timePicker1.getCurrentHour();
        int Minute =timePicker1.getCurrentMinute()+1;
        //int Hour = Date_Picker.getDayOfMonth();
        //int Minute = Date_Picker.getDayOfMonth();
       //Create an offset from the current time in which the alarm will go off.
        Calendar cal = Calendar.getInstance();
       cal.add(Calendar.SECOND, 5);
        cal.setTimeInMillis(System.currentTimeMillis());
        //calendar.add(Calendar.SECOND, 10);
       // cal.set(year, month, day, Hour, Minute);
        //Create a new PendingIntent and add it to the AlarmManager
        Intent intent = new Intent(this, AlarmReceiverActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,
            12345, intent, PendingIntent.FLAG_CANCEL_CURRENT);
        AlarmManager am = 
            (AlarmManager)getSystemService(Activity.ALARM_SERVICE);
        am.set(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(),pendingIntent);
    }

}