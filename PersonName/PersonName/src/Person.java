import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dob;
    private String nationality;

    public Person(String name, LocalDate dob, String nationality) {
        this.name = name;
        this.dob = dob;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", nationality='" + nationality + '\'' +
                '}';
    }

}
