
/**
 * This class is a parent class for all other classes.
 * 
 * @author Aaron Weedman
 * @version 1.0
 * Construction Project
 * Spring 2023
 */
public class Building {
	
	protected String projectName;//used to denote project name
	protected String completeAddress;//used to denote the full address
	protected double totalSquareFeet;//used to show the total square feet
	protected String occupancyGroup;//used to denote occupancy group
	protected String subgroup;//used to denote subgroup
	
	/*
	 * Empty argument constructor for Building setting all instance fields to "" or 0.0
	 */
	
	public Building() {
		
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subgroup = "";
	}//end Building
	
	/*
	 * Preferred constructor for Building used to support passing parameters for each instance field.
	 */
	
	public Building(String aProjectName, String aCompleteAddress, double aTotalSquareFeet, String aOccupancyGroup, String aSubgroup) {
		
		projectName = aProjectName;
		completeAddress = aCompleteAddress;
		totalSquareFeet = aTotalSquareFeet;
		occupancyGroup = aOccupancyGroup;
		subgroup = aSubgroup;
	}//end Building
	
	public void draw() {
	}//end draw
	
	/*
	 * the displayData method uses StringBuilder to give all information about the Building
	 * @return toString
	 */
	
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append("Project name: " + projectName + "\n");
		sb.append("Address: " + completeAddress + "\n");
		sb.append("Total Square Feet: " + totalSquareFeet + "\n");
		sb.append("Occupancy Group: " + occupancyGroup + "\n");
		sb.append("Subgroup: " + subgroup + "\n");
		
		return sb.toString();
	}//end displayData

	/**
	 * getter for projectName
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}//end getProjectName

	/**
	 * setter for projectName
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String aprojectName) {
		aprojectName = projectName;
	}//end setProjectName

	/**
	 * getter for completeAddress
	 * @return the completeAddress
	 */
	public String getCompleteAddress() {
		return completeAddress;
	}//end getCompleteAddress

	/**
	 * setter for completeAddress
	 * @param completeAddress the completeAddress to set
	 */
	public void setCompleteAddress(String acompleteAddress) {
		acompleteAddress = completeAddress;
	}//end setCompleteAddress

	/**
	 * getter for totalSquareFeet
	 * @return the totalSquareFeet
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//end getTotalSquareFeet

	/**
	 * setter for totalSquareFeet
	 * @param totalSquareFeet the totalSquareFeet to set
	 */
	public void setTotalSquareFeet(double atotalSquareFeet) {
		atotalSquareFeet = totalSquareFeet;
	}//end setTotalSquareFeet

	/**
	 * getter for occupancyGroup
	 * @return the occupancyGroup
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}//end getOccupancyGroup

	/**
	 * setter for occupancyGroup
	 * @param occupancyGroup the occupancyGroup to set
	 */
	public void setOccupancyGroup(String aoccupancyGroup) {
		aoccupancyGroup = occupancyGroup;
	}//end setOccupancyGroup

	/**
	 * getter for sungroup
	 * @return the subgroup
	 */
	public String getSubgroup() {
		return subgroup;
	}//end getSubgroup

	/**
	 * setter for subgroup
	 * @param subgroup the subgroup to set
	 */
	public void setSubgroup(String asubgroup) {
		asubgroup = subgroup;
	}//end setSubgroup
	
}//end class
