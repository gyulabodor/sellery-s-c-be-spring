package com.gb.sellerysc.date;

import com.gb.sellerysc.shared.exception.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("date")
public class ProcessingDateController {

    private final ProcessingDateService processingDateService;

    public ProcessingDateController(ProcessingDateService processingDateService) {
        this.processingDateService = processingDateService;
    }
    @GetMapping
    public ResponseEntity<ProcessingDateData> fetchProcessingDate(@RequestBody ProcessingDateFindRequest processingDateFindRequest) throws NotFoundException {
        return ResponseEntity.ok(processingDateService.fetchProcessingDate(processingDateFindRequest));
    }

    @PostMapping
    public ResponseEntity<ProcessingDateData> saveProcessingDate(@RequestBody ProcessingDateCreateRequest processingDateCreateRequest){
        return ResponseEntity.ok(processingDateService.saveProcessingDate(processingDateCreateRequest));
    }

    @GetMapping("{year}/{month}")
    public ResponseEntity<List<ProcessingDateData>> searchProcessingDateListByMonth(@PathVariable Integer year, @PathVariable Integer month){
        return ResponseEntity.ok(processingDateService.fetchProcessingDateListByMonth(
                ProcessingDateFindRequest
                        .builder()
                        .year(year)
                        .month(month)
                        .build()
        ));
    }
    @GetMapping("{year}")
    public ResponseEntity<List<ProcessingDateData>> searchProcessingDateListByYear(@PathVariable Integer year){
        return ResponseEntity.ok(processingDateService.fetchProcessingDateListByYear(
                ProcessingDateFindRequest
                        .builder()
                        .year(year)
                        .build()
        ));
    }
}
