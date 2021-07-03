package List.DoublyLinkedList;

public class Demo {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jane","John", 15);
        Employee employee2 = new Employee("Mary","John", 16);
        Employee employee3 = new Employee("Scott","John", 17);
        Employee employee4 = new Employee("Mike","John", 18);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(employee1);
        list.addToFront(employee2);
        list.addToFront(employee3);
        list.addToFront(employee4);


        list.printList();
        System.out.println();
        System.out.println("size: " + list.size);

        Employee employee5 = new Employee("Bill","End", 78);
        list.addToEnd(employee5);

        list.printList();
        System.out.println();
        System.out.println("size: " + list.size);


        list.removeFromFront();
        list.printList();
        System.out.println();
        System.out.println("size: " + list.size);


        list.removeFromEnd();
        list.printList();
        System.out.println();
        System.out.println("size: " + list.size);


    }
}
