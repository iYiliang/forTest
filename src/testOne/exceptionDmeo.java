package testOne;

/**
 * @author �ĵ�ע�Ϳ�ݼ� Alt + Shift +J
 *
 */
public class exceptionDmeo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try {
			new getArea(-4,3);
			
		} catch (noException e) {
			// TODO �Զ����ɵ� catch ��
			System.out.println("����������");
		}finally{
			System.out.println("over");
		}

	}

}
