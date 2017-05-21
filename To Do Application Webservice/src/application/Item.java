package application;

import java.io.Serializable;
import java.util.Date;

public class Item implements Serializable{
	
	
	private static int counter = 0;
	private static final long serialVersionUID = -6417745492233165910L;
	
	private int id;
	private String name;
	private Date deadline;
	private boolean finished;
	
	public Item(){
		this(null);
	}
	
	public Item(String name) {
		this(name, null);
	}
	
	public Item(String name, Date deadline) {
		this(name, deadline, false);
	}

	public Item(String name, Date deadline, boolean finished) {
		super();
		this.id = ++counter;
		this.name = name;
		this.deadline = deadline;
		this.finished = finished;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", deadline=" + deadline + ", finished=" + finished + "]";
	}
	
	
	
}
