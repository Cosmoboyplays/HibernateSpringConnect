package hibernateTest1.entity; // Замените на ваш пакет


import javax.persistence.*;



@Entity
@Table(name = "employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", length = 15)
    private String name;
    @Column(name = "surname", length = 15)
    private String surname;
    @Column(name = "department", length = 20)
    private String department;
    @Column(name = "salary")
    private int salary;
    // Конструктор по умолчанию
    public Employees() {
    }
    // Конструктор с параметрами
    public Employees(String name, String surname, String department, Integer salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }
    // Геттеры и сеттеры
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}