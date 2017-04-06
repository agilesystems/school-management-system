package com.agile.schoolbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.agile.schoolbackend.dao.UserDAO;
import com.agile.schoolbackend.dto.Menu;
import com.agile.schoolbackend.dto.User;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	static List<User> users = new ArrayList<User>();

	{
		User u = new User();
		u.setId(1);
		u.setName("Ramy");
		u.setPassword("123");
		u.setUsername("admin");
		u.getMenus().add(new Menu(1, "Menu1", "Page1","fa fa-dashboard fa-fw"));
		u.getMenus().add(new Menu(2, "Menu2", "Page2","fa fa-bar-chart-o fa-fw"));
		u.getMenus().add(new Menu(3, "Menu3", "Page3","fa fa-bar-chart-o fa-fw"));
		u.getMenus().add(new Menu(4, "Menu4", "Page4","fa fa-bar-chart-o fa-fw"));
		u.getMenus().get(0).setSubMenus(new ArrayList<Menu>());

		u.getMenus().get(0).getSubMenus().add(new Menu(5, "Menu 1.1", "Page 1.1","fa fa-bar-chart-o fa-fw"));
		u.getMenus().get(0).getSubMenus().add(new Menu(6, "Menu 1.2", "Page 1.2","fa fa-bar-chart-o fa-fw"));
		u.getMenus().get(0).getSubMenus().add(new Menu(7, "Menu 1.3", "Page 1.3","fa fa-bar-chart-o fa-fw"));

		
		u.getMenus().get(0).getSubMenus().get(0).setSubMenus(new ArrayList<Menu>());
		u.getMenus().get(0).getSubMenus().get(0).getSubMenus().add(new Menu(8, "Menu 1.1.1", "Page 1.1.1","fa fa-bar-chart-o fa-fw"));
		u.getMenus().get(0).getSubMenus().get(0).getSubMenus().add(new Menu(9, "Menu 1.1.2", "Page 1.1.2","fa fa-bar-chart-o fa-fw"));
		u.getMenus().get(0).getSubMenus().get(0).getSubMenus().add(new Menu(10, "Menu 1.1.3", "Page 1.1.3","fa fa-bar-chart-o fa-fw"));
		
		users.add(u);
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Menu> getMenus(User user) {
		
		return users.get(0).getMenus();
	}
	
	

}
