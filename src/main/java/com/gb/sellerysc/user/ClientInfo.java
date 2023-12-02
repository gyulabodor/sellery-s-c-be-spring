package com.gb.sellerysc.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientInfo {
    private boolean hasExpenses;
    private boolean hasSalaries;
}
