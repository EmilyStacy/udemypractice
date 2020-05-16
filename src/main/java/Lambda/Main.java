package Lambda;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("printing the runable");
//            }
//        }).start();

//        new Thread(()-> System.out.println("printing the runnable")).start();

        employees.add(new Employee("Emily",32));
        employees.add(new Employee("John",20));
        employees.add(new Employee("Paloma",25));

       employees.sort(Comparator.comparing(Employee::getName));

        new Thread(()->{
            System.out.println("printing the runnable");
            System.out.println("testing another line");
            System.out.println();employees.forEach(employee -> employee.toString());} ).start();

    }



}

//class CodeToRun implements Runnable{
//    @Override
//    public void run(){
//        System.out.println("printing the runable");
//    }
//}
class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.getName()+" " + this.getAge();
    }
}