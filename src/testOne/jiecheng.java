package testOne;
import java.io.*;
public class jiecheng {

	public static void main(String[] args) {
		int num;
		String st;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.print("����������:") ;
			try
				{
					st=br.readLine() ;
					num=Integer.parseInt(st) ;
					break ;
				}
			catch(Exception e)
			{
			System.out.println("ֻ����������") ;
			}
			}
			System.out.println("�������������:"+num) ;
			}


	}

