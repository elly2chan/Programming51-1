public class Employee {
    private String name;
    private int expenses;


    public Employee(String name){
        this.name = name;
        this.expenses = 0;
    }

    public String toString(){
        return name;
    }

    public void addExpense(int netcost){
        expenses += netcost;
    }

    public String getName(){
        return name;
    }

    public int getExpenses(){
        return expenses;
    }
}
