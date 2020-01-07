public class Problem3Class {
    public static void main(String[] args) {
        Problem3Class problem3 = new Problem3Class();
        int month = 1;
        int day = 1;
        int year = 2100;
        int result = problem3.calcPrevDayNum(month, day, year);
        System.out.println(result);
    }
    public int calcPrevDayNum (int month, int day, int year) {
        int result=0, daysIn[] = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30};

        if (month<2 && day<2)
            result = (((year-1)%4!=0) || (((year-1)%100==0) && ((year-1)%400!=0))) ? 365:366;

        else {
            daysIn[1] = ((year%4!=0) || ((year%100==0) && (year%400!=0))) ? 28:29;

            for (int i=0;i<month-1;i++)
                result+=daysIn[i];
            result+=day-1;
        }
        return result;
    }
}
