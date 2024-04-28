package com.gb.sellerysc.date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface ProcessingDateRepository extends JpaRepository<ProcessingDate, Long> {
    ProcessingDate findByYearAndMonthAndDay(Integer year,Integer month, Integer day);
    List<ProcessingDate> findAllByYearAndMonth(Integer year,Integer month);
    List<ProcessingDate> findAllByYearAndMonthAndDay(Integer year,Integer month, Integer day);
    List<ProcessingDate> findAllByYear(Integer year);
}
