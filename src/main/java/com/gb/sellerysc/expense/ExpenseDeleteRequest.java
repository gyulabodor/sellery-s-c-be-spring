package com.gb.sellerysc.expense;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseDeleteRequest {

    private Long expenseId;

    private Long customerId;
}
