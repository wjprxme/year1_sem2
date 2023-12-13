package logic;

import exception.NameBlankException;

public class Item {

	private String itemName;
	private int price;

	// constructor

	public Item(String itemName) throws NameBlankException {
		//FILL CODE
		this.setItemName(itemName);
		this.price = 0;
		
	}

	public Item(String itemName, int price) throws NameBlankException{
		//FILL CODE
		this.setItemName(itemName);
		this.setPrice(price);
	}

	// methods
	public boolean equals(Item other) {
		//FILL CODE
		Item otherItem = (Item) o;
		if (this.getItemName() == otherItem.getItemName())
			return true;
		else
			return false;
	}

	public String toString() {
		//FILL CODE
		return itemName + " " + "$" + price;
	}

	// getter & setter
	public String getItemName() {
		//FILL CODE
		return this.itemName;
	}

	public void setItemName(String itemName) throws NameBlankException {
		//FILL CODE
		if(itemName.isBlank())
			throw new NameBlankException();
		this.itemName = itemName;
	}

	public int getPrice() {
		//FILL CODE
		return this.price;
	}

	public void setPrice(int price) {
		//FILL CODE
		if (price < 0) {
			price = 0;
		}
		this.price = price;
	}

}
