package model;

import java.io.Serializable;

public class Pallet implements Serializable{
	private int id;
	private int max_weight_cap;
	private String type_of_parts;
	private PartList parts;
	
	public Pallet(int id, int max_weight_cap, String type_of_parts) {
		this.type_of_parts = type_of_parts;
		this.max_weight_cap = max_weight_cap;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMax_weight_cap() {
		return max_weight_cap;
	}
	public void setMax_weight_cap(int max_weight_cap) {
		this.max_weight_cap = max_weight_cap;
	}
	public String getType_of_parts() {
		return type_of_parts;
	}
	public void setType_of_parts(String type_of_parts) {
		this.type_of_parts = type_of_parts;
	}

	public PartList getParts() {
		return parts;
	}

	public void setParts(PartList parts) {
		this.parts = parts;
	}
	
	public String toString()
	{
		return id + ". \"" + type_of_parts + "\" Max_weight: " + max_weight_cap;
	}
	
}
