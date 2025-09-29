public class Bell {
    private boolean isDing;

    public Bell() {
        this.isDing = true;
    }

    public void sound() {
        if (isDing) {
            System.out.println("ding");
        } else {
            System.out.println("dong");
        }
        isDing = !isDing;
    }
}