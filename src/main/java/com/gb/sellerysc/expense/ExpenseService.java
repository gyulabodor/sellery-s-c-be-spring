package com.gb.sellerysc.expense;
import java.util.List;
public interface ExpenseService {
     List<ExpenseData> fetchAllExpenses();
     ExpenseData saveExpense(ExpenseCreateRequest expenseCreateRequest);
     ExpenseData deleteExpense(ExpenseDeleteRequest expenseDeleteRequest);
}
