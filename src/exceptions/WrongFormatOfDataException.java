package exceptions;

public class WrongFormatOfDataException extends  Exception{
    public WrongFormatOfDataException(){
        super("\"Неправильный формат вводных данных\"");
    }
}
