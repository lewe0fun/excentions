package exceptions;

import java.io.IOException;

public class WriteProblemException extends IOException {
    public WriteProblemException(){
        super("\"Проблема с записью файла\"");
    }
}
