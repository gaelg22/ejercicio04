package com.upiiz.heroes.servers;

import com.upiiz.heroes.entities.Heroe;
import com.upiiz.heroes.repositories.HeroesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroesService {
    private HeroesRepository heroesRepository;

    //Constructor - Bean (frijolito - objeto) - Instanciado, Ensamblado y manejado por Spring
    public HeroesService(HeroesRepository heroesRepository) {
        this.heroesRepository = heroesRepository;
    }

    public List<Heroe> getAllHeroes()
    {
        return (List<Heroe>) heroesRepository.findAll();
    }

    public Heroe getHeroeById(Long id)
    {
        return heroesRepository.findById(id).orElse(null);
    }

    //No tenemos un id, por tanto se asume que lo va a crear
    public Heroe addHeroe(Heroe heroe) {
        return heroesRepository.save(heroe);
    }

    //Si tenemos id, por tanto se asume que lo va a actualizar
    public Heroe updateHeroe(Heroe heroe) {
        return heroesRepository.save(heroe);
    }

    public void deleteHeroe(Long id) {
        heroesRepository.deleteById(id);
    }

}
