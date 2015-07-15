public class TravelExpenseVector {
    private TravelExpense[] travelExpenseVector;
    private int currentSize;
    private int capacity;


    public TravelExpenseVector() {
        this.currentSize = 0;
        this.capacity = 10;
        travelExpenseVector = new TravelExpense[capacity];
    }

    public String toString() {
        String expenses = "";
        for (TravelExpense item : travelExpenseVector) {
            expenses += (item + "/n");
        }
        return expenses;
    }

    public void add(TravelExpense expense) {
        if (currentSize == capacity) {
            resize();
        }
        travelExpenseVector[currentSize] = expense;
    }

    public int getTotalNetCost() {
        int total = 0;
        for (int i = 0; i <= currentSize; i++) {
            total += travelExpenseVector[i].getNetCost();
        }
        return total;
    }

    public Employee[] getEmployeesWithMostExpenses() {
        Employee[] top2Emploees = new Employee[2];
        int index = 0;
        int index2 = (currentSize == 0)? 0: currentSize - 1;
        System.out.println(currentSize);
        for (int i = 0; i < currentSize; i++) {
            travelExpenseVector[i].getEmploeeExpenses();
            if (travelExpenseVector[index].getEmploeeExpenses() < travelExpenseVector[i].getEmploeeExpenses()) {
                index = i;
            } else if (travelExpenseVector[index2].getEmploeeExpenses() < travelExpenseVector[i].getEmploeeExpenses()) {
                index2 = i;
            }
        }
        top2Emploees[0] = travelExpenseVector[index].getEmployee();
        top2Emploees[1] = travelExpenseVector[index2].getEmployee();
        return top2Emploees;
    }

    private void resize() {
        TravelExpense[] temp = new TravelExpense[capacity * 2 + 1];
        for (int i = 0; i < capacity; i++) {
            temp[i] = travelExpenseVector[i];
        }
        travelExpenseVector = temp;

    }

}
