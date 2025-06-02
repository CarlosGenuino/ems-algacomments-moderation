package com.algaworks.comments_moderation.api.controller;

import com.algaworks.comments_moderation.api.model.ModerationInput;
import com.algaworks.comments_moderation.api.model.ModerationOutput;
import com.algaworks.comments_moderation.domain.service.ModerationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/moderate")
public class ModerationController {

    private final ModerationService moderationService;

    @PostMapping
    public ModerationOutput isValid(@RequestBody ModerationInput input){
        return moderationService.moderate(input);
    }
}
