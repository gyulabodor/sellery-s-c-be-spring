package com.gb.sellerysc.expense;

import com.gb.sellerysc.shared.utils.CurrencyEnum;
import com.gb.sellerysc.shared.utils.FrequencyEnum;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseCreateRequest {

    private String itemName;

    private Long amount;

    private CurrencyEnum currency;

    private FrequencyEnum frequency;

    private Long customerId;
}
