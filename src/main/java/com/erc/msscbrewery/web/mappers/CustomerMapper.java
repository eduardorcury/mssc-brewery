package com.erc.msscbrewery.web.mappers;

import com.erc.msscbrewery.domain.Customer;
import com.erc.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);

}
