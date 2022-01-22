package com.movixx.backend.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Getter
@Setter
@Table(name = "film_category", schema = "moviix")
@Entity
public class FilmCategory {

    @Id
    @Column(name = "film_category_id")
    private UUID id;


}
