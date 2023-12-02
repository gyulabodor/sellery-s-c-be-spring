package com.gb.sellerysc.expense;
import java.util.List;
public interface ExpenseService {
    public List<ExpenseData> fetchAllExpenses(Long id);
    public ExpenseData saveExpense(ExpenseCreateRequest expenseCreateRequest);
    public ExpenseData deleteExpense(ExpenseDeleteRequest expenseDeleteRequest);
}
