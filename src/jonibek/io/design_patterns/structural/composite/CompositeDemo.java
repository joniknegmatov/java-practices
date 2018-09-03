package jonibek.io.design_patterns.structural.composite;

/**
 *
 Composite pattern is used where we need to treat a group of objects in similar way as a single object.
 Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy.
 This type of design pattern comes under structural pattern as this pattern creates a tree structure of
 group of objects.

 This pattern creates a class that contains group of its own objects. This class provides ways to modify
 its group of same objects.

 We are demonstrating use of composite pattern via following example in which we will show employees hierarchy
 of an organization.

 Implementation
 We have a class Employee which acts as composite pattern actor class. CompositePatternDemo, our demo class will
 use Employee class to add department level hierarchy and print all employees.
 */

public class CompositeDemo {

    public static void main(String[] args) {

        Employee CEO = new Employee("John","CEO", 30000);

        Employee headSales = new Employee("Robert","Head Sales", 20000);

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        Employee salesIntern1 = new Employee("Intern Suxrob","Sales", 100);
        Employee salesIntern2 = new Employee("Intern Dima","Sales", 100);


        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        salesExecutive1.add(salesIntern1);
        salesExecutive2.add(salesIntern2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //print all employees of the organization
        printEmployees(CEO);
    }

    private static void printEmployees(Employee employee){
        System.out.println(employee);
        if(employee.getSubordinates() != null){
            for (Employee employee1 : employee.getSubordinates()){
                printEmployees(employee1);
            }
        }
    }
}
