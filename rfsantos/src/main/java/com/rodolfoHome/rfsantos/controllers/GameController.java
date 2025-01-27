package com.rodolfoHome.rfsantos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodolfoHome.rfsantos.dto.GameMinDTO;
import com.rodolfoHome.rfsantos.services.GameService;

@RestController
@RequestMapping(value = "/games")  //configuração do caminho no qual será respondida a API
public class GameController {

	@Autowired
	private GameService gameService; //Um controller injeta um Service
	
	//criando um mapeamento para o endpoint
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result  = gameService.findAll();
		return result;
	}
}
