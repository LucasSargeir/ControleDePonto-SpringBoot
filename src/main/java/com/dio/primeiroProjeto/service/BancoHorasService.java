package com.dio.primeiroProjeto.service;

import com.dio.primeiroProjeto.model.BancoHoras;
import com.dio.primeiroProjeto.repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {

	final BancoHorasRepository bancoHorasRepository;

	@Autowired
	public BancoHorasService(BancoHorasRepository bancoHorasRepository) {
		this.bancoHorasRepository = bancoHorasRepository;
	}

	public BancoHoras save(BancoHoras bancoHoras){
		return bancoHorasRepository.save(bancoHoras);
	}

	public List<BancoHoras> findAll() {
		return bancoHorasRepository.findAll();
	}

	public Optional<BancoHoras> getById(Long idJornada){
		return bancoHorasRepository.findById(idJornada);
	}

	public BancoHoras update(BancoHoras bancoHoras){
		return bancoHorasRepository.save(bancoHoras);
	}

	public void delete(BancoHoras bancoHoras){
		bancoHorasRepository.delete(bancoHoras);
	}
}
