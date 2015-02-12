/**
 * MVC PDA Project
 * This is an MVC project used to determine the user's permissable dating age range
 * @author Michael Running
 * @author Aleksey Skvlogin
 * @author Katie O'Nell
 * @version 1.0
 */
public class pdaView{
    /**
     * This creates the view
     * @param creepFactor is the boolean value that states whether or not the user's current relationship is creepy
     */
    public void printPDA(boolean creepFactor){
        //System.out.println(creepFactor);
        if(creepFactor == false){
            System.out.println("It is ok to date!");
        }
        else{
            System.out.println("It is NOT ok to date!");
        }
    }
}