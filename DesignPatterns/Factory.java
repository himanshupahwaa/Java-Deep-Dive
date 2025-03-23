// package DesignPatterns;

// abstract class Pizza{
//     int price;
//     String name;

//     public Pizza(String name, int price){
//         this.name = name;
//         this.price = price;
//     }
//     public abstract String getName();
//     public abstract int getPrice();
// }

// class PepperoniPizza extends Pizza{

//     public PepperoniPizza(){
//         super("Pepperoni Pizza", 10);
//     }

//     public String getName(){
//         return this.name;
//     }

//     public int getPrice(){
//         return this.price;
//     }
// }

// class MargheritaPizza extends Pizza{
//     public MargheritaPizza(){
//         super("Margherita Pizza", 8);
//     }

//     public String getName(){
//         return this.name;
//     }

//     public int getPrice(){
//         return this.price;
//     }
// }

// interface PizzaFactory {
//     public Pizza createPizza(String type);
// } 

// class SimplePizzaFactory implements PizzaFactory {

//     public Pizza createPizza(String type){
//         if (type.equals("Pepperoni")){
//             return new PepperoniPizza();
//         }
//         if (type.equals("Margherita")){
//             return new MargheritaPizza();
//         }
//         return null;
//     }
// }

// public class Factory {
//     public static void main(String[] args) {
//         PizzaFactory factory = new SimplePizzaFactory();
//         Pizza pizza1 = factory.createPizza("Pepperoni");
//         System.out.println("Ordered" + pizza1.getName() + "for $" + pizza1.getPrice());
//         Pizza pizza2 = factory.createPizza("Margherita");
//         System.out.println("Ordered" + pizza2.getName() + "for $" + pizza2.getPrice());
//     }
// }