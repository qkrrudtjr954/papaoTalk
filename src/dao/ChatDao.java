package dao;

import db.DBConnection;
import db.MySqlConnection;
import delegator.Delegator;
import dto.ChatDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChatDao implements ChatDaoImpl {

    DBConnection DBConnector = new MySqlConnection();

    public List<ChatDto> getChatByRoomSeq(int seq){
        String sql = "select * from chat where room_id="+seq;

        List<ChatDto> list = new ArrayList<>();

        Connection conn = null;
        PreparedStatement ptmt = null;
        ResultSet rs = null;


        try {
            conn = DBConnector.makeConnection();
            ptmt = conn.prepareStatement(sql);
            rs = ptmt.executeQuery();

            while(rs.next()){
                ChatDto dto = new ChatDto();

                dto.setContent(rs.getString("content"));
                dto.setRoom_id(rs.getInt("room_id"));
                dto.setSeq(rs.getInt("seq"));
                dto.setUser_id(rs.getString("user_id"));

                list.add(dto);
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }

        return list;
    }

    public boolean insert(ChatDto chat){
        Delegator delegator = Delegator.getInstance();
        String sql = " insert into chat( content, room_id, user_id ) values ('"+chat.getContent()+"', "+chat.getRoom_id()+", '"+delegator.getCurrent_user().getId()+"')";

        Connection conn = null;
        PreparedStatement ptmt = null;
        int count = -1;

        try {
            conn = DBConnector.makeConnection();
            ptmt = conn.prepareStatement(sql);
            count = ptmt.executeUpdate();


        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return count > 0 ? true : false;
    }
}
