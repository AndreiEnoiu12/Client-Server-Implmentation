package model;

import java.io.Serializable;

public class Car implements Serializable{
	private String chassis_nr;
	private String model;
	private int weight;
	public Car(String chassis_nr, String model, int weight)
	{
		this.chassis_nr = chassis_nr;
		this.model = model;
		this.weight = weight;
	}
	public String getchassis_nr() {
		return chassis_nr;
	}
	public void setchassis_nr(String chassis_nr) {
		this.chassis_nr = chassis_nr;
	}
	public String getmodel() {
		return model;
	}
	public void setmodel(String model) {
		this.model = model;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public boolean equals(Object o) {
	    if (this == o)
	        return true;
	    if (o == null)
	        return false;
	    if (getClass() != o.getClass())
	        return false;
	    
	    Car car = (Car) o;
	    return chassis_nr == car.chassis_nr;
	}
	
	public String toString()
	{
		return chassis_nr + ". \"" + model + "\" Weight: " + weight + "\n";
	}
}
