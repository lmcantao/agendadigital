package br.com.iftm.controler;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.iftm.business.BusinessException;
import br.com.iftm.business.PrestadorServicoBusiness;
import br.com.iftm.entity.PrestadorDeServico;
import br.com.iftm.entity.Telefone;

@RestController
@RequestMapping(value = "/prestador/servico")
public class PrestadorServicoRest {

	@Autowired
	private PrestadorServicoBusiness business;

	// create
	@PostMapping()
	public ResponseEntity<?> create(@RequestBody PrestadorDeServico prestador) {

		try {

			return ResponseEntity.ok(business.create(prestador));
		} catch (BusinessException e) {
			e.printStackTrace();

			return ResponseEntity.badRequest().body(e);
		} catch (Exception e) {
			e.printStackTrace();

			return ResponseEntity.badRequest().body(e);
		}
	}

	// read
	@GetMapping
	public ResponseEntity<?> read() {

		try {

			return ResponseEntity.ok(business.read());
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e);
		} catch (Exception e) {
			e.printStackTrace();

			return ResponseEntity.badRequest().body(e);
		}
	}

	// update
	@PutMapping
	public ResponseEntity<?> update(@RequestBody PrestadorDeServico prestador) {

		try {

			return ResponseEntity.ok(business.update(prestador));

		} catch (BusinessException e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e);
		} catch (Exception e) {
			e.printStackTrace();

			return ResponseEntity.badRequest().body(e);
		}
	}

	// delete
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Integer id) {

		try {
			business.delete(id);

			return ResponseEntity.ok().build();
		} catch (BusinessException e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e);
		} catch (Exception e) {
			e.printStackTrace();

			return ResponseEntity.badRequest().body(e);
		}

	}

	@GetMapping("/filtro/nome")
	public ResponseEntity<?> readByName(@PathParam("nome") String nome) {

		try {

			List<PrestadorDeServico> read_byName = business.readByName(nome);

			if (read_byName.isEmpty()) {
				return ResponseEntity.notFound().build();
			}

			return ResponseEntity.ok(business.readByName(nome));

		} catch (BusinessException e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e);
		} catch (Exception e) {
			e.printStackTrace();

			return ResponseEntity.badRequest().body(e);
		}
	}

	@GetMapping("/filtro/telefone")
	public ResponseEntity<?> readByTelefone(@PathParam("telefone") Telefone telefone) {

		try {

			List<PrestadorDeServico> listaTelefone = business.readByTelefone(telefone);

			if (listaTelefone == null || listaTelefone.isEmpty()) {
				return ResponseEntity.notFound().build();
			}

			return ResponseEntity.ok(readByTelefone(telefone));

		} catch (BusinessException e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e);
		} catch (Exception e) {
			e.printStackTrace();

			return ResponseEntity.badRequest().body(e);
		}
	}
}
