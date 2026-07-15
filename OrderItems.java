
public class OrderItems {

    public static void main (String[] args) {

        String[] orderItems = {"JNT-1001","JNT-3301","Cancelled","JNT-1002","Cancelled"};

        for (int i = 0; i < orderItems.length; i++) {

            if (orderItems[i].equals("Cancelled")) {
            
                continue;
            } else {

                System.out.println("1. " + orderItems[i]);
            }
        }
    }
}
