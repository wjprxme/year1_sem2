package logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import exception.NameBlankException;

public class ItemUtil {

	public static Scanner sc = new Scanner(System.in);

	public static boolean itemNameIsExist(Market market, String itemName) {
		//FILL CODE
	}

	public static boolean hasEnoughMoneytoBuy(Inventory toBuy, Item item, int amount) {
		//FILL CODE
	}

	public static ArrayList<Item> getItemFromFile(String filename) {
		
		File fileToRead = new File(filename);
		ArrayList<Item> itemsFromFile = new ArrayList<Item>();

		//FILL CODE
		
		return null;
	}

	public static void playerSellplayer(Inventory toSell, Inventory toBuy, Item item, int amount) {
		if (!hasEnoughMoneytoBuy(toBuy, item, amount)) {
			System.out.println(toBuy.getPlayerName() + " dont't have enough money to buy this item.");
		} else {
			System.out.println("=========SELL CONFIRMATION=========");
			System.out.println("    Selling " + item.getItemName() + " x" + amount
					+ " to " + toBuy.getPlayerName());
			System.out.println("            for $" + item.getPrice() * amount
					+ "             ");
			System.out.println(" >> Type \"1\" to confirm selling  ");
			System.out.println(" >> Type anything else to cancel ");
			System.out.println("===================================");
			String input = sc.nextLine();
			switch (input) {
			case "1":
				playerSellPlayerConfirmed(toSell, toBuy, item, amount);
				System.out.println("<<TRANSACTION COMPLETE>>");
				break;
			default:
				System.out.println("<<SELL CANCEL>>");
				break;
			}
		}
	}
	
	public static void playerSellPlayerConfirmed(Inventory toSell, Inventory toBuy, Item item, int amount) {
		//FILL CODE
	}

	public static void playerSellMarket(Inventory toSell, Item item, int amount) {
		System.out.println("=========SELL CONFIRMATION=========");
		System.out.println("    Selling " + item.getItemName() + " x" + amount
				+ " to market      ");
		System.out.println(
				"            for $" + item.getPrice() * amount + "             ");
		System.out.println(" >> Type \"1\" to confirm selling  ");
		System.out.println(" >> Type anything else to cancel ");
		System.out.println("===================================");
		String input = sc.nextLine();
		switch (input) {
		case "1":
			playerSellMarketConfirmed(toSell, item, amount);
			System.out.println("<<TRANSACTION COMPLETE>>");
			break;
		default:
			System.out.println("<<SELL CANCEL>>");
			break;
		}
	}
	
	public static void playerSellMarketConfirmed(Inventory toSell, Item item, int amount) {
		//FILL CODE
	}
	
	public static void playerBuyMarket(Inventory toBuy, Item item, int amount) {
		if (!ItemUtil.hasEnoughMoneytoBuy(toBuy, item, amount)) {
			System.out.println(toBuy.getPlayerName() + " Dont't have enough money\nto buy this item.");
		} else {
			System.out.println("=========BUY CONFIRMATION=========");
			System.out.println("	" + toBuy.getPlayerName() + " is buying ");
			System.out.println("	" + item.getItemName() + " x" + amount + " for $"
					+ item.getPrice() * amount);
			System.out.println(" >> Type \"1\" to confirm buying  ");
			System.out.println(" >> Type anything else to cancel");
			System.out.println("==================================");
			String input = sc.nextLine();
			switch (input) {
			case "1":
				playerBuyMarketConfirmed(toBuy, item, amount);
				System.out.println("TRANSACTION COMPLETE!");
				break;
			default:
				System.out.println("BUY CANCEL!");
				break;
			}
		}
	}
	
	public static void playerBuyMarketConfirmed(Inventory toBuy, Item item, int amount) {
		//FILL CODE
	}

}
