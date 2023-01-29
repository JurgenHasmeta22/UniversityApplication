package com.University.universityApp.dal;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Friendship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "friendshipId", nullable = false)
    private Integer id;

    @Size(max = 100)
    @NotNull
    @Column(name = "statusi", nullable = false, length = 100)
    private String statusi;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId1")
    private User userId1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId2")
    private User userId2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatusi() {
        return statusi;
    }

    public void setStatusi(String statusi) {
        this.statusi = statusi;
    }

    public User getUserId1() {
        return userId1;
    }

    public void setUserId1(User userId1) {
        this.userId1 = userId1;
    }

    public User getUserId2() {
        return userId2;
    }

    public void setUserId2(User userId2) {
        this.userId2 = userId2;
    }

}