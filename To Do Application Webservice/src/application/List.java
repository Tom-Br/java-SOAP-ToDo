package application;

import java.io.Serializable;
import java.util.ArrayList;

public class List implements Serializable{
	
	private static final long serialVersionUID = 1717113668686448358L;
	
	private ArrayList<Item> todo_list;
	
	public List(){};
	
	
	
	public Item getItem(int id){
		return todo_list.get(id);
	}
	
	public void addItem(Item item){
		todo_list.add(item);
	}
	
	public void deleteItem(int id){
		todo_list.remove(id);
	}

	public ArrayList<Item> getTodo_list() {
		return todo_list;
	}

	@Override
	public String toString() {
		String output = "";
		
		for (Item item : todo_list) {
			output += item.toString() + "\n";
		}
		
		return output;
	}
	
	

}
