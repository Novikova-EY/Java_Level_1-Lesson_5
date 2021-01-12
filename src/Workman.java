public class Workman {

    private String fullName; //ФИО
    private String post; // Должность
    private String email; // Email
    private String phone; // Телефон
    private int salary; // Зарплата
    private int age; // Возраст

    /** Конструктор: ФИО, должность, email, телефон, зарплата, возраст.*/
    public Workman(String fullName, String post, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    /** Вывод информации об объекте в консоль */
    void print() {
        System.out.println(String.format("%s, должность - %s, email - %s, телефон - %s, зарплата - %s, возраст - %s",fullName, post, email, phone, salary, age));
    }
}
