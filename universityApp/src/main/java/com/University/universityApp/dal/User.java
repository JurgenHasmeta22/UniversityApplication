package com.University.universityApp.dal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "UserTbl")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int userId ;

    @Column(nullable = false)
    public String emri;

    @Column(nullable = true)
    public String mbiemri;

    @Column(nullable = true)
    public String username;

    @Column(nullable = false, unique = true)
    public String email;
    @Column(nullable = true)
    public int nrTelefoni;
    @Column(nullable = false)
    public String passwordi;

    @Column(nullable = true)
    public String profilePicture;


    @OneToMany(mappedBy = "userId1",fetch = FetchType.EAGER)
    private Set<Friendship> friendshipsSent = new LinkedHashSet<>();

    @OneToMany(mappedBy = "userId2",fetch = FetchType.EAGER)
    private Set<Friendship> friendshipsReceived = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
    private Set<CommentLike> commentLikes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
    private Set<Notification> notifications = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
    private Set<UserCourse> userCourses = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
    private Set<Comment> comments = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
    private Set<AnnouncementLike> announcementLikes = new LinkedHashSet<>();


}
