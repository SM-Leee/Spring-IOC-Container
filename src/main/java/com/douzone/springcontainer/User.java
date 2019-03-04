package com.douzone.springcontainer;

import java.util.List;

public class User {
	private Long no;
	private Friend friend;
	private String name = "이성민";
	private List<String> friends;
	
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public User() {
		
	}
	public User(String name) {
		this.name = name;
	}
	public User(Long no,String name) {
		this.name = name;
		this.no = no;
	}
	
	public Friend getFriend() {
		return friend;
	}
	public void setFriend(Friend friend) {
		this.friend = friend;
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [no=" + no + ", friend=" + friend + ", name=" + name + ", friends=" + friends + "]";
	}
	
	
	
	
}
