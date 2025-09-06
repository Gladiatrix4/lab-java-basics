package Company;

public class Employee {
    //Attributes
    private String name;
    private String surname;
    private String birthday;
    private String address;
    private String email;
    private String id;
    private int socialSecurityNumber;
    private String position;
    private int level;
    private double salary;

    //Constructor
    public Employee(String name, String surname, String birthday, String address, String email, String id, int socialSecurityNumber, String position, int level, double salary) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.address = address;
        this.email = email;
        this.id = id;
        this.socialSecurityNumber = socialSecurityNumber;
        this.position = position;
        this.level = level;
        this.salary = salary;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getPosition() {
        return position;
    }

    public int getLevel() {
        return level;
    }

    public double getSalary() {
        return salary;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Methods
    public void information() {
        System.out.println("======================================================" +
                "\nThe Information for Employee " + name + " are the following:" +
                "\n======================================================" +
                "\nName: " + name +
                "\nSurname: " + surname +
                "\nBirthday: " + birthday +
                "\nAddress: " + address +
                "\nemail: " + email +
                "\nID: " + id +
                "\nSocialSecurityNumber: " + socialSecurityNumber +
                "\nPosition: " + position +
                "\nLevel: " + level +
                "\nSalary: " + salary + " €" +
                "\n======================================================");
    }

    public void setBonus(double bonus) {
        this.salary = salary + bonus;
    }
}
