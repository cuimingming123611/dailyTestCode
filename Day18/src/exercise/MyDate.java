package exercise;

/**
 * @author: CuiMingming
 * @Description:
 * @date: 2019-12-06 14:19
 */
public class MyDate implements Comparable{
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        MyDate myDate = (MyDate) o;
        int minusYear = this.getYear() - myDate.getYear();
        if (minusYear != 0){
            return minusYear;
        }
        //比较月
        int minusMonth = this.getMonth() - myDate.getMonth();
        if (minusMonth != 0){
            return minusMonth;

        }
        //比较日
        return this.getDay() - myDate.getDay();
    }

}
