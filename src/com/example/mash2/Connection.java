package com.example.mash2;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.StrictMode;

/**
 * This example demonstrates an alternative way to call a URL
 * using the Apache HttpClient HttpGet and HttpResponse
 * classes.
 * 
 * I copied the guts of this example from the Apache HttpClient
 * ClientConnectionRelease class, and decided to leave all the
 * try/catch/finally handling in the class. You don't have to catch
 * all the exceptions individually like this, I just left the code
 * as-is to demonstrate all the possible exceptions.
 * 
 * Apache HttpClient: http://hc.apache.org/httpclient-3.x/
 *
*/
public class Connection {
	
  
    HttpClient httpClient = new DefaultHttpClient();
    
    public Connection()
    {
    }
    
    
    
    
    
    
    
    public String get(String link){
    	String s = "";
        try {
            StrictMode.ThreadPolicy policy = new StrictMode.
                    ThreadPolicy.Builder().permitAll().build();
                    StrictMode.setThreadPolicy(policy); 
            URL url = new URL(link);
            HttpURLConnection con = (HttpURLConnection) url
              .openConnection();
            s = readStream(con.getInputStream());
            } catch (Exception e) {
            e.printStackTrace();
          }
        	return s;
    }
          private String readStream(InputStream in) {
        	  String returnString= "";
            BufferedReader reader = null;
            try {
              reader = new BufferedReader(new InputStreamReader(in));
              String line = "";
              while ((line = reader.readLine()) != null) {
                returnString = returnString + line;
              }
            } catch (IOException e) {
              e.printStackTrace();
            } finally {
              if (reader != null) {
                try {
                  reader.close();
                } catch (IOException e) {
                  e.printStackTrace();
                  }
              }
            }
            
            return returnString;
          } 
    
    
    
    
    
    
    
    
    public String getold(String link)
    {
	    String returnString = "";
	    try {
	      // this twitter call returns json results.
	      // see this page for more info: https://dev.twitter.com/docs/using-search
	      // http://search.twitter.com/search.json?q=%40apple
	
	      // Example URL 1: this yahoo weather call returns results as an rss (xml) feed
	      //HttpGet httpGetRequest = new HttpGet("http://weather.yahooapis.com/forecastrss?p=80020&u=f");
	      
	      // Example URL 2: this twitter api call returns results in a JSON format
	      HttpGet httpGetRequest = new HttpGet(link);
	
	      // Execute HTTP request
	      HttpResponse httpResponse = httpClient.execute(httpGetRequest);
	
	      // Get hold of the response entity
	      HttpEntity entity = httpResponse.getEntity();
	
	      // If the response does not enclose an entity, there is no need
	      // to bother about connection release
	      byte[] buffer = new byte[1024];
	      if (entity != null) {
	        InputStream inputStream = entity.getContent();
	        try {
	          int bytesRead = 0;
	          BufferedInputStream bis = new BufferedInputStream(inputStream);
	          while ((bytesRead = bis.read(buffer)) != -1) {
	            String chunk = new String(buffer, 0, bytesRead);
	            returnString = returnString + chunk;
	          }
	        } catch (IOException ioException) {
	          // In case of an IOException the connection will be released
	          // back to the connection manager automatically
	          ioException.printStackTrace();
	        } catch (RuntimeException runtimeException) {
	          // In case of an unexpected exception you may want to abort
	          // the HTTP request in order to shut down the underlying
	          // connection immediately.
	          httpGetRequest.abort();
	          runtimeException.printStackTrace();
	        } finally {
	          // Closing the input stream will trigger connection release
	          try {
	            inputStream.close();
	          } catch (Exception ignore) {
	          }
	        }
	      }
	    } catch (ClientProtocolException e) {
	      // thrown by httpClient.execute(httpGetRequest)
	      e.printStackTrace();
	    } catch (IOException e) {
	      // thrown by entity.getContent();
	      e.printStackTrace();
	    } finally {
	      // When HttpClient instance is no longer needed,
	      // shut down the connection manager to ensure
	      // immediate deallocation of all system resources
	      httpClient.getConnectionManager().shutdown();
	    }
	    return returnString;
    }
    
    
}