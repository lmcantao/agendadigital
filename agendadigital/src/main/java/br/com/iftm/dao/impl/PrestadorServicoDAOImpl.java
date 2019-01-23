package br.com.iftm.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.iftm.dao.PrestadorServicoDAO;
import br.com.iftm.entity.PrestadorDeServico;
import br.com.iftm.entity.Telefone;

@Repository
public class PrestadorServicoDAOImpl implements PrestadorServicoDAO {
	private List<PrestadorDeServico> lista = new ArrayList<>();
	private int indice = 0;

	@Override
	public PrestadorDeServico create(PrestadorDeServico prestador) {

		prestador.setCodigo(indice++);

		lista.add(prestador);

		return prestador;
	}

	@Override
	public List<PrestadorDeServico> read() {

		return lista;
	}

	@Override
	public List<PrestadorDeServico> readByName(String nome) {

		List<PrestadorDeServico> listaRetorno = new ArrayList<>();

		for (PrestadorDeServico prestador : lista) {

			if (prestador.getNome().toUpperCase().contains(nome.toUpperCase())) {
				listaRetorno.add(prestador);
			}
		}

		return listaRetorno;
	}

	@Override
	public List<PrestadorDeServico> readByTelefone(Telefone telefone) {

		List<PrestadorDeServico> listaRetorno = new ArrayList<>();

		/*
		 * for (PrestadorDeServico prestador : lista) {
		 * 
		 * if (prestador.getEstado().equals(estado)) { listaRetorno.add(cidade); } }
		 */

		return listaRetorno;
	}

	@Override
	public PrestadorDeServico update(PrestadorDeServico prestador) {

		for (PrestadorDeServico prestador2 : lista) {

			if (prestador2.getCodigo().equals(prestador.getCodigo())) {
				prestador2.setNome(prestador.getNome());
				prestador2.setCidade(prestador.getCidade());
				prestador2.setCep(prestador.getCep());
				prestador2.setBairro(prestador.getBairro());
				prestador2.setTipoLogradouro(prestador.getTipoLogradouro());
				prestador2.setLogradouro(prestador.getLogradouro());
				prestador2.setNumero(prestador.getNumero());
				prestador2.setComplemento(prestador.getComplemento());
				prestador2.setTelefone(prestador.getTelefone());
				prestador2.setTipoServico(prestador.getTipoServico());
				break;
			}
		}

		return null;
	}

	@Override
	public void delete(Integer id) {
		for (PrestadorDeServico prestador : lista) {
			if (prestador.getCodigo().equals(id)) {
				lista.remove(prestador);
				break;
			}
		}
	}
}
