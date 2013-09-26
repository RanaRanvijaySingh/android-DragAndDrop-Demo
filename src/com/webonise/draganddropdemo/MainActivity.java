package com.webonise.draganddropdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageView imageView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initializeComponents();
	}

	private void initializeComponents() {
		imageView=(ImageView)findViewById(R.id.imageViewDrag);
	}
}
