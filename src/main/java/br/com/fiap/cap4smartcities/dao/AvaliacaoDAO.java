package br.com.fiap.cap4smartcities.dao;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Avaliacao;
import br.com.fiap.entity.AvaliacaoId;

public class AvaliacaoDAO extends GenericDAO<Avaliacao, AvaliacaoId>{

	public AvaliacaoDAO(EntityManager em) {
		super(em);
	}

}

//Avaliacao seria a classe da Entidade que ficar� sob a responsabilidade da AvaliacaoDAO e que a classe da Chave Prim�ria � do tipo AvaliacaoId (lembrando que essa � a classe que mapeia os atributos que formama chave composta da entidade).