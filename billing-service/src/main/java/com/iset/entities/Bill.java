package com.iset.entities;

import java.util.Collection;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;

@Entity
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date billingDate;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long customerID;

    @Transient
    private Customer customer;

    @OneToMany(mappedBy = "bill")
    private Collection<ProductItem> productItems;

    public Bill() {}
    public Bill(Long id, Date billingDate, Long customerID,
                Customer customer, Collection<ProductItem> productItems) {
        this.id = id; this.billingDate = billingDate; this.customerID = customerID;
        this.customer = customer; this.productItems = productItems;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Date getBillingDate() { return billingDate; }
    public void setBillingDate(Date billingDate) { this.billingDate = billingDate; }
    public Long getCustomerID() { return customerID; }
    public void setCustomerID(Long customerID) { this.customerID = customerID; }
    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }
    public Collection<ProductItem> getProductItems() { return productItems; }
    public void setProductItems(Collection<ProductItem> productItems) { this.productItems = productItems; }
}