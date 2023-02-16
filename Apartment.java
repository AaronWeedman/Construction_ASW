/**
 * The Apartment class extends the Residential class and represents where
 * multiple families can live
 * 
 * @author Aaron Weedman
 * @version 1.0
 * Construction Project
 * Spring 2023
 */
public class Apartment extends Residential{

	private int numRentableUnits;//used to denote the number of rent-able units
	private double avgUnitSize;//used to show average unit size
	private boolean parkingAvailiable;// boolean for if there is parking or not.
	
	/*
	 * Empty argument constructor for Apartment setting all instance fields to "" or 0.0
	 */
	
	public Apartment() {
		super();
		numRentableUnits = 0;
		avgUnitSize = 0.0;
		parkingAvailiable = false;
	}//end Apartment
	
	/*
	 * Preferred constructor for Apartment used to support passing parameters for each instance field.
	 */
	
	public Apartment(String aProjectName, String aCompleteAddress, double aTotalSquareFeet, String aOccupancyGroup, String aSubgroup, int aNumBedrooms, int aNumBathrooms, boolean aLaundryRoom, int aNumRentableUnits, double aAvgUnitSize, boolean aParkingAvailiable) {
		super();
		projectName = aProjectName;
		completeAddress = aCompleteAddress;
		totalSquareFeet = aTotalSquareFeet;
		occupancyGroup = aOccupancyGroup;
		subgroup = aSubgroup;
		numBedrooms = aNumBedrooms;
		numBathrooms = aNumBathrooms;
		laundryRoom = aLaundryRoom;
		numRentableUnits = aNumRentableUnits;
		avgUnitSize = aAvgUnitSize;
		parkingAvailiable = aParkingAvailiable;
	}//end Apartment
	
	public void draw() {
	}//end Draw
	/*
	 * Method that uses StringBuilder to show all data for the apartment.
	 * @return sb.toString
	 */
	
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.displayData() + "\n");
		sb.append("Number of Rentable Units: " + numRentableUnits + "\n");
		sb.append("Average Units Size: " + avgUnitSize + "\n");
		sb.append("Is there parking availiable?: " + parkingAvailiable + "\n");
		
		return sb.toString();
	}//end displayData

	/**
	 * getter for numRentableUnits
	 * @return the numRentableUnits
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRenableUnits

	/**
	 * setter for numRentableUnits
	 * @param numRentableUnits the numRentableUnits to set
	 */
	public void setNumRentableUnits(int aNumRentableUnits) {
		aNumRentableUnits = numRentableUnits;
	}//end setNumRentableUnits

	/**
	 * getter for avgUnitSize
	 * @return the avgUnitSize
	 */
	public double getAvgUnitSize() {
		return avgUnitSize;
	}//end getAvgUnitSize

	/**
	 * setter for avgUnitSize
	 * @param avgUnitSize the avgUnitSize to set
	 */
	public void setAvgUnitSize(double aAvgUnitSize) {
		aAvgUnitSize = avgUnitSize;
	}//end setAvgUnitSize

	/**
	 * getter for parkingAvailiable
	 * @return the parkingAvailiable
	 */
	public boolean isParkingAvailiable() {
		return parkingAvailiable;
	}//end isParkingAvailiable

	/**
	 * setter for parkingAvailiable
	 * @param parkingAvailiable the parkingAvailiable to set
	 */
	public void setParkingAvailiable(boolean aParkingAvailiable) {
		aParkingAvailiable = parkingAvailiable;
	}//end setParkingAvailiable
	
}//end class
