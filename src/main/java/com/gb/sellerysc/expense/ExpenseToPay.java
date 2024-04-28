package com.gb.sellerysc.expense;

import com.gb.sellerysc.date.ProcessingDate;
import com.gb.sellerysc.shared.utils.PaymentTypeEnum;
import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
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

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentTypeEnum paymentType;
}
