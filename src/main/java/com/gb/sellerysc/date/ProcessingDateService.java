package com.gb.sellerysc.date;
import com.gb.sellerysc.shared.exception.NotFoundException;

import java.util.List;
public interface ProcessingDateService {
    public ProcessingDateData fetchProcessingDate(ProcessingDateFindRequest processingDateFindRequest) throws NotFoundException;

    public ProcessingDateData saveProcessingDate(ProcessingDateCreateRequest processingDateCreateRequest);

    public List<ProcessingDateData> searchProcessingDate(ProcessingDateFindRequest processingDateFindRequest);
}
