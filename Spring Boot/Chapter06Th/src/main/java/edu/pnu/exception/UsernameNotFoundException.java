package edu.pnu.exception;

import org.thymeleaf.exceptions.TemplateInputException;

public class UsernameNotFoundException extends TemplateInputException {

    private static final long serialVersionUID = 1L;

    public UsernameNotFoundException(String message) {
        super(message);
    }

}