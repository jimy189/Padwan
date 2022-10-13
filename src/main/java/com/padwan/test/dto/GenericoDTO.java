package com.padwan.test.dto;

import com.padwan.test.idenum.StatusEnum;

public class GenericoDTO {

    private String planet;
    private Integer ranking;
    private String classe;
    private String nome;
    private StatusEnum status;
    private String mentorNome;
    private Long midichlorians;
    

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
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
