// Lab_06 Task 08

 class Tea {
    public String name;
    public int price;
    public boolean status;

    public Tea(String name, int price) {
        this.name = name;
        this.price = price;
        this.status = false;
    }

    public void productDetail() {
        System.out.println("Name: " + name + ", Price: " + price);
        System.out.println("Status: " + status);
    }
}

// KKTea Class (Child of Tea, Parent of KKFlavouredTea)
 class KKTea extends Tea {
    public int weight;
    public int teaBags;
    private static int regularSoldCount = 0;

    public KKTea(int price, int teaBags) {
        super("KK Regular Tea", price);
        this.teaBags = teaBags;
        this.weight = teaBags * 2;
    }

    @Override
    public void productDetail() {
        super.productDetail();
        System.out.println("Weight: " + weight + ", Tea Bags: " + teaBags);
    }

    public static void updateSoldStatusRegular(KKTea t) {
        t.status = true;
        regularSoldCount++;
    }

    public static int getRegularSoldCount() {
        return regularSoldCount;
    }

    public static void totalSales() {
        System.out.println("Total Sales: " + regularSoldCount);
        System.out.println("KK Regular Tea: " + regularSoldCount);
    }
}

// KKFlavouredTea Class (Child of KKTea)
 class KKFlavouredTea extends KKTea {
    private static int flaovuredSoldCount = 0;

    public KKFlavouredTea(String flavourName, int price, int teaBags) {
        super(price, teaBags);
        this.name = "KK " + flavourName + " Tea";
    }

    public static void updateSoldStatusFlavoured(KKFlavouredTea t) {
        t.status = true;
        flaovuredSoldCount++;
    }

    public static void totalSales() {
        int regularCount = KKTea.getRegularSoldCount();
        int totalCount = regularCount + flaovuredSoldCount;
        System.out.println("Total Sales: " + totalCount);
        System.out.println("KK Regular Tea: " + regularCount);
        System.out.println("KK Flavoured Tea: " + flaovuredSoldCount);
    }
}

// Driver Code
public class TeaTester {
    public static void main(String[] args) {

        KKTea t1 = new KKTea(250, 50);
        System.out.println("--------1---------");
        t1.productDetail();
        System.out.println("--------2---------");
        KKTea.totalSales();
        System.out.println("--------3---------");

        KKTea t2 = new KKTea(470, 100);
        KKTea t3 = new KKTea(360, 75);
        KKTea.updateSoldStatusRegular(t1);
        KKTea.updateSoldStatusRegular(t2);
        System.out.println("--------4---------");
        t2.productDetail();
        System.out.println("--------5---------");
        KKTea.totalSales();
        System.out.println("--------6---------");

        KKFlavouredTea t4 = new KKFlavouredTea("Jasmine", 260, 50);
        KKFlavouredTea t5 = new KKFlavouredTea("Honey Lemon", 270, 45);
        KKFlavouredTea t6 = new KKFlavouredTea("Honey Lemon", 270, 45);
        System.out.println("--------7---------");
        t4.productDetail();
        System.out.println("--------8---------");
        t6.productDetail();
        System.out.println("--------9---------");
        KKFlavouredTea.updateSoldStatusFlavoured(t4);
        KKFlavouredTea.updateSoldStatusFlavoured(t5);
        KKFlavouredTea.updateSoldStatusFlavoured(t6);
        System.out.println("--------10---------");
        KKFlavouredTea.totalSales();
    }
}