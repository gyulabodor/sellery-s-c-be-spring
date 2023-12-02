package com.gb.sellerysc.shared.dashboard;

import com.gb.sellerysc.expense.ExpenseCreateRequest;
import com.gb.sellerysc.expense.ExpenseData;
import com.gb.sellerysc.expense.ExpenseDeleteRequest;
import com.gb.sellerysc.expense.ExpenseToPayService;
import com.gb.sellerysc.salary.SalaryCreateRequest;
import com.gb.sellerysc.salary.SalaryData;
import com.gb.sellerysc.salary.SalaryDeleteRequest;
import com.gb.sellerysc.salary.SalaryService;
import com.gb.sellerysc.shared.utils.SectionTypeEnum;
import com.gb.sellerysc.user.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class DashboardServiceImpl implements DashboardService{

    private SalaryService salaryService;
    private ExpenseToPayService expenseToPayService;
    private CustomerService customerService;



    @Override
    public void setMainSection(SectionTypeEnum sectionType) {

    }

    @Override
    public SalaryData saveSalary(SalaryCreateRequest salaryCreateRequest) {
        return null;
    }

    @Override
    public SalaryData deleteSalary(SalaryDeleteRequest salaryDeleteRequest) {
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
