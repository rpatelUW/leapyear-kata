package leapyear.uw.spec

import leapyear.uw.LeapYear
import spock.lang.Specification


class LeapYearSpec extends Specification {


    def "year 1996 is a leap year?"() {

        when:
            def yearTest = 1996;

        then:
            new LeapYear().isLeapYear(yearTest) == true;
    }

    def "year 2001 is not a leap year"() {

        when:
            def yearTest = 2001;

        then:
            new LeapYear().isLeapYear(yearTest) == false;
    }

    def "year 1900 is not a leap year"() {

        when:
        def yearTest = 1900;

        then:
        new LeapYear().isLeapYear(yearTest) == false;
    }

    def "year 2000 is a leap year"() {

        when:
            def yearTest = 2000;

        then:
            new LeapYear().isLeapYear(yearTest) == true;
    }

    def "this year is a leap year"() {

        expect:
            new LeapYear().leapyear == true;
    }

}
