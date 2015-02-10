import java.io.*;
import java.util.*;
import java.text.*;
public class work{
    public static void main(String args[]){
        pdaModel model = getInfo();
        pdaView view = new pdaView();
        pdaController controller = new pdaController(model, view);
        controller.updateView();

    }

    private static pdaModel getInfo(){
        pdaModel model = new pdaModel();

        int z = 0;
        while(z==0){
            System.out.println("What is your age? ");
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            System.out.println("What is bae's age?");
            Scanner sc2 = new Scanner(System.in);
            String str2 = sc2.next();
            if(model.isNumeric(str,str2)){
                int x = Integer.parseInt(str);
                int y = Integer.parseInt(str2);
                model.setYourAge(x);
                model.setBaeAge(y);
                model.setMaxAge(0);
                model.setMinAge(0);
                model.setCreepFactor(false);
                z++;

            }
        }
        return model;
    }
}