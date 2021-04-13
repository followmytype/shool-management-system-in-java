package school.management.system;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int fees;
    private int feesPaid;

    public Student(int id, String name, int grade) {
        this.fees = 10000;
        this.feesPaid = 0;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }

    public int getFees() {
        return this.fees;
    }

    public int getFeesPaid() {
        return this.feesPaid;
    }
    
    /**
     * 學生繳費
     * @param fees 欲繳交的學費
     */
    public void payFees(int fees) {
        this.feesPaid += fees;
        School.updateTotalMoney(fees);
    }

    @Override
    public String toString() {
        return "Student's name: " + this.getName() + ", " +
               "grade: " + this.getGrade() + ". " +
               "The fees are $" + this.getFees() +
               " and already paid $" + this.getFeesPaid();
    }
}