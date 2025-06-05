package exception;

public class CustomExcpetionExm extends Exception{

    public CustomExcpetionExm(String message) {
        super(message);
    }

    @Override
    public String getMessage() {

        return "This is defined in custom Exception message";
    }
}
