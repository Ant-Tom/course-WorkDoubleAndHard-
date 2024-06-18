public class EmployeeBook {
    private final Employee[] employees = new Employee[10];

    public boolean add(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public void remove(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getId() == id) {
                employees[i] = null;
                break;
            }
        }
    }

    public Employee get(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                continue;
            }
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee);
        }
    }

    public int salaruSum() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee == null){
                continue;
            }
            sum += employee.getSalary();
        }
        return sum;
    }

    public int salaruSum(int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee == null){
                continue;
            }
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public Employee findMinSalary() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public Employee findMinSalary(int department) {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() != department) {
                continue;
            }
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public Employee findMaxSalary() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public Employee findMaxSalary(int department) {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department && employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public double averageSalary() {
        return (double) salaruSum() / employees.length;
    }

    public double averageSalary(int department) {
        int countInDept = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department) {
                countInDept++;
            }
        }
        return (double) salaruSum(department) / countInDept;
    }

    public void printFIO() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee.getFirstName() + " " + employee.getLastName());
        }
    }

    public void indexSalary(double percent) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            employee.setSalary((int) (employee.getSalary() * percent));
        }
    }

    public void indexSalary(int department, double percent) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department) {
                employee.setSalary((int) (employee.getSalary() * percent));
            }
        }
    }

    public void indexSalary(int percent) {
        double indexValue = 1 + (percent / 100d);
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            employee.setSalary((int) (employee.getSalary() * indexValue));
        }
    }

    public void printEmployee(int department) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department) {
                System.out.printf(String.format("%d %s %s %d %n", employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getSalary()));
            }
        }
    }

    public void printEmployeeSalaryLess(int salary) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() < salary) {
                System.out.printf(String.format("%d %s %s %d %n", employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getSalary()));
            }
        }
    }

    public void printEmployeeSalaryGreater(int salary) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() >= salary) {
                System.out.printf(String.format("%d %s %s %d %n", employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getSalary()));
            }
        }
    }
}


