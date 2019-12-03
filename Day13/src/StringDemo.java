/**
 * @Author: MingmingCui
 * @Description: 获取某个字符串，在字符串中出现的次数
 * @Date:13:55 2019-12-02
 */
public class StringDemo {
    public static void main(String args[]) {
             String str="abkkcadklkabkebfkaabkskab";
             String sub = "ab";
        StringDemo stringDemo = new StringDemo();
        int count = stringDemo.getCount(str,sub);
        System.out.println(count);




    }

    public int getCount(String mainStr, String subStr) {
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index = 0;
        if (mainLength >= subLength) {
            //方式一：
           /*
           while ((index = mainStr.indexOf(subStr)) != -1) {
            count++;
            mainStr = mainStr.substring(index + subStr.length());
            }*/
           //方式二
            while ((index = mainStr.indexOf(subStr,index)) != -1){
                count++;
                index += subLength;
            }
        }
        return count;
    }
}

