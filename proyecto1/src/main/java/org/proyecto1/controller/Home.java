package org.proyecto1.controller;

import org.proyecto1.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Home {

	@Autowired
	private PostRepository postRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("hola", "funcionando");
		model.addAttribute("variable1", "perfectamente");
		return "index";
	}

}
