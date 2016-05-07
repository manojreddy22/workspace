package homeworks;

import java.io.*;
public class Nukes {

	public static void main(String[] args) throws Exception{
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String input=bfr.readLine();
		System.out.println(input.substring(0,1)+input.substring(3,input.length()));
	}
}
