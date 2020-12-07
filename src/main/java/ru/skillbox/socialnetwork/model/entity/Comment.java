package ru.skillbox.socialnetwork.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "post_comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private long id;

    @Column(name = "time_comment", columnDefinition = "TIMESTAMP")
    private LocalDateTime time;

    @Column(name = "post_id")
    private int postId;

    @Column(name = "parent_id")
    private long parentId;

    @Column(name = "author_id")
    private int authorId;

    @Column(name = "comment_text", columnDefinition = "VARCHAR(255)")
    private String commentText;

    @Column(name = "is_blocked")
    private int isBlocked;

    @Column(name = "is_deleted")
    private int isDeleted;

//    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
//            CascadeType.DETACH, CascadeType.REFRESH})
//    @JoinColumn(name = "author_id")
//    private Person person;

//    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
//            CascadeType.DETACH, CascadeType.REFRESH})
//    @JoinColumn(name = "post_id")
//    private Post post;

    public Comment() {
    }
//
//    public Person getPerson() {
//        return person;
//    }

//    public void setPerson(Person person) {
//        this.person = person;
//    }

//    public Post getPost() {
//        return post;
//    }
//
//    public void setPost(Post post) {
//        this.post = post;
//    }

}
