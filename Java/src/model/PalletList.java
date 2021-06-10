package model;

import java.io.Serializable;

public class PalletList implements Serializable{
	private Pallet[] pallets;
	private int count;
	private int size = 10;
	
	public PalletList()
	{
		pallets = new Pallet[size];
		count = 0;
	}
	
	public void add(Pallet pallet)
	{
		if(count == size)
		{
			Pallet[] temp = new Pallet[size*2];
			for(int i = 0 ; i < pallets.length; i++)
			{
				temp[i] = pallets[i];
			}
			pallets = temp;
		}
		pallets[count] = pallet;
		count++;
	}
	

	public Pallet[] getPallets() {
		return pallets;
	}

	public void setPackages(Pallet[] pallets) {
		this.pallets = pallets;
	}

	public int getSize() {
		return pallets.length;
	}
	
	public String toString()
	{
		String result = "";
		
		for(Pallet pallet : pallets)
		{
			if(pallet != null)
			{
				result += pallet.toString() + "\n";
			}
		}
		return result;
	}
}
