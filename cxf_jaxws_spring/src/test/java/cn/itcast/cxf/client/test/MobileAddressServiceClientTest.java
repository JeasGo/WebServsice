package cn.itcast.cxf.client.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.cxf.client.stub.MobileAddressService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:client-beans.xml"})
public class MobileAddressServiceClientTest {
	//注入要测试的bean
	@Autowired
	private MobileAddressService mobileAddressService;
	
	@Test
	public void test(){
		String address = mobileAddressService.getAddressByMobileNo("18516566511");
		System.out.println(address);
	}
}
