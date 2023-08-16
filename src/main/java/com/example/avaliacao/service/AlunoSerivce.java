package com.example.avaliacao.service;

import java.util.List;

import com.example.avaliacao.model.Aluno;

public interface AlunoSerivce {
	Aluno saveAluno(Aluno aluno);
	List<Aluno> getALLAlunos();
	Aluno getAlunoById(long idAluno);
}
