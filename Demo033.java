import java.util.LinkedHashSet;

public class Demo033{
    public static void main(String[] args) {
        // Create a LinkedHashSet of type Integer
        LinkedHashSet<Integer> marks = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        marks.add(1);
        marks.add(2);
        marks.add(3);
        marks.add(4);

        boolean isAdded = marks.add(2);
        if (!isAdded) {
            System.out.println("2 is already in the set.");
        }

        System.out.println("LinkedHashSet contains: " + marks);


        for (Integer numbers : marks) {
            System.out.println(numbers);
        }
    }
}