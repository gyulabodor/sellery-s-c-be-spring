package com.gb.sellerysc.user;

import com.gb.sellerysc.expense.Expense;
import com.gb.sellerysc.expense.ExpenseToPay;
import com.gb.sellerysc.salary.Salary;
import com.gb.sellerysc.shared.utils.SectionTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Expense> expenseList;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Salary> salaryList;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ExpenseToPay> expenseToPayList;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SectionTypeEnum mainSection;
}
