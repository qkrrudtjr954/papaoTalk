package service;

import dto.ChatDto;

import java.util.List;

public interface ChatServiceImpl {
    public List<ChatDto> getChatByRoomSeq(int seq);
    public boolean insert(ChatDto chat);
}
