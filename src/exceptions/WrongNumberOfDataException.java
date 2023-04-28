package exceptions;

public class WrongNumberOfDataException extends Exception {
    public WrongNumberOfDataException(){
        super("\"Неправильное количество вводных данных\"");
    }
}
