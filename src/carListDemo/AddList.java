package carListDemo;

import java.util.*;

public class AddList {
    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<String>();
//        stringList.add("xiha");
//        stringList.add("luha");
//        stringList.add("���");
//        System.out.println(stringList);

        Map map = new HashMap();

        int count = 1;//����count
        Scanner sc = new Scanner(System.in);
        for (int in = 0; in < 3; in++) {
            System.out.println("������һ���ַ�");
            String one = sc.nextLine();

            if (in == 0){
                stringList.add(one);
                map.put(one,count);
            }

            else
                for (int i = 0; i < stringList.size(); i++) {
                    if (stringList.get(i).equals(one) == false) {
                        /**
                         * ����Ԫ��
                         *ȡԪ�����������ݱȽ��Ƿ����
                         * ��ǰ���������������ѭ��
                         * ֻ��ȫ���������������
                         */
                        if (i == stringList.size()-1){
                            stringList.add(one);
                            map.put(one,count);
                            break;
                        }else
                            continue;
                    } else {
                        /**
                         * ����������ӦԪ��+1
                         */
                        count += (int) map.get(one);
                        map.put(one, count);
                        count = 1;
                        break;
                    }

                }

        }

        //�鿴�������ݼ�����
        Iterator entries = map.entrySet().iterator();

        while (entries.hasNext()) {

            Map.Entry entry = (Map.Entry) entries.next();

            String key = (String)entry.getKey();

            Integer value = (Integer) entry.getValue();

            System.out.println("Key = " + key + ", Value = " + value);

        }
//        System.out.println(stringList);//�鿴list����Ԫ��


    }


}
