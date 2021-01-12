package ru.skillbox.socialnetwork.api.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class IdUnreadCountLastMessageResponse {

  private int id;
  @JsonProperty("unread_count")
  private int unreadCount;
  @JsonProperty("last_message")
  private MessageEntityResponse lastMessage;
}