package testOne;

/**
 * @author 文档注释快捷键 Alt + Shift +J
 *
 */
public class exceptionDmeo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			new getArea(-4,3);
			
		} catch (noException e) {
			// TODO 自动生成的 catch 块
			System.out.println("请重新输入");
		}finally{
			System.out.println("over");
		}

	}

}
