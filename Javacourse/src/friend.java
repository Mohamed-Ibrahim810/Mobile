public class friend {
    // Static keyword
    String name;
    static int NumberOFfriends;

    friend(String name){
        this.name = name;
        NumberOFfriends++;
    }

    static void DisplayFriends(){
        System.out.println("You have "+NumberOFfriends+" friends");
    }

}
