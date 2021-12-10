public class Attraction extends AmusementPark {
    //instance fields
    private double rideSpeed; //speed of ride ; puke factor ; mph
    private double rideLength; //length of an attraction ; puke factor ; minutes
    private double rideHeight; //height of ride ; puke factor ; feet
    private int ticketsToRide; //ticket cost for an attraction ; profits ; getTickets (tickets that user has)

    private int totalTickets; //number of tickets purchased ; track users tickets ; 
    private int riderPerHour; // riders on the ride per hour ; profits

    private int ticketSpent; //number of tickets cost by each ride
    private double utilityCost; //cost of maintaining an attraction
 
    //Attraction constructor
    public Attraction(int ticketsToRide,double rideLength,int ridePHour)
    {
        this.ticketsToRide = ticketsToRide;
        this.rideLength = rideLength;

    }

    //get methods
    public double getUtilityCost(double costUtility)
    {
        utilityCost = costUtility;
        return utilityCost;
    }

    //ticket methods
    public int numTicket(int ticketPurchased)
    {
        totalTickets = ticketPurchased;
        return totalTickets;
    }
    public int ticketPerRide(int ticket)
    {
        ticketSpent = ticket;
        return ticketSpent;
    }
    //puke factor method
    public void PukeFactor(double speed, double length ) {
        
    }
    public int RidersHour(int riders)
    {
        riderPerHour = riders;
        return riderPerHour;
    }
    public double RideHeight(int height)
    {
        rideHeight = height;
        return rideHeight;
    }
    public double rideLength(double rideTime)
    {
        rideLength = rideTime;
        return rideLength;
    }
 }