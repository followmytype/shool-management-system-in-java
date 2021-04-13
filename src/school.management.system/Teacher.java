package school.management.system;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getSalaryEarned() {
        return this.salaryEarned;
    }

    public void receiveSalary(int salary) {
        this.salaryEarned += salary;
        School.updateTotalMoney(-salary);
    }

    @Override
    public String toString() {
        return "Teacher's name: " + this.getName() + ". " +
               "The salary are $" + this.getSalary() +
               " and already earned $" + this.getSalaryEarned();
    }
}