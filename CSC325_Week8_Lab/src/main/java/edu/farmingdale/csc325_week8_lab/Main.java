
package edu.farmingdale.csc325_week8_lab;

public class Main {
    public static Application configureApplication(){
        // need to use the abstract factory design pattern
        Application app;
        Garment g;
        String printName = "Check the config file for outfit";
        
        if (printName.contains("T-shirts")){
             g = new Casual();
             app = new Application(g);
        }
        return app;
    }
    
     public static void main(String[] args) {
         Application app = configureApplication;
         app.content();
         
     }
    
}
