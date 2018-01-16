package cn.itcast.cxf.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

//sei的接口：用来暴露类和方法出去-
@WebService//WebService的标识
public interface MobileAddressService {
	
	/**
	 * 
	 * 说明：根据手机号码查询归属地信息
	 * @param mobileNo
	 * @return
	 * @author 传智.BoBo老师
	 * @time：2017年11月30日 下午2:55:19
	 */
	@WebMethod//该注解可以省略
	public String getAddressByMobileNo(String mobileNo);

}
