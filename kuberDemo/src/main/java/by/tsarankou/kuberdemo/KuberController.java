package by.tsarankou.kuberdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class KuberController {

    @GetMapping("/")
    public String getData() throws UnknownHostException {
        return "Host name " + InetAddress.getLocalHost() + Math.random();
    }
}
