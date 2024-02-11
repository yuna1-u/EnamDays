public enum Day {
    MONDAY {
        @Override
        public void method() {
            System.out.println("В понедельник урок джава");

        }
    },
    TUESDAY {
        @Override
        public void method() {
            System.out.println("Во вторник урок английского ");

        }
    },
    WEDNESDAY {
        @Override
        public void method() {
            System.out.println("В среду урок джава скрипт");

        }
    },
    THURSDAY {
        @Override
        public void method() {
            System.out.println("В четверг урок испанского");

        }
    },
    FRIDAY {
        @Override
        public void method() {
            System.out.println("В пятницу урок французского");

        }
    },
    SATURDAY {
        @Override
        public void method() {
            System.out.println("В субботу урок русского");

        }
    },
    SUNDAY {
        @Override
        public void method() {
            System.out.println("В воскресенье урок кыргызского");

        }
    };

    public abstract void method();

    public static void dayMethod(Day day) {

        if (day.equals(MONDAY)) {
            MONDAY.method();
        } else if (day.equals(TUESDAY)) {
            TUESDAY.method();
        } else if (day.equals(WEDNESDAY)) {
            WEDNESDAY.method();
        } else if (day.equals(THURSDAY)) {
            THURSDAY.method();
        } else if (day.equals(FRIDAY)) {
            FRIDAY.method();
        } else if (day.equals(SATURDAY)) {
            SATURDAY.method();
        } else if (day.equals(SUNDAY)) {
            SUNDAY.method();
        }
    }
}
