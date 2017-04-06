package com.agile.schoolbackend.dto;

import java.util.List;

public class Menu {

	private int id;
	private String name;
	private String pageURL;
	private String cssClass;
	private List<Menu> subMenus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPageURL() {
		return pageURL;
	}

	public void setPageURL(String pageURL) {
		this.pageURL = pageURL;
	}

	public List<Menu> getSubMenus() {
		return subMenus;
	}

	public void setSubMenus(List<Menu> subMenus) {
		this.subMenus = subMenus;
	}

	public String getCssClass() {
		return cssClass;
	}

	public void setCssClass(String cssClass) {
		this.cssClass = cssClass;
	}

	public Menu(int id, String name, String pageURL, String cssClass) {
		setId(id);
		setName(name);
		setPageURL(pageURL);
		setCssClass(cssClass);
	}

	@Override
	public String toString() {
		/*
		 * <!-- <li><a href="#"><i class="fa fa-files-o fa-fw"></i> Sample Pages
		 * <span class="fa arrow"></span></a> <ul class="nav nav-second-level">
		  <li><a href="blank.html">Blank Page</a></li> <li><a
		  href="login.html">Login Page</a></li> </ul> /.nav-second-level</li>
		 * -->
		 */
		
		boolean hasSubMenu = (getSubMenus()!=null && getSubMenus().size() > 0);
		StringBuilder sb = new StringBuilder();

		sb.append("<li id=\"" + getId() + "\">");
		if (hasSubMenu) {
			sb.append("<li id=\"" + getId() + "\">");
			sb.append("<a href=\"#\">");
			sb.append(getName());
			sb.append("<span class=\"fa arrow\"></span></a>");
			sb.append("<ul class=\"nav nav-second-level\">");
			for(Menu m : getSubMenus()){
			sb.append("<li id=\""+m.getId()+"\">  <a href=\""+ m.getPageURL() +"\"><i class=\"" + m.getCssClass() + "\"></i>"+" "+m.getName()+"</a></li>");	
			}
			sb.append("</ul></li>");

		} else {
			sb.append("<li id=\"" + getId() + "\">");
			sb.append("<a href=\"" + getPageURL() + "\">");
			sb.append("<i class=\"" + getCssClass() + "\"></i> ");
			sb.append(getName());
			sb.append("</a></li>");
		}

		return sb.toString();

	}

}
