public class Main {

    private static Employee[] employees = new Employee[4];

    public static void main(String[] args) {

        employees[0] = new Employee(1, 1000, "John", "Smith");
        employees[1] = new Employee(1, 2000, "Demi", "Mur");
        employees[2] = new Employee(3, 3000, "Padme", "Amidala");
        employees[3] = new Employee(5, 4000, "Oleg", "Rogatov");

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
        System.out.println("================================================");
        System.out.println(salaruSum(3));
        System.out.println("================================================");
        System.out.println(findMaxSalary(1));
        System.out.println("================================================");
        System.out.println(findMinSalary(1));
        System.out.println("================================================");
        System.out.println(averageSalary(1));
        System.out.println("================================================");
        printEmployeeSalaryLess(2000);
        System.out.println("================================================");
        printEmployeeSalaryGreater(1001);
        System.out.println("================================================");
        printEmployee(1);
        System.out.println("================================================");
        indexSalary(20);
        indexSalary(1, 1.20);
        printEmployee(1);
    }


    public static void printEmployees() {
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

    public static int salaruSum(int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
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

    private static Employee findMinSalary(int department) {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary() < min.getSalary()) {
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

    public static Employee findMaxSalary(int department) {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public static double averageSalary() {
        return (double) salaruSum() / employees.length;
    }

    public static double averageSalary(int department) {
        int countInDept = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                countInDept++;
            }
        }
        return (double) salaruSum(department) / countInDept;
    }

    public static void printFIO() {
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName());
        }
    }

    public static void indexSalary(double percent) {
        for (Employee employee : employees) {
            employee.setSalary((int) (employee.getSalary() * percent));
        }
    }

    public static void indexSalary(int department, double percent) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employee.setSalary((int) (employee.getSalary() * percent));
            }
        }
    }

    public static void indexSalary(int percent) {
        double indexValue = 1 + (percent / 100d);
        for (Employee employee : employees) {
            employee.setSalary((int) (employee.getSalary() * indexValue));
        }
    }

    private static void printEmployee(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.printf(String.format("%d %s %s %d %n", employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getSalary()));
            }
        }
    }

    private static void printEmployeeSalaryLess(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.printf(String.format("%d %s %s %d %n", employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getSalary()));
            }
        }
    }

    private static void printEmployeeSalaryGreater(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.printf(String.format("%d %s %s %d %n", employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getSalary()));
            }
        }
    }
}

