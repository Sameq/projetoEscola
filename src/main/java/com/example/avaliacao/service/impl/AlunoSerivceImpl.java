package com.example.avaliacao.service.impl;

//import java.lang.module.ResolutionException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.avaliacao.exception.ResouceNotFoundException;
import com.example.avaliacao.model.Aluno;
import com.example.avaliacao.repository.AlunoRepository;
import com.example.avaliacao.service.AlunoSerivce;
@Service
public class AlunoSerivceImpl implements AlunoSerivce{
	
	AlunoRepository alunoRepository;
	
	public AlunoSerivceImpl(AlunoRepository alunoRepository) {
//		super();
		this.alunoRepository = alunoRepository;
	}

	@Override
	public Aluno saveAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
	}

	@Override
	public List<Aluno> getALLAlunos() {
		
		return alunoRepository.findAll();
	}

	@Override
	public Aluno getAlunoById(long idAluno) {
		Optional<Aluno> aluno = alunoRepository.findById(idAluno);
		if (aluno.isPresent()) {
			return aluno.get();
		}
		throw new  ResouceNotFoundException("Alunooooooooooo");

	}

}
