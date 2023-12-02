package com.gb.sellerysc.user;

import com.gb.sellerysc.expense.ExpenseToPayData;
import com.gb.sellerysc.expense.ExpenseToPayService;
import com.gb.sellerysc.salary.SalaryData;
import com.gb.sellerysc.salary.SalaryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService{
    private SalaryService salaryService;
    private ExpenseToPayService expenseToPayService;

    public ClientServiceImpl(SalaryService salaryService, ExpenseToPayService expenseToPayService) {
        this.salaryService = salaryService;
        this.expenseToPayService = expenseToPayService;
    }

    @Override
    public ClientInfo fetchClientInfo(Long id) {
        Optional<List<SalaryData>> salaryList = Optional.ofNullable(salaryService.fetchSalaryList());
        Optional<List<ExpenseToPayData>> monthlyExpenseList = Optional.ofNullable(expenseToPayService.fetchMonthlyExpenseList());
        //kiszervezni mapperbe
        ClientInfo clientInfo = new ClientInfo();
        clientInfo.setHasExpenses(monthlyExpenseList.isEmpty());
        clientInfo.setHasSalaries(salaryList.isEmpty());
        return clientInfo;
    }
}
