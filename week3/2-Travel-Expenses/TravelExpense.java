public class TravelExpense {
    private String type;
    private Employee employee;
    private int netCost;

    public TravelExpense(String type, Employee employee, int netCost){
        this.type = type;
        this.employee = employee;
        employee.addExpense(netCost);
        this.netCost = netCost;
    }

    public String toString(){
        return "Type: " + type + " Employee: " + employee + " netCost: " + netCost;
    }

    public String getType(){
        return type;
    }

    public Employee getEmployee(){
        return employee;
    }

    public int getNetCost(){
        return netCost;
    }

    public int getEmploeeExpenses(){
        return employee.getExpenses();
    }
}
