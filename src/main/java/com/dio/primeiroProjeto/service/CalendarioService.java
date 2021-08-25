package com.dio.primeiroProjeto.service;

import com.dio.primeiroProjeto.model.Calendario;
import com.dio.primeiroProjeto.repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarioService {

	final CalendarioRepository calendarioRepository;

	@Autowired
	public CalendarioService(CalendarioRepository calendarioRepository) {
		this.calendarioRepository = calendarioRepository;
	}

	public Calendario save(Calendario calendario){
		return calendarioRepository.save(calendario);
	}

	public List<Calendario> findAll() {
		return calendarioRepository.findAll();
	}

	public Optional<Calendario> getById(Long idCalendario){
		return calendarioRepository.findById(idCalendario);
	}

	public Calendario update(Calendario calendario){
		return calendarioRepository.save(calendario);
	}

	public void delete(Long idCalendario){
		calendarioRepository.deleteById(idCalendario);
	}
}
