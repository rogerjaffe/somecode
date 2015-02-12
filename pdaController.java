/**
 * The controller instantiates the view and the model, receives messages from the view and sends and receives messages to the Model to commuincate changes required and changes made to the model variables
 * @author Michael Running
 * @Aleksey Skvlogin
 * @Katie O'Nell
 * @version 1.0
 */

public class pdaController{
    //instances of the model and view
    private pdaModel model;
    private pdaView view;
    /**
     * The controller constructor creates the model and view
     * @param model is the model
     * @param view is the view
     */
    public pdaController(pdaModel model, pdaView view){
        this.model = model;
        this.view = view;
    }

    /**
     * Setter function for the variable yourAge
     * @param yourAge is the age that the user inputs
     */
    public void setYourAge(int yourAge)
    {
        model.setYourAge(yourAge);
    }

    /**
     * Getter function for the variable yourAge
     * @return yourAge is the age that the user inputs
     */
    public int getYourAge()
    {
        return model.getYourAge();
    }

    /** 
     * Setter function for the variable minAge
     * @param integer minAge which is the minumum age of the person the user can date
     */ 
    public void setMinAge(int minAge){
        model.setMinAge(minAge);
    }

    /** 
     * Getter function for the variable minAge
     * @return integer minAge which is the minumum age of the person the user can date
     */ 
    public int getMinAge(){
        return model.getMinAge();
    }

    /** 
     * Setter function for the variable maxAge
     * @param integer maxAge which is the maximum age of the person the user can date
     */
    public void setMaxAge(int maxAge){
        model.setMaxAge(maxAge);
    }

    
    /** 
     * Getter function for the variable maxAge
     * @return integer maxAge which is the maximum age of the person the user can date
     */ 
    public int getMaxAge(){
        return model.getMaxAge();
    }

    /** 
     * Setter function for the boolean variable creepFactor
     * @param boolean creepFactor which states whether or not the user's current relationship is creepy
     */
    public void setCreepFactor(boolean creepFactor){
        model.setCreepFactor(creepFactor);
    }

    /** 
     * Getter function for the boolean variable creepFactor
     * @return boolean creepFactor which determines whether or not the user's current relationship is creepy
     */
    public boolean getCreepFactor(){
        return model.getCreepFactor();
    }

    /**
     * This section updates the view with the new information
     * (specifically the minAge, maxAge, and creepFactor
     */
    public void updateView(){
        view.printPDA(model.getCreepFactor());
    }
}