package com.gb.sellerysc.date;

import com.gb.sellerysc.expense.ExpenseToPay;
import com.gb.sellerysc.salary.Salary;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProcessingDate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer year;
    private Integer month;
    private Integer day;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ExpenseToPay> expenseToPayList;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Salary> salaryList;
}
