package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting") // ensures HTTP GET requests to /greeting are mapped to greeting() method
// @RequestParam binds the value of the query String parameter "name" into the "name" parameter of the greeting() method
// NOTE: The query string paramter "name" isn't required; if it's absent, the defaultValue of "World" is used
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}

