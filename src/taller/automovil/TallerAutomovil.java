
package taller.automovil;


public class TallerAutomovil {

    
    public static void main(String[] args) {
        /*
        Automivil carone = new Automivil("Toyota", "2017", 2.1f , 4, 180,0, Color.ROJO, TipoGasolina.GASOLINE, CarTipe.COMPACTO);
        
        carone.acelerar(80);
        carone.desacelerar(50);
        carone.frenar();
        carone.tiempo(30);
        
        
        
      */  
        
        
        
    Automivil autouno = new Automivil();
    autouno.setBrand("fort");
    autouno.setModel("13");
    autouno.setEngine(2);
    autouno.setNumbersseats(4);
    autouno.setMaxs(150);
    autouno.setModel("13");
    autouno.setCurrents(180);
    autouno.setColor(Color.ROJO);
    autouno.setTipogasolina(TipoGasolina.GASOLINE);
    autouno.setCartipe(CarTipe.COMPACTO);
    autouno.show();
    
    
    }
   
    
    
  
    
    
}
