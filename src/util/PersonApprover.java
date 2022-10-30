package util;

import common.Type;

//Class for approving methods
public class PersonApprover {

    private static boolean result;
    private static double consumablesCost;
    private static double clericalCost;
    private static double gadgetsCost;
    private static double gamingCost;
    private static double pcCost;

    public static boolean canApproveManager(double cost, Type type) {
        consumablesCost = 300;
        clericalCost = 500;
        gadgetsCost = 1000;
        gamingCost = 3000;
        pcCost = 5000;
        return approval(type, cost, consumablesCost, clericalCost, gadgetsCost, gamingCost, pcCost);
    }

    public static boolean canApproveVicePresident(double cost, Type type) {
        consumablesCost = 700;
        clericalCost = 1500;
        gadgetsCost = 2000;
        gamingCost = 4500;
        pcCost = 6500;
        return approval(type, cost, consumablesCost, clericalCost, gadgetsCost, gamingCost, pcCost);
    }

    public static boolean canApproveDirector(double cost, Type type) {
        consumablesCost = 500;
        clericalCost = 1000;
        gadgetsCost = 1500;
        gamingCost = 3500;
        pcCost = 6000;
        return approval(type, cost, consumablesCost, clericalCost, gadgetsCost, gamingCost, pcCost);
    }

    public static boolean canApprovePresident(double cost, Type type) {
        consumablesCost = 1000;
        clericalCost = 2000;
        gadgetsCost = 3000;
        gamingCost = 5000;
        pcCost = 8000;
        return approval(type, cost, consumablesCost, clericalCost, gadgetsCost, gamingCost, pcCost);
    }

    private static boolean approval(Type type, double cost, double consumablesCost, double clericalCost, double gadgetsCost, double gamingCost, double pcCost) {
        if (type.equals(Type.CONSUMABLES) && cost <= consumablesCost) {
            result = true;
            return result;
        } else if (type.equals(Type.CLERICAL) && cost <= clericalCost) {
            result = true;
            return result;
        } else if (type.equals(Type.GADGETS) && cost <= gadgetsCost) {
            result = true;
            return result;
        } else if (type.equals(Type.GAMING) && cost <= gamingCost) {
            result = true;
            return result;
        } else if (type.equals(Type.PC) && cost <= pcCost) {
            result = true;
            return result;
        } else {
            result = false;
            return result;
        }
    }
}
