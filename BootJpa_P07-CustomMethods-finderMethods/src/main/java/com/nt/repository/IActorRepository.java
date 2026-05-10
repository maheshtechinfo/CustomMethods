package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Actor;

public interface IActorRepository extends JpaRepository<Actor, Integer> {
	public List<Actor> findByCategoryEquals(String category);//findBy is fixed
	public List<Actor> getByCategoryEquals(String category);//getBy is fixed
	public List<Actor> readByCategoryEquals(String category);//readBy is fixed
	

}
