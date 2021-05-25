package fit.basic;

public class Controls {
    public static final String name = "Name";

    public static void switchAndMore() {
        String aNameForSelection = "Name";

        switch (aNameForSelection) {
            case name:
                System.out.println("Name found");

            case "anything":
                System.out.println("woah, how could? No break eh?");
                break;

            default:
                System.out.println("This is default...(you should never see this!)");
        }
    }
}
