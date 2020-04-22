package org.firefly.provider.personal.website.paper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paper")
public class PaperController {
    @GetMapping("/{id}")
    public Paper getPaperById(@PathVariable Integer id) {
        return Paper.builder()
                .id(id)
                .title("How to build your personal website")
                .content("Do id yourself!").build();
    }
}
