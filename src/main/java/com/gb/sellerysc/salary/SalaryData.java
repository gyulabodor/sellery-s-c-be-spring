package com.gb.sellerysc.salary;

import com.gb.sellerysc.date.ProcessingDateData;
import com.gb.sellerysc.shared.utils.CurrencyEnum;
import com.gb.sellerysc.shared.utils.FrequencyEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalaryData {
    private Long id;
    private Long amount;
    private CurrencyEnum currency;
    private FrequencyEnum frequency;
    private ProcessingDateData processingDate;
}
