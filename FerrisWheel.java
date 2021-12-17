import javax.swing.JOptionPane;

class FerrisWheel extends Attraction{
    public FerrisWheel(String aName, int cost, double aLength, double aHeight, double aSpeed) {
        super(aName , cost, aLength, aHeight, aSpeed);
    }
    /**
     * unique method that returns romantic factor based on @param riders
     * @return romantic facters based on # of riders
     */
    public String romanticFactor(int riders){
        if (riders == 2){return "\n\nThe ride was romantic";}
        else return "";
    }
    public String Ride(int riders){
        String message =
        "You rode "+getName()+" for "+getCost()+" tickets" + romanticFactor(riders);
        JOptionPane.showConfirmDialog(null,message, null, JOptionPane.DEFAULT_OPTION);
        return "";
    }
 }
