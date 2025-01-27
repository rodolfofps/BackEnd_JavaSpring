package com.rodolfoHome.rfsantos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rodolfoHome.rfsantos.dto.GameMinDTO;
import com.rodolfoHome.rfsantos.entities.Game;
import com.rodolfoHome.rfsantos.repositories.GameRepository;

@Service //necessidade de registrar a classe como sendo um componente do sistema. Injetar dependência de componentes no sistema
public class GameService {  

	//injeta uma instância do GameRepository dentro do GameService. Um Service injeta um Repository
	@Autowired  
	private GameRepository gameRepository; 
	
	public  List<GameMinDTO> findAll() {  // esse método permite gerar uma lista com os resultados de gameRepository sempre precisar implementar códigos SQL, o framework faz tudo
		List<Game> result  = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		}
}
