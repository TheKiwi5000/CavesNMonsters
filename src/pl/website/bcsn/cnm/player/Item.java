package pl.website.bcsn.cnm.player;

public class Item {
	
	private int id;
	private String name;
	
	public static Item air = new Item(0, "");
	
	public static Item sword1 = new Item(10, "Sword");
	
	public static Item pickaxe1 = new Item(20, "Pickaxe");
	
	
	private Item(int itemID, String itemName){
		id = itemID;
		name = itemName;
	}
	
	public Item(int itemID){
		id = itemID;
	}
	
}
