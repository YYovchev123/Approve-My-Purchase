package handlers;

import common.Type;

public class ExecutiveMeeting extends Approver {
    private static final ExecutiveMeeting INSTANCE = new ExecutiveMeeting();

    public static ExecutiveMeeting getInstance() {
        return INSTANCE;
    }

    @Override
    public void approve(int id, double cost, Type type) {

        System.out.println("Purchase with id " + id + " that costs " + cost + " requires an approval of executive meeting.");
    }

    @Override
    protected boolean canApprove(double cost, Type type) {
        return false;
    }
}
