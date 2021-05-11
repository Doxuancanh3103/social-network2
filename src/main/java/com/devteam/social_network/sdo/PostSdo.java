package com.devteam.social_network.sdo;

import lombok.Data;
import org.joda.time.DateTime;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class PostSdo {
    private Long postId;
    private String content;
    private LocalDate localDate;
    private LocalTime localTime;
    private String userEmail;
    private String reactionType;
}
