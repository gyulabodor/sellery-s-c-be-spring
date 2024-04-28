package com.gb.sellerysc.user;

import com.gb.sellerysc.expense.ExpenseToPayData;
import com.gb.sellerysc.salary.SalaryData;
import com.gb.sellerysc.shared.utils.SectionTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerData {

    private Long id;

    private String username;

    private String email;
    //Payment List
    private List<SalaryData> salaryList;
    //Only that expense can be mapped to an expenseToPay
    //which has enough place to have
    private List<ExpenseToPayData> expenseToPayList;

    private SectionTypeEnum mainSection;
}

