// Person.java
public class Person {
    private String name;
    private String bYear;

    public Person(String name, String bYear) {
        this.name = name;
        this.bYear = bYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getbYear() {
        return bYear;
    }

    public void setbYear(String bYear) {
        this.bYear = bYear;
    }

    public String toString() {
        return "Nhân viên: " + name + ", năm sinh: " + bYear;
    }
}
