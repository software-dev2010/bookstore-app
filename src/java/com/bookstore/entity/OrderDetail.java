package com.bookstore.entity;

import javax.persistence.*;

@Entity
@Table(name = "order_detail")
public class OrderDetail {

    private Integer orderdetailId;
    private BookOrder detailOrderId;
    private Book orderDetailBookId;
    private Integer quantity;
    private float subtotal;

    @Column(name = "order_detail_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getOrderdetailId() {
        return orderdetailId;
    }

    public void setOrderdetailId(Integer orderdetailId) {
        this.orderdetailId = orderdetailId;
    }

    public BookOrder getDetailOrderId() {
        return detailOrderId;
    }

    public void setDetailOrderId(BookOrder detailOrderId) {
        this.detailOrderId = detailOrderId;
    }

    public Book getOrderDetailBookId() {
        return orderDetailBookId;
    }

    public void setOrderDetailBookId(Book orderDetailBookId) {
        this.orderDetailBookId = orderDetailBookId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
}
