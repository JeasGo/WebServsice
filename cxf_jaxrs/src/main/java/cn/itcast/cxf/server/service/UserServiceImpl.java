package cn.itcast.cxf.server.service;

import java.util.ArrayList;
import java.util.List;

import cn.itcast.cxf.server.domain.User;
//sei的实现处理
public class UserServiceImpl implements UserService{

	@Override
	public void save(User user) {
		System.out.println("保存了："+user);
	}

	@Override
	public void update(User user) {
		System.out.println("更新了："+user);
	}

	@Override
	public void delete(Integer id) {
		System.out.println("删除了id："+id);
	}

	@Override
	public List<User> findAll() {
		System.out.println("服务端查询所有了。。。");
		List<User> userList=new ArrayList<>();
		userList.add(new User(1, "Rose", "666"));
		userList.add(new User(2, "Jack", "666"));
		userList.add(new User(3, "小明", "666"));
		userList.add(new User(4, "小红", "666"));
		return userList;
	}

	@Override
	public User findById(Integer id) {
		System.out.println("服务端查询的id是："+id);
		return new User(1, "Rose", "666");
	}

}
