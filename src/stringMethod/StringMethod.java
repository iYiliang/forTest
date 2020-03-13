package stringMethod;

public class StringMethod {
	public static void sop(Object obj) {
		System.out.println(obj);
	}


	public static void get() {
		String s1 = "中秋快乐";
		sop(s1);
		sop(s1.length());
		String s2 = "AllenKerwin";
		int s2_1 = s2.indexOf('l');//根据指定字符获取该字符第一次索引位置int indexOf(int ch)
		sop(s2_1);
		char s2_2 = s2.charAt(8);//返回指定位置上的字符 char charAt(int index)
		sop(s2_2);
		int s2_3 = s2.indexOf('e', 4);//int indexOf(int ch,int fromIndex)从指定位置算，返回指定字符的角标
		sop(s2_3);
//		int s2_4 = s2.indexOf("win");//int intdexOf(String str) 返回字符串的第一个字符的位置
		sop(s2.indexOf("win"));
	}
	
	public static void decide() {
		String s = "lubaocheng";
		sop(s.concat("bao"));
		sop(s.isEmpty());
		sop(s.startsWith("lu"));
		sop(s.endsWith("cheng"));
		sop(s.equals("luyiliang"));
		sop(s.equalsIgnoreCase("LuBaoCheng"));
		
	}
	public static void trans() {
		char[] ch = {'每','逢','佳','节','倍','思','亲'};
		String str = new String(ch);
		sop(str);
		String s = new String(ch,4,3);
		sop(s);
		String st = "xixihaha";
		char[] c = st.toCharArray();
		for(int i = 0;i<c.length;i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		
	}
	public static void replace() {
		String s = "每逢佳节倍思亲";
		sop(s.replace("亲", "我"));
		String str = "zhangsan,lisi,wangwu";
		String[] arr = str.split(",");
		for(int i =0;i<arr.length;i++) {
			sop(arr[i]);
		}
		String sub = new String(s.substring(3)); 
		sop(sub);
		
	}
	public static void zonghe() {
		String s = "   Allen Kerwin   ";
		sop(s.toUpperCase());
		sop(s.toLowerCase());
		sop(s.trim());
		String st = "allen";
		String str = "alan";
		int i = st.compareTo(str);
		sop(i);
		
	}
}
