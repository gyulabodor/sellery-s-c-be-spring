package com.gb.sellerysc.date;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;
@Mapper(componentModel = "spring")
public interface ProcessingDateMapper {
    ProcessingDateMapper MAPPER = Mappers.getMapper(ProcessingDateMapper.class);
    ProcessingDateData processingDateToProcessingDateData(ProcessingDate processingDate);
    ProcessingDate processingDateCreateRequestToProcessingDate(ProcessingDateCreateRequest processingDateCreateRequest);

    List<ProcessingDateData> processingDateListToProcessingDateDataList(List<ProcessingDate> processingDateList);
}
