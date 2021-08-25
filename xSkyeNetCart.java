package xSkyeNet;

import java.util.Scanner;
import java.util.Vector;


public class xSkyeNetCart {
	
	Vector<Gamers> gamers = new Vector<Gamers>();
	Vector<Games> games = new Vector <Games>();
	Vector <Other_Companies> other_companies = new Vector <Other_Companies>();
	Vector <Xskyenet_platform> xskyenet = new Vector <Xskyenet_platform>();

	/*This function, show us if the game available in the store or not
	and give us the lowest price.
	*/
	public void sellGames (Games gs) {
		int games_id = gs.game_id;
		int i;
		for (i=0; i< games.size();i++) {
			if (games.elementAt(i).game_id==games_id) {
				double min = 0;
				if (min > gs.price)
					min = gs.price;
					System.out.println(gs.game_name+" "+ gs.price);
			}
			else
				System.out.println("Sorry, This game not available yet");
			break;
		}
	}
	
	//this code shows us the items that the user added to cart
	private int itemCount;
	private double totalPrice;
	private static int capacity;
	private static Games[] cart = new Games[capacity];
	
	public xSkyeNetCart() {
		itemCount = 10;
		totalPrice = 0.0;
		capacity = 0;
	}
	
	
	public void add (int game_id1, double price1, String game_name1, String type1, int year, int month, int day) {
		Games item = new Games (game_id1, price1, game_name1, type1, day, month, year);
		totalPrice += price1;
		cart[itemCount] = item;
		itemCount += 1;
		if (itemCount == capacity) {
			increaseSize();
		}
		
	}

	public static void remove (String itemName) {
		Scanner s = new Scanner (System.in);
		for (int i = 0; i < cart.length; i++) {
			Games remove = (Games) cart.get(i); // why it's not working!!!
			if (itemName.equals(remove.getgame_name())) {
				cart.remove(i);
			}
		}
		
		System.out.println("\n" + "Game Name" + game_name + "wasn't found");
	}
	
	
	private void increaseSize() {
		Games[] item = new Games[capacity+5];
		for (int i = 0; i < capacity; i++) {
			item[i] = cart[i];
		}
		cart = item;
		item = null;
		capacity = cart.length;
	}
	
	
}

