package com.example.mash2;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity2 extends Activity {
	public static ArrayList<String> saveResult;
	TextView e1,e2,e3,e4,e5;
	TextView e1a,e2a,e3a,e4a,e5a;
	TextView e6,e7,e8,e9,e10;
	TextView e6a,e7a,e8a,e9a,e10a;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity2);
		
		e1=(TextView)findViewById(R.id.e1);
		e2=(TextView)findViewById(R.id.e2);
		e3=(TextView)findViewById(R.id.e3);
		e4=(TextView)findViewById(R.id.e4);
		e5=(TextView)findViewById(R.id.e5);
		e1a=(TextView)findViewById(R.id.e1a);
		e2a=(TextView)findViewById(R.id.e2a);
		e3a=(TextView)findViewById(R.id.e3a);
		e4a=(TextView)findViewById(R.id.e4a);
		e5a=(TextView)findViewById(R.id.e5a);
		e6=(TextView)findViewById(R.id.e6);
		e7=(TextView)findViewById(R.id.e7);
		e8=(TextView)findViewById(R.id.e8);
		e9=(TextView)findViewById(R.id.e9);
		e10=(TextView)findViewById(R.id.e10);
		e6a=(TextView)findViewById(R.id.e6a);
		e7a=(TextView)findViewById(R.id.e7a);
		e8a=(TextView)findViewById(R.id.e8a);
		e9a=(TextView)findViewById(R.id.e9a);
		e10a=(TextView)findViewById(R.id.e10a);
		
		int size = saveResult.size();
		if (size == 0)
			e1.setText("Nothing was selected!");
		if (size > 0)
		{
			String s = saveResult.get(0);
			e1.setText(s.substring(0, s.indexOf('\n')));
			e1a.setText(s.substring(s.indexOf('\n')+1));
		}
		if (size > 1)
		{
			String s = saveResult.get(1);
			e2.setText(s.substring(0, s.indexOf('\n')));
			e2a.setText(s.substring(s.indexOf('\n')+1));
		}
		if (size > 2)
		{
			String s = saveResult.get(2);
			e3.setText(s.substring(0, s.indexOf('\n')));
			e3a.setText(s.substring(s.indexOf('\n')+1));
		}
		if (size > 3)
		{
			String s = saveResult.get(3);
			e4.setText(s.substring(0, s.indexOf('\n')));
			e4a.setText(s.substring(s.indexOf('\n')+1));
		}
		if (size > 4)
		{
			String s = saveResult.get(4);
			e5.setText(s.substring(0, s.indexOf('\n')));
			e5a.setText(s.substring(s.indexOf('\n')+1));
		}
		if (size > 5)
		{
			String s = saveResult.get(5);
			e6.setText(s.substring(0, s.indexOf('\n')));
			e6a.setText(s.substring(s.indexOf('\n')+1));
		}
		if (size > 6)
		{
			String s = saveResult.get(6);
			e7.setText(s.substring(0, s.indexOf('\n')));
			e7a.setText(s.substring(s.indexOf('\n')+1));
		}
		if (size > 7)
		{
			String s = saveResult.get(7);
			e8.setText(s.substring(0, s.indexOf('\n')));
			e8a.setText(s.substring(s.indexOf('\n')+1));
		}
		if (size > 8)
		{
			String s = saveResult.get(8);
			e9.setText(s.substring(0, s.indexOf('\n')));
			e9a.setText(s.substring(s.indexOf('\n')+1));
		}
		if (size > 9)
		{
			String s = saveResult.get(9);
			e10.setText(s.substring(0, s.indexOf('\n')));
			e10a.setText(s.substring(s.indexOf('\n')+1));
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity2, menu);
		return true;
	}

}
