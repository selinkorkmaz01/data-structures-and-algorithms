import java.util.LinkedList;

public class LinkedListImplementation {
    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();

        students.add("Selin");
        students.add("Ahmet");
        students.add("Mehmet");

        System.out.println("Students: " + students);

        students.remove("Ahmet");

        System.out.println("After Removal: " + students);

        System.out.println("First Student: " + students.getFirst());
    }
}
