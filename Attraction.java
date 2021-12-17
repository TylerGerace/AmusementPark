
class Attraction{
    //instance fields
    private String name; //name of attraction
    private double rideSpeed; //speed of ride ; puke factor ; mph
    private double rideLength; //length of an attraction ; puke factor ; minutes
    private double rideHeight; //height of ride ; puke factor ; feet
    private int ticketsToRide; //ticket cost for an attraction ; profits ; getTickets (tickets that user has)

    //Attraction constructor
    public Attraction(String name, int ticketsToRide,double rideLength,double rideHeight,double rideSpeed)
    {
        this.name = name;
        this.ticketsToRide = ticketsToRide;
        this.rideLength = rideLength;
        this.rideHeight = rideHeight;
        this.rideSpeed = rideSpeed;
    }
    //get methods
    /** Methods will @return properties of an attraction*/
    public String getName() {return name;}
    public int getCost() {return ticketsToRide;}
    public double getRideLength() {return rideLength;}
    public double getRideHeight() {return rideHeight;}
    public double getRideSpeed() {return rideSpeed;}

    //ride Attraction methods (aka toString method)
    public int buyAttraction(int tickets){
        return tickets-getCost();
    }
    public String rideAttraction(){
        String message = 
        "You rode "+getName()+" for "+getCost()+" tickets";
        return message;
    }
 }
