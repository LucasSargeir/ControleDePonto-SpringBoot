package com.dio.primeiroProjeto.service;

import com.dio.primeiroProjeto.model.TipoData;
import com.dio.primeiroProjeto.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {

	final TipoDataRepository tipoDataRepository;

	@Autowired
	public TipoDataService(TipoDataRepository tipoDataRepository){
		this.tipoDataRepository = tipoDataRepository;
	}

	public TipoData save(TipoData tipoData){
		return tipoDataRepository.save(tipoData);
	}

	public List<TipoData> findAll() {
		return tipoDataRepository.findAll();
	}

	public Optional<TipoData> getById(Long idTipoData){
		return tipoDataRepository.findById(idTipoData);
	}

	public TipoData update(TipoData tipoData){
		return tipoDataRepository.save(tipoData);
	}

	public void delete(Long idTipoData){
		tipoDataRepository.deleteById(idTipoData);
	}
}
