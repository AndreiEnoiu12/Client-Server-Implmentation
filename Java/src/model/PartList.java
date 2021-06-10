package model;
import java.io.Serializable;

public class PartList implements Serializable{

		private Part[] parts;
		private int count;
		private int size = 10;
		
		public PartList()
		{
			setParts(new Part[size]);
			count = 0;
		}
		
		public void add(Part part)
		{
			if(count == size)
			{
				Part[] temp = new Part[size*2];
				for(int i = 0 ; i < parts.length; i++)
				{
					temp[i] = parts[i];
				}
				parts = temp;
			}
			parts[count] = part;
			count++;
		}

		public Part[] getParts() {
			return parts;
		}

		public void setParts(Part[] parts) {
			this.parts = parts;
		}

		public int getSize() {
			return parts.length;
		}
		
		public String toString()
		{
			String result = "";
			
			for(Part part : parts)
			{
				if(part != null)
				{
					result += part.toString() + "\n";
				}
			}
			return result;
		}
		
		
}
