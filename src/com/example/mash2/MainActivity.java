package com.example.mash2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.view.*;
import android.widget.*;
import org.json.JSONArray;
import org.json.JSONObject;
import android.graphics.*;


public class MainActivity extends Activity {
	Button generateButton, doneButton;
	//HTTPMYGET conn;
	Connection conn;
	EditText zipcode;
	EditText resultsBox;
	TextView r1,r2,r3,r4,r5;
	TextView r1a,r2a,r3a,r4a,r5a;
	boolean optionSelected1 = false;
	boolean optionSelected2 = false;
	boolean optionSelected3 = false;
	boolean optionSelected4 = false;
	boolean optionSelected5 = false;
	ArrayList<String> saveResult = new ArrayList<String>();
	String savedString1 = "";
	String savedString2 = "";
	String savedString3 = "";
	String savedString4 = "";
	String savedString5 = "";
	int oldColor = Color.WHITE;
	int newColor = Color.CYAN;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		generateButton=(Button)findViewById(R.id.buttonGenerate);
		zipcode=(EditText)findViewById(R.id.zipbox);
		r1=(TextView)findViewById(R.id.r1);
		r2=(TextView)findViewById(R.id.r2);
		r3=(TextView)findViewById(R.id.r3);
		r4=(TextView)findViewById(R.id.r4);
		r5=(TextView)findViewById(R.id.r5);
		r1a=(TextView)findViewById(R.id.r1a);
		r2a=(TextView)findViewById(R.id.r2a);
		r3a=(TextView)findViewById(R.id.r3a);
		r4a=(TextView)findViewById(R.id.r4a);
		r5a=(TextView)findViewById(R.id.r5a);
		doneButton = (Button)findViewById(R.id.done);
		
		generateButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				//conn = new HTTPMYGET(resultsBox);
				conn = new Connection();
				if(optionSelected1){
					//save in arraylist
					saveResult.add(savedString1);
					savedString1 = "";
				} 
				if(optionSelected2){
					saveResult.add(savedString2);
					savedString2 = "";
				} 
				if(optionSelected3){
					saveResult.add(savedString3);
					savedString3 = "";
				} 
				if(optionSelected4){
					saveResult.add(savedString4);
					savedString4 = "";
				} 
				if(optionSelected5){
					saveResult.add(savedString5);
					savedString5 = "";
				}
				generate();
				optionSelected1 = false;
				optionSelected2 = false;
				optionSelected3 = false;
				optionSelected4 = false;
				optionSelected5 = false;
				r1.setBackgroundColor(oldColor);
				r1a.setBackgroundColor(oldColor);
				r2.setBackgroundColor(oldColor);
				r2a.setBackgroundColor(oldColor);
				r3.setBackgroundColor(oldColor);
				r3a.setBackgroundColor(oldColor);
				r4.setBackgroundColor(oldColor);
				r4a.setBackgroundColor(oldColor);
				r5.setBackgroundColor(oldColor);
				r5a.setBackgroundColor(oldColor);
			}
		
		});
		
		r1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				
				optionSelected1 = !optionSelected1;				
				savedString1 = r1.getText() + "\n" + r1a.getText();
				if (optionSelected1 == true)
				{
					r1.setBackgroundColor(newColor);
					r1a.setBackgroundColor(newColor);
				}
				else
				{
					r1.setBackgroundColor(oldColor);
					r1a.setBackgroundColor(oldColor);
				}
			}
		});
		
		r1a.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				
				optionSelected1 = !optionSelected1;
				savedString1 = r1.getText() + "\n" + r1a.getText();
				if (optionSelected1 == true)
				{
					r1.setBackgroundColor(newColor);
					r1a.setBackgroundColor(newColor);
				}
				else
				{
					r1.setBackgroundColor(oldColor);
					r1a.setBackgroundColor(oldColor);
				}
			}
		});
		
		r2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				
				optionSelected2 = !optionSelected2;
				savedString2 = r2.getText() + "\n" + r2a.getText();
				
				if (optionSelected2 == true)
				{
					r2.setBackgroundColor(newColor);
					r2a.setBackgroundColor(newColor);
				}
				else
				{
					r2.setBackgroundColor(oldColor);
					r2a.setBackgroundColor(oldColor);
				}
			}
		});
		
		r2a.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				
				optionSelected2 = !optionSelected2;
				savedString2 = r2.getText() + "\n" + r2a.getText();
				if (optionSelected2 == true)
				{
					r2.setBackgroundColor(newColor);
					r2a.setBackgroundColor(newColor);
				}
				else
				{
					r2.setBackgroundColor(oldColor);
					r2a.setBackgroundColor(oldColor);
				}
			}
		});
		r3.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				
				optionSelected3 = !optionSelected3;
				savedString3 = r3.getText() + "\n" + r3a.getText();
				if (optionSelected3 == true)
				{
					r3.setBackgroundColor(newColor);
					r3a.setBackgroundColor(newColor);
				}
				else
				{
					r3.setBackgroundColor(oldColor);
					r3a.setBackgroundColor(oldColor);
				}
			}
		});
		
		r3a.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				
				optionSelected3 = !optionSelected3;
				savedString3 = r3.getText() + "\n" + r3a.getText();
				
				if (optionSelected3 == true)
				{
					r3.setBackgroundColor(newColor);
					r3a.setBackgroundColor(newColor);
				}
				else
				{
					r3.setBackgroundColor(oldColor);
					r3a.setBackgroundColor(oldColor);
				}
			}
		});
		
		r4.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				
				optionSelected4 = !optionSelected4;
				savedString4 = r4.getText() + "\n" + r4a.getText();
				
				if (optionSelected4 == true)
				{
					r4.setBackgroundColor(newColor);
					r4a.setBackgroundColor(newColor);
				}
				else
				{
					r4.setBackgroundColor(oldColor);
					r4a.setBackgroundColor(oldColor);
				}
			}
		});
		
		r4a.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				
				optionSelected4 = !optionSelected4;
				savedString4 = r4.getText() + "\n" + r4a.getText();
				
				if (optionSelected4 == true)
				{
					r4.setBackgroundColor(newColor);
					r4a.setBackgroundColor(newColor);
				}
				else
				{
					r4.setBackgroundColor(oldColor);
					r4a.setBackgroundColor(oldColor);
				}
			}
		});
		
		r5.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				
				optionSelected5 = !optionSelected5;
				savedString5 = r5.getText() + "\n" + r5a.getText();
				
				if (optionSelected5 == true)
				{
					r5.setBackgroundColor(newColor);
					r5a.setBackgroundColor(newColor);
				}
				else
				{
					r5.setBackgroundColor(oldColor);
					r5a.setBackgroundColor(oldColor);
				}
			}
		});
		
		r5a.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				
				optionSelected5 = !optionSelected5;
				savedString5 = r5.getText() + "\n" + r5a.getText();
				if (optionSelected5 == true)
				{
					r5.setBackgroundColor(newColor);
					r5a.setBackgroundColor(newColor);
				}
				else
				{
					r5.setBackgroundColor(oldColor);
					r5a.setBackgroundColor(oldColor);
				}
			}
		});
		
		doneButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if(optionSelected1){
					//save in arraylist
					saveResult.add(savedString1);
					savedString1 = "";
				} 
				if(optionSelected2){
					saveResult.add(savedString2);
					savedString2 = "";
				} 
				if(optionSelected3){
					saveResult.add(savedString3);
					savedString3 = "";
				} 
				if(optionSelected4){
					saveResult.add(savedString4);
					savedString4 = "";
				} 
				if(optionSelected5){
					saveResult.add(savedString5);
					savedString5 = "";
				}
				startActivity(new Intent(MainActivity.this, frame2.class));
				frame2.saveResult = saveResult;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	public void generate()
	{
		
		
		ArrayList<String[]> events = parse_foursquare();
		ArrayList<String[]> active = parse_active();
		for (String[] a : active)
			events.add(a);
		
		filter(events);
		
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(events.size()-1);
		r1.setText(events.get(randomInt)[0]);
		r1a.setText(events.get(randomInt)[1] +"\n"+ events.get(randomInt)[2] +", "+ events.get(randomInt)[3]);
		events.remove(randomInt);
		
		randomInt = randomGenerator.nextInt(events.size()-1);
		r2.setText(events.get(randomInt)[0]);
		r2a.setText(events.get(randomInt)[1] +"\n"+ events.get(randomInt)[2] +", "+ events.get(randomInt)[3]);
		events.remove(randomInt);
		
		randomInt = randomGenerator.nextInt(events.size()-1);
		r3.setText(events.get(randomInt)[0]);
		r3a.setText(events.get(randomInt)[1] +"\n"+ events.get(randomInt)[2] +", "+ events.get(randomInt)[3]);
		events.remove(randomInt);
		
		randomInt = randomGenerator.nextInt(events.size()-1);
		r4.setText(events.get(randomInt)[0]);
		r4a.setText(events.get(randomInt)[1] +"\n"+ events.get(randomInt)[2] +", "+ events.get(randomInt)[3]);
		events.remove(randomInt);
		
		randomInt = randomGenerator.nextInt(events.size()-1);
		r5.setText(events.get(randomInt)[0]);
		r5a.setText(events.get(randomInt)[1] +"\n"+ events.get(randomInt)[2] +", "+ events.get(randomInt)[3]);
		//conn.setLink("https://api.foursquare.com/v2/venues/search?near=08816&oauth_token=EQQO2X52JL3ZJLH2ACQZJIIRZJIVSOP0OSU25PXMGMRLVQMB&v=20130330");
		//AsyncTask a = conn.execute();
		//String s = conn.get("http://www.google.com");
		
	}
	
	private void filter(ArrayList<String[]> events)
	{
		String[] words = {"garage", "court", "parking","church", "dental", "cemetery", "cardiovascular", "care", "chiro", "funeral", "cremation", "radiology", "university", "office", "dr.", "doctor", "law", "school", "residence", "pharmacy", "laundry", "bus", "airport", "airplane", "hotel"};
		for (int i = 0; i < events.size(); i++)
			for (String w : words)
				if (events.get(i)[0].toLowerCase().contains(w))
					events.remove(i);
	}
	
	private ArrayList<String[]> parse_foursquare()
	{
		/*
		 * 0 - name
		 * 1 - address
		 * 2 - city
		 * 3 - state
		 */
		ArrayList<String[]> sList = new ArrayList<String[]>();
		String[] sArray;
		String s = conn.get("https://api.foursquare.com/v2/venues/search?limit=50&radius=40233&near="+zipcode.getText()+"&oauth_token=EQQO2X52JL3ZJLH2ACQZJIIRZJIVSOP0OSU25PXMGMRLVQMB&v=20130330");
		Map<String, String> map = new HashMap<String, String>();
		try {
			JSONObject json = new JSONObject(s);
			JSONObject jsonresp = json.getJSONObject("response");
			JSONArray jsonArr = jsonresp.getJSONArray("venues");
			for (int i = 1; i < jsonArr.length(); i++)
			{
				sArray = new String[4];
				JSONObject j0 = jsonArr.getJSONObject(i);
				if (!j0.has("name"))
					continue;
				sArray[0] = j0.getString("name"); //name
				JSONObject jloc = j0.getJSONObject("location");
				if (jloc.has("address"))
				{
					sArray[1] = jloc.getString("address");
				} else
					continue;
				if (jloc.has("city"))
					sArray[2] = jloc.getString("city");
				else
					continue;
				if (jloc.has("state"))
					sArray[3] = jloc.getString("state");
				else
					continue;
				sList.add(sArray);
			}

/*
			Iterator keys = j0.keys();
			
			while (keys.hasNext())
			{
				String key = (String) keys.next();
				map.put(key, j0.getString(key));
			}*/
		    } catch (Exception e) {
		      e.printStackTrace();
		    }
		/*
		Pattern p = Pattern.compile("\"id\":\"[0-9a-zA-Z]\"" +
				"\"name\":\"([^\"]+)\"" +
				"" +
				"" +
				"" +
				""
				location: {
			        address: "110 Wall Street"
			        lat: 40.69990522980407
			        lng: -74.00132428335488
			        distance: 112
			        city: "New York"
			        state: "NY"
			        country: "United States"
			        cc: "US"
			    }
				);*/
	/*	
		String r = "";
		for ( String[] arrr : sList)
		{
			r += arrr[0]+ " | " + arrr[1]+ " | " +arrr[2]+ " | " +arrr[3]+ "\n";
		}
		
		resultsBox.setText(r);*/
		
		return sList;
	}
	
	private ArrayList<String[]> parse_active()
	{
		/*
		 * 0 - name
		 * 1 - address
		 * 2 - city
		 * 3 - state
		 */
		String title = "";
		String address = "";
		String city = "";
		String state = "";
		ArrayList<String[]> info = new ArrayList<String[]>();
		String[] sArray;
		String s = conn.get("http://api.amp.active.com/search/?v=json&l="+zipcode.getText()+"&r=25&f=activities&s=relevance&num=500&page=1&api_key=j2csgzbzudr9ucsm5axdnzt6");
		Map<String, String> map = new HashMap<String, String>();
		try {
			
			JSONObject json = new JSONObject(s);
			JSONArray jsonArr = json.getJSONArray("_results");
			for (int i = 1; i < jsonArr.length(); i++)
			{
				sArray = new String[4];
				JSONObject j0 = jsonArr.getJSONObject(i);
				
				if(j0.has("title")) {
					title = j0.getString("title"); //name
					sArray[0] = title;
				} else
					continue;
				
				JSONObject jsonObj = j0.getJSONObject("meta");
				
				if(jsonObj.has("address") && !jsonObj.getString("address").equals(" ") && !jsonObj.getString("address").equals("")) {
					address = jsonObj.getString("address"); //address
					sArray[1] = address;
				}else
					continue;
				
				if(jsonObj.has("city") && !jsonObj.getString("city").equals(" ") && !jsonObj.getString("city").equals("")) {
					city = jsonObj.getString("city"); //city
					sArray[2] = city;
				}else
					continue;
				
				if(jsonObj.has("state") && !jsonObj.getString("state").equals(" ") && !jsonObj.getString("state").equals("")) {
					state = jsonObj.getString("state"); //state
					sArray[3] = state;
				}		else
					continue;
				info.add(sArray);
			}
			
/*
			Iterator keys = j0.keys();
			
			while (keys.hasNext())
			{
				String key = (String) keys.next();
				map.put(key, j0.getString(key));
			}*/
		    } catch (Exception e) {
		      e.printStackTrace();
		    }
		/*
		Pattern p = Pattern.compile("\"id\":\"[0-9a-zA-Z]\"" +
				"\"name\":\"([^\"]+)\"" +
				"" +
				"" +
				"" +
				""
				location: {
			        address: "110 Wall Street"
			        lat: 40.69990522980407
			        lng: -74.00132428335488
			        distance: 112
			        city: "New York"
			        state: "NY"
			        country: "United States"
			        cc: "US"
			    }
				);*/
		
		/*String r = "";
		
		for ( String[] arrr : info){
			
			r += arrr[0]+ " | " + arrr[1]+ " | " +arrr[2]+ " | " +arrr[3]+ "\n";
			resultsBox.setText(r);
		}*/
		
		return info;
	}
	
	


}
