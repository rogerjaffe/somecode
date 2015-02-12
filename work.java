import java.io.*;
import java.util.*;
import java.text.*;
/**
 * This class gets information from the model and creates an instance of the view and controller
 */
public class work{
    public static void main(String args[]){
        pdaModel model = getInfo();
        pdaView view = new pdaView();
        pdaController controller = new pdaController(model, view);
        controller.updateView();

    }

    /**
     * This class gets information from the model and view, does the necessary calculations to determine 
     * the creep factor and age range, and tells the view to display information
     * @return model returns the pdaModel with user information
     */
    private static pdaModel getInfo(){
        pdaModel model = new pdaModel();
        //variables to be used later 
        int z = 0;
        int x = 0;
        int y = 0;
        while(z==0){
            System.out.println("What is your age? ");
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            System.out.println("What is bae's age?");
            Scanner sc2 = new Scanner(System.in);
            String str2 = sc2.next();
            if(model.isNumeric(str,str2)){
                x = Integer.parseInt(str);
                y = Integer.parseInt(str2);
                z++;

            }
        }
        
        //setting all of the variables
        model.setYourAge(x);        
        model.setBaeAge(y);
        model.setMaxAge(0);
        model.setMinAge(0);
        model.setCreepFactor(false);

        //System.out.println("x is: " + x);
        //System.out.println("y is: " +y);
        //System.out.println("yourAge is " + model.getYourAge());
        //System.out.println("baeAge is " + model.getBaeAge());        
        //System.out.println("maxAge is " + model.getMaxAge());
        //System.out.println("minAge is " + model.getMinAge());
        System.out.println("Your permissible dating age range is from " + model.getMinAge() + " to " + model.getMaxAge() + ".");
        //System.out.println("creepFactor is " + model.getCreepFactor());

        return model;
    }
}