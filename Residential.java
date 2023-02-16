/**
 * The Residential class extends the Building class and represents where
 * people can live (has bedroom and bathroom). Also, the parent class for
 * SingleFamilyHome and Apartment Class
 * 
 * @author Aaron Weedman
 * @version 1.0
 * Construction Lab
 * Spring 2023
 */
public class Residential extends Building{
	
	protected int numBedrooms;//used to show the number of bedrooms
	protected int numBathrooms;//used to show the number of bathrooms
	protected boolean laundryRoom;//used to show if there is a laundry room or not
	
	/*
	 * Empty argument constructor for Residential setting all instance fields to 0 or false
	 */
	
	public Residential() {
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}//end Residential
	
	/*
	 * Preferred constructor for Residential used to support passing parameters for each instance field.
	 */
	
	public Residential(String aProjectName, String aCompleteAddress, double aTotalSquareFeet, String aOccupancyGroup, String aSubgroup, int aNumBedrooms, int aNumBathrooms, boolean aLaundryRoom) {
		super();
		projectName = aProjectName;
		completeAddress = aCompleteAddress;
		totalSquareFeet = aTotalSquareFeet;
		occupancyGroup = aOccupancyGroup;
		subgroup = aSubgroup;
		numBedrooms = aNumBedrooms;
		numBathrooms = aNumBathrooms;
		laundryRoom = aLaundryRoom;
	}//end Residential
	
	public void draw() {
	}//end draw
	
	/*
	 * the displayData method uses StringBuilder to give all information about Residential
	 * @return toString
	 */
	
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.displayData() + "\n");
		sb.append("Number of Bedrooms: " + numBedrooms + "\n");
		sb.append("Number of Bathrooms: " + numBathrooms + "\n");
		sb.append("Is there a laundry room? : " + laundryRoom + "\n");
		
		return sb.toString();
	}//end displayData
	
	/**
	 * getter for numBedrooms
	 * @return the numBedrooms
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}//end getNumBedrooms

	/**
	 * setter for numBedrooms
	 * @param numBedrooms the numBedrooms to set
	 */
	public void setNumBedrooms(int aNumBedrooms) {
		aNumBedrooms = numBedrooms;
	}//end setNumBedrooms

	/**
	 * getter for numBathrooms
	 * @return the numBathrooms
	 */
	public int getNumBathrooms() {
		return numBathrooms;
	}//end getNumBathrooms

	/**
	 * setter for numBathrooms
	 * @param numBathrooms the numBathrooms to set
	 */
	public void setNumBathrooms(int aNumBathrooms) {
		aNumBathrooms = numBathrooms;
	}//end setNumBathrooms

	/**
	 * getter for laundryRoom
	 * @return the laundryRoom
	 */
	public boolean isLaundryRoom() {
		return laundryRoom;
	}//end isLaundryRoom

	/**
	 * setter for laundryRoom
	 * @param laundryRoom the laundryRoom to set
	 */
	public void setLaundryRoom(boolean aLaundryRoom) {
		aLaundryRoom = laundryRoom;
	}//end setLaundryRoom

}//end class
