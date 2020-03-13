package carListDemo;

import java.util.*;

public class AddList {
    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<String>();
//        stringList.add("xiha");
//        stringList.add("luha");
//        stringList.add("你猜");
//        System.out.println(stringList);

        Map map = new HashMap();

        int count = 1;//定义count
        Scanner sc = new Scanner(System.in);
        for (int in = 0; in < 3; in++) {
            System.out.println("请输入一个字符");
            String one = sc.nextLine();

            if (in == 0){
                stringList.add(one);
                map.put(one,count);
            }

            else
                for (int i = 0; i < stringList.size(); i++) {
                    if (stringList.get(i).equals(one) == false) {
                        /**
                         * 遍历元素
                         *取元素与输入数据比较是否相等
                         * 当前不相等则跳出当次循环
                         * 只到全部不等则添加数据
                         */
                        if (i == stringList.size()-1){
                            stringList.add(one);
                            map.put(one,count);
                            break;
                        }else
                            continue;
                    } else {
                        /**
                         * 发现相等则对应元素+1
                         */
                        count += (int) map.get(one);
                        map.put(one, count);
                        count = 1;
                        break;
                    }

                }

        }

        //查看所有内容及数量
        Iterator entries = map.entrySet().iterator();

        while (entries.hasNext()) {

            Map.Entry entry = (Map.Entry) entries.next();

            String key = (String)entry.getKey();

            Integer value = (Integer) entry.getValue();

            System.out.println("Key = " + key + ", Value = " + value);

        }
//        System.out.println(stringList);//查看list集合元素


    }


}
