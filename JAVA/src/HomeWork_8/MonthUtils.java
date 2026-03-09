package HomeWork_8;

public class MonthUtils {

    static Month makeMonth(String name, int days, int workDays) {
        Month month = new Month();
        month.name = name;
        month.days = days;
        month.workDays = workDays;
        return month;
    }


    public static final Month JANUARY = makeMonth("January", 31, 15);
    public static final Month FEBRUARY = makeMonth("February", 28, 19);
    public static final Month MARCH = makeMonth("MARCH", 31, 21);
    public static final Month APRIL = makeMonth("APRIL", 30, 22);
    public static final Month MAY = makeMonth("MAY", 31, 19);
    public static final Month JUNE = makeMonth("JUNE", 30, 21);
    public static final Month JULI = makeMonth("JULY", 31, 23);
    public static final Month AUGUST = makeMonth("AUGUST", 31, 21);
    public static final Month SEPTEMBER = makeMonth("SEPTEMBER", 30, 22);
    public static final Month OCTOBER = makeMonth("OCTOBER", 31, 21);
    public static final Month NOVEMBER = makeMonth("NOVEMBER", 30, 20);
    public static final Month DECEMBER = makeMonth("DECEMBER", 30, 22);


    public static Month[] YEAR = {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULI, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
    public static Month[] Qvr_1 = {JANUARY, FEBRUARY, MARCH};



}








