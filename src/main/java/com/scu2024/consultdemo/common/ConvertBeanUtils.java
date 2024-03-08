package com.scu2024.consultdemo.common;

import org.springframework.beans.BeanInstantiationException;
import org.springframework.beans.BeanUtils;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-05 14:35
 **/
public class ConvertBeanUtils {
	public static <T> T convert(Object source, Class<T> targetClass){
		if(source == null) return null;
		T t = newInstance(targetClass);
		BeanUtils.copyProperties(source, t);
		return t;
	}
	private static <T> T newInstance(Class<T> targetClass) {
		try {
			return targetClass.newInstance();
		} catch (Exception e) {
			throw new BeanInstantiationException(targetClass, "instantiation error", e);
		}
	}
	public static <K, T> List<T> convertList(List<K> sourceList, Class<T> targetClass) {
		if (sourceList == null) {
			return null;
		}
		List targetList = new ArrayList((int)(sourceList.size()/0.75) + 1);
		for (K source : sourceList) {
			targetList.add(convert(source, targetClass));
		}
		return targetList;
	}
}
