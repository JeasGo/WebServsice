package cn.itcast.cxf.server;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class CxfJaxWsServer {

	public static void main(String[] args) {
		//目标：发布WebService的服务
		//第一步：创建cxf中的服务器工厂
		JaxWsServerFactoryBean serverFactory=new JaxWsServerFactoryBean();
		
		//第二步：在工厂上设置几个属性
		//暴露出去的接口的方法等
		serverFactory.setServiceClass(MobileAddressService.class);
		//设置处理服务端逻辑的实现对象
		serverFactory.setServiceBean(new MobileAddressServiceImpl());
		//设置发布的服务地址
		//协议+ip+端口+服务名字
		serverFactory.setAddress("http://127.0.0.1:8888/mobile");
		
		//第三步：创建并发布服务
		serverFactory.create();
		System.out.println("WebService服务发布成功！");

	}

}
