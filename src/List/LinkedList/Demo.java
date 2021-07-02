package List.LinkedList;

public class Demo {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jane","John", 15);
        Employee employee2 = new Employee("Jane","John", 15);
        Employee employee3 = new Employee("Jane","John", 15);
        Employee employee4 = new Employee("Jane","John", 15);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(employee1);
        list.addToFront(employee2);
        list.addToFront(employee3);
        list.addToFront(employee4);


        list.printList();
        System.out.println();
        System.out.println("size: " + list.size);

        list.removeFromFront();

        System.out.println("size: " + list.size);


    }
}
