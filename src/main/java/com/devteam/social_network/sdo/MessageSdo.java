package com.devteam.social_network.sdo;

import lombok.Data;
import org.joda.time.DateTime;

import java.util.Date;

@Data
public class MessageSdo {
    private String from;
    private String text;
    private String time;
}
