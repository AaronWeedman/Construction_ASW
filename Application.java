/**
 * This is the Application class that calls all methods, getters/setters and constructors from
 * the other classes
 * 
 * @author Aaron Weedman
 * @version 1.0
 * Construction Project
 * Spring 2023
 */

public class Application {
	public static void main(String[] args ) {
		
		Building bld = new Building("Project Nine", "9999 Number Street, Louisville Kentucky, 40207", 999.9, "B", "one");
		Business bis = new Business("Project Nine", "9999 Number Street, Louisville Kentucky, 40207", 600.0, "B", "one", 9);
		Mall mal = new Mall("Project Nine", "9999 Number Street, Louisville Kentucky, 40207", 500.0, "B", "one", 9, 3, 100.0, 99);
		Residential res = new Residential("Residential Home", "0009 Home Street, Louisville Kentucky, 40207", 3200.0, "R", "one", 3, 2, true);
		Apartment apt = new Apartment("Apartment", "0099 Busy Street, Louisville Kentucky, 40207", 3200.0, "R", "one", 1, 1, true, 9, 600.0, true);
		SingleFamilyHome sfh = new SingleFamilyHome("Single Family Home", "9009 Street Street, Louisville Kentucky, 40207", 2200.0, "R", "one", 3, 2, true, true);
		
		
		System.out.println("Building" + "\n");//Prints "Building"
		
		System.out.println(bld.displayData());//prints displayData Method
		System.out.println(bld.projectName);//prints the project name
		System.out.println(bld.completeAddress);//prints the complete address
		System.out.println(bld.totalSquareFeet);//prints the total square feet
		System.out.println(bld.occupancyGroup);//prints the occupancy group
		System.out.println(bld.subgroup);//prints the subgroup
		System.out.println(bld.getProjectName());//returns project name
		System.out.println(bld.getCompleteAddress());//returns complete address
		System.out.println(bld.getTotalSquareFeet());//returns total square feet
		System.out.println(bld.getOccupancyGroup());//returns occupancy group
		System.out.println(bld.getSubgroup());//returns subgroup
		System.out.println(bld.toString());//prints toString
		System.out.println();
	
	
		System.out.println("Business" + "\n");//Prints "Business"
		
		System.out.println(bis.displayData());//prints displayData Method
		System.out.println(bis.projectName);//prints the project name
		System.out.println(bis.completeAddress);//prints the complete address
		System.out.println(bis.totalSquareFeet);//prints the total square feet
		System.out.println(bis.occupancyGroup);//prints the occupancy group
		System.out.println(bis.subgroup);//prints the subgroup
		System.out.println(bis.numRentableUnits);//prints the number of rent-able units
		System.out.println(bis.getCompleteAddress());//returns complete address
		System.out.println(bis.getNumRentableUnits());//returns number of rent-able units
		System.out.println(bis.getOccupancyGroup());//returns occupancy group
		System.out.println(bis.getProjectName());//returns project name
		System.out.println(bis.getSubgroup());//returns subgroup
		System.out.println(bis.getTotalSquareFeet());//returns total square feet
		System.out.println(bis.toString());//prints toString
		System.out.println();
		
		
		System.out.println("Mall" + "\n");//prints "Mall"
		
		System.out.println(mal.displayData());//prints displayData Method
		System.out.println(mal.projectName);//prints the project name
		System.out.println(mal.completeAddress);//prints the complete address
		System.out.println(mal.totalSquareFeet);//prints the total square feet
		System.out.println(mal.occupancyGroup);//prints the occupancy group
		System.out.println(mal.subgroup);//prints the subgroup
		System.out.println(mal.numRentableUnits);//prints the number of rent-able units
		System.out.println(mal.getCompleteAddress());//returns complete address
		System.out.println(mal.getNumRentableUnits());//returns number of rent-able units
		System.out.println(mal.getOccupancyGroup());//returns occupancy group
		System.out.println(mal.getProjectName());//returns project name
		System.out.println(mal.getSubgroup());//returns subgroup
		System.out.println(mal.getTotalSquareFeet());//returns total square feet
		System.out.println(mal.getNumParkingSpaces());//returns number of parking spaces
		System.out.println(mal.getMedianUnitSize());//returns median unit size
		System.out.println(mal.getNumRentedUnits());//returns number of rented units
		System.out.println(mal.toString());//prints toString
		System.out.println();
		
		
		System.out.println("Residential" + "\n");//prints "Residential"
		
		System.out.println(res.displayData());//prints displayData Method
		System.out.println(res.projectName);//prints the project name
		System.out.println(res.completeAddress);//prints the complete address
		System.out.println(res.totalSquareFeet);//prints the total square feet
		System.out.println(res.occupancyGroup);//prints the occupancy group
		System.out.println(res.subgroup);//prints the subgroup
		System.out.println(res.numBedrooms);//prints number of bedrooms
		System.out.println(res.numBathrooms);//prints number of bathrooms
		System.out.println(res.laundryRoom);//prints if there is a laundry room
		System.out.println(res.getProjectName());//returns project name
		System.out.println(res.getCompleteAddress());//returns complete address
		System.out.println(res.getTotalSquareFeet());//returns total square feet
		System.out.println(res.getOccupancyGroup());//returns occupancy group
		System.out.println(res.getSubgroup());//returns subgroup
		System.out.println(res.getNumBathrooms());//returns number of bathrooms
		System.out.println(res.getNumBedrooms());//returns number of bedrooms
		System.out.println(res.isLaundryRoom());//returns if there is a laundry room
		System.out.println(res.toString());//prints toString
		System.out.println();
				
						
		System.out.println("Apartment" + "\n");//prints "Apartment"
		
		System.out.println(apt.displayData());//prints displayData Method
		System.out.println(apt.projectName);//prints the project name
		System.out.println(apt.completeAddress);//prints the complete address
		System.out.println(apt.totalSquareFeet);//prints the total square feet
		System.out.println(apt.occupancyGroup);//prints the occupancy group
		System.out.println(apt.subgroup);//prints the subgroup
		System.out.println(apt.numBedrooms);//prints number of bedrooms
		System.out.println(apt.numBathrooms);//prints number of bathrooms
		System.out.println(apt.laundryRoom);//prints if there is a laundry room
		System.out.println(apt.getProjectName());//returns project name
		System.out.println(apt.getCompleteAddress());//returns complete address
		System.out.println(apt.getTotalSquareFeet());//returns total square feet
		System.out.println(apt.getOccupancyGroup());//returns occupancy group
		System.out.println(apt.getSubgroup());//returns subgroup
		System.out.println(apt.getNumBathrooms());//returns number of bathrooms
		System.out.println(apt.getNumBedrooms());//returns number of bedrooms
		System.out.println(apt.isLaundryRoom());//returns if there is a laundry room
		System.out.println(apt.getAvgUnitSize());//returns average unit size
		System.out.println(apt.getNumRentableUnits());//returns the number of rent-able units
		System.out.println(apt.isParkingAvailiable());//returns if there is parking available
		System.out.println(apt.toString());//prints toString
		System.out.println();
		
		
		System.out.println("Single Family Home" + "\n");//prints "Single Family Home"
		
		System.out.println(sfh.displayData());//prints displayData Method
		System.out.println(sfh.projectName);//prints the project name
		System.out.println(sfh.completeAddress);//prints the complete address
		System.out.println(sfh.totalSquareFeet);//prints the total square feet
		System.out.println(sfh.occupancyGroup);//prints the occupancy group
		System.out.println(sfh.subgroup);//prints the subgroup
		System.out.println(sfh.numBedrooms);//prints number of bedrooms
		System.out.println(sfh.numBathrooms);//prints number of bathrooms
		System.out.println(sfh.laundryRoom);//prints if there is a laundry room
		System.out.println(sfh.getProjectName());//returns project name
		System.out.println(sfh.getCompleteAddress());//returns complete address
		System.out.println(sfh.getTotalSquareFeet());//returns total square feet
		System.out.println(sfh.getOccupancyGroup());//returns occupancy group
		System.out.println(sfh.getSubgroup());//returns subgroup
		System.out.println(sfh.getNumBathrooms());//returns number of bathrooms
		System.out.println(sfh.getNumBedrooms());//returns number of bedrooms
		System.out.println(sfh.isLaundryRoom());//returns if there is a laundry room
		System.out.println(sfh.isGarage());//returns if there is a garage
		System.out.println(sfh.toString());//prints toString
		System.out.println();
		
	}//end main
}//end class
