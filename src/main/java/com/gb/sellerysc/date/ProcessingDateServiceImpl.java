package com.gb.sellerysc.date;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProcessingDateServiceImpl implements ProcessingDateService{

    private final ProcessingDateRepository processingDateRepository;
    private final ProcessingDateMapper mapper;
    public ProcessingDateServiceImpl(
            ProcessingDateRepository processingDateRepository,
            ProcessingDateMapper processingDateMapper){
        this.processingDateRepository=processingDateRepository;
        this.mapper=processingDateMapper;
    }
    @Override
    public ProcessingDateData fetchProcessingDate(ProcessingDateFindRequest processingDateFindRequest) {
        Optional<ProcessingDate> processingDate = Optional.ofNullable(processingDateRepository.findByYearAndMonthAndDay(
                processingDateFindRequest.getYear(),
                processingDateFindRequest.getMonth(),
                processingDateFindRequest.getDay()
        ));
        if (!processingDate.isPresent()){
            return null;
        }
        return mapper.processingDateToProcessingDateData(processingDate.get());
    }

    @Override
    public ProcessingDateData saveProcessingDate(ProcessingDateCreateRequest processingDateCreateRequest) {
        return mapper.processingDateToProcessingDateData(processingDateRepository
                .save(mapper.processingDateCreateRequestToProcessingDate(processingDateCreateRequest)
                ));
    }

    @Override
    public List<ProcessingDateData> searchProcessingDate(ProcessingDateFindRequest processingDateFindRequest) {
        return mapper.processingDateListToProcessingDateDataList(processingDateRepository.findAllByYearAndMonth(
                processingDateFindRequest.getYear(),processingDateFindRequest.getMonth()
        ));
    }
}
