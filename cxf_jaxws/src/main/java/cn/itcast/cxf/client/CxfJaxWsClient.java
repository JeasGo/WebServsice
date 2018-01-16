package cn.itcast.cxf.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import cn.itcast.cxf.client.stub.MobileAddressService;

public class CxfJaxWsClient {

	public static void main(String[] args) {
		//第一步：创建cxf的本地代理工厂
		JaxWsProxyFactoryBean proxyFactory=new JaxWsProxyFactoryBean();
		//第二步：设置两个属性
		//访问的webservice的服务地址
		proxyFactory.setAddress("http://127.0.0.1:8888/mobile");
		//设置接口类型
		proxyFactory.setServiceClass(MobileAddressService.class);
		//第三步：创建本地代理对象（桩）
		MobileAddressService ma=(MobileAddressService)proxyFactory.create();
		//调用方法获取数据
		String address=ma.getAddressByMobileNo("18516566511");
		System.out.println(address);
	}

}
