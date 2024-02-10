package com.api.crud.services;

import com.api.crud.models.EmpresaModel;
import com.api.crud.repositories.IEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmpresaService {

    @Autowired
    IEmpresaRepository empresaRepository;

    public ArrayList<EmpresaModel> getEmpresas() {
        return (ArrayList<EmpresaModel>) empresaRepository.findAll();
    }

    public EmpresaModel saveEmpresa(EmpresaModel empresa) {
        return empresaRepository.save(empresa);
    }

    public EmpresaModel updateById(EmpresaModel request, Long id) {
        EmpresaModel empresa = empresaRepository.findById(id).get();

        empresa.setNombre(request.getNombre());
        empresa.setNit(request.getNit());
        empresa.setFechaFundacion(request.getFechaFundacion());
        empresa.setDireccion(request.getDireccion());
        empresaRepository.save(empresa);

        return empresa;
    }

    public Boolean deleteEmpresa(Long id) {
        try {
            empresaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
