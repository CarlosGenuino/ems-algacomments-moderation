package com.algaworks.comments_moderation.api.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ModerationOutput {
    private Boolean approved;
    private String reason;
}
