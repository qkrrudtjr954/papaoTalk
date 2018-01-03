package controller;

import delegator.Delegator;
import dto.RoomDto;
import service.RoomService;
import view.RoomList;

import java.util.List;

public class RoomController {
    RoomService roomService = new RoomService();

    public void RoomList(){
        Delegator delegator = Delegator.getInstance();

        String user_id = delegator.getCurrent_user().getId();
        if(user_id==null){
            delegator.mainController.Main();
        }else {
            List<RoomDto> list = roomService.getRoomByUesrId(user_id);
            new RoomList(list);
        }
    }

}
