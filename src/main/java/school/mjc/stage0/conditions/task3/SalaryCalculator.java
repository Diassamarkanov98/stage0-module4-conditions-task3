package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        float result = salary;
        if (salary <= 10000 && salary > 0){
            System.out.println(result - (result*15/100));
        } else if (salary > 10000 && salary <= 20000){
            System.out.println(result - (result*18/100));
        } else if (salary > 20000){
            System.out.println(result - (result*20/100));
        } else {
            System.out.println("wrong input!");
        }
    }
}
