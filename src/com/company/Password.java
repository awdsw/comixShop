package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Password {
    private static Map<String, String> map = new HashMap<>();
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private String login;
    private String password;
    private boolean signedIn;
    static {
        map.put("1282", "1283");
    }
    private boolean verify(){ //для проверки
        setSignedIn(password.equals(map.get(login))); //сравнение пароля с логином пользователя
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }


    public void logIn() {
        try {
            while (!signedIn){
                System.out.println("Enter login: ");
                login = reader.readLine();

                System.out.println("Enter password: ");
                password = reader.readLine();

                if (verify()){
                    System.out.println("Успешно вошли в систему!");
                }
                else {
                    System.out.println("Не вошли в систему!");
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
