package kr.co.hyh.vo;

// myBatis���� �ʿ������

public class SQL {
	public static final String insert = "INSERT INTO `USER` SET uid=?, name=?, hp=?, addr=?, pos=?, dep=?, rdate=NOW()";
	public static final String select_list = "SELECT * FROM `USER`";
	public static final String select_one = "SELECT * FROM `USER` WHERE uid=?";
}
