package preparedstatement;

import util.updateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: CuiMingming
 * @Description:
 * @date: 2020-01-08 17:21
 */
public class UpdateTest {
    public static void main(String args[]) {
        /*String sql = "delete from customers where id = ?";
        boolean b = updateUtil.update(sql, 55);
        if (b) {
            System.out.println("更新成功");
        } else {
            System.out.println("更新失败");
        }*/



        String sql2 = "update customers set name = ?,email = ?,birth = ? where id = ?";
        Date date = null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            date = simpleDateFormat.parse("2019-01-01");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        boolean b1 = updateUtil.update(sql2, "崔明明", "cuimingming@qq.com", new Date(date.getTime()), 5);
        if (b1){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }
}
