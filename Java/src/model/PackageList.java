package model;

import java.io.Serializable;

public class PackageList implements Serializable{
	private Package[] packages;
	private int count;
	private int size = 10;
	
	public PackageList()
	{
		packages = new Package[size];
		count = 0;
	}
	
	public void add(Package pack)
	{
		if(count == size)
		{
			Package[] temp = new Package[size*2];
			for(int i = 0 ; i < packages.length; i++)
			{
				temp[i] = packages[i];
			}
			packages = temp;
		}
		packages[count] = pack;
		count++;
	}
	

	public Package[] getPackages() {
		return packages;
	}

	public void setPackages(Package[] packages) {
		this.packages = packages;
	}

	public int getSize() {
		return packages.length;
	}
	
	public String toString()
	{
		String result = "";
		
		for(Package pack : packages)
		{
			if(pack != null)
			{
				result += pack.toString() + "\n";
			}
		}
		return result;
	}
}
