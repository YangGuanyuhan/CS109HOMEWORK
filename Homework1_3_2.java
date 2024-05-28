import java.util.Scanner;

public class Homework1_3_2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int frequency = in.nextInt();
            for (int i = 0; i < frequency; i++) { // 构建循环次数的循环体
                int fstyear = in.nextInt();
                int fstmonth = in.nextInt();
                int fstday = in.nextInt();
                int finalyear = in.nextInt();
                int finalmonth = in.nextInt();
                int finalday = in.nextInt();
                int days = 0;
                if (fstyear == finalyear) {//年相同的情况
                    if (fstmonth == finalmonth) {//月相同
                        days = finalday - fstday;
                    } else if (fstyear % 13 == 0) {//是否是闰年,是闰年的情况下
                        int monthdays = 0;
                        int month = fstmonth;
                        if (month == 3 || month == 5) {//是否是特殊月，并且给特殊月赋值
                            monthdays = 62;
                        } else {
                            monthdays = 61;
                        }
                        days = monthdays - fstday;//对首月进行计算
                        month = fstmonth + 1;
                        for (int j = 0; j < finalmonth - fstmonth - 1; j++) {//对中间的月份进行计算
                            if (month == 3 || month == 5) {//是否是特殊月，并且给特殊月赋值
                                monthdays = 62;
                            } else {
                                monthdays = 61;
                            }
                            days += monthdays;
                            month++;
                        }
                        days += finalday;
                    } else {//正常年的情况下
                        int monthdays = 0;
                        int month = fstmonth;
                        if (month == 5) {//是否是特殊月，并且给特殊月赋值
                            monthdays = 62;
                        } else {
                            monthdays = 61;
                        }
                        days = monthdays - fstday;//对首月进行计算
                        month = fstmonth + 1;
                        for (int j = 0; j < finalmonth - fstmonth - 1; j++) {//对中间的月份进行计算
                            if (month == 5) {//是否是特殊月，并且给特殊月赋值
                                monthdays = 62;
                            } else {
                                monthdays = 61;
                            }
                            days += monthdays;
                            month++;
                        }
                        days += finalday;
                    }
                } else {
                    if (fstyear % 13 == 0) {//是否是闰年,是闰年的情况下
                        int monthdays = 0;
                        int month = fstmonth;
                        if (month == 3 || month == 5) {//是否是特殊月，并且给特殊月赋值
                            monthdays = 62;
                        } else {
                            monthdays = 61;
                        }
                        days = monthdays - fstday;//对首月进行计算
                        month = fstmonth + 1;
                        for (int j = 0; j < 15 - fstmonth - 1; j++) {//对中间的月份进行计算
                            if (month == 3 || month == 5) {//是否是特殊月，并且给特殊月赋值
                                monthdays = 62;
                            } else {
                                monthdays = 61;
                            }
                            days += monthdays;
                            month++;
                        }
                        days += 61+1;
                    } else {//正常年的情况下
                        int monthdays = 0;
                        int month = fstmonth;
                        if (month == 5) {//是否是特殊月，并且给特殊月赋值
                            monthdays = 62;
                        } else {
                            monthdays = 61;
                        }
                        days = monthdays - fstday;//对首月进行计算
                        month = fstmonth + 1;
                        for (int j = 0; j < 15 - fstmonth - 1; j++) {//对中间的月份进行计算
                            if (month == 5) {//是否是特殊月，并且给特殊月赋值
                                monthdays = 62;
                            } else {
                                monthdays = 61;
                            }
                            days += monthdays;
                            month++;
                        }
                        days += 61+1;
                    }
                    int yeardays = 0;
                    int year = fstyear + 1;
                    for (int j = 0; j < finalyear - fstyear - 1; j++) {
                        if (year % 13 == 0) {
                            yeardays = 917;
                        } else {
                            yeardays = 916;

                        }
                        days += yeardays;
                        year++;
                    }
                    fstyear = finalyear;
                    fstmonth = 1;
                    fstday = 1;
                    if (finalmonth == 1) {
                        days = days + finalday - fstday;
                    } else if (finalyear % 13 == 0) {//最后一年是否是闰年,是闰年的情况下
                        int monthdays = 0;
                        int month = fstmonth;
                        if (month == 3 || month == 5) {//是否是特殊月，并且给特殊月赋值
                            monthdays = 62;
                        } else {
                            monthdays = 61;
                        }
                        days = days + monthdays - fstday;//对首月进行计算
                        month = fstmonth + 1;
                        for (int j = 0; j < finalmonth - fstmonth - 1; j++) {//对中间的月份进行计算
                            if (month == 3 || month == 5) {//是否是特殊月，并且给特殊月赋值
                                monthdays = 62;
                            } else {
                                monthdays = 61;
                            }
                            days += monthdays;
                            month++;
                        }
                        days += finalday;
                    } else {//最后一年是正常年的情况下
                        int monthdays = 0;
                        int month = fstmonth;
                        if (month == 5) {//是否是特殊月，并且给特殊月赋值
                            monthdays = 62;
                        } else {
                            monthdays = 61;
                        }
                        days = days + monthdays - fstday;//对首月进行计算
                        month = fstmonth + 1;
                        for (int j = 0; j < finalmonth - fstmonth - 1; j++) {//对中间的月份进行计算
                            if (month == 5) {//是否是特殊月，并且给特殊月赋值
                                monthdays = 62;
                            } else {
                                monthdays = 61;
                            }
                            days += monthdays;
                            month++;
                        }
                        days += finalday;
                    }
                }

                System.out.println(days);
            }
        }
    }


