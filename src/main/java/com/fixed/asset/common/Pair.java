package com.fixed.asset.common;

/**
 * 
* @ClassName: Pair 
* @Description: Pair数据类型，便于绑定成对出现的对象
* @author xinjun.zhang
* @date 2016年10月17日 上午9:18:27 
* 
* @param <T>
* @param <N>
 */
public class Pair<T,N> {
	private T first;
	private N second;
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first = first;
	}
	public N getSecond() {
		return second;
	}
	public void setSecond(N second) {
		this.second = second;
	}
	public Pair(T first, N second) {
		super();
		this.first = first;
		this.second = second;
	}
	
	
}
