package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepository;

@Service
public class ActorMgmtServiceImpl implements IActorMgmtService {

	@Autowired
	private IActorRepository actorRepo;

	// findBy...
	/*	@Override
		public List<Actor> showActorBycategory(String category) {
			//use repo
			List<Actor> list = actorRepo.findByCategoryEquals(category);
			return list;
		}*/

	// getBy...
	/*	@Override
		public List<Actor> showActorBycategory(String category) {
			//use repo
			List<Actor> list = actorRepo.getByCategoryEquals(category);
			return list;
		}*/

	// readBy...
	@Override
	public List<Actor> showActorBycategory(String category) {
		// use repo
		List<Actor> list = actorRepo.readByCategoryEquals(category);
		return list;
	}

}
