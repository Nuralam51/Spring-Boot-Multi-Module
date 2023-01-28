package com.example.shared.subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectDTOMapper mapper;

    public List<SubjectDTO> getSubjectStr() {

        List<SubjectEntity> subjectList = new ArrayList<>();

        SubjectEntity subject1 = new SubjectEntity(1L, "SUB-1", "CSE-001",
                "Computer Science", "Bachelor", "CSE", true);

        SubjectEntity subject2 = new SubjectEntity(2L, "SUB-2", "CSE-002",
                "Java", "Bachelor", "CSE", true);

        SubjectEntity subject3 = new SubjectEntity(3L, "SUB-3", "CSE-003",
                "Data Science", "Bachelor", "CSE", false);

        SubjectEntity subject4 = new SubjectEntity(4L, "SUB-4", "CSE-004",
                "Data Structure & Algorithm", "Bachelor", "CSE", true);

        subjectList.add(subject1);
        subjectList.add(subject2);
        subjectList.add(subject3);
        subjectList.add(subject4);

        return mapper.entityToDto(subjectList);
    }

}
