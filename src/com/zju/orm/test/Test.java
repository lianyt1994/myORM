package com.zju.orm.test;

import com.zju.orm.core.Query;
import com.zju.orm.core.QueryFactory;
import com.zju.orm.po.Emp;

import java.sql.Date;
import java.util.List;

/**
 * 客户端调用的测试类
 */
public class Test {
	public static void main(String[] args) {
		Query q = QueryFactory.createQuery();

		//增
		/*Emp emp = new Emp();
		emp.setId(4);
		emp.setBirthday(new Date(System.currentTimeMillis()));
		emp.setAge(42);
		q.insert(emp);*/

		//删
		/*Emp emp = new Emp();
		emp.setId(3);
		q.delete(emp);*/

		//改
		/*Emp emp = new Emp();
		emp.setId(1);
		emp.setBirthday(new Date(System.currentTimeMillis()));
		emp.setAge(49);
		q.update(emp,new String[]{"id","birthday","age"});*/

		//查
		Emp emp = (Emp)q.queryById(Emp.class, 2);
		System.out.println(emp.getId()+"--"+emp.getAge()+"--"+emp.getBirthday());


	}
}
