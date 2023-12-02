package com.gb.sellerysc.expense;

import java.util.List;
public interface ExpenseToPayService {

    public List<ExpenseToPayData> fetchMonthlyExpenseList();
    public List<ExpenseToPayData> fetchMonthlyExpenseListByYearAndMonth(Integer year, Integer month);
    public ExpenseToPay saveMonthlyExpense(ExpenseToPayCreateRequest monthlyExpenseCreateRequest);
}
