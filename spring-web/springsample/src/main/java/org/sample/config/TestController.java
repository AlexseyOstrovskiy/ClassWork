package org.sample.config;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/pages")
public class TestController {

  @GetMapping("/showTest/{user}")
  public String handle2(@PathVariable("user") String user,
      @RequestParam(value = "name", required = false) String name,
      ModelMap model) {

    model.addAttribute("message", "Some message text: " + user + " with name " + name);

    if (user.equalsIgnoreCase("pikachu")) {
      throw new IllegalArgumentException();
    }

    return "test";
  }

  @ExceptionHandler(IllegalArgumentException.class)
  public String handleException(IllegalArgumentException e, HttpServletRequest httpRequest) {

    return "error";
  }
}
