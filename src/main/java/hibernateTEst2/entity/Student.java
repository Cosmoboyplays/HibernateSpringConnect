package hibernateTEst2.entity;


import jakarta.persistence.*;

@Entity
@Table(name="student") // Укажите имя таблицы, если оно отличается от имени класса
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private double avgGrade;
    // Конструктор без параметров
    public Student() {
    }
    // Конструктор с параметрами
    public Student(String name, String surname, double avgGrade) {
        this.name = name;
        this.surname = surname;
        this.avgGrade = avgGrade;
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
    public double getAvgGrade() {
        return avgGrade;
    }
    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", avgGrade=" + avgGrade +
                '}';
    }
}