package com.University.universityApp.dal;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "announcementId", nullable = false)
    private Integer id;

    @Size(max = 5000)
    @NotNull
    @Column(name = "pershkrimi", nullable = false, length = 5000)
    private String pershkrimi;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "courseId")
    private Course course;

    @OneToMany(mappedBy = "announcement")
    private Set<Comment> comments = new LinkedHashSet<>();

    @OneToMany(mappedBy = "announcement")
    private Set<AnnouncementLike> announcementLikes = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPershkrimi() {
        return pershkrimi;
    }

    public void setPershkrimi(String pershkrimi) {
        this.pershkrimi = pershkrimi;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<AnnouncementLike> getAnnouncementLikes() {
        return announcementLikes;
    }

    public void setAnnouncementLikes(Set<AnnouncementLike> announcementLikes) {
        this.announcementLikes = announcementLikes;
    }

}