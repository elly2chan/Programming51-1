public class Travel {
    private String city;
    private String country;
    private int vat;
    private TravelExpenseVector expensesData;

    public Travel(String city, String country, int vat){
        this.city = city;
        this.country = country;
        this.vat = vat;
        this.expensesData = new TravelExpenseVector();
    }

    public String getCity(){
        return city;
    }

    public String getCountry(){
        return country;
    }

    public int getVat(){
        return vat;
    }

    public void addExpense(TravelExpense expense){
        expensesData.add(expense);
    }

    public int totalNetCost(){
        return expensesData.getTotalNetCost();
    }

    public int totalCost(){
        return totalNetCost() + vat;
    }

    public Employee[] mostExpensesMadeBy(){
        return expensesData.getEmployeesWithMostExpenses();
    }

}
