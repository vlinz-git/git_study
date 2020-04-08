package icu.vlinz.git_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GitStudyApplication {
    @RequestMapping("/git")
    public String Git(){
        return "Hello Git! V0.7 -master update  --merge合并分支";
    }

    public static void main(String[] args) {
        SpringApplication.run(GitStudyApplication.class, args);
    }

}
