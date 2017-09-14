package arraylist;

import java.util.ArrayList;

public class arrayList
	{

		public static void main(String[] args)
			{
				ArrayList<Double> bodyTemps = new ArrayList<Double>();
				bodyTemps.add(95.0);
				bodyTemps.add(94.3);
				bodyTemps.add(96.7);
				bodyTemps.add(96.3);
				bodyTemps.add(98.8);
				bodyTemps.add(99.1);
				bodyTemps.add(103.0);
				bodyTemps.add(101.0);
				bodyTemps.add(98.6);
				bodyTemps.add(95.8);
				
				
				
		
			for (int i = 0; i < bodyTemps.size(); i++) 
			{
				
				System.out.println(bodyTemps.get(i) + " degrees Fahrenheit");
			}
			System.out.println("People with a fever: ");
			
			removingFever(bodyTemps);
			
			
		}

		private static void removingFever(ArrayList<Double> bodyTemps) {
			bodyTemps.remove(1);
			bodyTemps.remove(2);
			bodyTemps.remove(3);
			bodyTemps.remove(4);
			bodyTemps.remove(10);
			System.out.println(bodyTemps);
			
		}

	}
