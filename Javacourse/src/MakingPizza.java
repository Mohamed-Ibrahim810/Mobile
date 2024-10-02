public class MakingPizza {
    // Overloaded constructors
    String bread;
    String sauce;
    String cheese;
    String topping;

    MakingPizza(String bread,String sauce,String cheese){
        // assigning the values
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    MakingPizza(String bread,String sauce,String cheese,String topping){
        // assigning the values
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

}
