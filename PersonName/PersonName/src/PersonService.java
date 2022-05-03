import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class PersonService {
    public static List<Person> personList() {

        return Arrays.asList(
                new Person("John", getDate("14/01/1983"), "Australia"),
                new Person("Jack", getDate("03/08/2082"), "Canada"),
                new Person("Amber", getDate("09/08/1991"), "India"),
                new Person("Lori", getDate("16/07/1992"), "Nepal"),
                new Person("Jack", getDate("16/06/1994"), "Australia"),
                new Person("Amber", getDate("16/05/1884"), "Canada"),
                new Person("Lori", getDate("16/04/1886"), "US"));
    }

    public static LocalDate getDate(String date) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        return localDate;
    }
}
