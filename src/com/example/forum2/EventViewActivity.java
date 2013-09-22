package com.example.forum2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EventViewActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_view_layout);
        
        Button btnViewEvent = (Button) findViewById(R.id.Back);
        
        btnViewEvent.setOnClickListener(new View.OnClickListener() {
             
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), CalendarActivity.class);
                startActivity(intent);
                // Closing dashboard screen
                finish();
            }
        });
    }
}