package model;

public enum Status {
    DIRECTOR,
    HEADTEACHER,
    TEACHER,
    NANNY;

    public static Status getStatus(String st){
        switch (st){
            case("DIRECTOR"):return DIRECTOR;
            case("HEADTEACHER"):return HEADTEACHER;
            case("TEACHER"):return TEACHER;
            case("NANNY"):return NANNY;
            default: return null;
        }
    }
}
