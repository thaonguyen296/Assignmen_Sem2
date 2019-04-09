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

    }
}
