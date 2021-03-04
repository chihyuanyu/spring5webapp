package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    /**
     * 取的作者資訊
     * @param model
     * @return
     */
    @RequestMapping("/authors")
    public String getAuthrors(Model model){
        model.addAttribute("authors", authorRepository.findAll());
        return "authors";
    }
}