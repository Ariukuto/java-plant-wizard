// NICHT VON MIR !!!!!!

//
//Klassenmethoden für die vereinfachte Ein- und Ausgabe
//
// Methoden:
// printLn(String str), print(String str)
// print(char s[]), printLn(char s[])
// printLn(char ch)
// String readLn(), String readLn(String prompt) 
// char readChar(), char[] readChars() 
// char readChar(String prompt), char[] readChars(String prompt) 
// printInt(int i), printIntLn(int i)
// int readInt(), int readInt(String prompt)
//
// 12.3.99  Erstellung
// 27.4.99  "readChars" eingefügt
// 18.6.99  "print(Object o)" eingefügt
// 20.6.99  "print(char ch) eingefügt
// 11.9.99  "readLn(String prompt),readChar(String prompt), readChars(String prompt) 
//           readInt(String prompt)" eingefügt
// 25.11.08 "readDouble(), readDouble(String prompt)" eingefügt
//

import java.io.*;

/**
 * Diese Klasse enth�lt Klassenmethoden f�r die vereinfachte Ein- und Ausgabe
 **/
 
public class EinAus {
  private static PrintStream out = System.out;
  // deprecated:
  // private static DataInputStream in = new DataInputStream(System.in);
  // ersetzen durch:
  private static BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
                 
  /**
   * Gibt einen String auf dem Schirm aus und schliesst die Zeile ab.
   * str ist der auszugebende String.
   */
  public static final void printLn(String str) {
    out.println(str);
  }

  /**
   * Gibt einen String auf dem Schirm aus, schliesst die Zeile jedoch nicht ab,
   * d.h. es wird kein Carrige Return ausgegeben.
   * str ist der zu druckender String.
   **/
  public static final void print(String str) {
    out.print(str);
    out.flush();
  }

  /**
   * Schreibt eine Zeichenkette (String) auf den Schirm. Die Zeile wird nicht
   * mit Carrige Return abgeschlossen.
   * s[] ist die zu druckende Zeichenkette 
   **/
  public static final void print(char s[]) {
    out.print(s);
    out.flush();
  }

  /**
   * Schreibt eine Zeichenkette auf den Schirm und schliesst die Zeile 
   * mit Carrige Return ab.
   * s[] ist die zu druckende Zeichenkette
   **/
  public static final void printLn(char s[]) {
    out.println(s);
  }
  
  public static final void printLn(char ch) {
    out.println(ch);
  }
       
  public static final void print(char ch) {
    out.print(ch);
  }

  /**
   * Gibt ein Object auf dem Bildschirm aus.
   * o Object, das ausgegeben werden soll.
   **/
  public static void print(Object o) { 
      print(o + ""); 
  }

  /**
   * Liest eine Zeichenkette (String) von der Tastatur. Die Eingabe wird durch dr�cken
   * der Enter-Taste abgeschlossen.
   **/
  public static final String readLn() {
    String str="";
    
    try {
      str = d.readLine();
    } 
      catch (IOException e){
      printLn("Fehler in EinAus.readLn");
    }
    return str;
  }
  
  /**
   * Gibt einen Text aus und liest eine Zeichenkette (String) von der Tastatur. Die Eingabe wird durch dr�cken
   * der Enter-Taste abgeschlossen.
   **/
  public static final String readLn(String prompt) {
    String str = "";
    
    out.print(prompt);
    out.flush();

    try {
      str = d.readLine();
    } 
    catch (IOException e){
      printLn("Fehler in EinAus.readLn");
    }
    return str;
  }
  
  /**
   * Liest ein Zeichen von der Tastatur. 
   * Die Eingabe wird durch die Enter-Taste abgeschlossen.
   * Gibt das eingelesene Zeichen zur�ck.
   **/
  public static final char readChar() {
    String str = readLn();
    if (str.length() > 0) {
      return str.charAt(0);
    }
    return('\n');
  }
  
   /**
   * Gibt einen Text aus und liest ein Zeichen von der Tastatur. 
   * Die Eingabe wird durch die Enter-Taste abgeschlossen.
   * Gibt das eingelesene Zeichen zur�ck.
   **/
  public static final char readChar(String prompt) {
    out.print(prompt);
    out.flush();
    
    String str = readLn();
    if (str.length() > 0) {
      return str.charAt(0);
    }
    return('\n');
  }
  
 /**
   * Liest eine Zeichenkette von der Tastatur. 
   * Die Eingabe wird durch die Enter-Taste abgeschlossen.
   * Gibt die eingelesene Zeichenkette als Character-Reihung zur�ck.
   **/
  public static final char[] readChars() {
    return(readLn().toCharArray());
  }
 
  /**
   * Gibt einen Text aus und liest eine Zeichenkette von der Tastatur. 
   * Die Eingabe wird durch die Enter-Taste abgeschlossen.
   * Gibt die eingelesene Zeichenkette als Character-Reihung zur�ck.
   **/
  public static final char[] readChars(String prompt) {
    out.print(prompt);
    out.flush();
    
    return(readLn().toCharArray());
  }


  /**
   * Gibt einen Integerwert auf dem Schirm aus.
   * i auszugebender Integerwert.
   **/
  public static final void printInt(int i) {
    out.print("" + i);
  }

  /**
   * Gibt einen Integerwert auf dem Schirm aus 
   * und schliesst die Zeile mit einem Carrige Return ab.
   * i auszugebender Integerwert.
   **/
  public static final void printIntLn(int i) {
    out.println("" + i);
  }

  /** 
   * Liest einen Integerwert von der Tastatur. 
   * Die Eingabe wird durch die Enter-Taste abgeschlossen.
   * Gibt die eingelesene Zahl zur�ck.
   **/
  public static final int readInt() {
    String str;

    str = readLn();
    try {
      return Integer.parseInt(str);
    } 
      catch (NumberFormatException e) {
      return Integer.MIN_VALUE;
    }
  }
    
 /** 
   * Gibt einen Text aus und liest einen Integerwert von der Tastatur. 
   * Die Eingabe wird durch die Enter-Taste abgeschlossen.
   * Gibt die eingelesene Zahl zur�ck.
   **/
  public static final int readInt(String prompt) {
    out.print(prompt);
    out.flush();

      String str;
    str = readLn();
    try {
      return Integer.parseInt(str);
    } 
    catch (NumberFormatException e) {
      return Integer.MIN_VALUE; 
    }
  }
  
    /**
   * Liest einen Doublewert von der Tastatur.
   * Die Eingabe wird durch die Enter-Taste abgeschlossen.
   * Gibt die eingelesene Zahl zur�ck.
   **/
  public static final double readDouble() {
    String str;

    str = readLn();
    try {
      return Double.parseDouble(str);
    }
      catch (NumberFormatException e) {
      return Integer.MIN_VALUE;
    }
  }

 /**
   * Gibt einen Text aus und liest einen Doublewert von der Tastatur.
   * Die Eingabe wird durch die Enter-Taste abgeschlossen.
   * Gibt die eingelesene Zahl zur�ck.
   **/
  public static final double readDouble(String prompt) {
    out.print(prompt);
    out.flush();

    String str;
    str = readLn();
    try {
      return Double.parseDouble(str);
    }
    catch (NumberFormatException e) {
      return Double.MIN_VALUE;
    }
  }


}
