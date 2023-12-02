package com.gb.sellerysc.shared.dashboard;

import com.gb.sellerysc.expense.ExpenseCreateRequest;
import com.gb.sellerysc.expense.ExpenseData;
import com.gb.sellerysc.expense.ExpenseDeleteRequest;
import com.gb.sellerysc.salary.SalaryCreateRequest;
import com.gb.sellerysc.salary.SalaryData;
import com.gb.sellerysc.salary.SalaryDeleteRequest;
import com.gb.sellerysc.shared.utils.SectionTypeEnum;

public interface DashboardService {

    public void setMainSection(SectionTypeEnum sectionType);
    public SalaryData saveSalary(SalaryCreateRequest salaryCreateRequest);
    public SalaryData deleteSalary(SalaryDeleteRequest salaryDeleteRequest);
    public ExpenseData saveExpense(ExpenseCreateRequest expenseCreateRequest);
    public ExpenseData deleteExpense(ExpenseDeleteRequest expenseDeleteRequest);
}
