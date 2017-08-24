/* JavaBean 是 Java Web 程序的重要组件， 它是一些封装了数据和操作的功能类，供Jsp和Servlet调用，完成数据封装和数据处理*
 等功能。创建JavaBean时，需建立在web工程的源包“src”下，新建“class”文件。*/
/* 建立ConnectDbase JavaBean，在该JavaBean中有方法Connection getConnect()得到一个连接对象。*/
package ch07_5;
import java.sql.*;

public class ConnectDbase {
private String driverName="com.mysql.jdbc.Driver";//驱动程序名
private String userName="root";//数据库用户名
private String userPwd="123234";//密码
private String dbName="user";//数据库名
public String getDriverName(){return driverName;}
public void setDriverName(String driverName){this.driverName=driverName;}
public String getUserName(){return userName;}
public void setUserName(String userName){this.userName=userName;}
public String getUserPwd(){return userPwd;}
public void setUserPwd(String userPwd){this.userPwd=userPwd;}
public String getDbName(){return dbName;}
public void setDbName(String dbName){this.dbName=dbName;}
//实现数据库连接的方法
public Connection getConnect() throws SQLException,ClassNotFoundException{
	String url1="jdbc:mysql://localhost:3306/"+dbName;
	String url2="?user="+userName+"&password="+userPwd;
	String url3="&useUnicode=true&characterEncoding=GB2312";
	String url=url1+url2+url3;//利用连接符号字URL实现连接并创建连接对象
	Class.forName(driverName);//mysql数据库驱动程序加载格式
	//DriverManager类提供了getConnection方法，用来建立与数据库的连接，调用getConnection()方法可返回一个数据库连接对象
	return DriverManager.getConnection(url);
	}
}