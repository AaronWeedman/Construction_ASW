/**
 * The SingleFamilyHome class extends the Residential class and represents where
 * one fmaily can live.
 * 
 * @author Aaron Weedman
 * @version 1.0
 * Construction Project
 * Spring 2023
 *
 */
public class SingleFamilyHome extends Residential{
	
	private boolean garage;//used to show is the house has a garage or not
	
	/*
	 * Empty argument constructor for SingleFamilyHome setting the instance field to false
	 */
	
	public SingleFamilyHome() {
		super();
		garage = false;
	}//end SingleFamilyHome
	
	/*
	 * Preferred constructor for SingleFamilyHome used to support passing parameters for each instance field.
	 */
	
	public SingleFamilyHome(String aProjectName, String aCompleteAddress, double aTotalSquareFeet, String aOccupancyGroup, String aSubgroup, int aNumBedrooms, int aNumBathrooms, boolean aLaundryRoom, boolean aGarage) {
		super();
		projectName = aProjectName;
		completeAddress = aCompleteAddress;
		totalSquareFeet = aTotalSquareFeet;
		occupancyGroup = aOccupancyGroup;
		subgroup = aSubgroup;
		numBedrooms = aNumBedrooms;
		numBathrooms = aNumBathrooms;
		laundryRoom = aLaundryRoom;
		garage = aGarage;
	}//end SingleFamilyHome

	public void Draw() {
		System.out.println("Single Family Home" + "\n");
	}//end Draw
	
	/*
	 * the displayData method uses StringBuilder to give all information about the Single Family Home
	 * @return toString
	 */
	
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.displayData() + "\n");
		sb.append("Is there a garage: " + garage + "\n");
		
		return sb.toString();
	}//end displayData

	/**
	 * getter for garage
	 * @return the garage
	 */
	public boolean isGarage() {
		return garage;
	}//end isGarage

	/**
	 * setter for garage
	 * @param garage the garage to set
	 */
	public void setGarage(boolean aGarage) {
		aGarage = garage;
	}//end setGarage

}//end class
