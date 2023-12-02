package com.gb.sellerysc.expense;

import com.gb.sellerysc.shared.utils.CurrencyEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseData {

    private Long id;
    private String itemName;
    private Long amount;
    private CurrencyEnum currency;
}
