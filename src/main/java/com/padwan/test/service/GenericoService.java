package com.padwan.test.service;

import com.padwan.test.dto.GenericoDTO;
import com.padwan.test.dto.ProcessDTO;
import com.padwan.test.entity.ProcessDTOEntity;
import com.padwan.test.repository.ProcessDTORepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenericoService {
	
	 @Autowired
	 ProcessDTORepository processDTORepository;


    public ProcessDTO process(GenericoDTO generico){
        ProcessDTO processDTO = new ProcessDTO();
        processDTO.setClasseAbreviado(generico.getClasse().split(" ")[0]);
        processDTO.setPlanetAbreviado(generico.getPlanet().split(" ")[0]);
        Integer divisor = generico.getRanking() * 2;
        processDTO.setRankingMultiplicado(generico.getRanking()*124*612/divisor);
        processDTO.setNome(generico.getNome());
        processDTO.setStatus(generico.getStatus());
        processDTO.setMentorNome(generico.getMentorNome());
        processDTO.setMidichlorians(generico.getMidichlorians());
        
        
        ProcessDTOEntity entity = new ProcessDTOEntity();
        
        entity.setPlanetAbreviado(processDTO.getClasseAbreviado());
        entity.setRankingMultiplicado(processDTO.getRankingMultiplicado());
        entity.setClasseAbreviado(processDTO.getClasseAbreviado());
        entity.setPlanetAbreviado(processDTO.getPlanetAbreviado());
        entity.setNome(processDTO.getNome());
        entity.setStatus(processDTO.getStatus().toString());
        entity.setMentorNome(processDTO.getMentorNome());
        entity.setMidichlorians(processDTO.getMidichlorians());
        
        processDTORepository.save(entity);
        
        return processDTO;
    }

}
