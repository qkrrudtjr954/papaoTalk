package dao;

import dto.RoomDto;

import java.util.List;

public interface RoomDaoImpl {
    List<RoomDto> getRoomByUesrId(String user_id);
}
