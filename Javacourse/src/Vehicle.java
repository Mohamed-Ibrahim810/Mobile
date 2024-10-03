public abstract class Vehicle {
    //Inheritance
    // This is a superclass (parent class)

    /*double speed;

    void go(){
        System.out.println("The vehicle is moving");
    }
    void stop(){
        System.out.println("The vehicle is stopped");
    }*/


    //abstract
    abstract  void go(); // You don't need a body for the method
                        // it forces you to implement the method in one of the child class
    // You can no longer create an instance of the vehicle class,
    // because it's abstract,and a vehicle object is too vague
    // so we force the user to pick a certain vehicle that inherit from the vehicle class





}
