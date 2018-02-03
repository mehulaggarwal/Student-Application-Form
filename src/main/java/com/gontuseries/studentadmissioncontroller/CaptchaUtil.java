package com.gontuseries.studentadmissioncontroller;

import java.util.Random;

public class CaptchaUtil {
  public static String generateCaptchaTextMethod1(){
	  Random rnd=new Random();
	  int rl=rnd.nextInt();
	  String hash1=Integer.toHexString(rl);
	  return hash1;
  }
  public static String generateCaptchaTextMethod2(int captchaLength){
	  String saltChars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	  StringBuffer captchastrbuffer=new StringBuffer();
	  Random rnd=new Random();
	  while(captchastrbuffer.length()<captchaLength)
	  {
		  int index=(int)(rnd.nextFloat()*saltChars.length());
		  captchastrbuffer.append(saltChars.substring(index,index+1));
	  }
	  return captchastrbuffer.toString();
  }
}
