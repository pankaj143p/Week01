// create a class EarthVolume it's purpose to calculate the volume of Earth in km³ and miles³
class EarthVolume{
	public static void main(String[] args) {
		// create a variable pi and assign value 3.14159
		double pi=Math.PI;
		// create a variable radius and assign value 6378
		double radiusKm=6378;
		// calculate the volume in km³
		double volumeKm3=(4.0/3.0)*pi*Math.pow(radiusKm,3);
		// convert radius to miles
		double radiusMiles=radiusKm*0.621371;
		// calculate the volume in miles³
		double volumeMiles3=(4.0/3.0)*pi*Math.pow(radiusMiles,3);
		// display the volume in km³ and miles³
		System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
	}
}

