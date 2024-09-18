import java.util.HashMap;

public class Company {
    private HashMap<String, Integer> Employees;

    public Company(){
        Employees = new HashMap<String, Integer>();
    }

    public void addEmployee(String name, int age){
        Employees.put(name, age);
    }

    public void deleteEmployee(String name){
        Employees.remove(name);
    }

    public void printEmployees(){
        Employees.forEach((name, age) -> {
            System.out.printf("%s %d\n",name,age);
        });
    }
}
