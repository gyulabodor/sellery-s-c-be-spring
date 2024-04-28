package com.gb.sellerysc.date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProcessingDateInParentData {
        private Long id;
        private Integer year;
        private Integer month;
        private Integer day;
}
