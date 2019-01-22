package br.com.iftm.dao;

import java.util.List;

import br.com.iftm.entity.TipoServico;

public interface TipoServicoDAO {
	
	/**
	 * Metodo responsável por persistir o objeto {@link TipoServico} tipo de servico na base de dados
	 * 
	 * @param tipoServico Objeto a ser persistido
	 * @return Objeto persistido
	 */	
	TipoServico create (TipoServico tipoServico);
	
	/**
	 * Metodo responsavel por recuperar da base de dados os objetos {@link TipoServico}	
	 * 
	 * @return lista de {@link TipoServico}
	 */
	List<TipoServico> read();
	
	/**
	 * Metodo responsavel por recuperar da base de dados os objetos {@link TipoServico},
	 * cujo seu nome possua parte do parametro
	 * 
	 * @param nome Parte do nome a ser buscado
	 * @return Lista de {@link TipoServico}
	 */
	List<TipoServico> readByName(String nome);
	
	/**
	 * Metodo responsavel por persistir (atualizar) os dados na base o objeto desejado {@link TipoServico}
	 * 
	 * @param tipoServico Objeto a ser persistido
	 * @return Objeto persistido
	 */
	TipoServico update(TipoServico tipoServico);
	
	/**
	 * Metodo responsável por deletar da base de dados o objeto {@link TipoServico}, cujo código seja igual
	 * 
	 * @param id Código a ser buscado e deletado
	 */
	void delete(Integer id);

}
