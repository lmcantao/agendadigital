package br.com.iftm.dao;

import java.util.List;

import br.com.iftm.business.BusinessException;
import br.com.iftm.entity.Cidade;
import br.com.iftm.enums.Estado;

public interface CidadeDAO {

	/**
	 * Metodo responsável por persistir o objeto {@link Cidade} tipo de servico na
	 * base de dados
	 * 
	 * @param Cidade Objeto a ser persistido
	 * @return Objeto persistido
	 */
	Cidade create(Cidade cidade);

	/**
	 * Metodo responsavel por recuperar da base de dados os objetos {@link Cidade}
	 * 
	 * @return lista de {@link Cidade}
	 */
	List<Cidade> read();

	/**
	 * Metodo responsavel por recuperar da base de dados os objetos {@link Cidade},
	 * cujo seu nome possua parte do parametro
	 * 
	 * @param nome Parte do nome a ser buscado
	 * @return Lista de {@link Cidade}
	 */
	List<Cidade> readByName(String nome);

	/**
	 * Metodo responsavel por garantir os parametros obrigatórios para que se possa
	 * recuperar da base de dados os objetos {@link Cidade} usando o estado como
	 * parametro
	 * 
	 * @param nome Parte do nome a ser buscado
	 * @return Lista de {@link Cidade}
	 * @throws BusinessException
	 */
	List<Cidade> readByState(Estado estado) throws BusinessException;

	/**
	 * Metodo responsavel por persistir (atualizar) os dados na base o objeto
	 * desejado {@link Cidade}
	 * 
	 * @param Cidade Objeto a ser persistido
	 * @return Objeto persistido
	 */
	Cidade update(Cidade cidade);

	/**
	 * Metodo responsável por deletar da base de dados o objeto {@link Cidade}, cujo
	 * código seja igual
	 * 
	 * @param id Código a ser buscado e deletado
	 */
	void delete(Integer id);
}
