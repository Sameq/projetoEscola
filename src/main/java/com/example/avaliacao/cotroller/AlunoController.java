package com.example.avaliacao.cotroller;

import java.util.List;

import com.example.avaliacao.exception.ResouceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.avaliacao.model.Aluno;
import com.example.avaliacao.service.AlunoSerivce;
@RestController
@RequestMapping(value = "api/addaluno")
public class AlunoController {
	
	private AlunoSerivce alunoservice;

	public AlunoController(AlunoSerivce alunoservice) {
		this.alunoservice = alunoservice;
	}
	
	@PostMapping
	public ResponseEntity<Aluno> saveAluno(@RequestBody Aluno aluno ){
		return new ResponseEntity<Aluno>(alunoservice.saveAluno(aluno), HttpStatus.CREATED);
	}
	
	@GetMapping(value = "{listar}")
	public List<Aluno> getAllAluno(){
		return alunoservice.getALLAlunos();
	}
	
	@GetMapping(value = "teste/{id}")
	public ResponseEntity<Aluno> getAlunoByID(@PathVariable("id") long idAluno) throws ResouceNotFoundException {
		return new ResponseEntity<Aluno>(alunoservice.getAlunoById(idAluno), HttpStatus.OK);
	}
	
}
