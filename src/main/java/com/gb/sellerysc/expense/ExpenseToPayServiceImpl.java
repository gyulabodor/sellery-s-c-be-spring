package com.gb.sellerysc.expense;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseToPayServiceImpl implements ExpenseToPayService {
    private ExpenseToPayRepository expenseToPayRepository;
    public ExpenseToPayServiceImpl(ExpenseToPayRepository expenseToPayRepository) {
        this.expenseToPayRepository = expenseToPayRepository;
    }

    @Override
    public List<ExpenseToPayData> fetchMonthlyExpenseList() {
        return null;
    }

    @Override
    public List<ExpenseToPayData> fetchMonthlyExpenseListByYearAndMonth(Integer year, Integer month) {
        return null;
    }

    @Override
    public ExpenseToPay saveMonthlyExpense(ExpenseToPayCreateRequest monthlyExpenseCreateRequest) {
        return null;
    }
}
