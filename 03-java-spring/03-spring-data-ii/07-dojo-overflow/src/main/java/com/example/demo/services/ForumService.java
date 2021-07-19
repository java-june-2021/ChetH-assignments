package com.example.demo.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.Answer;
import com.example.demo.models.Question;
import com.example.demo.models.Tag;
import com.example.demo.repositories.AnswerRepository;
import com.example.demo.repositories.QuestionRepository;
import com.example.demo.repositories.TagRepository;

@Service
public class ForumService {

	// adding the repositories as dependencies
	private QuestionRepository questionRepository;
	private AnswerRepository answerRepository;
	private TagRepository tagRepository;

	// constructor
	public ForumService(QuestionRepository questionRepository, AnswerRepository answerRepository,
			TagRepository tagRepository) {
		this.questionRepository = questionRepository;
		this.answerRepository = answerRepository;
		this.tagRepository = tagRepository;
	}
	
	// returns all the questions
	public List<Question> allQuestions() {
		return questionRepository.findAll();
	}
	
	// returns one question
	public Question getOneQuestion(Long id) {
		return questionRepository.findById(id).orElse(null);
	}

	// returns all the answers
	public List<Answer> allAnswers() {
		return answerRepository.findAll();
	}
		
	// returns one answer
	public Answer getOneAnswer(Long id) {
		return answerRepository.findById(id).orElse(null);
	}
	
	// retrieve one tag from database
	public Tag getOneTag(String subject) {
		return this.tagRepository.findBySubject(subject);
	}
	
	// split string of tags into array
	public ArrayList<Tag> processTags(String tags) {
		ArrayList<Tag> tagsToAdd = new ArrayList<Tag>();
		String[] splitTags = tags.split(",");
		for (String subject : splitTags) {
			subject = subject.trim();
			System.out.print(subject);
			if (this.tagRepository.existsBySubject(subject)) { // tag is already in tag table, so just add tag to question
				Tag tagAddCandidate = this.getOneTag(subject);
				tagsToAdd.add(tagAddCandidate);
			} else { // add tag to tag table and question
				Tag newTag = new Tag();
				newTag.setSubject(subject);
				this.tagRepository.save(newTag);
				tagsToAdd.add(this.getOneTag(subject));
			}
		}
		return tagsToAdd;
		
	}
	
	// create question and associated tags
	public Question createQuestion(Question question) {
		question.setQuestionTags(this.processTags(question.getTagsEphemeral()));
		return this.questionRepository.save(question);
	}
	
	// create answer
	public Answer createAnswer(Answer answer) {
		return this.answerRepository.save(answer);
	}

}