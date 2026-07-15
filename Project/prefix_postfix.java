public class prefix_postfix {
    public static void main (String[] args) {
    
        int mainValue = 10;


        System.out.println("Main value prefix : " + mainValue);
        int swap = ++mainValue;
        System.out.println("Main value before prefix : " + mainValue);
        System.out.println("Swap value after prefix : " + swap);

        System.out.println("======================================");

        int originalValue = 10;
        int storeValue = originalValue++;

        System.out.println("Original value after postfix : " + originalValue);
        System.out.println("Original value after postfix : " + originalValue);
        System.out.println("Store value after postfix : " + storeValue);
    }
}
