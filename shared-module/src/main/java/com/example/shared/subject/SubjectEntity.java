package com.example.shared.subject;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectEntity {

    private Long id;
    private String subjectId;
    private String subjectCode;
    private String subjectName;
    private String degree;
    private String department;
    private Boolean isActive;
}
