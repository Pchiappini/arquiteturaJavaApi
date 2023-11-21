package br.edu.infnet.contrucaoVendasApi.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.contrucaoVendasApi.model.domain.Informacao;
import br.edu.infnet.contrucaoVendasApi.model.repository.InformacaoRepository;

@Service
public class InformacaoService {
	
	@Autowired
	private InformacaoRepository informacaoRepository;

	public List<Informacao> obterLista() {
		// TODO Auto-generated method stub
		return (List<Informacao>) informacaoRepository.findAll();
	}

	public Informacao incluir(Informacao informacao) {
		// TODO Auto-generated method stub
		return informacaoRepository.save(informacao);
	}

}
