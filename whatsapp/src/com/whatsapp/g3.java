// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.whatsapp:
//            g6, gx, g5, gq, 
//            gr, gm, gy, g2, 
//            gn, gw, g0, gv, 
//            gi, gp, g7, g4, 
//            gz, gg, gj

public abstract class g3
{

    public static boolean a;
    private static Map b;
    private static final String z[];

    public g3()
    {
    }

    static final g3 a(Locale locale)
    {
        return (g3)b.get(locale.getLanguage());
    }

    public static void a(String as[], g3 g3_1)
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            b.put(s, g3_1);
        }

    }

    static final int b(int i)
    {
        switch (i)
        {
        default:
            return 0x1000004;

        case 1: // '\001'
            return 0x1000005;

        case 2: // '\002'
            return 0x1000006;

        case 4: // '\004'
            return 0x1000007;

        case 8: // '\b'
            return 0x1000008;

        case 16: // '\020'
            return 0x1000009;
        }
    }

    static final String c(int i)
    {
        switch (i)
        {
        default:
            return z[4];

        case 1: // '\001'
            return z[5];

        case 2: // '\002'
            return z[3];

        case 4: // '\004'
            return z[1];

        case 8: // '\b'
            return z[0];

        case 16: // '\020'
            return z[2];
        }
    }

    abstract int a(int i);

    static 
    {
        String as[];
        Object obj;
        String as1[];
        char c1;
        int i;
        as = new String[6];
        obj = "Sh'";
        c1 = '\uFFFF';
        as1 = as;
        i = 0;
_L10:
        int j;
        int k;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L7:
        if (k <= j)
        {
            obj = (new String(((char []) (obj)))).intern();
            byte byte0;
            char c2;
            switch (c1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "Az?";
                i = 1;
                as1 = as;
                c1 = '\0';
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "Xl>W";
                i = 2;
                as1 = as;
                c1 = '\001';
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "Zc5";
                i = 3;
                as1 = as;
                c1 = '\002';
                continue; /* Loop/switch isn't completed */

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "Zy8K`";
                i = 4;
                as1 = as;
                c1 = '\003';
                continue; /* Loop/switch isn't completed */

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                as1 = as;
                obj = "Oh\"A";
                c1 = '\004';
                continue; /* Loop/switch isn't completed */

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                b = new HashMap();
                as = new String[54];
                obj = "Wh=";
                c1 = '\005';
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 5: // '\005'
                as1[i] = ((String) (obj));
                obj = "W\177(";
                c1 = '\006';
                i = 1;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 6: // '\006'
                as1[i] = ((String) (obj));
                obj = "Ql";
                c1 = '\007';
                i = 2;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 7: // '\007'
                as1[i] = ((String) (obj));
                obj = "Qh";
                c1 = '\b';
                i = 3;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 8: // '\b'
                as1[i] = ((String) (obj));
                obj = "Pa";
                c1 = '\t';
                i = 4;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "Pc";
                c1 = '\n';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "Pb";
                c1 = '\013';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "P~";
                c1 = '\f';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "Py";
                c1 = '\r';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "Sd";
                c1 = '\016';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "Sb";
                c1 = '\017';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "Ra";
                c1 = '\020';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "]h";
                c1 = '\021';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\\z";
                c1 = '\022';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\\y";
                c1 = '\023';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "[o";
                c1 = '\024';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "[a";
                c1 = '\025';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "[c";
                c1 = '\026';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "[b";
                c1 = '\027';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "F{";
                c1 = '\030';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "Tk";
                c1 = '\031';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "Wj";
                c1 = '\032';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "Wc";
                c1 = '\033';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "Vl";
                c1 = '\034';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "Px";
                c1 = '\035';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "Sx\"";
                c1 = '\036';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "St";
                c1 = '\037';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "Rx";
                c1 = ' ';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 28;
                obj = "]l";
                c1 = '!';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "\\~";
                c1 = '"';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 34: // '"'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "^x";
                c1 = '#';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "Yo";
                c1 = '$';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 36: // '$'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "Xa";
                c1 = '%';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 37: // '%'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "X\177";
                c1 = '&';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 38: // '&'
                as1[i] = ((String) (obj));
                i = 34;
                obj = "[l8";
                c1 = '\'';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 39: // '\''
                as1[i] = ((String) (obj));
                i = 35;
                obj = "[h";
                c1 = '(';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 40: // '('
                as1[i] = ((String) (obj));
                i = 36;
                obj = "Z`";
                c1 = ')';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 41: // ')'
                as1[i] = ((String) (obj));
                i = 37;
                obj = "Z\177";
                c1 = '*';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 42: // '*'
                as1[i] = ((String) (obj));
                i = 38;
                obj = "El";
                c1 = '+';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 43: // '+'
                as1[i] = ((String) (obj));
                i = 39;
                obj = "El ";
                c1 = ',';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 44: // ','
                as1[i] = ((String) (obj));
                i = 40;
                obj = "E~";
                c1 = '-';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 45: // '-'
                as1[i] = ((String) (obj));
                i = 41;
                obj = "Fb";
                c1 = '.';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 46: // '.'
                as1[i] = ((String) (obj));
                i = 42;
                obj = "F|";
                c1 = '/';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 47: // '/'
                as1[i] = ((String) (obj));
                i = 43;
                obj = "Fz";
                c1 = '0';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 48: // '0'
                as1[i] = ((String) (obj));
                i = 44;
                obj = "Al";
                c1 = '1';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 49: // '1'
                as1[i] = ((String) (obj));
                i = 45;
                obj = "Ah";
                c1 = '2';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 50: // '2'
                as1[i] = ((String) (obj));
                i = 46;
                obj = "Af";
                c1 = '3';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 51: // '3'
                as1[i] = ((String) (obj));
                i = 47;
                obj = "@\177";
                c1 = '4';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 52: // '4'
                as1[i] = ((String) (obj));
                i = 48;
                obj = "Ox";
                c1 = '5';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 53: // '5'
                as1[i] = ((String) (obj));
                i = 49;
                obj = "Xc";
                c1 = '6';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 54: // '6'
                as1[i] = ((String) (obj));
                i = 50;
                obj = "R~'";
                c1 = '7';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 55: // '7'
                as1[i] = ((String) (obj));
                i = 51;
                obj = "Ve\"";
                c1 = '8';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 56: // '8'
                as1[i] = ((String) (obj));
                i = 52;
                obj = "G`";
                c1 = '9';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 57: // '9'
                as1[i] = ((String) (obj));
                i = 53;
                obj = "Ey";
                c1 = ':';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 58: // ':'
                as1[i] = ((String) (obj));
                a(as, new g6());
                as = new String[2];
                obj = "V~";
                c1 = ';';
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 59: // ';'
                as1[i] = ((String) (obj));
                obj = "Ff";
                c1 = '<';
                i = 1;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 60: // '<'
                as1[i] = ((String) (obj));
                a(as, new gx());
                as = new String[3];
                obj = "Sk";
                c1 = '=';
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 61: // '='
                as1[i] = ((String) (obj));
                obj = "S\177";
                c1 = '>';
                i = 1;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 62: // '>'
                as1[i] = ((String) (obj));
                obj = "^l2";
                c1 = '?';
                i = 2;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 63: // '?'
                as1[i] = ((String) (obj));
                a(as, new g5());
                as = new String[7];
                obj = "]\177";
                c1 = '@';
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 64: // '@'
                as1[i] = ((String) (obj));
                obj = "Gx";
                c1 = 'A';
                i = 1;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 65: // 'A'
                as1[i] = ((String) (obj));
                obj = "F\177";
                c1 = 'B';
                i = 2;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 66: // 'B'
                as1[i] = ((String) (obj));
                obj = "@f";
                c1 = 'C';
                i = 3;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 67: // 'C'
                as1[i] = ((String) (obj));
                obj = "Wh";
                c1 = 'D';
                i = 4;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 68: // 'D'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "W~";
                c1 = 'E';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 69: // 'E'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "Fe";
                c1 = 'F';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 70: // 'F'
                as1[i] = ((String) (obj));
                a(as, new gq());
                as = new String[1];
                obj = "Y{";
                c1 = 'G';
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 71: // 'G'
                as1[i] = ((String) (obj));
                a(as, new gr());
                as = new String[1];
                obj = "Yy";
                c1 = 'H';
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 72: // 'H'
                as1[i] = ((String) (obj));
                a(as, new gm());
                as = new String[1];
                obj = "Ea";
                c1 = 'I';
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 73: // 'I'
                as1[i] = ((String) (obj));
                a(as, new gy());
                as = new String[2];
                obj = "Gb";
                c1 = 'J';
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 74: // 'J'
                as1[i] = ((String) (obj));
                obj = "Xb";
                c1 = 'K';
                i = 1;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 75: // 'K'
                as1[i] = ((String) (obj));
                a(as, new g2());
                as = new String[1];
                obj = "Fa";
                c1 = 'L';
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 76: // 'L'
                as1[i] = ((String) (obj));
                a(as, new gn());
                as = new String[1];
                obj = "T\177";
                c1 = 'M';
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 77: // 'M'
                as1[i] = ((String) (obj));
                a(as, new gw());
                as = new String[1];
                obj = "Xf";
                c1 = 'N';
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 78: // 'N'
                as1[i] = ((String) (obj));
                a(as, new g0());
                as = new String[1];
                obj = "Vt";
                c1 = 'O';
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 79: // 'O'
                as1[i] = ((String) (obj));
                a(as, new gv());
                as = new String[1];
                obj = "W\177";
                c1 = 'P';
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 80: // 'P'
                as1[i] = ((String) (obj));
                a(as, new gi());
                as = new String[1];
                obj = "Yl7";
                c1 = 'Q';
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 81: // 'Q'
                as1[i] = ((String) (obj));
                a(as, new gp());
                as = new String[1];
                obj = "Fe9";
                c1 = 'R';
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 82: // 'R'
                as1[i] = ((String) (obj));
                a(as, new g7());
                as = new String[1];
                obj = "Xy";
                c1 = 'S';
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 83: // 'S'
                as1[i] = ((String) (obj));
                a(as, new g4());
                as = new String[7];
                obj = "Rl";
                c1 = 'T';
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 84: // 'T'
                as1[i] = ((String) (obj));
                obj = "Fh";
                c1 = 'U';
                i = 1;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 85: // 'U'
                as1[i] = ((String) (obj));
                obj = "F`1";
                c1 = 'V';
                i = 2;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 86: // 'V'
                as1[i] = ((String) (obj));
                obj = "F`9";
                c1 = 'W';
                i = 3;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 87: // 'W'
                as1[i] = ((String) (obj));
                obj = "F`:";
                c1 = 'X';
                i = 4;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 88: // 'X'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "F`>";
                c1 = 'Y';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 89: // 'Y'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "F`#";
                c1 = 'Z';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 90: // 'Z'
                as1[i] = ((String) (obj));
                a(as, new gz());
                as = new String[12];
                obj = "Tf";
                c1 = '[';
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 91: // '['
                as1[i] = ((String) (obj));
                obj = "T`";
                c1 = '\\';
                i = 1;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 92: // '\\'
                as1[i] = ((String) (obj));
                obj = "We";
                c1 = ']';
                i = 2;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 93: // ']'
                as1[i] = ((String) (obj));
                obj = "Sd<";
                c1 = '^';
                i = 3;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 94: // '^'
                as1[i] = ((String) (obj));
                obj = "Aa";
                c1 = '_';
                i = 4;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 95: // '_'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "Rx'";
                c1 = '`';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 96: // '`'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "]d";
                c1 = 'a';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 97: // 'a'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "Yc";
                c1 = 'b';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 98: // 'b'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "Xj";
                c1 = 'c';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 99: // 'c'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "[~?";
                c1 = 'd';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 100: // 'd'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "Ad";
                c1 = 'e';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 101: // 'e'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "Bl";
                c1 = 'f';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 102: // 'f'
                as1[i] = ((String) (obj));
                a(as, new gg());
                as = new String[27];
                obj = "Tw";
                c1 = 'g';
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 103: // 'g'
                as1[i] = ((String) (obj));
                obj = "W`";
                c1 = 'h';
                i = 1;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 104: // 'h'
                as1[i] = ((String) (obj));
                obj = "Sl";
                c1 = 'i';
                i = 2;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 105: // 'i'
                as1[i] = ((String) (obj));
                obj = "\\j";
                c1 = 'j';
                i = 3;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 106: // 'j'
                as1[i] = ((String) (obj));
                obj = "]x";
                c1 = 'k';
                i = 4;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 107: // 'k'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "_l";
                c1 = 'l';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 108: // 'l'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "^i5";
                c1 = 'm';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 109: // 'm'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "^h1";
                c1 = 'n';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 110: // 'n'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "^b";
                c1 = 'o';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 111: // 'o'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "Xt";
                c1 = 'p';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 112: // 'p'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "Fh#";
                c1 = 'q';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 113: // 'q'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "Fj";
                c1 = 'r';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 114: // 'r'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "Ab";
                c1 = 's';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 115: // 's'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "A\177";
                c1 = 't';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 116: // 't'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "Cd";
                c1 = 'u';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 117: // 'u'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "Bb";
                c1 = 'v';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 118: // 'v'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "Lb";
                c1 = 'w';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 119: // 'w'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "Oe";
                c1 = 'x';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 120: // 'x'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "Wb";
                c1 = 'y';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 121: // 'y'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "Qw";
                c1 = 'z';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 122: // 'z'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "\\i";
                c1 = '{';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 123: // '{'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "_{";
                c1 = '|';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 124: // '|'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "^l";
                c1 = '}';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 125: // '}'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "^`";
                c1 = '~';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 126: // '~'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "^c";
                c1 = '\177';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 127: // '\177'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "X~";
                c1 = '\200';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 128: 
                as1[i] = ((String) (obj));
                i = 26;
                obj = "Ae";
                c1 = '\201';
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 129: 
                as1[i] = ((String) (obj));
                break;
            }
            break; /* Loop/switch isn't completed */
        }
        c2 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 752
    //                   0 775
    //                   1 782
    //                   2 789
    //                   3 796;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_796;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte0 = 18;
_L8:
        obj[j] = (char)(byte0 ^ c2);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 53;
          goto _L8
_L3:
        byte0 = 13;
          goto _L8
_L4:
        byte0 = 80;
          goto _L8
        byte0 = 46;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
        a(as, new gj());
    }
}
