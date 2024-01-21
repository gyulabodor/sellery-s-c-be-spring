package com.gb.sellerysc.date;
import com.gb.sellerysc.shared.exception.NotFoundException;

import java.util.List;
public interface ProcessingDateService {
    ProcessingDateData fetchProcessingDate(ProcessingDateFindRequest processingDateFindRequest) throws NotFoundException;

    ProcessingDateData saveProcessingDate(ProcessingDateCreateRequest processingDateCreateRequest);

    List<ProcessingDateData> fetchProcessingDateListByMonth(ProcessingDateFindRequest processingDateFindRequest);

    List<ProcessingDateData> fetchProcessingDateListByYear(ProcessingDateFindRequest processingDateFindRequest);
}
