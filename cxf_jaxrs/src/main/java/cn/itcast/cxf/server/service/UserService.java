package cn.itcast.cxf.server.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cn.itcast.cxf.server.domain.User;

//sei接口：暴露出去
public interface UserService {
	/**
	 * 
	 * 说明：保存
	 * @param user
	 * @author 传智.BoBo老师
	 * @time：2017年11月30日 下午5:47:03
	 */
	@Path("/users")//资源URI
	@POST//保存
	//消费者类型：
	//允许客户端发送过来的数据的类型（表述形式）：通常是xml或json，一般服务端写的广一点。这里写两个说明服务端即能接收xml格式，也能接收json格式。
	//什么是消费者：调用接口的一方
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public void save(User user);
	/**
	 * 
	 * 说明：更新
	 * @param user
	 * @author 传智.BoBo老师
	 * @time：2017年11月30日 下午5:47:32
	 */
	@Path("/users")//资源URI
	@PUT//更新
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public void update(User user);
	/**
	 * 
	 * 说明：删除用户
	 * @param id
	 * @author 传智.BoBo老师
	 * @time：2017年11月30日 下午5:47:50
	 */
	@Path("/users/{id}")//比如访问/users/1,那么@PathParam注解就可以根据占位符的名字获取占位符的值
	@DELETE//删除
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public void delete(@PathParam("id")Integer id);
	
	/**
	 * 
	 * 说明：查询所有
	 * @return
	 * @author 传智.BoBo老师
	 * @time：2017年11月30日 下午5:48:45
	 */
	@Path("/users")
	@GET//查询
	//生产者：服务端，它是服务的提供者！
	//生产者类型：服务端能客户端类型
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<User> findAll();
	
	/**
	 * 
	 * 说明：根据id查询一个
	 * @param id
	 * @return
	 * @author 传智.BoBo老师
	 * @time：2017年11月30日 下午5:49:19
	 */
	@Path("/users/{id}")
	@GET//查询
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})//消费者类型
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})//生产者类型
	public User findById(@PathParam("id")Integer id);
	
}
