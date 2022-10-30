package constant;

public class Constant {

    //Constants for approval
    public static final String DIRECTOR_APPROVAL = "Director approved purchase with id: %d that costs: %s.";
    public static final String MANAGER_APPROVAL = "Manager approved purchase with id: %d that costs: %s.";
    public static final String PRESIDENT_APPROVAL = "President approved purchase with id: %d that costs: %s.";
    public static final String VICE_PRESIDENT_APPROVAL = "Vice President approved purchase with id: %d that costs: %s.";

    //Constants for not approval
    public static final String DIRECTOR_NOT_APPROVAL = "Purchase with id: %d needs approval from higher position than Director.";
    public static final String MANAGER_NOT_APPROVAL = "Purchase with id: %d needs approval from higher position than Manager.";
    public static final String PRESIDENT_NOT_APPROVAL = "Purchase with id: %d needs approval from higher position than President.";
    public static final String VICE_PRESIDENT_NOT_APPROVAL = "Purchase with id: %d needs approval from higher position than Vice President.";
}
