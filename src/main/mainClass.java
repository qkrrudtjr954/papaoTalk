package main;

import db.DBConnection;
import db.MySqlConnection;
import delegator.Delegator;
import dto.HumanDto;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConnection DBConnector = new MySqlConnection();
		DBConnector.initConnect();

		Delegator delegator = Delegator.getInstance();
//		delegator.setCurrent_user(new HumanDto(1, "qkrrudtjr954", "2017-12-29 20:43:46"));
		delegator.setCurrent_user(new HumanDto(3, "user1", "2018-01-01 22:16:46"));
		delegator.roomController.RoomList();
	}

}
