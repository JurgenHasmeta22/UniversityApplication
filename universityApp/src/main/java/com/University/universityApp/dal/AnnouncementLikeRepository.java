package com.University.universityApp.dal;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnouncementLikeRepository extends JpaRepository<AnnouncementLike, Integer >{

}