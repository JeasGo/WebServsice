package cn.itcast.cxf.server.domain;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement//REST资源注解，jax-rs规范会要求框架对该类型的对象进行表述性转换
/*一个表述性对象
 * xml：<user><id>1</id><xxx...</user>
 * json:{"user":{"id":1,x....}}
 * 类名默认第一个字母小写，然后放到元素名字
 * 也可以自定义
 * 比如：UserManager----自定义为usermanager
 */
@XmlRootElement(name="user")
public class User {
	private Integer id;
	private String username;
	private String password;
	
	public User() {
	}
	
	public User(Integer id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

	
	
}
