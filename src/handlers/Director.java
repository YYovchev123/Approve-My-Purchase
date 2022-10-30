package handlers;

import common.Type;
import util.PersonApprover;

import static constant.Constant.DIRECTOR_APPROVAL;
import static constant.Constant.DIRECTOR_NOT_APPROVAL;

public class Director extends Approver {

    @Override
    public void approve(int id, double cost, Type type) {
        if (canApprove(cost, type)) {
            System.out.printf((DIRECTOR_APPROVAL) + "%n", id, cost);
            return;
        }
        System.out.printf((DIRECTOR_NOT_APPROVAL) + "%n", id);
    }

    @Override
    protected boolean canApprove(double cost, Type type) {
        return PersonApprover.canApproveDirector(cost, type);
    }
}
