package com.jiaweippmtool.demo.services;

import com.jiaweippmtool.demo.domain.Project;
import com.jiaweippmtool.demo.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){
        return projectRepository.save(project);
    }
}
