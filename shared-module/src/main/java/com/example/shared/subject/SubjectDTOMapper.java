package com.example.shared.subject;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SubjectDTOMapper {

    public SubjectDTO entityToDto(SubjectEntity theSubject) {

        SubjectDTO subjectDTO = new SubjectDTO();
        subjectDTO.setSubjectId(theSubject.getSubjectId());
        subjectDTO.setSubjectCode(theSubject.getSubjectCode());
        subjectDTO.setSubjectName(theSubject.getSubjectName());
        subjectDTO.setDegree(theSubject.getDegree());
        subjectDTO.setDepartment(theSubject.getDepartment());

        return subjectDTO;
    }

    public List<SubjectDTO> entityToDto(List<SubjectEntity> theSubject) {
        return theSubject.stream().map(s -> entityToDto(s))
                .collect(Collectors.toList());
    }

    public SubjectEntity dtoToEntity(SubjectDTO theSubjectDTO) {

        SubjectEntity subject = new SubjectEntity();
        subject.setSubjectId(theSubjectDTO.getSubjectId());
        subject.setSubjectCode(theSubjectDTO.getSubjectCode());
        subject.setSubjectName(theSubjectDTO.getSubjectName());
        subject.setDegree(theSubjectDTO.getDegree());
        subject.setDepartment(theSubjectDTO.getDepartment());

        return subject;
    }

    public List<SubjectEntity> dtoToEntity(List<SubjectDTO> theSubjectDTO) {
        return theSubjectDTO.stream().map(s -> dtoToEntity(s)).collect(Collectors.toList());
    }
}
