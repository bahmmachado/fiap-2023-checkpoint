package br.com.fiap.checkpoint1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint1.model.Empregado;
import br.com.fiap.checkpoint1.service.EmpregadoService;

@RestController
@RequestMapping("/empregados")
public class EmpregadoController {

	@Autowired
	private EmpregadoService empregadoService;

	@GetMapping
	public List<Empregado> listAll() {
		return empregadoService.list();
	}

	@PostMapping

	public Empregado create(Empregado empregado) {
		Empregado result = empregadoService.save(empregado);
		return result;
	}

	@PutMapping
	public Empregado update(Empregado empregado) {
		Empregado result = empregadoService.save(empregado);
		return result;
	}

	@DeleteMapping("/{codigoEmpregado}")
	public void delete(@PathVariable Long codigoEmpregado) {
		empregadoService.delete(codigoEmpregado);
	}

	@GetMapping("/{codigoEmpregado}")
	public Empregado findById(@PathVariable Long codigoEmpregado) {
		return empregadoService.findById(codigoEmpregado);
	}

}
