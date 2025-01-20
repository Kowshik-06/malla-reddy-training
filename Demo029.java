import java.util.ArrayList;

public class Demo029 {
    public static void main(String[] args) {

        ArrayList<String> members = new ArrayList<>();

        members.add("Alice");
        members.add("Bob");
        members.add("Charlie");
        members.add("David");
        members.add("Eve");
        members.add("Frank");
        members.add("Grace");
        members.add("Hannah");
        members.add("Ivy");
        members.add("Jack");

        System.out.println("Members in the list:");
        for (String member : members) {
            System.out.println(member);
        }
    }
}