package kr.co.hyh.vo;

// myBatis에서 필요없어짐

public class SQL {
	public static final String insert = "INSERT INTO `USER` SET uid=?, name=?, hp=?, addr=?, pos=?, dep=?, rdate=NOW()";
	public static final String select_list = "SELECT * FROM `USER`";
	public static final String select_one = "SELECT * FROM `USER` WHERE uid=?";
}
