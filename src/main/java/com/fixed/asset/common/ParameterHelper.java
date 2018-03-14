package com.fixed.asset.common;

import java.util.HashMap;
import java.util.Map;
/**
 * 
* @ClassName: ParameterHelper 
* @Description: 参数辅助类
* @author xinjun.zhang
* @date 2016年10月18日 下午2:25:18 
*
 */
public class ParameterHelper {
	
	/**
	 * 
	* @Title: generateParameters 
	* @Description: ParameterHelper.generateParameters(new Pair<String,Integer>("size",100) ... ); 
	* @param @param objects
	* @param @return    设定文件 
	* @return Map<String,Object>    返回类型 
	* @throws
	 */
	@SafeVarargs
	public static Map<String,Object> generateParameters(Pair<String,Object> ... objects ){
		Map<String,Object> map = new HashMap<String,Object>();
		for(Pair<String,Object> obj : objects){
			map.put(obj.getFirst(), obj.getSecond());
		}
		return map;
	}
}
