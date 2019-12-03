/**
 * @Author: MingmingCui
 * @Description:   查找最大的相同字符串（目前只支持只有一个最大的相同字符串）
 * @Date:14:24 2019-12-02
 */
public class StringDemo2 {
    public static void main(String args[]) {
        String string1 = "abcwerhelloyuioaefabce";
        String string2 = "hellouab";
        StringDemo2 stringDemo2 = new StringDemo2();
        String maxSameString = stringDemo2.getMaxSameString(string1, string2);
        System.out.println(maxSameString);

    }

    public String getMaxSameString(String str1, String str2) {
        if (str1 != null && str2 != null) {
            String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
            String minStr = (str1.length() < str2.length()) ? str1 : str2;
            int length = minStr.length();
            for (int i = 0; i < length; i++) {

                for (int x = 0, y = length - i; y <= length; x++, y++) {
                    String substring = minStr.substring(x, y);
                    if (maxStr.contains(substring)) {
                        return substring;
                    }
                }
            }

        }
        return null;
    }

}
