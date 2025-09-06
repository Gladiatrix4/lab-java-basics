package Company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        //3. Create an Employee class to represent an employee of a company. Add all relevant properties and behaviors
        //      that you might need but you have to include a salary property. Don't forget to add getters and setters.

        //4. Create an Intern class that extends from Employee. All the Interns have a salary limit of 20000 (constant).
        //      You must validate if an intern is created (or salary updated) with a bigger salary than the max. The max value is set.

        //5. Write a program that creates 10 Employees and print it al the properties.

        Scanner scanner = new Scanner(System.in);


        System.out.println("""
                ------------------------------------------------------------------------------
                If you want to do the calculation automatic answer: true
                If you want to do the calculation manually answer: false""");


        boolean autoCalc = scanner.nextBoolean();

        if (!autoCalc) {
            System.out.println("""
                    ------------------------------------------------------------------------------
                    Enter the following information about the new Employee with the correct order:
                    Name, Surname, Birthday, Address, email, ID, Social Security Number, Position, Level, Salary""");

            String name = scanner.nextLine();
            String surname = scanner.nextLine();
            String birthday = scanner.nextLine();
            String address = scanner.nextLine();
            String email = scanner.nextLine();
            String id = scanner.nextLine();
            int socialSecurityNumber = scanner.nextInt();
            scanner.nextLine();
            String position = scanner.nextLine();
            int level = scanner.nextInt();
            scanner.nextLine();
            double salary = scanner.nextDouble();

            System.out.println("""
                    ------------------------------------------------------------------------------
                    Is this employee an intern?""");

            boolean interntrue = scanner.nextBoolean();

            Employee emp1;

            do
                if (interntrue && salary > 20000) {
                    System.out.println("""
                             ------------------------------------------------------------------------------
                            All the Interns have a salary limit of 20000!
                            Please re-enter new amount""");
                    salary = scanner.nextDouble();

                } while (interntrue && salary > 20000);


            if (!interntrue) {
                emp1 = new Employee(name, surname, birthday, address, email, id, socialSecurityNumber, position, level, salary);
            } else {
                emp1 = new Intern(name, surname, birthday, address, email, id, socialSecurityNumber, position, level, salary);
            }

            emp1.information();

            if (interntrue && emp1.getSalary() == 20000) {
                System.out.println("""
                        All the Interns have a salary limit of 20000, therefore this employee can not get a bonus !""");
                System.exit(0);
            }

            System.out.println("""
                    ----------------------------------------------------------------------
                    Enter the next bonus amount for the employer:""");

            emp1.setBonus(scanner.nextDouble());

            do
                if (interntrue && emp1.getSalary() > 20000) {
                    System.out.println("""
                             ------------------------------------------------------------------------------
                            All the Interns have a salary limit of 20000!
                            Please re-enter new bonus, so that the sum is not greater than 20000""");
                    emp1.setBonus(scanner.nextDouble());

                } while (interntrue && emp1.getSalary() > 20000);


            System.out.println("The Salary plus the bonus of " + name + " " + surname + "is: " + emp1.getSalary());
        } else {

            List<Employee> employees = new ArrayList<>();

            employees.add(new Employee("Gustav", "Paloski", "19/07/1985", "Ravestreet 53", "guPalo@gmail.com", "GUPALO", 422525909, "Mechanical Engineer", 3, 3500));
            employees.add(new Employee("Peri", "Mango", "17/07/1985", "Nordistreet 53", "perima@gmail.com", "PERIMA", 852156588, "Engineering Manager", 6, 10000));
            employees.add(new Employee("Niko", "Toski", "19/08/1985", "Eleimonor 53", "nitokoski@gmail.com", "NISKIT", 136659586, "Electrical Engineer", 3, 3700));
            employees.add(new Intern("Lary", "limou", "19/07/1989", "Mordika 53", "lalirimou@gmail.com", "lALIR", 789654357, "Automation Engineer", 4, 6000));
            employees.add(new Employee("Helen", "Depathe", "12/02/1995", "Harilaou 53", "bepanthen85@gmail.com", "HEDEPA", 763124865, "Hand Worker", 1, 2000));
            employees.add(new Employee("Susan", "Neifola", "06/03/1990", "Kaisie 53", "kimame@gmail.com", "SANFOLA", 958462352, "Mechanical Engineer", 3, 3500));
            employees.add(new Intern("Dmitry", "Koronovitsch", "23/04/1975", "Senofarstreet 53", "nustazo@gmail.com", "DIKORO", 112156811, "Hand Worker", 2, 2300));
            employees.add(new Employee("Giovani", "Garcia", "30/012/1998", "Bankisa 53", "denTheloAllopia@gmail.com", "GIGAVANI", 246885931, "Hand Worker", 1, 2000));
            employees.add(new Intern("Linore", "Aloma", "01/04/1985", "Drakainas 53", "tola56@gmail.com", "LUCYPA", 455669852, "Hand Worker", 1, 2000));
            employees.add(new Employee("Zak", "Meno", "14/01/1989", "Maindo 53", "paokararegate4@gmail.com", "MEZAK", 789654858, "Electrical Engineer", 3, 3700));

            for (Employee employee : employees) {
                employee.information();
            }

        }
    }
}
