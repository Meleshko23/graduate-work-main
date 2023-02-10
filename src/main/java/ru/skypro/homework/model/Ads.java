package ru.skypro.homework.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@Table(name = "ads")
public class Ads {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "price")
    private Integer price;

    @Column(name = "title")
    private String title;

    //в таблице сделать связь с user_id
    private Integer author;

//    @Column(name = "description")
//    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "ads")
    private Collection<Image> images;

    @OneToMany(mappedBy = "ads")
    private Collection<Comment> comments;


}