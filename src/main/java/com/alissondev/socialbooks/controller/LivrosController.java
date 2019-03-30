package com.alissondev.socialbooks.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alissondev.socialbooks.entities.Livro;

@RestController
public class LivrosController {

	@RequestMapping(value = "/livros", method = RequestMethod.GET)
	public List<Livro> listar() {
		
		Livro l1 = new Livro("Rest Aplicado");
		Livro l2 = new Livro("Java passo-a-passo");
		
		Livro[] livros = {l1, l2};
		
		return Arrays.asList(livros);
	}
}
