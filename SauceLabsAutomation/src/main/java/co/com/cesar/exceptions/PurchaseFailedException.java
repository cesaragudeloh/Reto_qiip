package co.com.cesar.exceptions;

public class PurchaseFailedException extends AssertionError{

    public static final String PURCHASE_FAILED_EXCEPTION = "An error occurred with your purchase. Please check";

    public PurchaseFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
