package org.example.w4_1;

public class Autorizaciya {
    static String login;
    static String password;
    static String confirmpassword;


    public static String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public static String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public static boolean autorizaciya(String login, String password, String confirmpassword) throws WrongLoginException, WrongPasswordException {
//        super();
        if (login.length() >= 20) {
            throw new WrongLoginException("Слишком длинный логин");
        }
        if (password.length() >= 20) {
            throw new WrongPasswordException("Слишком длинный пароль");
        }
        if (password.equals(confirmpassword)) {
//            System.out.println(password.equals(confirmpassword));
            return true;

        } else
            throw new WrongPasswordException("пароли не совпадают");

    }
}
