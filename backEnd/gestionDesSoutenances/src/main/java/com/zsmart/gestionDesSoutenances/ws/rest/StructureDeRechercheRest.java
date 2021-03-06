package com.zsmart.gestionDesSoutenances.ws.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zsmart.gestionDesSoutenances.bean.StructureDeRecherche;
import com.zsmart.gestionDesSoutenances.service.facade.StructureDeRechercheService;

import io.swagger.annotations.Api;
@Api
@RestController
//@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("api/v1/gestionDesSoutenances-api/structureDeRecherche")
public class StructureDeRechercheRest {

	@Autowired
       StructureDeRechercheService structureDeRechercheService;

        @GetMapping("/")
    public List<StructureDeRecherche> findAll() {
        return structureDeRechercheService.findAll();
    }
        @GetMapping("/etablissement/reference/{reference}")
    public List<StructureDeRecherche> findByEtablissementReference(@PathVariable String reference) {
        return structureDeRechercheService.findByEtablissementReference(reference);
    }
        @DeleteMapping("/etablissement/nom/{nom}")
    public int deleteByEtablissementNom(@PathVariable String nom) {
        return structureDeRechercheService.deleteByEtablissementNom(nom);
    }
      @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return structureDeRechercheService.deleteByReference(reference);
    }
    
        @PostMapping("/")
    public int save(@RequestBody StructureDeRecherche structureDeRecherche) {
        return structureDeRechercheService.save(structureDeRecherche);
    }
    
        


}
