package com.example.forum2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GoalActivity extends Activity {

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goal_layout);
        
        Button btnProfile = (Button) findViewById(R.id.profileg);
        
        btnProfile.setOnClickListener(new View.OnClickListener() {
             
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), DashboardActivity.class);
                startActivity(intent);
                // Closing dashboard screen
                finish();
            }
        });
        
        Button btnCal = (Button) findViewById(R.id.calendarg);
        
        btnCal.setOnClickListener(new View.OnClickListener() {
             
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), CalendarActivity.class);
                startActivity(intent);
                // Closing dashboard screen
                finish();
            }
        });
        
        Button btnExplore = (Button) findViewById(R.id.exploreg);
        
        btnExplore.setOnClickListener(new View.OnClickListener() {
             
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), ExploreActivity.class);
                startActivity(intent);
                // Closing dashboard screen
                finish();
            }
        });
    }
}
