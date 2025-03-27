import java.util.*;

public class Test06 {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Ivan",100000, 19810515, 407371204);
        Employee emp2 = new Employee("Den",90000, 19810516, 407371205);
        Employee emp3 = new Employee("Bek",23000, 19810518, 407371207);

        List<Employee> emps = new ArrayList<>();
        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);

//        emps.stream().filter(e -> e.getSalary() < 80000).map(ee -> ee.getName()).forEach(System.out::println);
        emps.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .map(ee -> ee.getName()).forEach(System.out::println);



    }
}
