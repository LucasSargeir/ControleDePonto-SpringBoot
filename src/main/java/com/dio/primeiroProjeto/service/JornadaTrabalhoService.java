package com.dio.primeiroProjeto.service;

import com.dio.primeiroProjeto.model.JornadaTrabalho;
import com.dio.primeiroProjeto.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {

	final JornadaTrabalhoRepository jornadaRepository;

	@Autowired
	public JornadaTrabalhoService(JornadaTrabalhoRepository jornadaRepository){
		this.jornadaRepository = jornadaRepository;
	}

	public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho){
		return jornadaRepository.save(jornadaTrabalho);
	}

	public List<JornadaTrabalho> findAll() {
		return jornadaRepository.findAll();
	}

	public Optional<JornadaTrabalho> getById(Long idJornada){
		return jornadaRepository.findById(idJornada);
	}

	public JornadaTrabalho update(JornadaTrabalho jornada){
		return jornadaRepository.save(jornada);
	}

	public void delete(Long idJornada){
		jornadaRepository.deleteById(idJornada);
	}
}
