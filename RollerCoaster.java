import javax.swing.JOptionPane;
public class RollerCoaster extends Attraction{
    private double length;
    private double height;
    private double speed;
     public RollerCoaster(String aName, int cost, double aLength, double aHeight, double aSpeed) {
           super(aName , cost, aLength, aHeight, aSpeed);
           speed = aSpeed;
           height = aHeight;
           speed = aSpeed;
        } 
    /**
     * unique method that uses properities to make pukefactor
     * @return chance based on 60%speed/30%length/10%height
     */
    public double PukeFactor() {
        double pukeFactor;
        pukeFactor = ((speed*60/100)+(height*10/100)+((length*60/100)*30)-100);
        return pukeFactor;
    }
    public String Ride(){
        String message = 
        "You rode "+getName()+" for "+getCost()+" tickets"
        +"\n\nThere was a "+PukeFactor()+"% chance of you puking";
        JOptionPane.showConfirmDialog(null,message, null, JOptionPane.DEFAULT_OPTION);
        return "";
    }
}
