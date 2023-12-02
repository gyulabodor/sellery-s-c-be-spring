package com.gb.sellerysc.expense;

import com.gb.sellerysc.date.ProcessingDateData;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseToPayData {
    private Long id;
    private ExpenseData expense;
    private ProcessingDateData processingDate;
}
