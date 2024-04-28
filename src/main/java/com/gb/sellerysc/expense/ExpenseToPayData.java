package com.gb.sellerysc.expense;

import com.gb.sellerysc.date.ProcessingDateInParentData;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseToPayData {
    private Long id;
    private ExpenseData expense;
    private ProcessingDateInParentData processingDate;
}
