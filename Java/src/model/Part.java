package model;

import java.io.Serializable;

public class Part implements Serializable{
	
	private String chassis_nr;
	private String part_name;
	private int weight;
	private int quantity;
	private int pallet_id = 0;
	private String destination;
	
	public Part(String chassis_nr, String part_name, int weight, int quantity) {
		this.chassis_nr = chassis_nr;
		this.part_name = part_name;
		this.weight = weight;
		this.quantity = quantity;
	}
	
	public Part(String chassis_nr, String part_name, int weight, int quantity, int pallet_id, String destination) {
		this.chassis_nr = chassis_nr;
		this.part_name = part_name;
		this.weight = weight;
		this.quantity = quantity;
		this.pallet_id = pallet_id;
		this.destination = destination;
	}
	public String getChassis_nr() {
		return chassis_nr;
	}
	public void setChassis_nr(String chassis_nr) {
		this.chassis_nr = chassis_nr;
	}
	public String getPart_name() {
		return part_name;
	}
	public void setPart_name(String part_name) {
		this.part_name = part_name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setDestination(String destination)
	{
		this.destination = destination;
	}
	
	public String getDestination()
	{
		return destination;
	}
	
	public void setPalletID(int pallet_id)
	{
		this.pallet_id = pallet_id;
	}
	
	public int getPalletID()
	{
		return pallet_id;
	}
	
	public String toString()
	{
		String result = chassis_nr + " \"" + part_name + "\" Weight: " +  weight + " quantity: " + quantity; 
		
		if(destination != null && pallet_id != 0)
		result += " Destination: " + destination + " pallet ID: " + pallet_id;
		
		return result;
	}
}
