package org.example.task1;

public class Main {

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        System.out.println(authorization("aboba", "1234ytrwtwetwetwetwwetwe", "1234"));

    }

    public static boolean authorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if(login.length() > 20) throw new WrongLoginException(login);
        if(password.length() > 20 || !password.equals(confirmPassword))  throw new WrongPasswordException(password, confirmPassword);
        return true;
    }
}
