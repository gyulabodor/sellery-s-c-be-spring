package com.gb.sellerysc.expense;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {
    @Override
    public List<ExpenseData> fetchAllExpenses(Long id) {
        return null;
    }

    @Override
    public ExpenseData saveExpense(ExpenseCreateRequest expenseCreateRequest) {
        return null;
    }

    @Override
    public ExpenseData deleteExpense(ExpenseDeleteRequest expenseDeleteRequest) {
        return null;
    }
}
