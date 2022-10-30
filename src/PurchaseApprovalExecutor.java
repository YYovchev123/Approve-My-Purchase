import common.Type;
import handlers.*;

public class PurchaseApprovalExecutor {

    public static void execute() {
        Approver manager = new Manager();
        ApprovalChainGenerator.generate(manager);

        manager.approve(1, 1001, Type.CONSUMABLES);
        manager.approve(2, 2001, Type.CLERICAL);
        manager.approve(3, 3001, Type.GADGETS);
        manager.approve(4, 5001, Type.GAMING);
        manager.approve(5, 8001, Type.PC);
    }
}
