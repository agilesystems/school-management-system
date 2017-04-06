package com.agile.schoolbackend.dao;

import java.util.List;

import com.agile.schoolbackend.dto.Menu;
import com.agile.schoolbackend.dto.User;

public interface UserDAO {

	public void add(User uuser);
	public List<Menu>getMenus(User user);
	
}
