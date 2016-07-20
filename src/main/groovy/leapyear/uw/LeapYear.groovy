package leapyear.uw
import java.time.LocalDateTime;

class LeapYear {

    boolean leapyear

    LeapYear()
    {
        this.ifLeapYear()
    }


    boolean isLeapYear(int year) {

        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            return true
        }
    }

    boolean ifLeapYear(){

        LocalDateTime cal = LocalDateTime.now();

        def yearNow = cal.getYear();

        //yearNow = 2017

        leapyear = isLeapYear(yearNow)

    }
}
