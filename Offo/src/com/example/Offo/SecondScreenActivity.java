package com.example.Offo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle; 
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class SecondScreenActivity extends Activity {
	ImageButton imgButton;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondscreen);
        addListenerOnButton();
        addListenerOnButton1();
        addListenerOnButton2();
        addListenerOnButton3();
        
    } 
    private void addListenerOnButton() {
		
        imgButton = (ImageButton) findViewById
        (R.id.imageButton21);
        
       
        final Context context = this;
        
        imgButton.setOnClickListener(new OnClickListener() {
          @Override
          public void onClick(View arg0) {
          	Intent intent = new Intent(context, FourthScreenActivity.class);
              startActivity(intent);
          }
        });
	}
   private void addListenerOnButton1() {
		
        imgButton = (ImageButton) findViewById
        (R.id.imageButton22);
        
       
        final Context context = this;
        
        imgButton.setOnClickListener(new OnClickListener() {
          @Override
          public void onClick(View arg0) {
          	Intent intent = new Intent(context, FourthScreenActivity.class);
              startActivity(intent);
          }
        });
	}
   private void addListenerOnButton2() {
		
       imgButton = (ImageButton) findViewById
       (R.id.imageButton23);
       
      
       final Context context = this;
       
       imgButton.setOnClickListener(new OnClickListener() {
         @Override
         public void onClick(View arg0) {
         	Intent intent = new Intent(context, FourthScreenActivity.class);
             startActivity(intent);
         }
       });
	}
   private void addListenerOnButton3() {
		
       imgButton = (ImageButton) findViewById
       (R.id.imageButton24);
       
      
       final Context context = this;
       
       imgButton.setOnClickListener(new OnClickListener() {
         @Override
         public void onClick(View arg0) {
         	Intent intent = new Intent(context, FourthScreenActivity.class);
             startActivity(intent);
         }
       });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
         /* Inflate the menu; this adds items to the action bar            
         if it is present */
         getMenuInflater().inflate(R.menu.main, menu);
         return true;
     }

}

 