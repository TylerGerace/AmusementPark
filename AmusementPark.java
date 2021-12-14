public class AmusementPark {
    //instance fields
    final int NUM_OF_RIDES = 3; //total rides
    final int MAX_HOURS = 11; //how long park is open (hours) ; profits
    final double COST_PER_TICKET = 5; //5 dollars per ticket

    private int numAttendants; //number of people going to park
    private int totalTickets; //total tickets the user has
   public AmusementPark()
	{
		
	}
    //get methods
    public int getAttendants() 
    {
        //return random amount of attendants based of avg low & avg high
        final int MAX = 20000; final int MIN = 5000;
        numAttendants = ((int) (Math.random() * (MAX - MIN + 1) + MIN));
        return numAttendants;
    }
    public int getTickets(){
        return totalTickets;
    }
    public boolean checkTickets(){  //computer determines whether visitor has enough tickets for their desired rides
    	//unfinished
    }
    
    public double getTicketCost() //returns cost of ticket
    {
        return COST_PER_TICKET;
    }
    public int getNumberRides() //returns number of rides in the park
    {
        return NUM_OF_RIDES;
    }
    public int getMaxHours() //returns park hours
    {
        return MAX_HOURS;
    }
}
