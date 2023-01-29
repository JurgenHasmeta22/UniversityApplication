package com.University.universityApp.dto;

import lombok.*;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseGetDto {

    private int courseId;
    private String emriKursit;
    private String pershkrimi;
    private String dataKrijimit;
    private Date dataNisjes;
    private Date dataPerfundimit;
    private int semestri;



}