package com.devteam.social_network.sdi;

import lombok.Data;
import org.joda.time.DateTime;
import org.springframework.web.multipart.MultipartFile;

@Data
public class PostSdi {
    private String content;
    private String userEmail;
    private String reactionType;
}
