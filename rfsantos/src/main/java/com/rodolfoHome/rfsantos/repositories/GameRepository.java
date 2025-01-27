package com.rodolfoHome.rfsantos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodolfoHome.rfsantos.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{  //permite inserir, atualizar, deletar já nativo do JpaRepository

	
	
	
}
