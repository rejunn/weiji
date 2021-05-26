package utils;

import play.libs.Codec;
import models.User;

public class ValidatePassword {
	public static boolean isPassword(User newuser,User user){
		String password=Codec.hexMD5(newuser.password+user.salt);
		if(password.equals(user.password)){
			return true;
		}
		return false;
	}
}
