package com.gb.sellerysc.salary;
import java.util.List;
public interface SalaryService {
    public List<SalaryData> fetchSalaryList();
    public SalaryData saveSalary(SalaryCreateRequest salaryCreateRequest);
}
