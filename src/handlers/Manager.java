package handlers;

import common.Type;
import util.PersonApprover;

import static constant.Constant.*;

public class Manager extends Approver {
    @Override
    public void approve(int id, double cost, Type type) {
        if (canApprove(cost, type)) {
            System.out.printf((MANAGER_APPROVAL) + "%n", id, cost);
            return;
        }
        System.out.printf((MANAGER_NOT_APPROVAL) + "%n", id);
    }

    @Override
    protected boolean canApprove(double cost, Type type) {
        return PersonApprover.canApproveManager(cost, type);
    }
}
