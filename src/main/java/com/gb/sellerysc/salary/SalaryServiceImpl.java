package com.gb.sellerysc.salary;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService{
    private SalaryRepository salaryRepository;
    private SalaryMapper salaryMapper;
    public SalaryServiceImpl(SalaryRepository salaryRepository,
                             SalaryMapper salaryMapper) {
        this.salaryRepository = salaryRepository;
        this.salaryMapper = salaryMapper;
    }

    @Override
    public List<SalaryData> fetchSalaryList() {
        return salaryMapper.salaryListToSalaryDataList(salaryRepository.findAll());
    }

    @Override
    public SalaryData saveSalary(SalaryCreateRequest salaryCreateRequest) {
        return null;
    }
}
