package utils;

import java.util.UUID;

public class UUIDString {
	/**
	 * 生成uuid
	 *
	 * @Title: create 
	 * @return
	 * @return: String
	 */
	public static String create(){
		UUID uuid=UUID.randomUUID();
		return uuid.toString();
	}
}
