package com.bookstore.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Book {

    private Integer bookId;
    private String title;
    private String author;
    private String description;
    private String isbn;
    private byte[] image;
    private float price;
    private Date publishDate;
    private Timestamp lastUpdateTime;
    private Category bookCategoryId;

    @Column(name = "book_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Column(name = "publish_date")
    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Column(name = "last_update_time")
    public Timestamp getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Timestamp lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }


    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")

    public Category getBookCategoryId() {
        return bookCategoryId;
    }

    public void setBookCategoryId(Category bookCategoryId) {
        this.bookCategoryId = bookCategoryId;
    }
}
