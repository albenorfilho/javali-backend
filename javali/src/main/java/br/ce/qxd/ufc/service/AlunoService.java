package br.ce.qxd.ufc.service;

import br.ce.qxd.ufc.model.Aluno;
import br.ufc.quixada.npi.service.GenericService;

public interface AlunoService extends GenericService<Aluno> {

	public abstract Aluno getAluno(String matricula);

	public abstract Aluno getAlunoByCPF(String cpf);

	public abstract boolean isAlunoCadastrado(Aluno aluno);
}
