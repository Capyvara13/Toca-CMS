package com.atdo.toca_cms.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "media")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Media {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_media")
    private long id;
}
