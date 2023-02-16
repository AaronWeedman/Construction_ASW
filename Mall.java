/**
 * The Mall class extends the Business class and represents where
 * multiple businesses can operate out of
 * 
 * @author Aaron Weedman
 * @version 1.0
 * Construction Lab
 * Spring 2023
 */
public class Mall extends Business{
	
	private int numRentedUnits;//used to denote the number of units being rented
	private double medianUnitSize;//used to denote the median unit size
	private int numParkingSpaces;//used to denote the number of parking spaces
	
	/*
	 * Empty argument constructor for Mall setting all instance fields to 0 or 0.0
	 */
	
	public Mall() {
		super();
		numRentedUnits = 0;
		medianUnitSize = 0.0;
		numParkingSpaces = 0;
	}//end Mall
	
	/*
	 * Preferred constructor for Mall used to support passing parameters for each instance field.
	 */
	
	public Mall(String aProjectName, String aCompleteAddress, double aTotalSquareFeet, String aOccupancyGroup, String aSubgroup, int aNumRentableUnits, int aNumRentedUnits, double aMedianUnitSize, int aNumParkingSpaces) {
		super();
		projectName = aProjectName;
		completeAddress = aCompleteAddress;
		totalSquareFeet = aTotalSquareFeet;
		occupancyGroup = aOccupancyGroup;
		subgroup = aSubgroup;
		numRentableUnits = aNumRentableUnits;
		numRentedUnits = aNumRentedUnits;
		medianUnitSize = aMedianUnitSize;
		numParkingSpaces = aNumParkingSpaces;
	}//end Mall
	
	public void draw() {
	}//end Draw
	
	/*
	 * the displayData method uses StringBuilder to give all information about the mall
	 * @return toString
	 */
	
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.displayData() + "\n");
		sb.append("Number of Rented Units: " + numRentedUnits + "\n");
		sb.append("Median Units Size: " + medianUnitSize + "\n");
		sb.append("Number of Parking Spaces: " + numParkingSpaces + "\n");
		
		return sb.toString();
	}//end displayData

	/**
	 * getter for numRentedUnits
	 * @return the numRentedUnits
	 */
	public int getNumRentedUnits() {
		return numRentedUnits;
	}//end getNumRentedUnits

	/**
	 * setter for numRentedUnits
	 * @param numRentedUnits the numRentedUnits to set
	 */
	public void setNumRentedUnits(int aNumRentedUnits) {
		aNumRentedUnits = numRentedUnits;
	}//end setNumRentedUntis

	/**
	 * getter for medianUnitSize
	 * @return the medianUnitSize
	 */
	public double getMedianUnitSize() {
		return medianUnitSize;
	}//end getMedianUnitSize

	/**
	 * setter for medianUnitSize
	 * @param medianUnitSize the medianUnitSize to set
	 */
	public void setMedianUnitSize(double aMedianUnitSize) {
		aMedianUnitSize = medianUnitSize;
	}//end setMedianUnitSize

	/**
	 * getter for numParkingSpaces
	 * @return the numParkingSpaces
	 */
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}//end getNumParkingSpaces

	/**
	 * setter for numParkingSpaces
	 * @param numParkingSpaces the numParkingSpaces to set
	 */
	public void setNumParkingSpaces(int aNumParkingSpaces) {
		aNumParkingSpaces = numParkingSpaces;
	}//end setNumParkingSpaces

}//end class
