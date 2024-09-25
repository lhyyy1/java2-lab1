import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Company company = new Company();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String op = scanner.next();
            if (op.equals("add")) {
                String name = scanner.next();
                int age = scanner.nextInt();
                company.addEmployee(name, age);
            }
            else if (op.equals("delete")){
                String name = scanner.next();
                company.deleteEmployee(name);
            }
            else{
                company.printEmployees();
            }
        }
    }
}
