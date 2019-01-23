package br.com.iftm.dao;

import java.util.List;

import br.com.iftm.business.BusinessException;
import br.com.iftm.entity.Cidade;
import br.com.iftm.entity.PrestadorDeServico;
import br.com.iftm.entity.Telefone;

public interface PrestadorServicoDAO {

	/**
	 * Metodo responsável por garantir os parametros obrigatórios, bom como
	 * solicitar a camada de acesso a dados que persista o objeto {@link Cidade}
	 * 
	 * @param Cidade Objeto a ser persistido
	 * @return Objeto persistido
	 * @throws BusinessException
	 */
	PrestadorDeServico create(PrestadorDeServico prestador) throws BusinessException;

	/**
	 * Metodo responsavel por garantir os parametros dos objetos {@link Cidade} para
	 * retorná-los
	 * 
	 * @return lista de {@link Cidade}
	 * @throws BusinessException
	 */
	List<PrestadorDeServico> read() throws BusinessException;

	/**
	 * Metodo responsavel por garantir os parametros obrigatórios para que se possa
	 * recuperar da base de dados os objetos {@link Cidade}, cujo seu nome possua
	 * parte do parametro
	 * 
	 * @param nome Parte do nome a ser buscado
	 * @return Lista de {@link Cidade}
	 * @throws BusinessException
	 */
	List<PrestadorDeServico> readByName(String nome) throws BusinessException;

	/**
	 * Metodo responsavel por garantir os parametros obrigatórios para que se possa
	 * recuperar da base de dados os objetos {@link Cidade} usando o estado como
	 * parametro
	 * 
	 * @param nome Parte do nome a ser buscado
	 * @return Lista de {@link Cidade}
	 * @throws BusinessException
	 */
	List<PrestadorDeServico> readByTelefone(Telefone telefone) throws BusinessException;

	/**
	 * Metodo responsavel garantir os parametros obrigatórios para que se possa
	 * persistir (atualizar) os dados na base o objeto desejado {@link Cidade}
	 * 
	 * @param Cidade Objeto a ser persistido
	 * @return Objeto persistido
	 * @throws BusinessException
	 */
	PrestadorDeServico update(PrestadorDeServico prestador) throws BusinessException;

	/**
	 * Metodo responsável por garantir os parametros obrigatórios para que se possa
	 * deletar da base de dados o objeto {@link Cidade}, cujo código seja igual ao
	 * parametro de entrada
	 * 
	 * @param id Código a ser buscado e deletado
	 * @throws BusinessException
	 */
	void delete(Integer id) throws BusinessException;
}
