package cn.itcast.cxf.server;
//sei的实现：用于处理客户端发过来的请求数据，处理数据后，给客户端响应
public class MobileAddressServiceImpl implements MobileAddressService{

	@Override
	//参数：客户端传递过来的值
	//返回：给客户端都额响应的内容
	public String getAddressByMobileNo(String mobileNo) {
		//调用dao，到服务端自己数据库中查询归属地信息。
		String result=mobileNo+"的归属地信息是：上海";
		
		return result;
	}

}
