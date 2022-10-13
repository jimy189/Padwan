package com.padwan.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.padwan.test.idenum.StatusEnum;




@Entity
@Table(name = "processdto")

public class ProcessDTOEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chave_id")
	Long chaveVariavel;

    @Column(name = "planetabreviado")
    String planetAbreviado;
    
    @Column(name = "rankingmultiplicado")
    Integer rankingMultiplicado;
    
    @Column(name = "classeabreviado")
    String classeAbreviado;
    
    @Column(name = "nome")
    String nome;
    
    @Column(name = "status")
    String status;
    
    @Column(name = "mentornome")
    String mentorNome;
    
    @Column(name = "midichlorians")
    Long midichlorians;

	public Long getChaveVariavel() {
		return chaveVariavel;
	}

	public void setChaveVariavel(Long chaveVariavel) {
		this.chaveVariavel = chaveVariavel;
	}

	public String getPlanetAbreviado() {
		return planetAbreviado;
	}

	public void setPlanetAbreviado(String planetAbreviado) {
		this.planetAbreviado = planetAbreviado;
	}

	public Integer getRankingMultiplicado() {
		return rankingMultiplicado;
	}

	public void setRankingMultiplicado(Integer rankingMultiplicado) {
		this.rankingMultiplicado = rankingMultiplicado;
	}

	public String getClasseAbreviado() {
		return classeAbreviado;
	}

	public void setClasseAbreviado(String classeAbreviado) {
		this.classeAbreviado = classeAbreviado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMentorNome() {
		return mentorNome;
	}

	public void setMentorNome(String mentorNome) {
		this.mentorNome = mentorNome;
	}

	public Long getMidichlorians() {
		return midichlorians;
	}

	public void setMidichlorians(Long midichlorians) {
		this.midichlorians = midichlorians;
	}
    
    
    
    
    
}
