public class pdaController{
    private pdaModel model;
    private pdaView view;
    public pdaController(pdaModel model, pdaView view){
        this.model = model;
        this.view = view;
    }

    public void setYourAge( int yourAge)
    {
        model.setYourAge(yourAge);
    }

    public int getYourAge()
    {
        return model.getYourAge();
    }

    public void setMinAge(int minAge){
        model.setMinAge(minAge);
    }

    public int getMinAge(){
        return model.getMinAge();
    }

    public void setMaxAge(int maxAge){
        model.setMaxAge(maxAge);
    }

    public int getMaxAge(){
        return model.getMaxAge();
    }
    
    public void setCreepFactor(boolean creepFactor){
    model.setCreepFactor(creepFactor);
    }
    public boolean getCreepFactor(){
    return model.getCreepFactor();
    }
    
    public void updateView(){
    view.printPDA(model.getCreepFactor());
    }
}