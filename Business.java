/**
 * The Business Class extends the Building class and is the parent class for the Mall class
 * 
 * @author Aaron Weedman
 * @version 1.0
 * Construction Lab
 * Spring 2023
 */
public class Business extends Building{
	
	protected int numRentableUnits;//used to denote the number of units that can be rented
	
	/*
	 * Empty argument constructor for Business setting the instance field to 0
	 */
	
	public Business() {
		super();
		numRentableUnits = 0;
	}//end Business
	
	/*
	 * Preferred constructor for Business used to support passing parameters for each instance field.
	 */
	
	public Business(String aProjectName, String aCompleteAddress, double aTotalSquareFeet, String aOccupancyGroup, String aSubgroup, int aNumRentableUnits) {
		super();
		projectName = aProjectName;
		completeAddress = aCompleteAddress;
		totalSquareFeet = aTotalSquareFeet;
		occupancyGroup = aOccupancyGroup;
		subgroup = aSubgroup;
		numRentableUnits = aNumRentableUnits;
	}//end Business
	
	public void draw() {
	}
	
	/*
	 * the displayData method uses StringBuilder to give all information about the Building
	 * @return toString
	 */
	
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.displayData() + "\n");
		sb.append("Number of Rentable Units: " + numRentableUnits + "\n");
	
		return sb.toString();
	}//end displayData

	/**
	 * getter for numRentableUnits
	 * @return the numRentableUnits
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits

	/**
	 * setter for numRentableUnits
	 * @param numRentableUnits the numRentableUnits to set
	 */
	public void setNumRentableUnits(int aNumRentableUnits) {
		aNumRentableUnits = numRentableUnits;
	}//end setNumRentableUnits
	
}//end class
