package com.University.universityApp.dal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int courseId ;

    @Column(nullable = false)
    public String emriKursit;

    @Column(nullable = true)
    public String pershkrimi;

    @Column(nullable = true)
    public Date dataKrijimit;

    @Column(nullable = false, unique = true)
    public Date dataNisjes;
    @Column(nullable = true)
    public Date dataPerfundimit;
    @Column(nullable = false)
    public int semestri;


    @OneToMany(mappedBy = "course")
    private Set<Announcement> announcements = new LinkedHashSet<>();

    @OneToMany(mappedBy = "course")
    private Set<UserCourse> userCourses = new LinkedHashSet<>();

    @OneToMany(mappedBy = "course")
    private Set<Comment> comments = new LinkedHashSet<>();

}
