package com.jmoney.StickyTapeAPI.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.jmoney.StickyTapeAPI.models.Actor;
import com.jmoney.StickyTapeAPI.models.Award;
import com.jmoney.StickyTapeAPI.repositories.ActorRepository;
import com.jmoney.StickyTapeAPI.repositories.AwardRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/actors/{actorId}/awards")
public class AwardApiController {

	private ActorRepository actorRepository;
	private AwardRepository awardRepository;

	public AwardApiController(ActorRepository actorRepository, AwardRepository awardRepository) {
		this.actorRepository = actorRepository;
		this.awardRepository = awardRepository;

	}

	// @PostMapping("")
	// public Actor create(@PathVariable Long actorId, @RequestBody Award award) {
	// Actor actor = actorRepository.findOne(actorId);
	// actor.getAwards().add(award);
	// award.setActor(actor);
	// awardRepository.save(award);
	// return actor;
	@PostMapping("")
	public Award create(@PathVariable Long actorId, @RequestBody Award award) {
		Actor actor = actorRepository.findOne(actorId); // get an actor
		award.setActor(actor); // assign the award to the actor
		awardRepository.save(award);
		return award; // see the actor with the award associated

	}
}
