import javax.swing.JOptionPane;

public class AmusementParkTest {
    public static void main(String[] args){
        //Intialize Attractions
        RollerCoaster theBullet = new RollerCoaster("The Bullet", 3, 1, 150, 250);
        FerrisWheel theWheel = new FerrisWheel("The Wheel", 2, 10, 300, 10);
        MerryGoRound theCarousel = new MerryGoRound("The Carousel", 1, 2, 10, 15);

        //MAIN
        boolean done = false;
        while (done==false){ //simulation will run until user exits or park closes

            //welcome message; asks user to buy tickets
            String message = "Welcome to the Amusement Park Simulation\n\n Would you like to buy tickets?";
            int reply = JOptionPane.showConfirmDialog(null, message, null, JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.NO_OPTION){ done = true; break;}

            //gives info on rides; asks user how many tickets to buy
            int tickets =  Integer.parseInt(JOptionPane.showInputDialog
            ("Attraction Costs:\nRoller Coaster - 3 Tickets\nFerris Wheel - 2 Tickets\nMerry-Go-Round - 1 Ticket"+
             "\n\n 1 Ticket cost $5\nHow many Tickets would you like to buy?"));
            AmusementPark visitor = new AmusementPark(tickets); //instialize the users tickets

            //show user total cost 4 tickets
            JOptionPane.showConfirmDialog(null, 
                "Total: $"+tickets*visitor.getTicketCost(), "Total Cost for Tickets", JOptionPane.DEFAULT_OPTION);
           
            /** 
             * for riding attractions, park closes during the time
             * of riding 5 attractions OR user can exit.
             * Sim / loop will also end if user runs out of tickets
             */
            int usersTickets = tickets; //ticket variable to use in loop
            int ridesRidden = 0;
            while (ridesRidden<5){ 
                //check ridesRidden
                if (ridesRidden == 5){ 
                    JOptionPane.showConfirmDialog(null, "The Amusement Park has Closed.",null, JOptionPane.DEFAULT_OPTION);
                    done = false; break;
                }
                else ridesRidden++;

                /**
                 * Show user's tickets and ask IF they want to ride or leave
                 */
                String message2 = "You have "+usersTickets+" Tickets.\nWould you like to ride an Attraction?";
                int reply2 = JOptionPane.showConfirmDialog(null, message2, null, JOptionPane.YES_NO_OPTION);
                //leave sim if user wants
                if (reply2 == JOptionPane.NO_OPTION){
                    JOptionPane.showConfirmDialog(null, "You have left the Amusement park",null, JOptionPane.DEFAULT_OPTION);
                    done = true; break;
                }

                /**
                 * ELSE ask what attraction to ride
                 */
                else{
                    String message3 = "What Attraction would you like to ride?"+
                    "\nRoller Coaster (The Bullet) - 3 Tickets\nFerris Wheel (The Wheel) - 2 Tickets\nMerry-Go-Round (The Carousel) - 1 Ticket";
                    String[] options = {theBullet.getName(), theWheel.getName(), theCarousel.getName()};
                    int choice = 
                    JOptionPane.showOptionDialog(null, message3, null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);

                    //if they choose Roller Coaster
                    if (choice == 0){
                        usersTickets = usersTickets-theBullet.getCost();
                        //checks if user has enough tickets, if not sim is exited
                        if(usersTickets<=0){visitor.noTickets(); done=true; break;}
                        else theBullet.Ride();
                    }
                    //if they choose Ferris Wheel
                    if (choice == 1){
                        usersTickets = usersTickets-theBullet.getCost();
                        //checks if user has enough tickets, if not sim is exited
                        if(usersTickets<=0){visitor.noTickets(); done=true; break;}
                        else{
                            int riders =
                            Integer.parseInt(JOptionPane.showInputDialog("How many people are riding?"));
                            theWheel.Ride(riders);
                        }
                    }
                    //if they choose Merry go round
                    if (choice == 2){
                        usersTickets = usersTickets-theBullet.getCost();
                        //checks if user has enough tickets, if not sim is exited
                        if(usersTickets<=0){visitor.noTickets(); done=true; break;}
                        else{
                            int age = 
                            Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
                            theCarousel.Ride(age);
                        }
                    }
                }
            }
        }
    }
} 
