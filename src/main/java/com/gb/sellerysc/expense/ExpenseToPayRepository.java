package com.gb.sellerysc.expense;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseToPayRepository extends JpaRepository<ExpenseToPay, Long> {

}
