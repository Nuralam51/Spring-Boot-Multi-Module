package com.example.student.controller;

import com.example.shared.subject.SubjectDTO;
import com.example.shared.subject.SubjectEntity;
import com.example.shared.subject.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public List<SubjectDTO> getString() {
        List<SubjectDTO> subjectList = subjectService.getSubjectStr();
        return subjectList;
    }

}
