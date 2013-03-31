package com.example.mash2;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class frame2 extends Activity{
	
	public static ArrayList<String> saveResult;
	TextView r1,r2,r3,r4,r5;
	TextView r1a,r2a,r3a,r4a,r5a;
	TextView r6,r7,r8,r9,r10;
	TextView r6a,r7a,r8a,r9a,r10a;
	
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_2);
		
		r1=(TextView)findViewById(R.id.e1);
		r2=(TextView)findViewById(R.id.e2);
		r3=(TextView)findViewById(R.id.e3);
		r4=(TextView)findViewById(R.id.e4);
		r5=(TextView)findViewById(R.id.e5);
		r1a=(TextView)findViewById(R.id.e1a);
		r2a=(TextView)findViewById(R.id.e2a);
		r3a=(TextView)findViewById(R.id.e3a);
		r4a=(TextView)findViewById(R.id.e4a);
		r5a=(TextView)findViewById(R.id.e5a);
		r6=(TextView)findViewById(R.id.e6);
		r7=(TextView)findViewById(R.id.e7);
		r8=(TextView)findViewById(R.id.e8);
		r9=(TextView)findViewById(R.id.e9);
		r10=(TextView)findViewById(R.id.e10);
		r6a=(TextView)findViewById(R.id.e6a);
		r7a=(TextView)findViewById(R.id.e7a);
		r8a=(TextView)findViewById(R.id.e8a);
		r9a=(TextView)findViewById(R.id.e9a);
		r10a=(TextView)findViewById(R.id.e10a);
		
		int size = saveResult.size();
		
		try{
		if (size == 0){
			r1.setText("Nothing was selected!");
			r1a.setText(null);
		}
		
		
		if (size > 0)
		{
			String s = saveResult.get(0);
			r1.setText(s.substring(0, s.indexOf('\n')));
			r1a.setText(s.substring(s.indexOf('\n')+1));
		}
		if (size > 1)
		{
			String s = saveResult.get(1);
			r2.setText(s.substring(0, s.indexOf('\n')));
			r2a.setText(s.substring(s.indexOf('\n')+1));
		}
		if (size > 2)
		{
			String s = saveResult.get(2);
			r3.setText(s.substring(0, s.indexOf('\n')));
			r3a.setText(s.substring(s.indexOf('\n')+1));
		}
		if (size > 3)
		{
			String s = saveResult.get(3);
			r4.setText(s.substring(0, s.indexOf('\n')));
			r4a.setText(s.substring(s.indexOf('\n')+1));
		}
		if (size > 4)
		{
			String s = saveResult.get(4);
			r5.setText(s.substring(0, s.indexOf('\n')));
			r5a.setText(s.substring(s.indexOf('\n')+1));
		}
		if (size > 5)
		{
			String s = saveResult.get(5);
			r6.setText(s.substring(0, s.indexOf('\n')));
			r6a.setText(s.substring(s.indexOf('\n')+1));
		}
		if (size > 6)
		{
			String s = saveResult.get(6);
			r7.setText(s.substring(0, s.indexOf('\n')));
			r7a.setText(s.substring(s.indexOf('\n')+1));
		}
		if (size > 7)
		{
			String s = saveResult.get(7);
			r8.setText(s.substring(0, s.indexOf('\n')));
			r8a.setText(s.substring(s.indexOf('\n')+1));
		}
		if (size > 8)
		{
			String s = saveResult.get(8);
			r9.setText(s.substring(0, s.indexOf('\n')));
			r9a.setText(s.substring(s.indexOf('\n')+1));
		}
		if (size > 9)
		{
			String s = saveResult.get(9);
			r10.setText(s.substring(0, s.indexOf('\n')));
			r10a.setText(s.substring(s.indexOf('\n')+1));
		}
		} catch (NullPointerException e){
			if (size > 0)
			{
				String s = saveResult.get(0);
				r1.setText(s.substring(0, s.indexOf('\n')));
				r1a.setText(s.substring(s.indexOf('\n')+1));
			}
			if (size > 1)
			{
				String s = saveResult.get(1);
				r2.setText(s.substring(0, s.indexOf('\n')));
				r2a.setText(s.substring(s.indexOf('\n')+1));
			}
			if (size > 2)
			{
				String s = saveResult.get(2);
				r3.setText(s.substring(0, s.indexOf('\n')));
				r3a.setText(s.substring(s.indexOf('\n')+1));
			}
			if (size > 3)
			{
				String s = saveResult.get(3);
				r4.setText(s.substring(0, s.indexOf('\n')));
				r4a.setText(s.substring(s.indexOf('\n')+1));
			}
			if (size > 4)
			{
				String s = saveResult.get(4);
				r5.setText(s.substring(0, s.indexOf('\n')));
				r5a.setText(s.substring(s.indexOf('\n')+1));
			}
			if (size > 5)
			{
				String s = saveResult.get(5);
				r6.setText(s.substring(0, s.indexOf('\n')));
				r6a.setText(s.substring(s.indexOf('\n')+1));
			}
			if (size > 6)
			{
				String s = saveResult.get(6);
				r7.setText(s.substring(0, s.indexOf('\n')));
				r7a.setText(s.substring(s.indexOf('\n')+1));
			}
			if (size > 7)
			{
				String s = saveResult.get(7);
				r8.setText(s.substring(0, s.indexOf('\n')));
				r8a.setText(s.substring(s.indexOf('\n')+1));
			}
			if (size > 8)
			{
				String s = saveResult.get(8);
				r9.setText(s.substring(0, s.indexOf('\n')));
				r9a.setText(s.substring(s.indexOf('\n')+1));
			}
			if (size > 9)
			{
				String s = saveResult.get(9);
				r10.setText(s.substring(0, s.indexOf('\n')));
				r10a.setText(s.substring(s.indexOf('\n')+1));
			}
		}

	}
}
