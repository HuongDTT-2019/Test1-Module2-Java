import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choose = null;
        boolean exit = false;
        StudentManagement studentManager = new StudentManagement();
        showMenu();
        while (true) {
            choose = input.nextLine();
            switch (choose) {
                case "1":
                    System.out.print("Nhap vao so luong sinh vien: ");
                    int size = input.nextInt();
                    studentManager.studentList = new Student[size];
                    for (int i = 0; i < studentManager.studentList.length; i++) {
                        studentManager.studentList[i] = studentManager.addStudent();
                    }
                    break;
                case "2":
                    System.out.println("Nhap vao vi tri sinh vien muon sua");
                    int element = input.nextInt();
                    for (int i = 0; i < studentManager.studentList.length; i++) {
                        boolean isStudent = (studentManager.studentList[i] == studentManager.studentList[element]);
                        if(isStudent) {
                            studentManager.editStudent(studentManager.studentList[i]);
                        }
                    }
                    break;
                case "3":
                    System.out.println("Nhap vao id sinh vien muon xoa");
                    int id = input.nextInt();
                    studentManager.deleteStudent(id);
                    break;
                case "4":
                    studentManager.sortStudent();
                    break;
                case "5":
                    studentManager.showStudent();
                    break;
                case "0":
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
            showMenu();
        }
    }
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by gpa.");
        System.out.println("5. Show student.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
