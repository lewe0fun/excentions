import data.User;
import exceptions.WriteProblemException;
import exceptions.WrongFormatOfDataException;
import exceptions.WrongNumberOfDataException;
import utils.UserParser;
import utils.UserWriter;

import java.io.IOException;
import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private final UserParser userParser;
    private final UserWriter userWriter;

    private TerminalReader() {
        userParser = new UserParser();
        userWriter = new UserWriter();
    }

    public static TerminalReader getInstance() {
        if (terminalReader == null) {
            terminalReader = new TerminalReader();
        }
        return terminalReader;
    }

    public void listen() throws IOException{
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nВведите: Фамилия, Имя, Отчество, дата рождения(типа 12-34-56), номер телефона пол(f/m),\nили exit для выхода.");
            String cmd = sc.nextLine();
            if (cmd.equals("exit")) break;
            try {
                User user = userParser.userParse(cmd);
                    System.out.println("Пользователь " + user + " записывается...");
                    userWriter.writeUser(user);
            } catch (WrongNumberOfDataException | WrongFormatOfDataException | WriteProblemException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        sc.close();
    }
}
