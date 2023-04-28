package utils;

import data.FIO;
import data.User;
import exceptions.WrongFormatOfDataException;
import exceptions.WrongNumberOfDataException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class UserParser {

    public User userParse(String source) throws WrongNumberOfDataException, WrongFormatOfDataException {
        boolean isPhoneFound = false;
        boolean isSexFound = false;
        boolean isDataFound = false;
        User result = new User();
        String[] strings = source.split(" ");
        ArrayList<String> userField = new ArrayList<>();
        Collections.addAll(userField, strings);
        if (userField.size() != 6) throw new WrongNumberOfDataException();
        for (int i = 0; i < userField.size(); i++) {
            if (!isPhoneFound && isInteger(userField.get(i))) {//поиск телефона
                result.setPhone(Integer.parseInt(userField.get(i)));
                userField.remove(i);
                isPhoneFound = true;
            }
        }
        for (int i = 0; i < userField.size(); i++) {
            if (!isSexFound && (Objects.equals(userField.get(i), "f") || Objects.equals(userField.get(i), "m"))) {//поиск пола
                result.setSex(userField.get(i).charAt(0));
                userField.remove(i);
                isSexFound = true;
            }
        }
        for (int i = 0; i < userField.size(); i++) {
            if(userField.get(i).length()==8){
            if (!isDataFound && userField.get(i).charAt(2) == '-' && userField.get(i).charAt(5) == '-') {//поиск даты
                if (isInteger(String.valueOf(userField.get(i).charAt(0) + userField.get(i).charAt(1) + userField.get(i).charAt(3) + userField.get(i).charAt(4) + userField.get(i).charAt(6) + userField.get(i).charAt(7)))) {
                    result.setData(userField.get(i));
                    userField.remove(i);
                    isDataFound = true;
                }
            }}
        }
        if (userField.size() == 3 && !isInteger(userField.get(0) + userField.get(1) + userField.get(2))) {
            // КАК еще ОПРЕДЕЛИТЬ В РАНДОМНОМ ПОРЯДКЕ ГДЕ ИМЯ, ФАМИЛИЯ И ОТЧЕСТВО
            result.setFio(new FIO(userField.get(0), userField.get(1), userField.get(2)));
        }
        if (userField.size() != 3)throw new WrongFormatOfDataException();
        return result;
    }

    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }
}
