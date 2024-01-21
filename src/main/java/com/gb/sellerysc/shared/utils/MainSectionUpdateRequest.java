package com.gb.sellerysc.shared.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MainSectionUpdateRequest {
    private Long customerId;
    private SectionTypeEnum updatedSection;
}
