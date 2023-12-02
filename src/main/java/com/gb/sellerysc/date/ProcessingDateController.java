package com.gb.sellerysc.date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("date")
public class ProcessingDateController {
    private ProcessingDateService processingDateService;
private ProcessingDateMapper processingDateMapper;
    public ProcessingDateController(ProcessingDateService processingDateService,ProcessingDateMapper processingDateMapper) {
        this.processingDateService = processingDateService;
        this.processingDateMapper=processingDateMapper;
    }

    @GetMapping
    public ResponseEntity<ProcessingDateData> fetchProcessingDate(@RequestBody ProcessingDateFindRequest processingDateFindRequest){
        return ResponseEntity.ok(processingDateService.fetchProcessingDate(processingDateFindRequest));
    }
    @PostMapping
    public ResponseEntity<ProcessingDateData> saveProcessingDate(@RequestBody ProcessingDateCreateRequest processingDateCreateRequest){
        return ResponseEntity.ok(processingDateService.saveProcessingDate(processingDateCreateRequest));
    }

    @GetMapping("{year}/{month}")
    public ResponseEntity<List<ProcessingDateData>> fetchProcessingDate(@PathVariable Integer year, @PathVariable Integer month){
        return ResponseEntity.ok(processingDateService.searchProcessingDate(new ProcessingDateFindRequest(year,month,0)));
    }
}
