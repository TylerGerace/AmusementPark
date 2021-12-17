import javax.swing.JOptionPane;

class AmusementPark {
    //instance fields
    final double COST_PER_TICKET = 5; //5 dollars per ticket

    private int usersTickets; //total tickets the user has

    //constructor
    public AmusementPark(int ticketsBought){
        usersTickets = ticketsBought;
    }
    /** @return user's total tickets */
    public int getTickets(){
        return usersTickets;
    }
    public String noTickets(){
        JOptionPane.showConfirmDialog(null,"You do not have enough tickets", null, JOptionPane.DEFAULT_OPTION);
        return "";
    }
    //get ticket costs
    public double getTicketCost(){
        return COST_PER_TICKET;
    }
}
