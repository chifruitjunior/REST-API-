package com.api.crud.repositories;

import com.api.crud.models.EmpresaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpresaRepository extends JpaRepository<EmpresaModel, Long> {
}
