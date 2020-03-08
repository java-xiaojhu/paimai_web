package com.example.demo.util;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 
 * @ClassName Cache
 * @description 队列缓存
 * @author sye
 * @date 2016-12-14
 * @version V1.0
 */
public class Cache {

	private ArrayBlockingQueue<String> data = new ArrayBlockingQueue<String>(5);// 数组阻塞队列【线程安全】

	public Integer size() {
		return data.size();
	}

	/**
	 * 
	 * @title: get
	 * @description: 获得一个订单ID
	 * @return
	 */
	public String get() {
		try {
			return data.take();// 获得队列头部数据
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 
	 * @title: save
	 * @description: 保存一个订单ID
	 * @param id
	 */
	public void save(String oid) {
		try {
			data.put(oid);// 放入队列
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
