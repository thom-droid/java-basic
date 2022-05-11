package classes;

public class LocalClassExample {

    public String title;

    public static String computeAndReturnPeriod(String startYear, String endYear) {
        String year = startYear + endYear;

        class Period {
            public final String startYear;

            public Period(String startYear) {
                this.startYear = startYear;
            }
        }

        Period period = new Period(year);

        return period.startYear;

    }


}
