package by.tsarankou.kuberdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KuberController {

    @GetMapping("/")
    public String getData() {
        return "Data from server";
    }
}
