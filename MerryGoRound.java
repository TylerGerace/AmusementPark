import javax.swing.JOptionPane;

class MerryGoRound extends Attraction{
    public MerryGoRound(String aName, int cost, double aLength, double aHeight, double aSpeed) {
        super(aName , cost, aLength, aHeight, aSpeed);
    }
    /**
     * unique method returns a joy factor based of @param age 
     * @return how much the user enjoyed the ride based off age
     */
    public String JoyFactor(int age) {
        String message = "";
        if (age<=13) {message = "\n\nYou greatly enjoyed the ride";}
        else {message = "\n\nYou enjoyed the ride";}
        return message;
    } 
    public String Ride(int age){
        String message = 
        "You rode "+getName()+" for "+getCost()+" tickets"+JoyFactor(age);
        JOptionPane.showConfirmDialog(null,message, null, JOptionPane.DEFAULT_OPTION);
        return "";
    }
}
