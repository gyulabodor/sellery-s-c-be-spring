package com.gb.sellerysc.expense;

import com.gb.sellerysc.shared.utils.CurrencyEnum;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseCreateRequest {
    private String itemName;
    private Long amount;
    private CurrencyEnum currency;
}
