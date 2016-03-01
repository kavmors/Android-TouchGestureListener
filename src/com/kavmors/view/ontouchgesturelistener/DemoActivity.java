package com.kavmors.view.ontouchgesturelistener;

import com.kavmors.view.widget.OnTouchGestureListener;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class DemoActivity extends Activity {
	private View view;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_demo);
		
		view = findViewById(R.id.view);
		view.setOnTouchListener(new OnTouchGestureListener(this));
		
		//Log info with tag("OnTouchGestureListener") when touch screen 
	}
}
