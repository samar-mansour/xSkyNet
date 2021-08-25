/*
 * Samar Mansour - 312472285
 * Darine Sky - 320879166
 */
package xSkyeNet;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Games {
	
	String game_name;
	String type;
	int game_id;
	double price;
	GregorianCalendar date;
	
	
	public Games(int game_id1, double price1, String game_name1, String type1,int year, int month, int day) {
		game_name = game_name1;
		type = type1;
		game_id = game_id1;
		price = price1;
		date = new GregorianCalendar();
		date.set(year, month, day);
	}


	public String getgame_name() {
		return game_name;
	}
	
	public String gettype() {
		return type;
	}
	
	public int getgame_id() {
		return game_id;
	}
	
	public double getprice() {
		return price;
	}
	
	
	
	
		
	
	

	public String toString() {
		return "Game name: "+game_name+".\n Type: "+type+
				".\n Game ID: "+game_id+".\n Price: "+price+".\n Date: "+date.getTime().toGMTString()+".\n";
	}
	
	
	
}
