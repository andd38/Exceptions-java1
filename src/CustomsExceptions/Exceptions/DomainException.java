package CustomsExceptions.Exceptions;

public class DomainException extends Exception{
    private static final long serialVersion = 1L;
    public DomainException(String msg){
        super(msg);
    }
}
