package com.zju.orm.core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 用来对得到的ResultSet进行封装
 */
public interface CallBack {
	Object doExecute(Connection conn, PreparedStatement ps, ResultSet rs);
}
