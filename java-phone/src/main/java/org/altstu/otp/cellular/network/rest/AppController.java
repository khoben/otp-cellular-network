package org.altstu.otp.cellular.network.rest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class AppController {
    @RequestMapping("/messages")
    public List<Object> messages(Model model) {
        return Collections.emptyList();
    }
}