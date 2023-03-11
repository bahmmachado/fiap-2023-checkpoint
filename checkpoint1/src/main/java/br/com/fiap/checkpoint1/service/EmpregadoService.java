package br.com.fiap.checkpoint1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint1.model.Empregado;
import br.com.fiap.checkpoint1.repository.EmpregadoRepository;


@Service
public class EmpregadoService {
	

	@Autowired
	private EmpregadoRepository empregadoRepository;
	
	

	public List<Empregado> list() {
		return empregadoRepository.findAll();
	}
	public Empregado save(Empregado empregado) {
		return empregadoRepository.save(empregado);
	}
	public void delete(Long codigoEmpregado) {
	    empregadoRepository.deleteById(codigoEmpregado);
	}

	public Empregado findById(Long codigoEmpregado) {
	    Optional<Empregado> empregado = empregadoRepository.findById(codigoEmpregado);
	    return empregado.orElse(null);
	}


}
