package com.kgprojects.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DRef
{
	@Value("#{obj}")
	private ComponentBean cb;

	public DRef(ComponentBean cb) {
		super();
		this.cb = cb;
	}

	public ComponentBean getCb() {
		return cb;
	}

	public void setCb(ComponentBean cb) {
		this.cb = cb;
	}

	@Override
	public String toString() {
		return "DRef [cb=" + cb + "]";
	}
}
