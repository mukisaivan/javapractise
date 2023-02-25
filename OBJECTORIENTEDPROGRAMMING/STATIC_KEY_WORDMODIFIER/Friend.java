package OBJECTORIENTEDPROGRAMMING.STATIC_KEY_WORDMODIFIER;

public class Friend {
    String name;  // Since all those objects below this name have to use this name then we can declare a static method below it

    static int numberofFriends; // all the things below this static will be entitled to this variable

    Friend(String name) {
        this.name = name;
        numberofFriends++;
    }

    static void displayFriends() {
        System.out.println("you have " + numberofFriends + " friends");
    }

}
