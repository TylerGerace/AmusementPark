public class AmusementPark {
    //instance fields
    final int NUM_OF_RIDES = 3; //total rides
    final int MAX_HOURS = 11; //how long park is open (hours) ; profits
    final double COST_PER_TICKET = 5; //5 dollars per ticket

    private int numAttendants; //number of people going to park

    //get methods
    public int getAttendants() 
    {
        //return random amount of attendants based of avg low & avg high
        final int MAX = 20000; final int MIN = 5000;
        numAttendants = ((int) (Math.random() * (MAX - MIN + 1) + MIN));
        return numAttendants;
    }
    public double getTicketCost()
    {
        return COST_PER_TICKET;
    }
    public int getNumberRides()
    {
        return NUM_OF_RIDES;
    }
    public int getMaxHours()
    {
        return MAX_HOURS;
    }
}
