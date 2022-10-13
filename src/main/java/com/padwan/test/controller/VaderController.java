package com.padwan.test.controller;

import com.padwan.test.dto.GenericoDTO;
import com.padwan.test.service.RenatoService;
import com.padwan.test.service.VaderService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URL;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping({"/vader", "/Renato"})
public class VaderController {

    private VaderService vaderService;
    
    private RenatoService renatoService;

    @Autowired
    public VaderController(VaderService vaderService, RenatoService renatoService){
        this.vaderService = vaderService;
        this.renatoService = renatoService;
    }

    @ResponseBody
    @RequestMapping(value = "/skills", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> skills(HttpServletRequest request) {
        try {
        	JSONObject json = new JSONObject();
        	URL url = new URL(request.getRequestURL().toString());
        	String path = url.getPath();
        	
        	 if (path.contentEquals("/vader/skills")) {
        		 json.put("Darth Vader", vaderService.skills());
        	    } 
        	 if (path.contentEquals("/Renato/skills")) {
        		 json.put("Renato Marcelo", renatoService.skills());
        	    }
            
            return new ResponseEntity(json.toString(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
