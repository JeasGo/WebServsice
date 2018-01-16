package cn.itcast.cxf.server.publish;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import cn.itcast.cxf.server.domain.User;
import cn.itcast.cxf.server.service.UserServiceImpl;

public class CxfJaxrsServer {

	public static void main(String[] args) {
		//第一步：创建服务工厂
		JAXRSServerFactoryBean serverFactory=new JAXRSServerFactoryBean();
		//第二步：设置属性
		//服务地址
		serverFactory.setAddress("http://127.0.0.1:8888/userService");
		//实现对象
		serverFactory.setServiceBean(new UserServiceImpl());
		//设置资源类型：作用是cxf会自动将json或xml数据反序列化成java对象的类型。
		serverFactory.setResourceClasses(User.class);
		
		//第三步：创建并发布服务
		serverFactory.create();
		System.out.println("服务发布成功！");

	}

}
