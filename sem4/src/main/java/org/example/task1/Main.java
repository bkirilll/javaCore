package org.example.task1;

public class Main {

    public static void main(String[] args) {

        System.out.println(authorization("aboba", "1234ytrwtwetwetwetwwetwe", "1234"));

    }

    public static boolean authorization(String login, String password, String confirmPassword) {
        if(login.length() > 20) try {
            throw new WrongLoginException(login);
        } catch (WrongLoginException e) {
            throw new RuntimeException(e);
        }
        if(password.length() > 20 || !password.equals(confirmPassword)) try {
            throw new WrongPasswordException(password, confirmPassword);
        } catch (WrongPasswordException e) {
            throw new RuntimeException(e);
        }
        else {
            return true;
        }

    }
}
