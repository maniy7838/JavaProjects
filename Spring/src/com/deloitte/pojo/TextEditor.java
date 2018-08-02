package com.deloitte.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class TextEditor {

	private SpellChecker spellChecker; 
	private String name;
	
	
	public void getName() {
		System.out.println("Name : " + name);
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}


	public TextEditor() {
		System.out.println("Inside Default TextEditor Constructor");
	}
	
	
	public TextEditor(SpellChecker spellChecker) {
		
		System.out.println("Inside TextEditor Constructor");
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker.");
		this.spellChecker  = spellChecker;
	}
	
	
}
