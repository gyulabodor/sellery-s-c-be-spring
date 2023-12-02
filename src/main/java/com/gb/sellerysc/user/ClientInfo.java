package com.gb.sellerysc.user;

import com.gb.sellerysc.shared.utils.SectionTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientInfo {

    private boolean hasExpenses;

    private boolean hasSalaries;

    private SectionTypeEnum mainSection;
}
