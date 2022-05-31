package com.example.backend.repository;


import com.example.backend.model.Cykelhold;
import com.example.backend.model.Cykelrytter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Christopher
 */
public interface CykelrytterRepository extends JpaRepository<Cykelrytter, Integer> {

    List<Cykelrytter>getCykelrytterByCykelhold(Cykelhold cykelhold);

    List<Cykelrytter>getAllBySamlettidNotNullOrderBySamlettid();

}

