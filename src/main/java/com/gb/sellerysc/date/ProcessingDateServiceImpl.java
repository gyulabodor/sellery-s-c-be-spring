package com.gb.sellerysc.date;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProcessingDateServiceImpl implements ProcessingDateService{

    private final ProcessingDateRepository processingDateRepository;
    private final ProcessingDateMapper processingDateMapper;
    public ProcessingDateServiceImpl(
            ProcessingDateRepository processingDateRepository,
            ProcessingDateMapper processingDateMapper){
        this.processingDateRepository=processingDateRepository;
        this.processingDateMapper =processingDateMapper;
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
        return processingDateMapper.processingDateToProcessingDateData(processingDate.get());
    }

    @Override
    public ProcessingDateData saveProcessingDate(ProcessingDateCreateRequest processingDateCreateRequest) {
        return processingDateMapper.processingDateToProcessingDateData(processingDateRepository
                .save(processingDateMapper.processingDateCreateRequestToProcessingDate(processingDateCreateRequest)
                ));
    }

    @Override
    public List<ProcessingDateData> searchProcessingDate(ProcessingDateFindRequest processingDateFindRequest) {
        return processingDateMapper.processingDateListToProcessingDateDataList(processingDateRepository.findAllByYearAndMonth(
                processingDateFindRequest.getYear(),processingDateFindRequest.getMonth()
        ));
    }
}
