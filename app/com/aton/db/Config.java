package com.aton.db;

import org.apache.commons.lang.StringUtils;

import play.Play;

public class Config {
	public static String getProperty(String key) {
		return getProperty(key, StringUtils.EMPTY);
	}

	public static String getProperty(String key, String defaultValue) {
		return Play.configuration.getProperty(key, defaultValue);
	}
}
