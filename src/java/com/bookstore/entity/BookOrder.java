package com.bookstore.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "book_order")
public class BookOrder {

    private Integer orderId;
    private Customer bookCustomerId;
    private Timestamp orderDate;
    private String shippingAddress;
    private String recipientName;
    private String recipientPhone;
    private String paymentMethod;
    private double total;
    private String status;

    @Column(name = "order_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    public Customer getBookCustomerId() {
        return bookCustomerId;
    }

    public void setBookCustomerId(Customer bookCustomerId) {
        this.bookCustomerId = bookCustomerId;
    }

    @Column(name = "order_date")
    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    @Column(name = "shipping_address")
    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Column(name = "recipient_name")
    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    @Column(name = "recipient_phone")
    public String getRecipientPhone() {
        return recipientPhone;
    }

    public void setRecipientPhone(String recipientPhone) {
        this.recipientPhone = recipientPhone;
    }

    @Column(name = "payment_method")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
