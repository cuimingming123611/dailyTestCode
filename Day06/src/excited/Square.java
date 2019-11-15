package excited;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:13:59 2019-11-15
 */
public class Square {
    public int method(int m ,int n){
        for (int i =0;i<m;i++){
            for (int j = 0;j<n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        return m * n;
    }
}
