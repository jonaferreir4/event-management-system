package core.Utils;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Data inválida.");
        }
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    
    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    
    // verificar se a data é válida
    public boolean isValidDate(int day, int month, int year) {
        if (year < 1000 || year > 9999 || month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }

        String dateStr = String.format("%02d/%02d/%04d", day, month, year);
        if (!dateStr.matches("\\d{2}/\\d{2}/\\d{4}")) {
            return false;
        }

        int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear(year)) {
            return day <= 29;
        } else {
            return day <= daysPerMonth[month];
        }
    }

    // verificar se é um ano bissexto
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // converter a data para String na formatação correta
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
