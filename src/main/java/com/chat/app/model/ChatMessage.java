package com.chat.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatMessage {
    private String sender;
    private String content;

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }
}
