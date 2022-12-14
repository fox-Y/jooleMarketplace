package com.example.joole.repository;

import com.example.joole.model.Product;
import com.example.joole.model.Project;
import com.example.joole.model.ProjectProduct;
import com.example.joole.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProjectProductRepository extends JpaRepository<ProjectProduct, Long> {
    List<ProjectProduct> findAllByProduct(Product product);

    List<ProjectProduct> findAllByProject(Project project);
}
