package com.gb.sellerysc.date;
import java.util.List;
public interface ProcessingDateService {
    public ProcessingDateData fetchProcessingDate(ProcessingDateFindRequest processingDateFindRequest);

    public ProcessingDateData saveProcessingDate(ProcessingDateCreateRequest processingDateCreateRequest);
    public List<ProcessingDateData> searchProcessingDate(ProcessingDateFindRequest processingDateFindRequest);
}
