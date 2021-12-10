import javax.swing.JOptionPane;

public class AmusementParkTest {
    public static void main(String[] args){
        //VARAIABLES
        boolean done = false;
        while (done==false){ //simulation will run until user runs out of tickets 
            String message = "Welcome to the Amusement Park Simulation\n\n Would you like to buy tickets?";
            int reply = JOptionPane.showConfirmDialog(null, message, null, JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.NO_OPTION){ done = true; break;}

            int tickets =  Integer.parseInt(JOptionPane.showInputDialog
            ("Current Attractions:\nRoller Coaster - 3 Tickets\nFerris Wheel - 2 Tickets\nMerry-Go-Round - 1 Ticket"+
             "\n\n 1 Ticket cost $5\nHow many Tickets would you like to buy?"));
            Visitor user = new Visitor(tickets);

            while ( !=)

        }

    }
}  