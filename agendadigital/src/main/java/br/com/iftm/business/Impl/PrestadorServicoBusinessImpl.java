package br.com.iftm.business.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import br.com.iftm.business.BusinessException;
import br.com.iftm.business.PrestadorServicoBusiness;
import br.com.iftm.dao.PrestadorServicoDAO;
import br.com.iftm.entity.PrestadorDeServico;
import br.com.iftm.entity.Telefone;
import br.com.iftm.entity.TipoServico;

@Service
public class PrestadorServicoBusinessImpl implements PrestadorServicoBusiness {

	@Autowired
	private PrestadorServicoDAO dao;

	@Override
	public PrestadorDeServico create(PrestadorDeServico prestador) throws BusinessException {

		if (StringUtils.isEmpty(prestador.getNome())) {

			throw new BusinessException("Nome Requerido");
		}

		if (prestador.getCidade() == null || prestador.getCidade().getCodigo() == null) {
			throw new BusinessException("Cidade Requerido");
		}

		if (StringUtils.isEmpty(prestador.getBairro())) {
			throw new BusinessException("Bairro Requerido");
		}

		if (StringUtils.isEmpty(prestador.getCep())) {
			throw new BusinessException("CEP Requerido");
		}

		if (prestador.getTipoLogradouro() == null) {
			throw new BusinessException("Tipo Logradouro Requerido");
		}

		if (StringUtils.isEmpty(prestador.getLogradouro())) {
			throw new BusinessException("Tipo Logradouro Requerido");
		}

		if (prestador.getTelefone() == null || prestador.getTelefone().isEmpty()) {
			throw new BusinessException("Telefone Requerido");
		}

		if (prestador.getTipoServico() == null || prestador.getTipoServico().isEmpty()) {
			throw new BusinessException("Tipo de Serviço Requerido");
		}

		for (Telefone telefone : prestador.getTelefone()) {
			if (telefone.getDDD() == null) {
				throw new BusinessException("DDD Requerido");
			}

			if (telefone.getNumero() == null) {
				throw new BusinessException("Número Telefone Requerido");
			}
		}

		for (TipoServico tipoServico : prestador.getTipoServico()) {
			if (tipoServico.getCodigo() == null) {
				throw new BusinessException("Código Requerido");
			}
		}

		return dao.create(prestador);
	}

	@Override
	public List<PrestadorDeServico> read() throws BusinessException {

		return dao.read();
	}

	@Override
	public List<PrestadorDeServico> readByName(String nome) throws BusinessException {

		if (StringUtils.isEmpty(nome)) {

			throw new BusinessException("Nome Requerido");
		}

		return dao.readByName(nome);
	}

	@Override
	public List<PrestadorDeServico> readByTelefone(Telefone telefone) throws BusinessException {

		if (StringUtils.isEmpty(telefone)) {

			throw new BusinessException("Estado Requerido");
		}

		return dao.readByTelefone(telefone);
	}

	@Override
	public PrestadorDeServico update(PrestadorDeServico prestador) throws BusinessException {

		if (prestador.getCodigo() == null) {
			throw new BusinessException("Código Requerido");
		}

		if (StringUtils.isEmpty(prestador.getNome())) {
			throw new BusinessException("Nome Requerido");
		}

		if (prestador.getCidade().getCodigo() == null) {
			throw new BusinessException("Código Requerido");
		}

		if (StringUtils.isEmpty(prestador.getBairro())) {
			throw new BusinessException("Bairro Requerido");
		}

		if (StringUtils.isEmpty(prestador.getCep())) {
			throw new BusinessException("CEP Requerido");
		}

		if (prestador.getTipoLogradouro() == null) {
			throw new BusinessException("Tipo Logradouro Requerido");
		}

		if (StringUtils.isEmpty(prestador.getLogradouro())) {
			throw new BusinessException("Tipo Logradouro Requerido");
		}

		return dao.update(prestador);
	}

	@Override
	public void delete(Integer id) throws BusinessException {

		if (id == null) {
			throw new BusinessException("Código Requerido");
		}

		dao.delete(id);

	}
}
