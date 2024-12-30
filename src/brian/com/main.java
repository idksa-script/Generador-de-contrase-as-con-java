package brian.com;

import java.util.Random;

public class main{

    public static void main(String []args){

        Random rd = new Random();

        String Caracteres = "qwertyuiopasdfghjklñzxcvbnmWERTYUIOPASDFGHJKLÑZXCVBNM1234567890'¡`+Ḉ-.,<>:;`*^¨ç_:;ªº!·$%&/()=?¿¡'{}¬½~#@|";

        String Password = "";

        while (Password.length() < 12) {

            Password = Password + Caracteres.charAt(rd.nextInt(Caracteres.length()));
        }
        System.out.println("Contraseña Generada: " + Password);

    }
}
