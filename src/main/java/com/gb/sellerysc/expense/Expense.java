package com.gb.sellerysc.expense;

import com.gb.sellerysc.shared.utils.CurrencyEnum;
import com.gb.sellerysc.user.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String itemName;
    private Long amount;
    @Enumerated(EnumType.STRING)
    private CurrencyEnum currency;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ExpenseToPay> expenseToPayList;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Customer user;
}
