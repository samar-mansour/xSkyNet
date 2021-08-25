package xSkyeNet;
/*
 * Samar Mansour - 312472285
 * Darine Sky - 320879166
 */
public class Gamers {
	String name;
	String country;
	String mail;
	int num_id;
	
	public Gamers (String name1, String country1, String mail1, int num_id1) {
		name = name1;
		country = country1;
		mail = mail1;
		num_id = num_id1;
	}
	
	public String tpString() {
		return "Gamer name: "+name+
				".\n Country:"+country+".\n mail:"+mail+".\n ID:"+num_id+".\n";
	}
	

}
