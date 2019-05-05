package main.utils

import java.net.HttpURLConnection;
import java.net.URL;

class HttpUtils {
	
	static String url = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&orderby=time&minmag=2&limit=10&offset=11"
	
	static void main(String[] args) {
		
		def  connection = new URL(url).openConnection() as HttpURLConnection
		
			// set some headers
			connection.setRequestProperty( 'User-Agent', 'groovy-2.4.4' )
			connection.setRequestProperty( 'Accept', 'application/json' )
		
			// get the response code - automatically sends the request
			println connection.responseCode + ": " + connection.inputStream.text
		
	}

	String getEarthQuakeData(String url){

			def  connection = new URL(url).openConnection() as HttpURLConnection
		
			// set some headers
			connection.setRequestProperty( 'User-Agent', 'groovy-2.4.4' )
			connection.setRequestProperty( 'Accept', 'application/json' )

			return connection.inputStream.text
	}
}
