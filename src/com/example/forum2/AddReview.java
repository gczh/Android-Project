package com.example.forum2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddReview extends Activity{
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.work_review);
        
        Button btnAddReview = (Button) findViewById(R.id.button1);
        
        btnAddReview.setOnClickListener(new View.OnClickListener() {
             
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), DashboardActivity.class);
                startActivity(intent);
                // Closing dashboard screen
                finish();
            }
        });
	}

}
