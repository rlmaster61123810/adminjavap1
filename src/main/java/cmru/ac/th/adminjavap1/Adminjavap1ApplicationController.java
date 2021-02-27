package cmru.ac.th.adminjavap1;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

	@SpringBootApplication

	@RestController

	@Controller
	public class Adminjavap1ApplicationController {

	@GetMapping(value="login.html")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "auth/login";
	}
}
