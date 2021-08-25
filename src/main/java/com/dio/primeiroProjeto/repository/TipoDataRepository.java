package com.dio.primeiroProjeto.repository;

import com.dio.primeiroProjeto.model.TipoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDataRepository extends JpaRepository<TipoData, Long>{
}
