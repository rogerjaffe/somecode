import java.io.*;
import java.util.*;
import java.text.*;
/**
 * The model represents the data that the app uses
 * @author Michael Running
 * @author Aleksey Skvlogin
 * @author Katie O'Nell
 * @version 1.0
 */
 
public class pdaModel{
    
    //These are the model's data variables
    private int yourAge;
    private int minAge;
    private int maxAge;
    private int baeAge;
    private boolean creepFactor;

    /** 
     * Getter function for the variable yourAge
     * @return integer yourAge which is the age that the user inputs
     */ 
    public int getYourAge(){
        return yourAge;
    }

    /** 
     * Setter function for the variable yourAge
     * @param integer yourAge which is the age that the user inputs
     */ 
    public void setYourAge(int yourAge){
        this.yourAge = yourAge;
    }

    /** 
     * Getter function for the variable minAge
     * @return integer minAge which is the minumum age of the person the user can date
     */ 
    public int getMinAge(){
        return minAge;
    }

    /** 
     * Setter function for the variable minAge
     * @param integer minAge which is the minumum age of the person the user can date
     */ 
    public void setMinAge(int minAge){
        minAge = (yourAge/2) + 7;
        this.minAge = minAge;
    }

    /** 
     * Getter function for the variable maxAge
     * @return integer maxAge which is the maximum age of the person the user can date
     */ 
    public int getMaxAge(){
        return maxAge;
    }

    /** 
     * Setter function for the variable maxAge
     * @param integer maxAge which is the maximum age of the person the user can date
     */ 
    public void setMaxAge(int maxAge){
        maxAge = (yourAge - 7) * 2;
        this.maxAge = maxAge;
    }

    /** 
     * Getter function for the variable baeAge
     * @return integer baeAge which is the age of the user's partner that they input
     */ 
    public int getBaeAge(){
        return baeAge;
    }

    /** 
     * Setter function for the variable baeAge
     * @param integer baeAge which is the age of the user's partner that they input
     */ 
    public void setBaeAge(int baeAge){
        this.baeAge = baeAge;
    }

    /** 
     * Getter function for the boolean variable creepFactor
     * @return boolean creepFactor which determines whether or not the user's current relationship is creepy
     */ 
    public boolean getCreepFactor(){
        return creepFactor;
    }

    /** 
     * Setter function for the boolean variable creepFactor
     * @param boolean creepFactor which states whether or not the user's current relationship is creepy
     */
    public void setCreepFactor(boolean creepFactor){
        if((minAge <= baeAge) && (maxAge>=baeAge)){
            creepFactor = false;
        }
        else{
            creepFactor = true;
        }
        this.creepFactor = creepFactor;
    }

    /** 
     * This section parses the two pieces of user input (their age and their partner's age) and turns them into integers from strings
     * @param str is the first string (the user's age)
     * @param str2 is the second string (the user's partner's age)
     * @return boolean numberFormatException returns false if there is a number format exception 
     * it returns false if one or both inputs is not an integer and true if they're both integers
     */
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