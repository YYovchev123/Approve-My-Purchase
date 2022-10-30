package handlers;

import common.Type;

public abstract class Approver {

    protected Approver next;

    public abstract void approve(int id, double cost, Type type);
    protected abstract boolean canApprove(double cost, Type type);

    public Approver registerNext(Approver next) {
        this.next = next;
        return next;
    }
}
