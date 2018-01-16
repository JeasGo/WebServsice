package cn.itcast.cxf.client;

import java.util.Collection;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;

import cn.itcast.cxf.server.domain.User;

public class CxfJaxrsClient {

	public static void main(String[] args) {
		User user=new User();
		user.setId(1);
		user.setUsername("Rose");
		user.setPassword("666");
		
		
		//保存
		//参数是资源地址
//		Response response = WebClient.create("http://127.0.0.1:8888/userService/users")
//		.type(MediaType.APPLICATION_JSON)//给服务端的类型：在服务端看来就是消费者类型
//		.post(user);//保存
//		System.out.println(response.getStatus());
		//修改
//		Response response = WebClient.create("http://127.0.0.1:8888/userService/users")
//				.type(MediaType.APPLICATION_JSON)//给服务端的类型：在服务端看来就是消费者类型
//				.put(user);//保存
//		System.out.println(response.getStatus());
		//删除
//		Response response = WebClient.create("http://127.0.0.1:8888/userService/users/1")
//				.type(MediaType.APPLICATION_JSON)//给服务端的类型：在服务端看来就是消费者类型
//				.delete();
//		System.out.println(response.getStatus());
		//查询所有
//		Collection<? extends User> collection = WebClient.create("http://127.0.0.1:8888/userService/users")
//		.accept(MediaType.APPLICATION_JSON)//向服务端说我要啥，你给啥：对应服务端生产者类型
//		.getCollection(User.class);//保存
//		System.out.println(collection);
		//根据id查询一个
		User u = WebClient.create("http://127.0.0.1:8888/userService/users/1")
		.type(MediaType.APPLICATION_JSON)//给服务端的类型：在服务端看来就是消费者类型
		.accept(MediaType.APPLICATION_JSON)//向服务端说我要啥，你给啥：对应服务端生产者类型
		.get(User.class);
		System.out.println(u);
		
		System.out.println("操作完成");
	}

}
