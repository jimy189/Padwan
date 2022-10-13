package com.padwan.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.padwan.test.entity.ProcessDTOEntity;
import com.padwan.test.repository.ProcessDTORepository;
import com.padwan.test.repository.ProcessDTOResponse;
import org.springframework.stereotype.Service;

@Service
public class ListasService {
	 @Autowired
	 ProcessDTORepository processDTORepository;
	 
	public List<ProcessDTOResponse> listaMestrejediAndAluno(String nomeMentor){
        List<ProcessDTOResponse> listaMetrejedi = new ArrayList<>();
        
        List<ProcessDTOEntity> entity = processDTORepository.findByMentorAndAluno(nomeMentor, "mestre_jedi");
    
        if(entity != null) {
        listaMetrejedi = popularListas(entity);
        }
        
        return listaMetrejedi;
    }
	
	public List<ProcessDTOResponse> listarMidichlorians(){
        List<ProcessDTOResponse> listarMidichlorians = new ArrayList<>();
        
        List<ProcessDTOEntity> entity = processDTORepository.findByMidichlorians();
    
        if(entity != null) {
        	listarMidichlorians = popularListas(entity);
    	
        }
        return listarMidichlorians;
    }
	
	public Integer listaPorCategoriaJedi(String status){
              
        Integer qtd = processDTORepository.getCountByCategoria(status);
      
        return qtd;
    }
	
	public List<ProcessDTOResponse> popularListas(List<ProcessDTOEntity> entity){
        List<ProcessDTOResponse> listaStarWAR = new ArrayList<>();
        
       
    	for (ProcessDTOEntity processDTOEntity : entity) {
    		ProcessDTOResponse dto = new ProcessDTOResponse();
    		dto.setClasseAbreviado(processDTOEntity.getClasseAbreviado());
    		dto.setMentorNome(processDTOEntity.getMentorNome());
    		dto.setMidichlorians(processDTOEntity.getMidichlorians());
    		dto.setNome(processDTOEntity.getNome());
    		dto.setPlanetAbreviado(processDTOEntity.getPlanetAbreviado());
    		dto.setStatus(processDTOEntity.getStatus());
    		dto.setRankingMultiplicado(processDTOEntity.getRankingMultiplicado());
    		
    		listaStarWAR.add(dto);
    		
		}
        
        return listaStarWAR;
    }
}
