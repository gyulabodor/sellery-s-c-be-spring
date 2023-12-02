package com.gb.sellerysc.salary;

import com.gb.sellerysc.date.ProcessingDateCreateRequest;
import com.gb.sellerysc.shared.utils.CurrencyEnum;
import com.gb.sellerysc.shared.utils.FrequencyEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalaryCreateRequest {
    private Long amount;
    private CurrencyEnum currency;
    private FrequencyEnum frequency;
    private ProcessingDateCreateRequest processingDate;
    private Long customerId;
}
