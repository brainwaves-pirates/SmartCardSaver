package com.example.Offo;

import android.os.Bundle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	
	ImageButton imgButton;
	ImageButton imgButton1;
	ImageButton imgButton2;
	ImageButton imgButton3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);

          addListenerOnButton();
          addListenerOnButton1();
          addListenerOnButton2();
          addListenerOnButton3();
          
          
        }

	private void addListenerOnButton() {
		
          imgButton = (ImageButton) findViewById
          (R.id.imageButton1);
         
          final Context context = this;
          
          imgButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
            	Intent intent = new Intent(context, SecondScreenActivity.class);
                startActivity(intent);
            }
          });
	}
          
          private void addListenerOnButton1() {
        	  final Context context = this;
        	  imgButton1 = (ImageButton) findViewById
                      (R.id.imageButton2);
              imgButton1.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View arg0) {
                	Intent intent = new Intent(context, ThirdScreenActivity.class);
                   startActivity(intent);
                }
             });
	}
          private void addListenerOnButton2() {
      		
              imgButton = (ImageButton) findViewById
              (R.id.imageButton3);
             
              final Context context = this;
              
              imgButton.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View arg0) {
                	Intent intent = new Intent(context, IciciScreenActivity.class);
                    startActivity(intent);
                }
              });
    	}
      	private void addListenerOnButton3() {
    		
            imgButton = (ImageButton) findViewById
            (R.id.imageButton4);
           
            final Context context = this;
            
            imgButton.setOnClickListener(new OnClickListener() {
              @Override
              public void onClick(View arg0) {
              	Intent intent = new Intent(context, AxisScreenActivity.class);
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