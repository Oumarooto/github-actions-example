package com.maryam.github_cicd_actions.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {


    @GetMapping("/welcome")
    public String welcome(HttpServletRequest request){
        return "Welcome to my School. My session ID is : "+request.getSession().getId();
    }
}


//…or create a new repository on the command line
//echo "# github-actions-example" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin git@github.com:Oumarooto/github-actions-example.git
//

// git pull origin prod



//…or push an existing repository from the command line
//git remote add origin git@github.com:Oumarooto/github-actions-example.git
//git branch -M main
//git push -u origin main
