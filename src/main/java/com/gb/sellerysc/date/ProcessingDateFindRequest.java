package com.gb.sellerysc.date;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProcessingDateFindRequest {
    private Integer year;
    private Integer month;
    private Integer day;
}
