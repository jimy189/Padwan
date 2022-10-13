package com.padwan.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genericodto")
public class GenericoDTO {
	@Id
    @Column(name = "chave_id")
	Long chaveVariavel;

    @Column(name = "planet")
    String planet;
    
    @Column(name = "ranking")
    Integer ranking;
    
    @Column(name = "classe")
    String classe;
}
