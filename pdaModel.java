import java.io.*;
import java.util.*;
import java.text.*;
public class pdaModel{
    private int yourAge;
    private int minAge;
    private int maxAge;
    private int baeAge;
    private boolean creepFactor;

    public int getYourAge(){
        return yourAge;
    }

    public void setYourAge(int yourAge){
        this.yourAge = yourAge;
    }

    public int getMinAge(){
        return minAge;
    }

    public void setMinAge(int minAge){
        minAge = (yourAge/2) + 7;
        this.minAge = minAge;
    }

    public int getMaxAge(){
        return maxAge;
    }
    
    public void setMaxAge(int maxAge){
    maxAge = (yourAge - 7) * 2;
    this.maxAge = maxAge;
    }
    public int getBaeAge(){
        return baeAge;
    }

    public void setBaeAge(int baeAge){
        this.baeAge = baeAge;
    }

    public boolean getCreepFactor(){
        return creepFactor;
    }

    public void setCreepFactor(boolean creepFactor){
        if((minAge <= baeAge) && (maxAge>=baeAge)){
            creepFactor = false;
        }
        else{
            creepFactor = true;
        }
        this.creepFactor = creepFactor;
    }
    public boolean isNumeric(String str, String str2){
    try{
    int i = Integer.parseInt(str);
    int i2 = Integer.parseInt(str2);
    }
    catch(NumberFormatException nfe){
    return false;
    }
    return true;
    }

}