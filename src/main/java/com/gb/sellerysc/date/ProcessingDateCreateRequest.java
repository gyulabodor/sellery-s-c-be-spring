package com.gb.sellerysc.date;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProcessingDateCreateRequest {
    private Integer year;
    private Integer month;
    private Integer day;
}
