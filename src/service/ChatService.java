package service;

import dao.ChatDao;
import dao.ChatDaoImpl;
import dto.ChatDto;

import java.util.List;

public class ChatService implements ChatServiceImpl {

    ChatDaoImpl chatDao = new ChatDao();

    public List<ChatDto> getChatByRoomSeq(int seq){
        return chatDao.getChatByRoomSeq(seq);
    }
    public boolean insert(ChatDto chat){
        return chatDao.insert(chat);
    }
}
