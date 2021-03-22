package oauth2.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/openinformation")//видно всем пользователям
    public String showOpenInformation()
    {
        return "Information for any user is here!";
    }

    @GetMapping("/closeinformation")//видно только тем, кто залогинился
    public String showCloseInformation()
    {
        return "to see this text you need to be logged in";
    }
}
