public class PurchasingException extends RuntimeException {
    private String msg;

    public PurchasingException(String message) {
        super(message);
        msg = message;
    }

    public PurchasingException() {
        super();
    }

}
