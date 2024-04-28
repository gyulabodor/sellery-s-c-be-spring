package com.gb.sellerysc.expense;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseToPayServiceImpl implements ExpenseToPayService {
    private final ExpenseToPayRepository expenseToPayRepository;
    private final ExpenseToPayMapper expenseToPayMapper;
    public ExpenseToPayServiceImpl(ExpenseToPayRepository expenseToPayRepository,ExpenseToPayMapper expenseToPayMapper) {
        this.expenseToPayRepository = expenseToPayRepository;
        this.expenseToPayMapper = expenseToPayMapper;
    }

    @Override
    public List<ExpenseToPayData> fetchMonthlyExpenseList() {
        return expenseToPayMapper.expenseToPayListToExpenseToPayDataList(expenseToPayRepository.findAll());
    }

    @Override
    public List<ExpenseToPayData> fetchYearlyExpenseList(Long userId, Integer year, Integer month) {
        return null;
    }

    @Override
    public List<ExpenseToPayData> fetchDailyExpenseList(Long userId, Integer year, Integer month, Integer day) {
        return null;
    }

    @Override
    public List<ExpenseToPayData> fetchMonthlyExpenseListByYear(Long userId, Integer year) {
        return null;
    }

    @Override
    public ExpenseToPayData saveMonthlyExpense(ExpenseToPayCreateRequest monthlyExpenseCreateRequest) {
        return null;
    }

    @Override
    public ExpenseToPayData fetchExpenseById(Long id) {
        return null;
    }
}
