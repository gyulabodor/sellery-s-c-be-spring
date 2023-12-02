package com.gb.sellerysc.expense;

import com.gb.sellerysc.date.ProcessingDate;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ExpenseToPay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "expense_id", nullable = false)
    private Expense expense;
    @ManyToOne
    private ProcessingDate processingDate;
    private Integer numberOfPayment;
    private Boolean payed;
}
