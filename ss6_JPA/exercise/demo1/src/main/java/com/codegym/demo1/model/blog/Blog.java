package com.codegym.demo1.model.blog;

import com.codegym.demo1.model.category.Category;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String writer;
    private String content;
    private String dateCreate;

    @ManyToOne
    @JoinColumn(name = "type_id" ,referencedColumnName = "id")
    private Category category;

    public Blog() {
    }

    public Blog(int id, String title, String writer, String content, String dateCreate) {
        this.id = id;
        this.title = title;
        this.writer = writer;
        this.content = content;
        this.dateCreate = dateCreate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }
}
