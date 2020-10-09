package org.sample.config;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

  @GetMapping("/handle")
  public String handle2() {

    return "some result";
  }

  @GetMapping("/handle2")
  public Map<String, String> handle() {

    return new HashMap<String, String>() {{
      put("key", "value");
    }};
  }
}
