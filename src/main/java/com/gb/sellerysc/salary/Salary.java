package com.gb.sellerysc.salary;

import com.gb.sellerysc.date.ProcessingDate;
import com.gb.sellerysc.shared.utils.CurrencyEnum;
import com.gb.sellerysc.shared.utils.FrequencyEnum;
import com.gb.sellerysc.user.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long amount;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CurrencyEnum currency;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FrequencyEnum frequency;

    @ManyToOne
    @JoinColumn(name = "processing_date_id", nullable = false)
    private ProcessingDate processingDate;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Customer user;
}
