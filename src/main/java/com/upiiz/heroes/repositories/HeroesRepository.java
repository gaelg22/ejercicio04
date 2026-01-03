package com.upiiz.heroes.repositories;

import com.upiiz.heroes.entities.Heroe;
import org.springframework.data.repository.CrudRepository;

public interface HeroesRepository extends CrudRepository<Heroe, Long> {
    //Ya tiene los metodos -> Agregar, Listar, Actualizar, Buscar por id
    //Podemos agregar mas metodos



}
