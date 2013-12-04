package pl.website.bcsn.cnm.player;

import java.util.ArrayList;

public class Inventory {
	
	private ArrayList<Item> items;
	private int size;
	
	public Item getItemInSlot(int slot){
		if(slot > size) return null;
		return items.get(slot);
	}
	
	public void setItemInSlot(int slot, Item item){
		if(slot > size) return;
		items.set(slot, item);
	}
}
