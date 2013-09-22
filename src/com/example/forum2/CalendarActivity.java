package com.example.forum2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalendarActivity extends Activity{
      
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_layout);
        
        Button btnViewEvent = (Button) findViewById(R.id.button5);
        
        btnViewEvent.setOnClickListener(new View.OnClickListener() {
             
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), EventViewActivity.class);
                startActivity(intent);
                // Closing dashboard screen
                finish();
            }
        });
        
        
        Button btnProfile = (Button) findViewById(R.id.profilec);
        
        btnProfile.setOnClickListener(new View.OnClickListener() {
             
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), DashboardActivity.class);
                startActivity(intent);
                // Closing dashboard screen
                finish();
            }
        });
        
        Button btnExplore = (Button) findViewById(R.id.explorec);
        
        btnExplore.setOnClickListener(new View.OnClickListener() {
             
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), ExploreActivity.class);
                startActivity(intent);
                // Closing dashboard screen
                finish();
            }
        });
        
        Button btnGoal = (Button) findViewById(R.id.goalc);
        
        btnGoal.setOnClickListener(new View.OnClickListener() {
             
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), GoalActivity.class);
                startActivity(intent);
                // Closing dashboard screen
                finish();
            }
        });
	}
}
