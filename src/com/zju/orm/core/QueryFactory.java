package com.zju.orm.core;

/**
 * 创建Query对象的工厂类
 */
public class QueryFactory {
	
	private static Query prototypeObj;  //原型对象
	static {
		try {
			String queryClass = DBManager.getConf().getQueryClass();
			Class c = Class.forName(queryClass);  ////加载指定的query类
			prototypeObj = (Query) c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		TableContext.loadPOTables();
	}
	
	private QueryFactory(){
	}
	
	
	public static Query createQuery(){
		try {
			return (Query) prototypeObj.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
