/*
Proyecto Compiladores
Nombre: González Flores Diana Patricia
Matrícula: 170812
Carrera: ITI
Grupo: T54B
*/
package main;
import java.io.*; import lexer.*; import parser.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Lexer lex = new Lexer();
        System.out.println("Ingrese código:");
        Parser parse = new Parser(lex);
        parse.program();
        System.out.println(" ");

    }  
}
