package com.example.mash2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.EditText;

public class HTTPMYGET extends AsyncTask<Void,String,Void>{
	EditText resultsBox;
	String link;
	
	public HTTPMYGET(EditText resultsBox)
	{
		this.resultsBox = resultsBox;
	}
	
	public void setLink(String link)
	{
		this.link = link;
	}
	
	@Override
	public void onPreExecute() {

	}

	@Override
	public Void doInBackground(Void... params) {
		try {
			String result;
			StringBuilder sb = new StringBuilder();

			HttpClient httpclient = new DefaultHttpClient();
			HttpPost httppost = new HttpPost(
					link);
			HttpResponse response = httpclient.execute(httppost);
			HttpEntity entity = response.getEntity();
			InputStream is = entity.getContent();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					is, "iso-8859-1"), 8);
			sb = new StringBuilder();
			String line = reader.readLine();
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
				Log.e("publish",sb.toString());
			}
			is.close();
			result = sb.toString();
			publishProgress(result);
		} catch (Exception e) {

		}
		return null;
	}

	@Override
	public void onPostExecute(Void result) {
		super.onPostExecute(result);
	}

	@Override
	public void onProgressUpdate(String... urls) {
	/*	String toSet = "";
		
		for(String s: urls)
		{
			toSet += s;
		}*/
		this.resultsBox.setText(urls[2]);
	}
}