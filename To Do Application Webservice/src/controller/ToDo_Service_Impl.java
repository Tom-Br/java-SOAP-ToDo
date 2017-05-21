package controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import application.Item;

public class ToDo_Service_Impl implements ToDo_Service {
	
	private static Map<Integer,Item> items = new HashMap<Integer,Item>();

	@Override
	public Item getItem(int id) {
		return items.get(id);
	}

	@Override
	public boolean addItem(Item a) {
		if(items.get(a.getId()) != null){
			return false;
		}
		else{
			items.put(a.getId(), a);
			return true;
		}
	}

	@Override
	public boolean deleteItem(int id) {
		if(items.get(id) == null){
			return false;
		}
		else{
			items.remove(id);
			return true;
		}
	}

	@Override
	public Item[] getAllItems() {
		Set<Integer> ids = items.keySet();
		
		Item[] list = new Item[ids.size()];
		
		for(int i = 0; i < ids.size(); i++){
			list[i] = items.get(i);
		}
		
		return list;
			
	}
	


}
