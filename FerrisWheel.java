class FerrisWheel extends Attraction{
FerrisWheel attraction = new FerrisWheel();
attraction.ridersHour(300);
attraction.RideSpeed(45.00);
attraction.RideHeight(60);
attraction.ticketPerRide(2);
attraction.rideLength(12);
attraction.getUtilityCost(40);
attraction.getPukeFactor(0.99);
int Romantic;
 
 //unique method for Ferris Wheel subclass has an equation based on user input to determine romantic factor 
public int romanticRating()
{
if(attraction.getAttendants%2 == 0)
{
System.out.println(“Romantic factor is 10/10”);
}
else 
{
System.out.println(“Romantic factor is 5/10”);
}
 
	
}
 
 
 
 
 
 
 
