package com.example.Offo;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import android.os.Bundle; 
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class IciciScreenActivity extends Activity {
	ImageButton imgButton;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iciciscreen);
        addListenerOnButton();
        addListenerOnButton1();
        addListenerOnButton2();
        addListenerOnButton3();
        
    }
private void addListenerOnButton() {
		
        imgButton = (ImageButton) findViewById
        (R.id.imageButton51);
       
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
    (R.id.imageButton52);
    
   
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
   (R.id.imageButton53);
   
  
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
   (R.id.imageButton54);
   
  
   final Context context = this;
   
   imgButton.setOnClickListener(new OnClickListener() {
     @Override
     public void onClick(View arg0) {
     	Intent intent = new Intent(context, FourthScreenActivity.class);
         startActivity(intent);
     }
   });
	}
    
    } 