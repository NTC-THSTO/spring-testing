package com.ps.bk.hotel.room.repo;

import org.springframework.data.repository.CrudRepository;

import com.ps.bk.hotel.room.model.Room;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepo extends CrudRepository<Room, Long> {
	Room findByRoomNumber(String roomNumber);
}
