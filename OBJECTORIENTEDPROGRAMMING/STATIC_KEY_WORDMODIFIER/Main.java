package OBJECTORIENTEDPROGRAMMING.STATIC_KEY_WORDMODIFIER;

public class Main {
    public static void main(String[] args) {
       
        Friend friend1 = new Friend("Mukisa");
        Friend friend2 = new Friend("Ivan");

        System.out.println(Friend.numberofFriends);

        Friend.displayFriends();

        
        System.out.println(friend1.name);
        
        System.out.println(friend2.name);


    }
    
}
