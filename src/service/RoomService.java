package service;

import dao.RoomDao;
import dto.RoomDto;

import java.util.List;

public class RoomService implements RoomServiceImpl {
    RoomDao roomDao = new RoomDao();

    @Override
    public List<RoomDto> getRoomByUesrId(String user_id) {
        return roomDao.getRoomByUesrId(user_id);
    }
}
