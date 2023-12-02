package com.gb.sellerysc.salary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalaryDeleteRequest {

    private Long salaryId;

    private Long customerId;
}
