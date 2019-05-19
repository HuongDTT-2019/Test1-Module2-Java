import java.util.Scanner;

public class StudentManagement {
    Student[] studentList;
    Scanner scanner = new Scanner(System.in);

    public Student addStudent() {
        Student student = new Student();
        System.out.print("Id: ");
        int id = scanner.nextInt();
        student.setId(id);
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();
        student.setName(name);

        System.out.print("Age: ");
        int age = scanner.nextInt();
        student.setAge(age);
        scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();
        student.setAddress(address);

        System.out.print("GPA: ");
        float gpa = scanner.nextFloat();
        student.setGpa(gpa);

        return student;
    }

    public void editStudent(Student student) {
        System.out.print("Id: " + student.getId());
        scanner.nextLine();
        System.out.print("\nName: " + student.getName());
        System.out.print("\nEdit Name:");
        String name = scanner.nextLine();
        student.setName(name);

        System.out.print("\nAge: " + student.getAge());
        System.out.print("\nEdit Age: " );
        int age = scanner.nextInt();
        student.setAge(age);
        scanner.nextLine();

        System.out.print("\nAddress: " + student.getAddress());
        System.out.print("\nAddress: ");
        String address = scanner.nextLine();
        student.setAddress(address);

        System.out.print("\nGPA: "+student.getGpa());
        System.out.print("\nGPA: ");
        float gpa = scanner.nextFloat();
        student.setGpa(gpa);
    }

    public void deleteStudent(int id) {
        for (int i = 0; i <studentList.length; i++) {
            boolean isStudent = (studentList[i].getId() == id);
            if (isStudent){
                studentList[i] = null;
            }
        }
    }

    public void sortStudent() {
        Student temp = studentList[0];
        for (int i = 0 ; i < studentList.length - 1; i++) {
            for (int j = i + 1; j < studentList.length; j++) {
                boolean isGpa = (studentList[i].getGpa() < studentList[j].getGpa());
                if (isGpa) {
                    temp = studentList[j];
                    studentList[j] = studentList[i];
                    studentList[i] = temp;
                }
            }
        }
    }

    public void showStudent() {
        System.out.println("Id" + "\t" + "Name" + "\t" + "Age" + "\t" + "Address" + "\t" + "Gpa");
        for (int i = 0; i < studentList.length; i++) {
            System.out.print(studentList[i].getId() + "\t");
            System.out.print(studentList[i].getName() + "\t");
            System.out.print(studentList[i].getAge() + "\t");
            System.out.print(studentList[i].getAddress() + "\t");
            System.out.print(studentList[i].getGpa() + "\t");
            System.out.println("\n");
        }


    }
}
