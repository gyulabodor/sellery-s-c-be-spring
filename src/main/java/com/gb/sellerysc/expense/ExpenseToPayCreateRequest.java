package com.gb.sellerysc.expense;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseToPayCreateRequest {

       private ExpenseCreateRequest expense;
}
