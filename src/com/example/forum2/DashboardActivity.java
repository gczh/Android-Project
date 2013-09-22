package com.example.forum2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
 
import library.UserFunctions;
 
public class DashboardActivity extends Activity {
    UserFunctions userFunctions;
    Button btnLogout;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         
        /**
         * Dashboard Screen for the application
         * */       
        // Check login status in database
        userFunctions = new UserFunctions();
        if(userFunctions.isUserLoggedIn(getApplicationContext())){
       // user already logged in show databoard
            setContentView(R.layout.dashboard);
            
            //logout button
            btnLogout = (Button) findViewById(R.id.btnLogout);
             
            btnLogout.setOnClickListener(new View.OnClickListener() {
                 
                public void onClick(View arg0) {
                    // TODO Auto-generated method stub
                    userFunctions.logoutUser(getApplicationContext());
                    Intent login = new Intent(getApplicationContext(), LoginActivity.class);
                    login.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(login);
                    // Closing dashboard screen
                    finish();
                }
            });
            
            Button btnAddReview = (Button) findViewById(R.id.button5);
            
            btnAddReview.setOnClickListener(new View.OnClickListener() {
                 
                public void onClick(View arg0) {
                    // TODO Auto-generated method stub
                    Intent intent = new Intent(getApplicationContext(), AddReview.class);
                    startActivity(intent);
                    // Closing dashboard screen
                    finish();
                }
            });
          
            
            Button btnCalendar = (Button) findViewById(R.id.button3);
            
            btnCalendar.setOnClickListener(new View.OnClickListener() {
                 
                public void onClick(View arg0) {
                    // TODO Auto-generated method stub
                    Intent intent = new Intent(getApplicationContext(), CalendarActivity.class);
                    startActivity(intent);
                    // Closing dashboard screen
                    finish();
                }
            });
            
            Button btnExplore = (Button) findViewById(R.id.button4);
            
            btnExplore.setOnClickListener(new View.OnClickListener() {
                 
                public void onClick(View arg0) {
                    // TODO Auto-generated method stub
                    Intent intent = new Intent(getApplicationContext(), ExploreActivity.class);
                    startActivity(intent);
                    // Closing dashboard screen
                    finish();
                }
            });
            
            Button btnGoal = (Button) findViewById(R.id.button2);
            
            btnGoal.setOnClickListener(new View.OnClickListener() {
                 
                public void onClick(View arg0) {
                    // TODO Auto-generated method stub
                    Intent intent = new Intent(getApplicationContext(), GoalActivity.class);
                    startActivity(intent);
                    // Closing dashboard screen
                    finish();
                }
            });
            
             
        }else{
            // user is not logged in show login screen
            Intent login = new Intent(getApplicationContext(), LoginActivity.class);
            login.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(login);
            // Closing dashboard screen
            finish();
        }        
    }
}
