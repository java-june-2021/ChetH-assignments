package com.example.demo.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.example.demo.models.Question;

@Component
public class TagValidator {

	public boolean supports(Class<?> clazz) {
		return Question.class.equals(clazz);
		}
	
	public void validate(Object target, Errors errors) {
		Question question = (Question) target;
		String[] tags = question.getTagsEphemeral().split(",");
		if(tags.length > 3) {
			errors.rejectValue("tagsEphemeral", "too many", "Max of 3 tags");
		}
	}
}
