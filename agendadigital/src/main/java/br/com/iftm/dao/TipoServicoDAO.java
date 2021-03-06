package br.com.iftm.dao;

import java.util.List;

import br.com.iftm.business.BusinessException;
import br.com.iftm.entity.TipoServico;

public interface TipoServicoDAO {

	/**
	 * Metodo responsavel por persistir o objeto {@link TipoServico} na base de
	 * dados.
	 * 
	 * @param tipoServico Objeto a ser persistido.
	 * @return Objeto persistido.
	 * @throws BusinessException
	 */
	TipoServico create(TipoServico tipoServico) throws BusinessException;

	/**
	 * Metodo responsavel por recuperar da base de datos todos os objetos
	 * {@link TipoServico}.
	 * 
	 * @return Lista de {@link TipoServico}.
	 * @throws BusinessException
	 */
	List<TipoServico> read() throws BusinessException;

	/**
	 * Metodo responsavel por recuperar da base de datos todos os objetos
	 * {@link TipoServico}, cujo nome possua parte do parametro Nome.
	 * 
	 * @param nome Parte do nome a ser buscado.
	 * @return Lista de {@link TipoServico}.
	 * @throws BusinessException
	 */
	List<TipoServico> readByName(String nome) throws BusinessException;

	/**
	 * Metodo responsavel por persistir (atualizar) na base de dados o objeto
	 * {@link TipoServico}.
	 * 
	 * @param tipoServico objeto a ser persistido.
	 * @return
	 * @throws BusinessException
	 */
	TipoServico update(TipoServico tipoServico) throws BusinessException;

	/**
	 * Metodo responsavel por excluir da base de dados o objeto {@link TipoServico}
	 * referente ao id informado.
	 * 
	 * @param id identificador do objeto {@link TipoServico} a ser excluido.
	 * @throws BusinessException
	 */
	void delete(Integer id) throws BusinessException;
}
