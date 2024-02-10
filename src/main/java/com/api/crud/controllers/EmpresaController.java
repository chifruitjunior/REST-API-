package com.api.crud.controllers;

import com.api.crud.models.EmpresaModel;
import com.api.crud.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {


    @Autowired
    private EmpresaService empresaService;

    @GetMapping
    public ArrayList<EmpresaModel> getEmpresas() {
        return this.empresaService.getEmpresas();
    }

    @PostMapping
    public EmpresaModel saveUser(@RequestBody EmpresaModel empresa) {
        return this.empresaService.saveEmpresa(empresa);
    }

    @PutMapping(path = "/{id}")
    public EmpresaModel updateEmpresaById(@RequestBody EmpresaModel request, @PathVariable("id") Long id) {
        return this.empresaService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        boolean todoBien = this.empresaService.deleteEmpresa(id);
        if ( todoBien ) {
            return "Empresa con el id: " + id + " fue eliminada correctamente";
        } else {
            return "Oh no! Algo ha ido mal al intentar eliminar la empresa con el id: " + id;
        }
    }

}
