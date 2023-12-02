package com.gb.sellerysc.date;
import com.gb.sellerysc.expense.ExpenseToPayData;
import com.gb.sellerysc.salary.SalaryData;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProcessingDateData {
    private Long id;
    private Integer year;
    private Integer month;
    private Integer day;
    private List<ExpenseToPayData> expenseToPayList;
    private List<SalaryData> salaryList;
}
