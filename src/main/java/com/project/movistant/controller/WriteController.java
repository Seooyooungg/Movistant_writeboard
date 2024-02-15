package com.project.movistant.controller;

import com.project.movistant.entity.MovistantBoard;
import com.project.movistant.service.MovistantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WriteController {

    @Autowired
    private MovistantService movistantService;

    @GetMapping("/Movistant/write")
    public String WriteForm() {

        return "write";
    }

    @PostMapping("/Movistant/writepro")
    public String WritePro(MovistantBoard movistantBoard) {

        movistantService.write(movistantBoard);

        return"submit";
    }
}
