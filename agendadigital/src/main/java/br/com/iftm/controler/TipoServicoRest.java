package br.com.iftm.controler;

import java.util.List;

import javax.websocket.server.PathParam;

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
import br.com.iftm.business.TipoServicoBusiness;
import br.com.iftm.business.Impl.TipoServicoBusinessImpl;
import br.com.iftm.entity.TipoServico;

@RestController // Habilita classe com o servico rest
@RequestMapping(value = "/tiposervico") // Nome do servico
public class TipoServicoRest {

	private TipoServicoBusiness business = new TipoServicoBusinessImpl();

	// create
	@PostMapping()
	public ResponseEntity<?> create(@RequestBody TipoServico tipoServico) {

		try {
			// tipoServico = business.create(tipoServico);

			return ResponseEntity.ok(business.create(tipoServico));
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
	public ResponseEntity<?> update(@RequestBody TipoServico tipoServico) {

		try {

			return ResponseEntity.ok(business.update(tipoServico));

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

			List<TipoServico> read_byName = business.readByName(nome);

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
}
