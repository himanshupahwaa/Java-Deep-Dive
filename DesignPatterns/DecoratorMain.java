
package DesignPatterns;
abstract class Pizza{
    int price;
    String name;

    public Pizza(String name, int price){
        this.name = name;
        this.price = price;
    }
    public abstract String getName();
    public abstract int getPrice();
}

abstract class Decorator extends Pizza{
    Pizza pizza;
    public Decorator(Pizza pizza){
        super(pizza.name, pizza.price);
        this.pizza = pizza;
    }
    public String getName(){
        return pizza.name;
    }
    public int getPrice(){
        return pizza.price;
    }
    public abstract void addTopping();
}
class CheeseDecorator extends Decorator{
    public CheeseDecorator(Pizza pizza){
        super(pizza);
        this.pizza = pizza;
    }
    public void addTopping(){
        super.price += 2;
        super.name += " with Cheese";
    }
    public String getName(){
        return this.name + " with Cheese";
    }
    public int getPrice(){
        return this.price + 2;
    }
}

class PepperoniPizza extends Pizza{

    public PepperoniPizza(){
        super("Pepperoni Pizza", 10);
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }
}

class MargheritaPizza extends Pizza{
    public MargheritaPizza(){
        super("Margherita Pizza", 7);
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }
}

interface PizzaFactory {
    public Pizza createPizza(String type);
} 

class SimplePizzaFactory implements PizzaFactory {

    public Pizza createPizza(String type){
        if (type.equals("Pepperoni")){
            return new PepperoniPizza();
        }
        if (type.equals("Margherita")){
            return new MargheritaPizza();
        }
        return null;
    }
}


public class DecoratorMain {
    public static void main(String[] args) {
        PizzaFactory factory = new SimplePizzaFactory();
        Pizza pizza1 = factory.createPizza("Pepperoni");
        Pizza cheesePizza = new CheeseDecorator(pizza1);
        System.out.println("Ordered" + cheesePizza.name + "for $" + cheesePizza.price);
        Pizza pizza2 = factory.createPizza("Margherita");
        
        System.out.println("Ordered" + pizza2.getName() + "for $" + pizza2.getPrice());
    }
}
