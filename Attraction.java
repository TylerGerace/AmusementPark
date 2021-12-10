public class Attraction extends AmusementPark {
    //instance fields
    private double rideSpeed; //speed of ride ; puke factor ; mph
    private double rideLength; //length of an attraction ; puke factor ; minutes
    private double rideHeight; //height of ride ; puke factor ; feet
    private int ticketsToRide; //ticket cost for an attraction ; profits ; getTickets (tickets that user has)
    private int totalTickets; //number of tickets purchased ; track users tickets ; 
    private int ticketSpent; //number of tickets cost by each ride
    
    //Attraction constructor
    public Attraction(int ticketsToRide,double rideLength,double rideHeight,double rideSpeed)
    {
        this.ticketsToRide = ticketsToRide;
        this.rideLength = rideLength;
        this.rideHeight = rideHeight;
        this.rideSpeed = rideSpeed;
    }

    //Ride Attraction Method
    public int rideAttraction(int userTickets, Attraction attraction){
        int tickets = userTickets;
        return tickets - ticketToRide();
    }

    //get methods

    //ticket methods
    public int numTicket(int ticketPurchased)
    {
        totalTickets = ticketPurchased;
        return totalTickets;
    }
    public int ticketToRide()
    {
        return ticketToRide();
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