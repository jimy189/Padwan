package com.padwan.test.dto;

import com.padwan.test.idenum.StatusEnum;

public class ProcessDTO {

    private String planetAbreviado;
    private Integer rankingMultiplicado;
    private String classeAbreviado;
    private String nome;
    private StatusEnum status;
    private String mentorNome;
    private Long midichlorians;
    
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

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
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
