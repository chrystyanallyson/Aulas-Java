package com.mycompany.horadosistema;

//import java.util.Date;
import java.awt.Dimension;
import java.awt.Toolkit;
//import java.util.Locale;

public class HoraDoSistema {

    /*
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());
    }
    */
    /*
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.print("A linguagem do sistema é: ");
        System.out.println(loc.getDisplayLanguage());
    }
    */
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Sua resolução é "+d.width+" x "+d.height);
    }
}
