
package com.gb.sellerysc.expense;

import java.util.List;
public interface ExpenseToPayService {

    public List<ExpenseToPayData> fetchMonthlyExpenseList();
    public List<ExpenseToPayData> fetchYearlyExpenseList(Long userId,Integer year, Integer month);
    public List<ExpenseToPayData> fetchDailyExpenseList(Long userId,Integer year, Integer month, Integer day);
    public List<ExpenseToPayData> fetchMonthlyExpenseListByYear(Long userId,Integer year);
    public ExpenseToPayData saveMonthlyExpense(ExpenseToPayCreateRequest monthlyExpenseCreateRequest);
    public ExpenseToPayData fetchExpenseById(Long id);
}

