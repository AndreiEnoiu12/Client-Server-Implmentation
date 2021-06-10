package model;
import java.io.Serializable;

public class CarList implements Serializable{

		private Car[] cars;
		private int count;
		private int size = 10;
		
		public CarList()
		{
			setCars(new Car[size]);
			count = 0;
		}
		
		public void add(Car car)
		{
			if(count == size)
			{
				Car[] temp = new Car[size*2];
				for(int i = 0 ; i < cars.length; i++)
				{
					temp[i] = cars[i];
				}
				cars = temp;
			}
			cars[count] = car;
			count++;
		}

		public Car[] getCars() {
			return cars;
		}

		public void setCars(Car[] cars) {
			this.cars = cars;
		}

		public int getSize() {
			return cars.length;
		}
		
		public String toString()
		{
			String result = "";
			
			for(Car car : cars)
			{
				if(car != null)
				{
					result += car.toString() + "\n";
				}
			}
			return result;
		}
		
		
}
