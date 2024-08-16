package cap01;
//Uma instrução, multiplas linhas
//barra invertida -> caractere de escape

public class TerceiroProgramaJava {
    public static void main(String[] args) {
        // \n -> sequência de escape
        System.out.println("\nBem-vindo\n a\n programação\n com\n Java");
        System.out.println();
        System.out.println("As sequências de escape de caracteres e de cadeias de caracteres permitem a representação de alguns caracteres não gráficos, bem como os caracteres de aspas simples, aspas duplas e barra invertida em literais de caracteres e literais de cadeias de caracteres.");
        System.out.println("EscapeSequence:\r\n" + //
                        "    \\ b    /* \\u0008: backspace BS */\r\n" + //
                        "    \\ t    /* \\u0009: horizontal tab HT */\r\n" + //
                        "    \\ n    /* \\u000a: linefeed LF */\r\n" + //
                        "    \\ f    /* \\u000c: form feed FF */\r\n" + //
                        "    \\ r    /* \\u000d: carriage return CR */\r\n" + //
                        "    \\ \"    /* \\u0022: double quote \" */\r\n" + //
                        "    \\ '    /* \\u0027: single quote ' */\r\n" + //
                        "    \\ \\              /* \\u005c: backslash \\ */");

        System.out.println("OctalEscape        /* \\u0000 to \\u00ff: from octal value */");
        System.out.println("OctalEscape:\r\n" + //
                        "    \\ OctalDigit\r\n" + //
                        "    \\ OctalDigit OctalDigit\r\n" + //
                        "    \\ ZeroToThree OctalDigit OctalDigit");
        System.out.println("OctalDigit: one of\r\n" + //
                        "    0 1 2 3 4 5 6 7");
        System.out.println("ZeroToThree: one of\r\n" + //
                        "    0 1 2 3");
    }
}
