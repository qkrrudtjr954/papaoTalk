package dao;

import dto.ChatDto;

import java.util.List;

public interface ChatDaoImpl {
    public List<ChatDto> getChatByRoomSeq(int seq);
    public boolean insert(ChatDto chat);
}
