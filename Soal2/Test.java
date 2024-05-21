package Soal2;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("John", "Bekasi", "08333", "john@gmail.com");
        Student student = new Student("Jane", "Tangerang", "08555", "jane@gmail.com", Student.Tahun2);
        Employee employee = new Employee("Mike", "Surabaya", "08999", "mike@gmail.com", "Ruangan 1", 5000000, new MyDate());
        Faculty faculty = new Faculty("Sarah", "Jakarta", "08111", "sarah@gmail.com", "Ruangan 5", 8000000, new MyDate(), "7am - 4pm", "Professor");
        Staff staff = new Staff("Wilson", "Bandung", "08666", "wilson@gmail.com", "Ruangan 10", 4000000, new MyDate(), "Manager");

        System.out.println(person.toString() + "\n\n");
        System.out.println(student.toString() + "\n\n");
        System.out.println(employee.toString() + "\n\n");
        System.out.println(faculty.toString() + "\n\n");
        System.out.println(staff.toString() + "\n\n");
    }
}
