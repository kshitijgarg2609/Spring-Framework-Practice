package com.kgprojects.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class InjectCollections
{
	private List<String> list;
	private Set<String> set;
	private Map<String,String> map;
	private Properties prop;
	public InjectCollections()
	{
		super();
	}
	public InjectCollections(List<String> list, Set<String> set, Map<String, String> map, Properties prop) {
		super();
		this.list = list;
		this.set = set;
		this.map = map;
		this.prop = prop;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	@Override
	public String toString() {
		return "InjectCollections [list=" + list + ", set=" + set + ", map=" + map + ", prop=" + prop + "]";
	}
}
