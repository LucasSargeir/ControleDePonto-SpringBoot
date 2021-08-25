package com.dio.primeiroProjeto.service;

import com.dio.primeiroProjeto.model.Movimentacao;
import com.dio.primeiroProjeto.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {

	final MovimentacaoRepository movimentacaoRepository;

	@Autowired
	public MovimentacaoService(MovimentacaoRepository movimentacaoRepository) {
		this.movimentacaoRepository = movimentacaoRepository;
	}

	public Movimentacao save(Movimentacao movimentacao){
		return movimentacaoRepository.save(movimentacao);
	}

	public List<Movimentacao> findAll() {
		return movimentacaoRepository.findAll();
	}

	public Optional<Movimentacao> getById(Long idMovimentacao){
		return movimentacaoRepository.findById(idMovimentacao);
	}

	public Movimentacao update(Movimentacao movimentacao){
		return movimentacaoRepository.save(movimentacao);
	}

	public void delete(Movimentacao movimentacao){
		movimentacaoRepository.delete(movimentacao);
	}
}
