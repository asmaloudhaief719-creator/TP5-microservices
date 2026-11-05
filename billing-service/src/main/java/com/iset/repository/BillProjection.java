package com.iset.repository;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import com.iset.entities.Bill;
import com.iset.entities.ProductItem;

@Projection(name = "fullBill", types = Bill.class)
public interface BillProjection {
    Long getId();
    Date getBillingDate();
    Long getCustomerID();
    Collection<ProductItem> getProductItems();
}