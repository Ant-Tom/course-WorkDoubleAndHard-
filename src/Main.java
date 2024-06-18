public class Main {


    public static void main(String[] args) {

        EmployeeBook book = new EmployeeBook();
        book.add(new Employee(1, 1000, "John", "Smith"));
        book.add(new Employee(1, 2000, "Demi", "Mur"));
        book.add(new Employee(3, 3000, "Padme", "Amidala"));
        book.add(new Employee(5, 4000, "Oleg", "Rogatov"));

        book.printEmployees();
        System.out.println("================================================");
        System.out.println(book.salaruSum());
        System.out.println("================================================");
        System.out.println(book.findMinSalary());
        System.out.println("================================================");
        System.out.println(book.findMaxSalary());
        System.out.println("================================================");
        System.out.println(book.averageSalary());
        System.out.println("================================================");
        book.printFIO();
        System.out.println("================================================");
        System.out.println(book.salaruSum(3));
        System.out.println("================================================");
        System.out.println(book.findMaxSalary(1));
        System.out.println("================================================");
        System.out.println(book.findMinSalary(1));
        System.out.println("================================================");
        System.out.println(book.averageSalary(1));
        System.out.println("================================================");
        book.printEmployeeSalaryLess(2000);
        System.out.println("================================================");
        book.printEmployeeSalaryGreater(1001);
        System.out.println("================================================");
        book.printEmployee(1);
        System.out.println("================================================");
        book.indexSalary(20);
        book.indexSalary(1, 1.20);
        book.printEmployee(1);
    }

}

