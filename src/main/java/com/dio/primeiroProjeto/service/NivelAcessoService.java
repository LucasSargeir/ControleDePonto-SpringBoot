package com.dio.primeiroProjeto.service;

import com.dio.primeiroProjeto.model.NivelAcesso;
import com.dio.primeiroProjeto.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {

	final NivelAcessoRepository nivelAcessoRepository;

	@Autowired
	public NivelAcessoService(NivelAcessoRepository nivelAcessoRepository) {
		this.nivelAcessoRepository = nivelAcessoRepository;
	}

	public NivelAcesso save(NivelAcesso nivelAcesso){
		return nivelAcessoRepository.save(nivelAcesso);
	}

	public List<NivelAcesso> findAll() {
		return nivelAcessoRepository.findAll();
	}

	public Optional<NivelAcesso> getById(Long idNivelAcesso){
		return nivelAcessoRepository.findById(idNivelAcesso);
	}

	public NivelAcesso update(NivelAcesso nivelAcesso){
		return nivelAcessoRepository.save(nivelAcesso);
	}

	public void delete(Long idNivelAcesso){
		nivelAcessoRepository.deleteById(idNivelAcesso);
	}
}
