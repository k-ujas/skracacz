package dev.greencashew.linkshortener.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/links")
public class LinkManageController {

    @PostMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    LinkDto createLink(@RequestBody CreateLinkDto link) {
        return link.toDto();
    }

    @DeleteMapping("/{id}/{email}")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<?> deleteLink(String id,
                                 String email){
        return ResponseEntity.noContent().build();
    }

}
//a