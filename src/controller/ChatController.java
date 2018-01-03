package controller;

import dao.ChatDao;
import dto.ChatDto;
import dto.RoomDto;
import service.ChatService;
import view.Room;

import java.util.List;

public class ChatController {

    ChatService chatService = new ChatService();

    public void Chat(RoomDto room){

        /* 서버 커넥션 */


        List<ChatDto> list = chatService.getChatByRoomSeq(room.getSeq());
        new Room(list, room);
    }

    public boolean insert(ChatDto chat){
        return chatService.insert(chat);
    }
}
