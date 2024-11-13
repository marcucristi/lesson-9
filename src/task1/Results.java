package task1;

public class Results {
    public static void main(String[] args) {

        System.out.println();
        Person somePerson = new Person("Kyle", "Dacia 38/2" );
        System.out.println(somePerson);

        System.out.println();
        Student someStudent = new Student("Hanna", "Cuza Voda 7", "C++", 2003, 934.34 );
        System.out.println(someStudent);

        System.out.println();
        Staff someStaff = new Staff("Henry", "Burebista 3","Nicolae Iorga", 12739.76);
        System.out.println((someStaff));
    }
}
