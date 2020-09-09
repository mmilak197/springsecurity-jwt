package mmilak.dev.springsecurityjwt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {

    @GetMapping("/test1")
    public String availableForAll() {
        return "available For All";
    }

    @GetMapping("/test2")
    public String availableForLogin() {
        return "available For Login";
    }

    @GetMapping("/test3")
    public String availableForSpecificRoles() {
        return "available For Specific Roles";
    }
}
