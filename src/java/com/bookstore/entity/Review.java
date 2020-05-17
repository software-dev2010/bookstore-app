package com.bookstore.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Review {

    private Integer reviewId;
    private Book reviewBookId;
    private Customer reviewCustomerId;
    private Integer rating;
    private String headline;
    private String comment;
    private Timestamp reviewTime;

    @Column(name = "review_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "book_id")
    public Book getReviewBookId() {
        return reviewBookId;
    }

    public void setReviewBookId(Book reviewBookId) {
        this.reviewBookId = reviewBookId;
    }

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    public Customer getReviewCustomerId() {
        return reviewCustomerId;
    }

    public void setReviewCustomerId(Customer reviewCustomerId) {
        this.reviewCustomerId = reviewCustomerId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Column(name = "review_time")
    public Timestamp getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Timestamp reviewTime) {
        this.reviewTime = reviewTime;
    }
}
