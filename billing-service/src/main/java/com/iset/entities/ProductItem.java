package com.iset.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;

@Entity
public class ProductItem {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long productID;

    @Transient
    private Product product;

    private double price;
    private int quantity;

    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Bill bill;

    public ProductItem() {}
    public ProductItem(Long id, Long productID, Product product,
                       double price, int quantity, Bill bill) {
        this.id = id; this.productID = productID; this.product = product;
        this.price = price; this.quantity = quantity; this.bill = bill;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getProductID() { return productID; }
    public void setProductID(Long productID) { this.productID = productID; }
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public Bill getBill() { return bill; }
    public void setBill(Bill bill) { this.bill = bill; }
}