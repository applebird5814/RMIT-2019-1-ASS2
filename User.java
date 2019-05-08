import java.util.ArrayList;

public class User {
    private String Id;
    private String name;
    private String phoneNumber;
    private double balance;
    private int isPremium = 0;
    private ArrayList<Content> purchasedContent;
    private int itemTotal = 0;

    public ArrayList getPurchasedContent() {
        return purchasedContent;
    }

    public User(String inputid, String inputname, String inputphonenum, double inputbalance) {
        Id = inputid;
        name = inputname;
        phoneNumber = inputphonenum;
        balance = inputbalance;
        purchasedContent = new ArrayList<Content>();
    }

    public User(String inputid, String inputname, String inputphonenum) {
        Id = inputid;
        name = inputname;
        phoneNumber = inputphonenum;
        balance = 500;
        purchasedContent = new ArrayList<Content>();
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void becomePremium() {
        if (isPremium == 1) {
            System.out.printf("This user is already premium\n");
        } else {
            if (balance < 100) {
                System.out.printf("Balance not enough\n");
            } else {
                balance -= 100;
                isPremium = 1;
                System.out.printf("Succeed in becoming premium\n");
            }
        }
    }

    public void buyContent(Content newcontent) {
        double discount = 1;
        if (isPremium == 1) {
            discount = 0.8;
        }
        double m = discount * newcontent.getPrice();
        // let the price become a correct price in the real world
        m = ((double) ((int) (m * 100 + 0.5))) / 100;
        try {
            balance = purchasing(balance, m);
            // double is not allways correct while solving money, so round is necessary.
            balance = ((double) ((int) (balance * 100 + 0.5))) / 100;
            purchasedContent.add(newcontent);
            itemTotal++;
            System.out.println("Purchase successfully,you spend" + m);
        } catch (PurchasingException e) {
            System.out.println(e);
        }
    }

    public double purchasing(double money, double price) {
        if (money < price) {
            throw new PurchasingException("You don't have enough money");
        } else {
            money -= price;
            return money;
        }
    }

    public void showContentBrought() {
        if (itemTotal == 0) {
            System.out.println("Nothing");
        } else {
            for (int j = 0; j < itemTotal; j++) {
                Content show = purchasedContent.get(j);
                System.out.println(show.getName());
            }
        }
    }
}