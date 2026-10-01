/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.automovil;

/**
 *
 * @author Asus
 */
public class Automivil {
     //Atributos
    private String brand;
   
    private String model;
    private float engine;
    private int numbersseats;
    private int Maxs;
    private int currents;
    private Color color;
    private TipoGasolina tipogasolina;
    private CarTipe cartipe;
    
    public Automivil(){
        
        
    }

    public Automivil(String brand, String model, float engine, int numbersseats, int Maxs, int currents, Color color, TipoGasolina tipogasolina, CarTipe cartipe) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.numbersseats = numbersseats;
        this.Maxs = Maxs;
        this.currents = currents;
        this.color = color;
        this.tipogasolina = tipogasolina;
        this.cartipe = cartipe;
    }
    
    //setters y getters

    public String getBrand() {
        return brand;
    }
    

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getEngine() {
        return engine;
    }

    public void setEngine(float engine) {
        this.engine = engine;
    }

    public int getNumbersseats() {
        return numbersseats;
    }

    public void setNumbersseats(int numbersseats) {
        this.numbersseats = numbersseats;
    }

    public int getMaxs() {
        return Maxs;
    }

    public void setMaxs(int Maxs) {
        this.Maxs = Maxs;
    }

    public int getCurrents() {
        return currents;
    }

    public void setCurrents(int currents) {
        this.currents = currents;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TipoGasolina getTipogasolina() {
        return tipogasolina;
    }

    public void setTipogasolina(TipoGasolina tipogasolina) {
        this.tipogasolina = tipogasolina;
    }

    public CarTipe getCartipe() {
        return cartipe;
    }

    public void setCartipe(CarTipe cartipe) {
        this.cartipe = cartipe;
    }

    
    
    //Metodos 
    public void acelerar (float vgg){
        
        if(currents+ vgg >Maxs ){
            System.out.println("Supero la velocidad maxima");
        }else{
            currents+=vgg;
            System.out.println("aceleraste, velocidad actual"+ currents);
        }
            
    }
     public void desacelerar (float vgg){
        
        if(currents- vgg <0 ){
            System.out.println("No puesdes desacelrar menos que cero");
        }else{
            currents-=vgg;
            System.out.println("desaceleraste, velocidad actual"+ currents);
        }
            
    }
    public void frenar (){
        currents=0;
        System.out.println("frenaste");
    }
    public float tiempo (float distancia){
        System.out.println("El tiempo es"+ (distancia /currents));
       return -1;
    }
    
   //show 
    public void show(){
        System.out.println("Brand:"+ brand);
        System.out.println("Model:"+model);
        System.out.println("Engine:"+engine);
        System.out.println("Numbersseats"+ numbersseats);
        System.out.println("Maxs"+Maxs);
        System.out.println("Currents"+currents);
        System.out.println("color"+color);
        System.out.println("Tipogasolina"+tipogasolina);
        System.out.println("Cartipe"+ cartipe); 
    }
    
    
}
