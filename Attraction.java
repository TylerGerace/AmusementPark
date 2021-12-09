public class Attraction {
    //instance fields
    //FINALS
    final int NUM_OF_RIDES = 3; //total rides
    final int MAX_HOURS = 11; //how long park is open (hours) ; profits
    //general fields for a ride
    private int rideSpeed; //speed of ride ; puke factor
    private double rideLength; //length of an attraction ; puke factor
    private int rideHeight; //height of ride ; puke factor
    private double ticketsToRide; //ticket cost for an attraction ; profits ; getTickets (tickets that user has)

    private int ticketsPurchased; //number of tickets purchased ; track users tickets ; 
    private int numAttendants; //number of people going to park
    private int riderPerHour; // riders on the ride per hour ; profits

    private int ticketSpent; //number of tickets cost by each ride
    private double utilityCost; //cost of maintaining an attraction
 
    public Attraction(int ticketsToRide,double rideLength,int ridePHour)
    {
        this.ticketsToRide = ticketsToRide;
        this.rideLength = rideLength;

    }

    public int getAttendants(int numAttend)
    {
    numAttendents = numAttend;
    return numAttendants;
    }
    public int getNumberRides()
    {
    return NUM_OF_RIDES;
    }
    public int getMaxHours()
    {
    return MAX_HOURS;
    }
    public int numTicket(int ticketPurchased)
    {
    this.numTicket = ticketPurchased;
    return numTicket;
    }
    public int RidersHour(int riders)
    {
    riderPerHour = riders;
    return riderPerHour;
    }
    public int RideHeight(int height)
    {
    rideHeight = height;
    return rideHeight;
    }
    public int ticketPerRide(int ticket)
    {
    ticketSpent = ticket;
    return ticketSpent;
    }
    public double ticketCost(double ticketCostAmount)
    {
    this.ticketCost = ticketCostAmount;
    return ticketCost;
    }
    public double rideLength(double rideTime)
    {
    rideLength = rideTime;
    return rideLength;
    }
    public double getUtilityCost(double costUtility)
    {
    utilityCost = costUtility;
    return utilityCost;
    }
 }