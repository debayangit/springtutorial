package com.debayan.learning1.springboottutorial1.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.debayan.learning1.springboottutorial1.beans.Topic;

@Service
public class TopicService {
	private List<Topic> topics= new ArrayList<Topic>(Arrays.asList(
			new Topic("1", "name1", "description1"),
			new Topic("2", "name2", "description2"),
			new Topic("3", "name3", "description3")));


	public List<Topic> getTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public List<Topic> addTopic(Topic t){
		topics.add(t);		
		return topics;
	}
	
	public List<Topic> updateTopic(Topic t, String id){
		for(int i=0; i<topics.size(); i++) {
			if(topics.get(i).getId().equals(id)) {
				topics.set(i, t);
			}
		}
		return topics;
	}

	public List<Topic> deleteTopic(String id) {
		Topic tDelete= topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		topics.remove(tDelete);
		return topics;
	} 
}
