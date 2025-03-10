package com.synergisticit.controller;

import com.synergisticit.domain.AddRequest;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GesangZeren
 * @project AddAPI
 * @date 3/10/2025
 */
@RestController
@RequestMapping("/api/v1")
public class AddController {

    @PostMapping("/add")
    public int add(@RequestBody AddRequest addRequest) {
        return addRequest.getA() + addRequest.getB();
    }

}
