package com.gb.sellerysc.salary;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;
@Mapper(componentModel = "spring")
public interface SalaryMapper {

    SalaryMapper MAPPER = Mappers.getMapper(SalaryMapper.class);

    List<SalaryData> salaryListToSalaryDataList(List<Salary> salaryList);
}
