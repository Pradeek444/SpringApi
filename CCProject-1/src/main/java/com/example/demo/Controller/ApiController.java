package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Game;

import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
   @Autowired
   private ApiService gameservice;
   
   @PostMapping("/addgame")
   public String postDetails(@RequestBody Game g) {
	   gameservice.savedetails(g);
	   return "Game Successfully Added";
   }
   @GetMapping("/")
   public List<Game>getGame(){
	return gameservice.getAllDetails();
   }
   @GetMapping("/{pgno}/{pgsize}")
   public List<Game> listing(@PathVariable("pgno")int pgno,@PathVariable("pgsize")int pgsize){
	   return gameservice.findall(pgno, pgsize);
   }
  
   @PutMapping("/{id}")
   public Game updateStudentById(@PathVariable int id, @RequestBody Game g) {
       return gameservice.GameById(id, g);
   }
 
   @DeleteMapping("/delete/{id}")
   public String deletedata(@PathVariable int id) {
	   return gameservice.removedate(id);
   }
   @PutMapping("/update/{id}")
   public Game updateStudentById1(@PathVariable int id, @RequestBody Game g) {
       return gameservice.updateGameById(id, g);
   }
}
