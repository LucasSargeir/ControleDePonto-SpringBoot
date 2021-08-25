package com.dio.primeiroProjeto.service;

import com.dio.primeiroProjeto.model.Empresa;
import com.dio.primeiroProjeto.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

	final EmpresaRepository empresaRepository;

	@Autowired
	public EmpresaService(EmpresaRepository empresaRepository) {
		this.empresaRepository = empresaRepository;
	}

	public Empresa save(Empresa empresa){
		return empresaRepository.save(empresa);
	}

	public List<Empresa> findAll() {
		return empresaRepository.findAll();
	}

	public Optional<Empresa> getById(Long idEmpresa){
		return empresaRepository.findById(idEmpresa);
	}

	public Empresa update(Empresa empresa){
		return empresaRepository.save(empresa);
	}

	public void delete(Long idEmpresa){
		empresaRepository.deleteById(idEmpresa);
	}
}
