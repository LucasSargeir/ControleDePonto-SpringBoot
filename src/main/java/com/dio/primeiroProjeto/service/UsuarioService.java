package com.dio.primeiroProjeto.service;

import com.dio.primeiroProjeto.model.Usuario;
import com.dio.primeiroProjeto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

	final UsuarioRepository usuarioRepository;

	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository){
		this.usuarioRepository = usuarioRepository;
	}

	public Usuario save(Usuario usuario){
		return usuarioRepository.save(usuario);
	}
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	public Optional<Usuario> getById(Long idUsuario){
		return usuarioRepository.findById(idUsuario);
	}

	public Usuario update(Usuario usuario){
		return usuarioRepository.save(usuario);
	}

	public void delete(Long idUsuario){
		usuarioRepository.deleteById(idUsuario);
	}
}
