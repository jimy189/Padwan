package com.padwan.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.padwan.test.entity.ProcessDTOEntity;
import com.padwan.test.repository.ProcessDTORepository;
import com.padwan.test.repository.ProcessDTOResponse;
import com.padwan.test.service.ListasService;

@RestController
@RequestMapping("/listas")
public class ListarController {

	private ListasService listasService;

	@Autowired
	public ListarController(ListasService listasService) {
		this.listasService = listasService;

	}

	@ResponseBody
	@RequestMapping(value = "/mestrejedi", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ProcessDTOResponse>> buscarMetreJedi(
			@RequestParam(value = "nomeMentor") String nomeMentor) {

		List<ProcessDTOResponse> listaMestreJedi = new ArrayList<ProcessDTOResponse>();

		try {

			listaMestreJedi = listasService.listaMestrejediAndAluno(nomeMentor);

		} catch (Exception e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return ResponseEntity.ok(listaMestreJedi);
	}

	@ResponseBody
	@RequestMapping(value = "/midichlorians", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ProcessDTOResponse>> buscarMidichlorians() {

		List<ProcessDTOResponse> listaMidichlorians = new ArrayList<ProcessDTOResponse>();
		try {

			listaMidichlorians = listasService.listarMidichlorians();

		} catch (Exception e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return ResponseEntity.ok(listaMidichlorians);
	}

	@ResponseBody
	@RequestMapping(value = "/categoriajedi", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> buscarPorCategoria(@RequestParam(value = "categoria") String categoria) {

		Integer qtdPorcategoria = 0;

		try {

			qtdPorcategoria = listasService.listaPorCategoriaJedi(categoria);

		} catch (Exception e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return ResponseEntity.ok(qtdPorcategoria);
	}
}
