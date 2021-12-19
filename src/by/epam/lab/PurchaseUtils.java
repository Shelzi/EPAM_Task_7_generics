package by.epam.lab;

public class PurchaseUtils {
    private final Purchase purchase;

    public PurchaseUtils() {
        purchase = new Purchase();
    }

    public PurchaseUtils(Purchase purchase) {
        this.purchase = purchase;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void printPurchase() {
        System.out.printf("%s%n", purchase);
    }

    public void printCost() {
        System.out.printf("cost = %s%n", purchase.getCost());
    }

    public void printCostDiff(Purchase purchase) {
        Byn costDiff = new Byn(getPurchase().getCost().compareTo(purchase.getCost()));
        System.out.printf("diff = %s BYN%n", costDiff);
    }

    public void printIsSameCost(Purchase[] purchases) {
        boolean areEqual = false;
        for (Purchase value : purchases) {
            areEqual = value.equals(this.purchase);
            if (areEqual) {
                break;
            }
        }
        if (areEqual) {
            System.out.println("There is purchase among array with the same cost like this purchase");
        } else {
            System.out.println("There are no purchases among array with the same cost like this purchase");
        }
    }
}