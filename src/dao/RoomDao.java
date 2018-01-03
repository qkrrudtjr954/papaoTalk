package dao;

import db.DBConnection;
import db.MySqlConnection;
import dto.RoomDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoomDao implements RoomDaoImpl {

    DBConnection DBConnector = new MySqlConnection();

    @Override
    public List<RoomDto> getRoomByUesrId(String user_id) {
        String sql = "select * from room where user_id='"+user_id+"' or target_id='"+user_id+"'";

        Connection conn = null;
        PreparedStatement ptmt = null;
        ResultSet rs = null;

        List<RoomDto> list = new ArrayList<>();


        try {
            conn = DBConnector.makeConnection();
            ptmt = conn.prepareStatement(sql);
            rs = ptmt.executeQuery();

            while(rs.next()){
                RoomDto room = new RoomDto();

                room.setSeq(rs.getInt("seq"));
                room.setUser_id(rs.getString("user_id"));
                room.setTarget_id(rs.getString("target_id"));

                list.add(room);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return list;
    }
}
