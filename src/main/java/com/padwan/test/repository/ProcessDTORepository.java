package com.padwan.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.padwan.test.entity.ProcessDTOEntity;



public interface ProcessDTORepository extends JpaRepository<ProcessDTOEntity, Long>{
	@Query("SELECT s FROM ProcessDTOEntity s WHERE s.nome = ?1 AND s.status= ?2 OR s.mentorNome = ?1")
	List<ProcessDTOEntity> findByMentorAndAluno(String mentorNome, String tipoCategoria);

	@Query("SELECT s FROM ProcessDTOEntity s WHERE s.midichlorians > 9000 ")
	List<ProcessDTOEntity> findByMidichlorians();
	
	@Query("SELECT COUNT(s) FROM ProcessDTOEntity s WHERE s.status= ?1 ")
	Integer getCountByCategoria(String tipoCategoria);
	
	
}
