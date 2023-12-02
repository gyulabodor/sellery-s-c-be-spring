package com.gb.sellerysc.date;

import com.gb.sellerysc.shared.exception.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("date")
public class ProcessingDateController {

    private ProcessingDateService processingDateService;

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
    public ResponseEntity<List<ProcessingDateData>> fetchProcessingDate(@PathVariable Integer year, @PathVariable Integer month){
        return ResponseEntity.ok(processingDateService.searchProcessingDate(new ProcessingDateFindRequest(year,month,0)));
    }
}
