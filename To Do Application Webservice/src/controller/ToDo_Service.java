package controller;

import application.Item;

public interface ToDo_Service {
	

	/*Item Methods */
	public Item getItem(int id);
	public boolean addItem(Item a);
	public boolean deleteItem(int id);
	
	public Item[] getAllItems();
}
