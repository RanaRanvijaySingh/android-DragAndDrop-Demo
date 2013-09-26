package com.webonise.draganddropdemo;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.widget.ImageView;

public class MainActivity extends Activity {

	private static final String IMAGE_TAG="Android Logo";
	ImageView imageView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initializeComponents();
		
		imageView.setOnLongClickListener(new View.OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
			
				ClipData.Item item=new ClipData.Item((CharSequence) v.getTag());
				
				String [] mimeTypes={ClipDescription.MIMETYPE_TEXT_PLAIN};
				ClipData dragData=new ClipData(v.getTag().toString(), mimeTypes, item);
				
				View.DragShadowBuilder myShadowBuilder=new DragShadowBuilder(imageView);
				v.startDrag(dragData, myShadowBuilder, null , 0);
				
				return true;
			}
		});
		
		imageView.setOnDragListener(new OnDragListener() {
			
			@Override
			public boolean onDrag(View v, DragEvent event) {
			
				
				
				return false;
			}
		});
		
	}

	private void initializeComponents() {
		imageView=(ImageView)findViewById(R.id.imageViewDrag);
		imageView.setTag(IMAGE_TAG);
	}
}
