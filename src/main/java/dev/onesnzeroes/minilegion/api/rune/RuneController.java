package dev.onesnzeroes.minilegion.api.rune;

import dev.onesnzeroes.minilegion.api.rune.request.CreateRuneRequest;
import dev.onesnzeroes.minilegion.api.rune.request.RuneModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rune")
public class RuneController {

    private RuneService runeService;

    public RuneController(RuneService service){
        this.runeService = service;
    }

    @GetMapping("/{runeId}")
    public RuneModel get(@PathVariable Long runeId){
        return this.runeService.read(runeId);
    }

    @PutMapping("/")
    public RuneModel post(CreateRuneRequest request){
        return this.runeService.create(request);
    }
}
