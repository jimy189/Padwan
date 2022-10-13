package com.padwan.test.repository;

import com.padwan.test.idenum.StatusEnum;

public class ProcessDTOResponse {
	
	  	private String planetAbreviado;
	    private Integer rankingMultiplicado;
	    private String classeAbreviado;
	    private String nome;
	    private String status;
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
