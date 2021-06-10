package model;

import java.io.Serializable;

public class Package implements Serializable{
	private int id;
	private String type;
	private String destination;
	private PartList parts;
	
	public Package(int id, String type, String destination) {
		this.id = id;
		this.type = type;
		this.destination = destination;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public PartList getParts() {
		return parts;
	}
	public void setParts(PartList parts) {
		this.parts = parts;
	}
	
	public String toString()
	{
		return id + ". \"" + type + "\" Destination: " + destination + "\n";
	}
}
