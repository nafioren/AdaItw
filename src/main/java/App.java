

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Person p1 = new Person();
        System.out.println("El nombre y apellido de la person 1 es: " + p1.getName() + " " + p1.getLastName());
        System.out.println("Ingrese el nombre de la person 2: ");
        Person p2 = new Person(read.next());
        System.out.println("El nombre y apellido de la person 2 es: " + p2.getName() + " " + p2.getLastName());
        System.out.println("Ingrese el nombre de la person 3: ");
        String name = read.next();
        System.out.println("Ingrese el apellido de la person 3: ");
        String lastName = read.next();
        Person p3 = new Person(name, lastName);
        System.out.println("El nombre y apellido de la person 3 es: " + p3.getName() + " " + p3.getLastName());

    }


}