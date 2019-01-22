package br.com.iftm.business;

import java.util.List;

import br.com.iftm.entity.TipoServico;

public interface TipoServicoBusiness {

	/**
	 * Metodo responsável por garantir os parametros obrigatórios, bom como
	 * solicitar a camada de acesso a dados que persista o objeto
	 * {@link TipoServico}
	 * 
	 * @param tipoServico Objeto a ser persistido
	 * @return Objeto persistido
	 * @throws BusinessException
	 */
	TipoServico create(TipoServico tipoServico) throws BusinessException;

	/**
	 * Metodo responsavel por garantir os parametros dos objetos {@link TipoServico}
	 * para retorná-los
	 * 
	 * @return lista de {@link TipoServico}
	 * @throws BusinessException
	 */
	List<TipoServico> read() throws BusinessException;

	/**
	 * Metodo responsavel por garantir os parametros obrigatórios para que se possa
	 * recuperar da base de dados os objetos {@link TipoServico}, cujo seu nome
	 * possua parte do parametro
	 * 
	 * @param nome Parte do nome a ser buscado
	 * @return Lista de {@link TipoServico}
	 * @throws BusinessException
	 */
	List<TipoServico> readByName(String nome) throws BusinessException;

	/**
	 * Metodo responsavel garantir os parametros obrigatórios para que se possa
	 * persistir (atualizar) os dados na base o objeto desejado {@link TipoServico}
	 * 
	 * @param tipoServico Objeto a ser persistido
	 * @return Objeto persistido
	 * @throws BusinessException
	 */
	TipoServico update(TipoServico tipoServico) throws BusinessException;

	/**
	 * Metodo responsável por garantir os parametros obrigatórios para que se possa
	 * deletar da base de dados o objeto {@link TipoServico}, cujo código seja igual
	 * ao parametro de entrada
	 * 
	 * @param id Código a ser buscado e deletado
	 * @throws BusinessException
	 */
	void delete(Integer id) throws BusinessException;
}
