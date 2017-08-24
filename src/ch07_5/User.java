/* JavaBean �� Java Web �������Ҫ����� ����һЩ��װ�����ݺͲ����Ĺ����࣬��Jsp��Servlet���ã�������ݷ�װ�����ݴ���
 �ȹ��ܡ�����JavaBeanʱ���轨����web���̵�Դ����src���£��½���class���ļ���*/
/* User���ڴ���û����ݣ�����һ��ʵ����֤��Ϣ�ķ�����boolean yanzheng_user(String xm2,String mm2)*/
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
	Connection conn=cdb.getConnect();//���ݿ����ӽӿ�Connection
	String sql="select * from user_b where(uname=? and upassword=?)";
	PreparedStatement pstmt=conn.prepareStatement(sql);//PreparedStatement��ִ�ж�̬SQL���Ľӿ�
	pstmt.setString(1,xm2);//Ϊָ����������String��ֵ
	pstmt.setString(2,mm2);
	ResultSet rs=pstmt.executeQuery();
	//���ʽ�����ӿ�ResultSet��executeQuery()ִ��ǰ����������Ķ�̬select��䣬������һ����Զ��Ϊ�յ�ResultSetʵ����
	//ResultSet��next()�������ƶ�ָ�뵽��һ�У�ָ�����λ�ڵ�һ��֮ǰ����һ�ε��ø÷������ƶ�����һ�У�
	//----���������һ���򷵻�true�����򷵻�false��
	if(rs.next())  f=true;
	else f=false;
	if(rs!=null) rs.close();//�ͷ�ResultSetʵ��ռ�õ����ݿ��JDBC��Դ
	if(pstmt!=null) pstmt.close();//�ͷ�Statementʵ��ռ�õ����ݿ��JDBC��Դ
	if(conn!=null) conn.close();//�ͷ�Connectionʵ��ռ�õ����ݿ��JDBC��Դ
	return f;
}

}
