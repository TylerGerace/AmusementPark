public class Visitor {

    private int totalTickets; //total tickets the user has

    //constructor
    public Visitor(int ticketsPurchased){
        totalTickets=ticketsPurchased;
    }
    //get methods
    public int getTickets(){
        return totalTickets;
    }
}
