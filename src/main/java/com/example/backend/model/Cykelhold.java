package com.example.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Christopher
 */
@Entity
@Getter
@Setter
public class Cykelhold {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teamId", nullable = false)
    private Integer teamId;
    private String teamnavn;

    @OneToMany
    @JoinColumn(name = "teamId")
    private Set<Cykelrytter> cykelryttere = new HashSet<>();
}
