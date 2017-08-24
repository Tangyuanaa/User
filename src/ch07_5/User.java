/* JavaBean 是 Java Web 程序的重要组件， 它是一些封装了数据和操作的功能类，供Jsp和Servlet调用，完成数据封装和数据处理
 等功能。创建JavaBean时，需建立在web工程的源包“src”下，新建“class”文件。*/
/* User用于存放用户数据，且有一个实现验证信息的方法。boolean yanzheng_user(String xm2,String mm2)*/
package ch07_5;
import java.sql.*;
public class User {
	private String xm=null;
	private String mm=null;
	public String getXm(){return xm;}
	public void setXm(String xm){this.xm=xm;}
	public String getMm(){return mm;}
	public void setMm(String mm){this.mm=mm;}
	public User(){}
	public User(String a,String b){
		xm=a;
		mm=b;
		}
public boolean yanzheng_user(String xm2,String mm2) throws SQLException,ClassNotFoundException{
	boolean f=false;
	ConnectDbase cdb=new ConnectDbase();
	Connection conn=cdb.getConnect();//数据库连接接口Connection
	String sql="select * from user_b where(uname=? and upassword=?)";
	PreparedStatement pstmt=conn.prepareStatement(sql);//PreparedStatement是执行动态SQL语句的接口
	pstmt.setString(1,xm2);//为指定参数设置String型值
	pstmt.setString(2,mm2);
	ResultSet rs=pstmt.executeQuery();
	//访问结果集接口ResultSet；executeQuery()执行前面包含参数的动态select语句，并返回一个永远不为空的ResultSet实例。
	//ResultSet中next()方法，移动指针到下一行，指针最初位于第一行之前，第一次调用该方法将移动到第一行，
	//----如果存在下一行则返回true，否则返回false。
	if(rs.next())  f=true;
	else f=false;
	if(rs!=null) rs.close();//释放ResultSet实例占用的数据库和JDBC资源
	if(pstmt!=null) pstmt.close();//释放Statement实例占用的数据库和JDBC资源
	if(conn!=null) conn.close();//释放Connection实例占用的数据库和JDBC资源
	return f;
}

}
