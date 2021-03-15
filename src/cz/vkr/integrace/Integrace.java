package cz.vkr.integrace;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONObject;

import cz.vkr.dto.Vitr;

public class Integrace {

	public static Vitr getRealnyVitr() {

		Vitr vitr = null;
		URL url = null;
		String l = "";
		try {
			url = new URL(
					"http://api.openweathermap.org/data/2.5/weather?q=Mlada%20Boleslav&appid=97b9ce4a4e35b0d5d422467eb814fda5");

			String query = "";

			
			URLConnection urlc = url.openConnection();

			urlc.setDoOutput(true);
			urlc.setAllowUserInteraction(false);

			PrintStream ps = new PrintStream(urlc.getOutputStream());

			ps.print(query);
			ps.close();

			BufferedReader br = new BufferedReader(new InputStreamReader(urlc.getInputStream()));

			l = br.readLine();

		//	System.out.println(l);
			br.close();		

		} catch (

		Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		JSONObject json = new JSONObject(l);  
	//	System.out.println(json.toString());  
		double wind = json.getJSONObject("wind").getDouble("deg");
			
	
		vitr = new Vitr((int)json.getJSONObject("wind").getDouble("deg"), json.getJSONObject("wind").getDouble("speed"), json.getJSONObject("wind").getDouble("gust"));

		return vitr;
	}

}
