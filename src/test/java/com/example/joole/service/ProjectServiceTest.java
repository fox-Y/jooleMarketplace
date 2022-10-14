package com.example.joole.service;

import com.example.joole.model.Product;
import com.example.joole.model.Project;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ProjectServiceTest {

    @Autowired
    private ProjectService projectService;

    @Test
    void createProject() {
        Project project=new Project();
        project.setProjectId(1L);
        projectService.createProject(project);
        System.out.println(project);
        Assertions.assertNotNull(projectService);
    }

    @Test
    void findProject() {
        System.out.println(projectService.findProject());
        Assertions.assertNotNull(projectService.findProject());
    }

    @Test
    void findProjectById() {
        Project project=new Project();
        project.setProjectId(1L);
        projectService.createProject(project);
        Assertions.assertNotNull(projectService.findProjectById(1L));
    }

    @Test
    void deleteProject() {
        Project project=new Project();
        project.setProjectId(99999L);
        projectService.createProject(project);
        projectService.deleteProject(project.getProjectId());
        Assertions.assertNull(projectService.findProjectById(99999L));
    }
}