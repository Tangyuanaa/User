/* JavaBean �� Java Web �������Ҫ����� ����һЩ��װ�����ݺͲ����Ĺ����࣬��Jsp��Servlet���ã�������ݷ�װ�����ݴ���*
 �ȹ��ܡ�����JavaBeanʱ���轨����web���̵�Դ����src���£��½���class���ļ���*/
/* ����ConnectDbase JavaBean���ڸ�JavaBean���з���Connection getConnect()�õ�һ�����Ӷ���*/
package ch07_5;
import java.sql.*;

public class ConnectDbase {
private String driverName="com.mysql.jdbc.Driver";//����������
private String userName="root";//���ݿ��û���
private String userPwd="123234";//����
private String dbName="user";//���ݿ���
public String getDriverName(){return driverName;}
public void setDriverName(String driverName){this.driverName=driverName;}
public String getUserName(){return userName;}
public void setUserName(String userName){this.userName=userName;}
public String getUserPwd(){return userPwd;}
public void setUserPwd(String userPwd){this.userPwd=userPwd;}
public String getDbName(){return dbName;}
public void setDbName(String dbName){this.dbName=dbName;}
//ʵ�����ݿ����ӵķ���
public Connection getConnect() throws SQLException,ClassNotFoundException{
	String url1="jdbc:mysql://localhost:3306/"+dbName;
	String url2="?user="+userName+"&password="+userPwd;
	String url3="&useUnicode=true&characterEncoding=GB2312";
	String url=url1+url2+url3;//�������ӷ�����URLʵ�����Ӳ��������Ӷ���
	Class.forName(driverName);//mysql���ݿ�����������ظ�ʽ
	//DriverManager���ṩ��getConnection�������������������ݿ�����ӣ�����getConnection()�����ɷ���һ�����ݿ����Ӷ���
	return DriverManager.getConnection(url);
	}
}