package service;

import dto.RoomDto;

import java.util.List;

public interface RoomServiceImpl {
    List<RoomDto> getRoomByUesrId(String user_id);
}
