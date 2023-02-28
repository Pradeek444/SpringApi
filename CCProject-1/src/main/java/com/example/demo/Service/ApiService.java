package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Game;

import com.example.demo.Repositories.GameRepo;

@Service
public class ApiService {
	@Autowired
	GameRepo gm;
	
	
	public Game savedetails(Game g) {
		return gm.save(g);
	}
	public List<Game> findall(int pgno,int pgsize){
		Pageable pg=PageRequest.of(pgno, pgsize);
		Page<Game> pageresult=gm.findAll(pg);
		return pageresult.toList();
	}
	public List<Game> getAllDetails()
	{
		return gm.findAll();
	}
	

	public String removedate(int id) {
		try {
			if(!gm.findById(id).isEmpty())
			{
				gm.deleteById(id);
				return "Game Removed";
			}
			else
				throw new Exception("Error");
		}
		catch(Exception e) {
			e.printStackTrace();
			return "No game Found for Id "+id;
		}
	}
	
	public Game GameById(int id,Game g) {
		Game gg=gm.findById(id).orElse(null);
		
		
		gg.setName(g.getName());
		gg.setName(g.getName());
		gg.setCname(g.getCname());
		gg.setPrice(g.getPrice());
		gg.setQty(g.getQty());
		gg.setYear(g.getYear());
		return gm.save(gg);
		
		
	}
	public Game updateGameById(int id,Game g) {
		g.setId(id);
		return gm.saveAndFlush(g);
		
	}

	
	

}
