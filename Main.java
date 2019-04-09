package assignment2;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("TH108", "Nguyen Thu Thao",19);
        Student s2 = new Student("TH110","Cong Bao Ngoc",20);

        System.out.println(s1);
        System.out.println(s2);

        Employee e1 = new Employee("TH1108", "Nguyen Huong Lan", 18);
        Employee e2 = new Employee("TH1105", "Nguyen Minh Quan", 19);

        System.out.println(e1);
        System.out.println(e2);

        PersonModel<Student> lists1 = new PersonModel<>();
        lists1.addInfo(s1);
        lists1.addInfo(s2);
        lists1.showInfo();

        PersonModel<Employee> lists2 = new PersonModel<>();
        lists2.addInfo(e1);
        lists2.addInfo(e2);
        lists2.showInfo();

    }
}
