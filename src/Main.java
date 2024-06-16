public class Main {

    private static Employee[] employees = new Employee[4];

    public static void main(String[] args) {

        employees [0] = new Employee(1, 1000,"John", "Smith");
        employees [1] = new Employee(2, 2000,"Demi", "Mur");
        employees [2] = new Employee(3, 3000,"Padme", "Amidala");
        employees [3] = new Employee(5, 4000,"Oleg", "Rogatov");

        printEmployees();
        System.out.println("================================================");
        System.out.println(salaruSum());
        System.out.println("================================================");
        System.out.println(findMinSalary());
        System.out.println("================================================");
        System.out.println(findMaxSalary());
        System.out.println("================================================");
        System.out.println(averageSalary());
        System.out.println("================================================");
        printFIO();
    }


    public static void  printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int salaruSum() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee findMinSalary() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }
    public static Employee findMaxSalary() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public static double averageSalary(){
        return  salaruSum() / employees.length;
    }

    public static void printFIO () {
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName());
        }
    }
}

