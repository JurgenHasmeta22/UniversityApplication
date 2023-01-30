package com.University.universityApp.controllers;

import com.University.universityApp.dal.Announcement;
//import common.server.identity.dto.PasswordChangeDto;
import com.University.universityApp.dal.Course;
import com.University.universityApp.services.AnnouncementService;
//import common.server.identity.dto.UserPatchDto;
//import common.server.identity.dto.UserPostDto;
  import com.University.universityApp.services.CourseService;

import java.util.List;


//import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/announcements")
public class AnnouncementController {

    public final AnnouncementService announcementService;

    public AnnouncementController(AnnouncementService announcementService)
    {
        this.announcementService = announcementService;
    }

   /*  @GetMapping("{id}")
    public List<Announcement> getAnnouncementsByCourseId(@PathVariable int id) {
        return announcementService.getAnnouncementsByCourseId(id);
    }
*/
}
