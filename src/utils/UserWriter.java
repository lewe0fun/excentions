package utils;

import data.User;
import exceptions.WriteProblemException;

import java.io.FileWriter;
import java.io.IOException;

public class UserWriter {

    public void writeUser(User user) throws IOException {
        try (FileWriter fw = new FileWriter(user.getFio().getPartName3() + ".txt", true)) {
            fw.write(user.toString() + '\n');
        } catch (IOException e) {
            throw new WriteProblemException();
        }
    }
}
