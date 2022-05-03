import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PersonNaming {
    private static final Integer AGE_LIMIT = 30;

    public static void main(String[] args) throws Exception {
        List<Person> personList = PersonService.personList();

        System.out.println("duplicate name list::");
        List<String> duplicateNameList = getDuplicateNameList(personList);
        duplicateNameList.forEach(System.out::println);

        System.out.println("filtered people::");
        List<Person> filteredList = getFilteredList(personList);
        filteredList.forEach(System.out::println);

        int averageAge = calculateAverageAge(filteredList);
        System.out.println("average age is::" + averageAge);

        System.out.println("people of age less than " + AGE_LIMIT);
        List<Person> peopleAgeLessThanN = getPeopleAgeLessThanN(filteredList, AGE_LIMIT);
        peopleAgeLessThanN.stream()
                .forEach(System.out::println);

        System.out.println("all countries::");
        List<String> countryList = getCountryList(filteredList);
        System.out.println(countryList);

    }

    private static List<String> getDuplicateNameList(List<Person> personList) {
        Set<String> duplicates = new HashSet<>();
        personList.stream()
                .filter(person -> !duplicates.add(person.getName()))
                .collect(Collectors.toList());
        return new ArrayList<>(duplicates);
    }

    private static List<Person> getFilteredList(List<Person> personList) {
        Set<String> filteredList = new HashSet<>();
        return personList.stream()
                .filter(person -> filteredList.add(person.getName()))
                .collect(Collectors.toList());
    }

    private static int calculateAge(Person person) {
        LocalDate now = LocalDate.now();
        LocalDate dob = person.getDob();
        Period period = Period.between(now, dob);
        int years = Math.abs(period.getYears());
        return years;
    }

    private static int calculateAverageAge(List<Person> personList) {
        int ageSum = personList.stream().mapToInt(PersonNaming::calculateAge).sum();
        return (ageSum / (personList.size()));
    }

    private static List<Person> getPeopleAgeLessThanN(List<Person> personList, int n) {
        List<Person> peopleWithAgeLessThanN = new ArrayList<>();
        for (Person person : personList) {
            int age = calculateAge(person);
            if (age > n) {
                peopleWithAgeLessThanN.add(person);
            }
        }
        return peopleWithAgeLessThanN;
    }

    private static List<String> getCountryList(List<Person> personList) {
        Set<String> countries = personList.stream()
                .map(Person::getNationality).collect(Collectors.toSet());
        return new ArrayList<>(countries);
    }

}
