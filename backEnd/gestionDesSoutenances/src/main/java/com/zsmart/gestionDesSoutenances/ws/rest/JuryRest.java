package com.zsmart.gestionDesSoutenances.ws.rest;

import com.zsmart.gestionDesSoutenances.bean.Jury;
import com.zsmart.gestionDesSoutenances.service.facade.JuryService;

import io.swagger.annotations.Api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
//@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("api/v1/gestionDesSoutenances-api/jury")
public class JuryRest {

    @Autowired
    JuryService juryService;

    @GetMapping("/")
    public List<Jury> findAll() {
        return juryService.findAll();
    }

    @DeleteMapping("/cin/{cin}")
    public int deleteByCin(@PathVariable String cin) {
        return juryService.deleteByCin(cin);
    }

    @GetMapping("/cin/{cin}")
    public Jury findByCin(@PathVariable String cin) {
        return juryService.findByCin(cin);
    }

    @PostMapping("/")
    public int save(@RequestBody Jury jury) {
        return juryService.save(jury);
    }

}
