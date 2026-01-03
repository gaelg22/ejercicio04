package com.upiiz.heroes.controllers;

import com.upiiz.heroes.entities.Heroe;
import com.upiiz.heroes.servers.HeroesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/marvel/socios/v1/heroes")
public class HeroeController {

    private final HeroesService heroesService;

    public HeroeController(HeroesService heroesService) {
        this.heroesService = heroesService;
    }

    @GetMapping
    public ResponseEntity<List<Heroe>> getHeroes() {
        return ResponseEntity.ok(heroesService.getAllHeroes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Heroe> getHeroesById(@PathVariable Long id) {
        return ResponseEntity.ok(heroesService.getHeroeById(id));
    }

    @PostMapping
    public ResponseEntity<Heroe> createHeroe(@RequestBody Heroe heroe) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(heroesService.addHeroe(heroe));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Heroe> updateHeroe(@PathVariable Long id,
                                             @RequestBody Heroe heroe) {
        heroe.setId(id);
        return ResponseEntity.ok(heroesService.updateHeroe(heroe));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHeroe(@PathVariable Long id) {
        heroesService.deleteHeroe(id);
        return ResponseEntity.noContent().build();
    }
}
