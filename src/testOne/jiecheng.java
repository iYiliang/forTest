package testOne;
import java.io.*;
public class jiecheng {

	public static void main(String[] args) {
		int num;
		String st;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.print("请输入数字:") ;
			try
				{
					st=br.readLine() ;
					num=Integer.parseInt(st) ;
					break ;
				}
			catch(Exception e)
			{
			System.out.println("只能输入整数") ;
			}
			}
			System.out.println("你输入的整数是:"+num) ;
			}


	}

