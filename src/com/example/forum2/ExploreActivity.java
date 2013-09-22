package com.example.forum2;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExploreActivity extends Activity {
	
	private static String KEY_SUCCESS = "success";
    //private static String KEY_ERROR = "error";
    //private static String KEY_ERROR_MSG = "error_msg";
    //private static String KEY_NAME = "name";
    //EditText editText2 = (EditText) findViewById(R.id.editText2);
   

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explore_view);
        
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
        
        
       Button btnCalendar = (Button) findViewById(R.id.calendare);
        
       btnCalendar.setOnClickListener(new View.OnClickListener() {
             
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), CalendarActivity.class);
                startActivity(intent);
                // Closing dashboard screen
                finish();
            }
        });
       
       Button btnExplore = (Button) findViewById(R.id.explore);
       
       btnExplore.setOnClickListener(new View.OnClickListener() {
             
            public void onClick(View arg0) {
                    TextView editetext1 = (TextView)findViewById (R.id.textView4);
                    editetext1.setVisibility(View.INVISIBLE);
                    
                    TextView editetext2 = (TextView)findViewById (R.id.textView5);
                    editetext2.setVisibility(View.INVISIBLE);
                    
                    TextView editetext3 = (TextView)findViewById (R.id.textView6);
                    editetext3.setVisibility(View.INVISIBLE);
                
            }
        });
       
       
       Button btnGoal = (Button) findViewById(R.id.goale);
       
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
