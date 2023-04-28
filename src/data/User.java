package data;

import data.FIO;

public class User {
    private FIO fio;
    private String data;
    private int phone;
    private char sex;

    public User() {
    }

    public User(FIO fio, String data, int phone, char sex) {
        this.fio = fio;
        this.data = data;
        this.phone = phone;
        this.sex = sex;
    }

    public FIO getFio() {
        return fio;
    }

    public void setFio(FIO fio) {
        this.fio = fio;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Пользователь:" +
                " " + fio +
                ", " + data +
                ", " + phone +
                ", " + sex;
    }
}
