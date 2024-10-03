//import javax.swing.JOptionPane;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Swapping 2 variables
        /*String x = "water";
        String y = "V cola";
        String temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("x: "+x);
        System.out.println("y: "+y);*/



        /*
        //User Input
        Scanner scanner = new Scanner(System.in);

        //Name
        System.out.println("what is your name?..");
        String name = scanner.nextLine();
        System.out.println("Hello "+name);

        //Age
        System.out.println("what is your age?");
        int age = scanner.nextInt();
        System.out.println("Oh..So you are "+age+ " old");
        System.out.println("hope u doin okay");

        //new line
        scanner.nextLine();

        //food
        System.out.println("what is your fave food");
        String food = scanner.nextLine();
        System.out.println("WAIT..I like "+food+" too");*/



        /*expression = operands & operators
        //operands = values, variables, numbers, quantity
        //operators = + - * / %
        double friends = 10;
        friends = friends /3;
        System.out.println(friends);*/


        /*GUI intro
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
        JOptionPane.showMessageDialog(null,"you are "+age+"!!!");

        double height = Double.parseDouble(JOptionPane.showInputDialog("what is your height"));
        JOptionPane.showMessageDialog(null,"so you are "+height+"cm...Bro that's cool");*/



        //Math class
        /*double pi = 3.14;
        double x = -7;

        double res = Math.pow(pi,2); //
        System.out.println(res);*/

        //Calc the hypotenuse

        /* First method
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Enter (a)");
        double a = scanner.nextDouble();

        System.out.println("Enter (b)");
        double b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("The Hypotenuse =  "+c);

        /* Second method (Faster)
        System.out.println("Enter (a)");
        double a = scanner.nextDouble();

        System.out.println("Enter (b)");
        double b = scanner.nextDouble();

        double c = Math.hypot(a,b);
        System.out.println("The Hypotenuse =  "+c);*/


        //Random number
        /*Random rand = new Random();
        int x = rand.nextInt(6)+1;//Rolling dice
        System.out.println("Your random number is "+x);*/


        //If statements
       /* Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();
        if(age>=18){
            System.out.println("bro...you can vote");
        }else{
            int yr = 18-age;
            System.out.println("Sorry buddy \njust "+yr+" more years");
        }*/


        /* Switch statement: allows a variable to be tested for equality
        against a list of values
        String day = "hamda";

        switch (day){
            case "Saturday":
                System.out.println("it is Saturday!");
                break;

            case "Sunday":
                System.out.println("it is Sunday!");
                break;

            case "Monday":
                System.out.println("it is Monday!");
                break;


            case "Tuesday":
                System.out.println("it is Tuesday!");
                break;

            case "Wednesday":
                System.out.println("it is Wednesday!");
                break;

            case "Thursday":
                System.out.println("it is Thursday!");
                break;

            case "Friday":
                System.out.println("it is Friday!");
                break;

            default:
                System.out.println("bro that's not a day");
        }*/


        /*Logical operators are used to connect two or more expressions
                               && (AND) both conditions must be true.
                               ||  (OR) either condition must be true.
                               !  (NOT) reverses boolean value of condition.
         */


        // while loop = executes a block of code as long as it's condition remains true


        // for loop = executes a block of code a limited amount of times


        //Nested loops
        /*for (int i = 0;i <= 2;i++){
            System.out.println();
            for (int j = 0;j <= 3;j++ ){
                System.out.print("*");

            }
        }*/


        // Array = used to store multiple values in a single variable
        /*String[] cars = {"camaro","corvette","Tesla"}; First method to create an array
        cars[0] = "Mustang"; //Replace
        System.out.println(cars[0]); // Output: Mustang
        //System.out.println(Arrays.toString(cars)); Show all*/

        /*String[] cars = new String[3]; //Second method to create an array
        cars[0] = "camaro";
        cars[1] = "corvette";
        cars[2] = "Tesla";
        System.out.println(Arrays.toString(cars));*/


        //2D array = an array of arrays
       /* int Even[][] = {
                {2,4,6},{8,10,12},{14,16,18}
        };

        //System.out.println(Even[0][1]); // Show one element

        System.out.println(Arrays.deepToString(Even)); //Show all elements 1#

        for(int i = 0; i < Even.length ; i++){ // Show all elements 2#
            System.out.println();
            for (int j = 0; j < Even[i].length ; j++){
                System.out.print(Even[i][j]);
            }

        }*/


        // Useful string methods: in the video


        // Wrapper class = Provides a way to use primitive data type as reference data types
        //                reference data types contain useful methods
        //                can be used with collections (ex.ArrayList)

        // Primitive       // Wrapper
        // ---------       // -------
        // boolean            Boolean
        // char               Character
        // int                Integer
        // double             Double

        // Autoboxing = the automatic conversion that the Java compiler makes between
        //              the primitive types and their corresponding object wrapper classes
        // Unboxing = the reverse of autoboxing.
        //            Automatic conversion of wrapper class to primitive

        /*Boolean a = true;
        Character b = '@';
        Integer  c = 123;
        Double d = 3.14;*/


        //Array list = a resizable array.
        //             Elements can be added and removed after compilation phase
        //             only store references data types (Use the wrapper class)
        /*ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("Makrona bashmel");
        food.add("Ruz n'batates");
        food.add("samak");

        food.set(0,"Mahshi"); // Replace
        food.remove(3);

        System.out.println(food); // Show all #1

        for(int i = 0; i < food.size() ; i++){ // Show all #2
            System.out.println(food.get(i));
        }*/


        // 2D array list =  a dynamic list of lists, you can change
        //                  the size of these lists during runtime

        /*ArrayList<String> BakeryList = new ArrayList<String>();
        BakeryList.add("Feno");
        BakeryList.add("Buqsmat");
        BakeryList.add("Auras agwa");

        ArrayList<String> MarketList = new ArrayList<String>();
        MarketList.add("Shai");
        MarketList.add("Makrona");
        MarketList.add("Salsa");
        MarketList.add("Shepsiat");
        MarketList.add("Soda");

        ArrayList<String> PharmacyList = new ArrayList<String>();
        PharmacyList.add("Ma3gon senan");
        PharmacyList.add("Panadol");

        ArrayList<ArrayList<String>> ShopingList = new ArrayList<>();
        ShopingList.add(BakeryList);
        ShopingList.add(MarketList);
        ShopingList.add(PharmacyList);

        //System.out.println(BakeryList.get(0)); // If you want a specific element
        System.out.println(ShopingList);
        System.out.println(ShopingList.get(1).get(4)); // If you want a specific element*/


        // For-each loop = traversing technique to iterate through the elements in an array/collection
        // less steps, more readable
        // less flexible
        /*String[] animals = {"cat","dog","elephant","tiger"};
        for(String i : animals){ // (:) means (in)
            System.out.println(i);
        }*/


        // Methods = a block of code that is executed whenever it is called
        // you write it outside the main method
       /* String name = "medo";
        greetings(name);*/


        // Overloaded methods = methods that share the same name but have different parameters
        // method name + parameters = method signature
        /*double x = add(1.0,2.0,3.0,4.0);
        System.out.println(x);*/


        // Printf = an optional method to control, format, and display text to the console window
        // two arguments format string + (object/variable/value)
        // % [flags] [precision] [width] [conversion-character]

        /*boolean bool = true;
        char ch = '$';
        String str = "medo";
        int num = 810;
        double dou = 3.14;*/

        // [conversion-character]
        /*System.out.printf("Do you want this job: %b\n",bool);
        System.out.printf("the salary is 2400%c\n",ch);
        System.out.printf("my name is %s\n",str);
        System.out.printf("my birth date %d\n",num);
        System.out.printf("Pi = %f\n",dou);*/

        // [width]
        //minimum number of characters to be written as output
        //System.out.printf("You have this much money %15s$",num); // If u need to line up numbers

        // [precision]
        // sets number of digits of precision when outputting floating-point value
        //System.out.printf("Pi = %.3f",dou);

        // [Flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus (+) or minus (-) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if number > 1000

        //System.out.printf("Pi = %-10f",dou);


        // Final keyword
        /*final double pi = 3.14159;
        pi = 4; // cannot assign a value to a final variable
        System.out.println(pi);*/


        //--------------------------------------------------------------------------
        //********************************** OOP ***********************************

        // Objects = an instance of a class that may contain attributes and methods
        //we can reuse the class for creating multiple objects
        /*car mycar = new car();
        car mycar2 = new car();

        System.out.println(mycar.name);
        System.out.println(mycar2.model);*/

        //mycar.drive();
        //mycar.brake();


        //How can we construct objects with different characteristics and different attributes
        // Constructor = special method that is called when an object is created

        /*Human human1 = new Human("medo",19,63); // human1->object
        Human human2 = new Human("hamda",23,77);
        Human human3 = new Human("hoda",20,66);

        human2.eat(); // calling the method
        human3.drink();*/


        // Local variables = declared inside a method
        //                   visible only to that specific method

        // Global variables = declared outside a method, but within a class
        //                    visible to all parts of a class


        // Overloaded constructors = multiple constructors within a class with the same name,
        //                           but have different parameters
        //                           name + parameters = signature
        /*MakingPizza pizza = new MakingPizza("crust","tomato","mozzarella"); // now we have pizza object
        System.out.println("here is the ingredients");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);*/


        // toString() = special method that all objects inherit,
        //              that returns a string that "textually represents" an object.
        //              can be used both implicitly and explicitly

        /*car carr = new car();
        System.out.println(carr.toString());
        // OR
        System.out.println(carr);*/


        // Array of objects
        /*Food food1 = new Food("pizza");
        Food food2 = new Food("ruz");
        Food food3 = new Food("mahshi");*/

        // a way to write an array of objects
        /*Food[] refrigerator = new Food[3]; // Making the array
        refrigerator[0] = food1;
        refrigerator[1] = food2;            // assigning the objects to the array
        refrigerator[2] = food3;*/

        // a second way (easier)
        /*Food[] refrigerator = {food1,food2,food3};
        System.out.println(refrigerator[1].foodName);*/


        // Object passing
        /*garage gar = new garage();
        car carr = new car("bmw");

        gar.park(carr);*/


        //static keyword = modifier. A single copy of a variable/method is created and shared.
        //                 The class "owns" the static member
        /*friend frnd1 = new friend("Ahmed");
        friend frnd2 = new friend("Ali");
        friend frnd3 = new friend("Omar");
        friend frnd4 = new friend("Abo bakr");

        //System.out.println(friend.NumberOFfriends);
        friend.DisplayFriends();*/


        // Inheritance = the process where one class acquires
        //               the attributes and methods of another.
        /*car car1 = new car();
        Bicycle bike1 = new Bicycle();

        car1.go();
        bike1.stop();*/            // They inherited from the vehicle class


        // method overriding = Declaring a method in subclass,
        //                     which is already present in parent class.
        //                     done so that a child class can give its own implementation


        // Super keyword = keyword refers to the superclass (parent) of an object
       //                  very similar to the "this" keyword
      //                   (assuming that you are using inheritance)
       /* Hero hero1 = new Hero("Batman",40,"$$$");
        Hero hero2 = new Hero("3nab man",25,"his intelligence");

        System.out.println(hero1.toString());
        System.out.println(hero2.toString());*/


        // Abstract = abstract classes cannot be created, but they can have a subclass
        //            abstract methods are declared without an implementation
        //            (it adds a layer of security)

        //Vehicle vehicle = new Vehicle();
        // You can no longer create an instance of the vehicle class,
        // because it's abstract,and a vehicle object is too vague
        // so we force the user to pick a certain vehicle that inherit from the vehicle class

       /* car car1 = new car();
        Bicycle bike1 = new Bicycle();

        car1.go();
        bike1.go();*/


        // Access modifiers

//**************** Access Levels *******************
/*   Modifier | Class | Package | Subclass | World |
* Public      |   Y   |    Y    |     Y    |   Y   |
* Protected   |   Y   |    Y    |     Y    |   N   |
* No modifier |   Y   |    Y    |     N    |   N   |
* Private     |   Y   |    N    |     N    |   N   |
* **************************************************/

        // Go to Pack1 and Pack2 for explanation



























    }

    /*static void greetings(String name){
        System.out.println("Hellllo and welcome mister "+name);
    }*/


// Overloaded methods
/*static int add(int a, int b) {
    System.out.println("This is overloaded method #1");
    return a + b;
}
static int add(int a, int b, int c) {
    System.out.println("This is overloaded method #2");
    return a + b + c;
}
static int add(int a, int b, int c, int d) {
    System.out.println("This is overloaded method #3");
    return a + b + c + d;
}
static double add(double a, double b) {
    System.out.println("This is overloaded method #4");
    return a + b;
}
static double add(double a, double b, double c) {
    System.out.println("This is overloaded method #5");
    return a + b + c;
}
static double add(double a, double b, double c, double d) {
    System.out.println("This is overloaded method #6");
    return a + b + c + d;
}
*/




}