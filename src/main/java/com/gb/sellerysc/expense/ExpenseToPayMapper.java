package com.gb.sellerysc.expense;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ExpenseToPayMapper {
    ExpenseToPayMapper MAPPER = Mappers.getMapper(ExpenseToPayMapper.class);

    ExpenseToPay expenseToPayToExpenseToPayData(ExpenseToPayData expenseToPayData);
    List<ExpenseToPayData> expenseToPayListToExpenseToPayDataList(List<ExpenseToPay> expenseToPayList);
    List<ExpenseToPayData> expenseToPayDataListToExpenseToPayList(List<ExpenseToPay> expenseToPayList);

}
