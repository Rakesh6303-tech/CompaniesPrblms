// This question was asked in Written Test
package com.imp;

public class BoatWeight {

	public static void main(String[] args) {
		int persons [] = {100,130,150,80,150};
		int boatsize = 200;  //  BoatSize
		int boats=0;         // Assume Boats is 0
		int CurrentPersonWeight=0;  // Take CurrentPerson Weight =0 
		for(int weight: persons)  // Enhanced Loop 
		{
			if(CurrentPersonWeight+weight<=boatsize) // Condition
			{
				CurrentPersonWeight += weight; // Calculating Person Weight
			}
			else
			{
				boats++;  // Boats will increase
				CurrentPersonWeight=weight; //  Start a new boat with this person's weight
			}
		}

        // Ensure the last boat is counted if it has passengers
		if(CurrentPersonWeight<0)
		{
			boats++;
		}
		System.out.println(boats);
	}

}
