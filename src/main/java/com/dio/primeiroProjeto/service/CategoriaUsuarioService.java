package com.dio.primeiroProjeto.service;

import com.dio.primeiroProjeto.model.CategoriaUsuario;
import com.dio.primeiroProjeto.repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaUsuarioService {

	final CategoriaUsuarioRepository categoriaUsuarioRepository;

	@Autowired
	public CategoriaUsuarioService(CategoriaUsuarioRepository categoriaUsuarioRepository) {
		this.categoriaUsuarioRepository = categoriaUsuarioRepository;
	}

	public CategoriaUsuario save(CategoriaUsuario categoriaUsuario){
		return categoriaUsuarioRepository.save(categoriaUsuario);
	}
	
	public List<CategoriaUsuario> findAll() {
		return categoriaUsuarioRepository.findAll();
	}

	public Optional<CategoriaUsuario> getById(Long idCategoriaUsuario){
		return categoriaUsuarioRepository.findById(idCategoriaUsuario);
	}

	public CategoriaUsuario update(CategoriaUsuario categoriaUsuario){
		return categoriaUsuarioRepository.save(categoriaUsuario);
	}

	public void delete(Long idCategoriaUsuario){
		categoriaUsuarioRepository.deleteById(idCategoriaUsuario);
	}
}
