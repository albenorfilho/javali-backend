package br.ce.qxd.ufc.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ce.qxd.ufc.service.AlunoService;

@Controller
@RequestMapping("aluno")
public class AlunoController {

	@Inject
	private AlunoService alunoService;

}
