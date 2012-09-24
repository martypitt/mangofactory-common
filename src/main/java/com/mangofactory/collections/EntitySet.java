package com.mangofactory.collections;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EntitySet<T extends Identifiable<PK>,PK extends Serializable> implements Iterable<T>{
	private final Map<PK,T> map;
	public EntitySet(Iterable<T> source)
	{
		map = new HashMap<PK,T>();
		for (T t : source) {
			PK key = t.getKey();
			map.put(key, t);
		}
	}
	public boolean contains(PK key)
	{
		return map.containsKey(key);
	}
	public T get(PK key)
	{
		return map.get(key);
	}
	public Iterator<T> iterator() {
		return map.values().iterator();
	}
}
