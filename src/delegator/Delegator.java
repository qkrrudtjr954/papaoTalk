package delegator;

import controller.ChatController;
import controller.HumanController;
import controller.MainController;
import controller.RoomController;
import dto.HumanDto;

public class Delegator {
    private static Delegator instance = null;
    public ChatController chatController = null;
    public RoomController roomController = null;
    public HumanController humanController = null;
    public MainController mainController = null;
    public HumanDto current_user = null;

    private Delegator(){
        chatController = new ChatController();
        roomController = new RoomController();
        humanController = new HumanController();
        mainController = new MainController();
    }

    public static Delegator getInstance() {
        if (instance==null){
            instance = new Delegator();
        }
        return instance;
    }


    public HumanDto getCurrent_user() {
        return current_user;
    }

    public void setCurrent_user(HumanDto current_user) {
        this.current_user = current_user;
    }
}
