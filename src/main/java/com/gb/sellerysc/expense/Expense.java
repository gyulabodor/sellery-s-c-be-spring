package com.gb.sellerysc.expense;

import com.gb.sellerysc.shared.utils.CurrencyEnum;
import com.gb.sellerysc.shared.utils.FrequencyEnum;
import com.gb.sellerysc.user.Customer;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;

    private Long amount;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CurrencyEnum currency;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FrequencyEnum frequency;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ExpenseToPay> expenseToPayList;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Customer user;
}
