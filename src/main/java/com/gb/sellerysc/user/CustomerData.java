package com.gb.sellerysc.user;

import com.gb.sellerysc.expense.ExpenseData;
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

    private List<ExpenseData> expenseList;

    private List<SalaryData> salaryList;

    private List<ExpenseToPayData> expenseToPayList;

    private SectionTypeEnum mainSection;
}

