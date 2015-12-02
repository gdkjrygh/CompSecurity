// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google:
//            gd

public final class c4 extends Enum
{

    public static final c4 ASCII;
    public static final c4 Big5;
    public static final c4 Cp1250;
    public static final c4 Cp1251;
    public static final c4 Cp1252;
    public static final c4 Cp1256;
    public static final c4 Cp437;
    public static final c4 EUC_KR;
    public static final c4 GB18030;
    public static final c4 ISO8859_1;
    public static final c4 ISO8859_10;
    public static final c4 ISO8859_11;
    public static final c4 ISO8859_13;
    public static final c4 ISO8859_14;
    public static final c4 ISO8859_15;
    public static final c4 ISO8859_16;
    public static final c4 ISO8859_2;
    public static final c4 ISO8859_3;
    public static final c4 ISO8859_4;
    public static final c4 ISO8859_5;
    public static final c4 ISO8859_6;
    public static final c4 ISO8859_7;
    public static final c4 ISO8859_8;
    public static final c4 ISO8859_9;
    public static final c4 SJIS;
    public static final c4 UTF8;
    public static final c4 UnicodeBigUnmarked;
    private static final c4 a[];
    private static final Map d;
    private static final Map e;
    private static final String z[];
    private final int b[];
    private final String c[];

    private c4(String s, int i, int j)
    {
        this(s, i, new int[] {
            j
        }, new String[0]);
    }

    private c4(String s, int i, int j, String as[])
    {
        super(s, i);
        b = (new int[] {
            j
        });
        c = as;
    }

    private c4(String s, int i, int ai[], String as[])
    {
        super(s, i);
        b = ai;
        c = as;
    }

    public static c4 getCharacterSetECIByName(String s)
    {
        return (c4)e.get(s);
    }

    public static c4 getCharacterSetECIByValue(int i)
    {
        if (i < 0 || i >= 900)
        {
            throw gd.a();
        } else
        {
            return (c4)d.get(Integer.valueOf(i));
        }
    }

    public static c4 valueOf(String s)
    {
        return (c4)Enum.valueOf(com/google/c4, s);
    }

    public static c4[] values()
    {
        return (c4[])a.clone();
    }

    public int getValue()
    {
        return b[0];
    }

    static 
    {
        Object obj;
        String as[];
        int i;
        int j;
        as = new String[55];
        obj = "L\033P\017";
        i = -1;
        j = 0;
_L12:
        String as1[];
        int j1;
        int l1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l1 = obj.length;
        j1 = 0;
_L8:
        if (l1 > j1) goto _L2; else goto _L1
_L1:
        int i1;
        obj = (new String(((char []) (obj)))).intern();
        switch (i)
        {
        default:
            as1[j] = ((String) (obj));
            obj = "V\002Vq 'd q/";
            j = 1;
            i = 0;
            continue; /* Loop/switch isn't completed */

        case 0: // '\0'
            as1[j] = ((String) (obj));
            obj = "V\002Vd *hFo";
            j = 2;
            i = 1;
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            as1[j] = ((String) (obj));
            j = 3;
            obj = "V\002Vd *hFi";
            i = 2;
            continue; /* Loop/switch isn't completed */

        case 2: // '\002'
            as1[j] = ((String) (obj));
            j = 4;
            obj = "\\!-o/";
            i = 3;
            continue; /* Loop/switch isn't completed */

        case 3: // '\003'
            as1[j] = ((String) (obj));
            j = 5;
            obj = "]8~i";
            i = 4;
            continue; /* Loop/switch isn't completed */

        case 4: // '\004'
            as1[j] = ((String) (obj));
            j = 6;
            obj = "X\023+o)-";
            i = 5;
            continue; /* Loop/switch isn't completed */

        case 5: // '\005'
            as1[j] = ((String) (obj));
            j = 7;
            obj = "V\002Vd *hFj";
            i = 6;
            continue; /* Loop/switch isn't completed */

        case 6: // '\006'
            as1[j] = ((String) (obj));
            j = 8;
            obj = "V\002Vq 'd q ";
            i = 7;
            continue; /* Loop/switch isn't completed */

        case 7: // '\007'
            as1[j] = ((String) (obj));
            j = 9;
            obj = "V\002Vq 'd q))";
            i = 8;
            continue; /* Loop/switch isn't completed */

        case 8: // '\b'
            as1[j] = ((String) (obj));
            j = 10;
            obj = "\\!(n-/";
            i = 9;
            continue; /* Loop/switch isn't completed */

        case 9: // '\t'
            as1[j] = ((String) (obj));
            j = 11;
            obj = "V\002Vq 'd q)+";
            i = 10;
            continue; /* Loop/switch isn't completed */

        case 10: // '\n'
            as1[j] = ((String) (obj));
            j = 12;
            obj = "\\!(n-)";
            i = 11;
            continue; /* Loop/switch isn't completed */

        case 11: // '\013'
            as1[j] = ((String) (obj));
            j = 13;
            obj = "J?p?w{4[5\177";
            i = 12;
            continue; /* Loop/switch isn't completed */

        case 12: // '\f'
            as1[j] = ((String) (obj));
            j = 14;
            obj = "J\005_q))\023\\";
            i = 13;
            continue; /* Loop/switch isn't completed */

        case 13: // '\r'
            as1[j] = ((String) (obj));
            j = 15;
            obj = "J\0024\035K\\\030P";
            i = 14;
            continue; /* Loop/switch isn't completed */

        case 14: // '\016'
            as1[j] = ((String) (obj));
            j = 16;
            obj = "V\002Vd *hFm)";
            i = 15;
            continue; /* Loop/switch isn't completed */

        case 15: // '\017'
            as1[j] = ((String) (obj));
            j = 17;
            obj = "V\002Vq 'd q)*";
            i = 16;
            continue; /* Loop/switch isn't completed */

        case 16: // '\020'
            as1[j] = ((String) (obj));
            j = 18;
            obj = "V\002Vd *hFm+";
            i = 17;
            continue; /* Loop/switch isn't completed */

        case 17: // '\021'
            as1[j] = ((String) (obj));
            j = 19;
            obj = "J\005_q ";
            i = 18;
            continue; /* Loop/switch isn't completed */

        case 18: // '\022'
            as1[j] = ((String) (obj));
            j = 20;
            obj = "V\002Vq 'd q-";
            i = 19;
            continue; /* Loop/switch isn't completed */

        case 19: // '\023'
            as1[j] = ((String) (obj));
            j = 21;
            obj = "V\002Vq 'd q,";
            i = 20;
            continue; /* Loop/switch isn't completed */

        case 20: // '\024'
            as1[j] = ((String) (obj));
            j = 22;
            obj = "V\002Vq 'd q*";
            i = 21;
            continue; /* Loop/switch isn't completed */

        case 21: // '\025'
            as1[j] = ((String) (obj));
            j = 23;
            obj = "h8w8wh\"4m**a";
            i = 22;
            continue; /* Loop/switch isn't completed */

        case 22: // '\026'
            as1[j] = ((String) (obj));
            obj = "h8w8wh\"4m**`";
            i = 23;
            j = 24;
            continue; /* Loop/switch isn't completed */

        case 23: // '\027'
            as1[j] = ((String) (obj));
            obj = "X\023(d(,a";
            j = 25;
            i = 24;
            continue; /* Loop/switch isn't completed */

        case 24: // '\030'
            as1[j] = ((String) (obj));
            j = 26;
            obj = "V\002Vd *hFm-";
            i = 25;
            continue; /* Loop/switch isn't completed */

        case 25: // '\031'
            as1[j] = ((String) (obj));
            j = 27;
            obj = "Z\004Z\003[Q";
            i = 26;
            continue; /* Loop/switch isn't completed */

        case 26: // '\032'
            as1[j] = ((String) (obj));
            j = 28;
            obj = "^\002Z\025Q";
            i = 27;
            continue; /* Loop/switch isn't completed */

        case 27: // '\033'
            as1[j] = ((String) (obj));
            j = 29;
            obj = "V\002Vd *hFm.";
            i = 28;
            continue; /* Loop/switch isn't completed */

        case 28: // '\034'
            as1[j] = ((String) (obj));
            j = 30;
            obj = "J?p?w{4[5\177J?t=jt4}";
            i = 29;
            continue; /* Loop/switch isn't completed */

        case 29: // '\035'
            as1[j] = ((String) (obj));
            j = 31;
            obj = "V\002Vd *hFn";
            i = 30;
            continue; /* Loop/switch isn't completed */

        case 30: // '\036'
            as1[j] = ((String) (obj));
            j = 32;
            obj = "V\002Vd *hFh";
            i = 31;
            continue; /* Loop/switch isn't completed */

        case 31: // '\037'
            as1[j] = ((String) (obj));
            j = 33;
            obj = "J\005_d";
            i = 32;
            continue; /* Loop/switch isn't completed */

        case 32: // ' '
            as1[j] = ((String) (obj));
            j = 34;
            obj = "V\002Vq 'd q.";
            i = 33;
            continue; /* Loop/switch isn't completed */

        case 33: // '!'
            as1[j] = ((String) (obj));
            j = 35;
            obj = "\\!(n-.";
            i = 34;
            continue; /* Loop/switch isn't completed */

        case 34: // '"'
            as1[j] = ((String) (obj));
            j = 36;
            obj = "V\002Vq 'd q),";
            i = 35;
            continue; /* Loop/switch isn't completed */

        case 35: // '#'
            as1[j] = ((String) (obj));
            j = 37;
            obj = "h8w8wh\"4m**c";
            i = 36;
            continue; /* Loop/switch isn't completed */

        case 36: // '$'
            as1[j] = ((String) (obj));
            j = 38;
            obj = "X\023R";
            i = 37;
            continue; /* Loop/switch isn't completed */

        case 37: // '%'
            as1[j] = ((String) (obj));
            j = 39;
            obj = "V\002Vq 'd q)";
            i = 38;
            continue; /* Loop/switch isn't completed */

        case 38: // '&'
            as1[j] = ((String) (obj));
            j = 40;
            obj = "V\002Vd *hFm,";
            i = 39;
            continue; /* Loop/switch isn't completed */

        case 39: // '\''
            as1[j] = ((String) (obj));
            j = 41;
            obj = "V\002Vd *hFe";
            i = 40;
            continue; /* Loop/switch isn't completed */

        case 40: // '('
            as1[j] = ((String) (obj));
            j = 42;
            obj = "h8w8wh\"4m**g";
            i = 41;
            continue; /* Loop/switch isn't completed */

        case 41: // ')'
            as1[j] = ((String) (obj));
            j = 43;
            obj = "V\002Vd *hFm";
            i = 42;
            continue; /* Loop/switch isn't completed */

        case 42: // '*'
            as1[j] = ((String) (obj));
            j = 44;
            obj = "V\002Vq 'd q+";
            i = 43;
            continue; /* Loop/switch isn't completed */

        case 43: // '+'
            as1[j] = ((String) (obj));
            j = 45;
            obj = "V\002Vd *hFm(";
            i = 44;
            continue; /* Loop/switch isn't completed */

        case 44: // ','
            as1[j] = ((String) (obj));
            j = 46;
            obj = "Z\004ZqSM";
            i = 45;
            continue; /* Loop/switch isn't completed */

        case 45: // '-'
            as1[j] = ((String) (obj));
            j = 47;
            obj = "V\002Vd *hFk";
            i = 46;
            continue; /* Loop/switch isn't completed */

        case 46: // '.'
            as1[j] = ((String) (obj));
            j = 48;
            obj = "Z\004Z\003SM";
            i = 47;
            continue; /* Loop/switch isn't completed */

        case 47: // '/'
            as1[j] = ((String) (obj));
            j = 49;
            obj = "V\002Vq 'd q!";
            i = 48;
            continue; /* Loop/switch isn't completed */

        case 48: // '0'
            as1[j] = ((String) (obj));
            j = 50;
            obj = "V\002Vq 'd q).";
            i = 49;
            continue; /* Loop/switch isn't completed */

        case 49: // '1'
            as1[j] = ((String) (obj));
            j = 51;
            obj = "V\002Vq 'd q)/";
            i = 50;
            continue; /* Loop/switch isn't completed */

        case 50: // '2'
            as1[j] = ((String) (obj));
            j = 52;
            obj = "L9p:l@\033P\017";
            i = 51;
            continue; /* Loop/switch isn't completed */

        case 51: // '3'
            as1[j] = ((String) (obj));
            j = 53;
            obj = "V\002Vd *hFd";
            i = 52;
            continue; /* Loop/switch isn't completed */

        case 52: // '4'
            as1[j] = ((String) (obj));
            j = 54;
            obj = "\\!(n--";
            i = 53;
            continue; /* Loop/switch isn't completed */

        case 53: // '5'
            as1[j] = ((String) (obj));
            z = as;
            Cp437 = new c4(z[4], 0, new int[] {
                0, 2
            }, new String[0]);
            obj = z[43];
            String s = z[39];
            ISO8859_1 = new c4(((String) (obj)), 1, new int[] {
                1, 3
            }, new String[] {
                s
            });
            ISO8859_2 = new c4(z[31], 2, 4, new String[] {
                z[22]
            });
            ISO8859_3 = new c4(z[2], 3, 5, new String[] {
                z[44]
            });
            ISO8859_4 = new c4(z[32], 4, 6, new String[] {
                z[21]
            });
            ISO8859_5 = new c4(z[3], 5, 7, new String[] {
                z[20]
            });
            ISO8859_6 = new c4(z[7], 6, 8, new String[] {
                z[34]
            });
            ISO8859_7 = new c4(z[47], 7, 9, new String[] {
                z[1]
            });
            ISO8859_8 = new c4(z[53], 8, 10, new String[] {
                z[8]
            });
            ISO8859_9 = new c4(z[41], 9, 11, new String[] {
                z[49]
            });
            ISO8859_10 = new c4(z[45], 10, 12, new String[] {
                z[51]
            });
            ISO8859_11 = new c4(z[16], 11, 13, new String[] {
                z[50]
            });
            ISO8859_13 = new c4(z[18], 12, 15, new String[] {
                z[36]
            });
            ISO8859_14 = new c4(z[40], 13, 16, new String[] {
                z[11]
            });
            ISO8859_15 = new c4(z[26], 14, 17, new String[] {
                z[17]
            });
            ISO8859_16 = new c4(z[29], 15, 18, new String[] {
                z[9]
            });
            SJIS = new c4(z[0], 16, 20, new String[] {
                z[52]
            });
            Cp1250 = new c4(z[10], 17, 21, new String[] {
                z[23]
            });
            Cp1251 = new c4(z[35], 18, 22, new String[] {
                z[24]
            });
            Cp1252 = new c4(z[54], 19, 23, new String[] {
                z[37]
            });
            Cp1256 = new c4(z[12], 20, 24, new String[] {
                z[42]
            });
            UnicodeBigUnmarked = new c4(z[30], 21, 25, new String[] {
                z[14], z[13]
            });
            UTF8 = new c4(z[33], 22, 26, new String[] {
                z[19]
            });
            obj = z[28];
            s = z[15];
            ASCII = new c4(((String) (obj)), 23, new int[] {
                27, 170
            }, new String[] {
                s
            });
            Big5 = new c4(z[5], 24, 28);
            GB18030 = new c4(z[25], 25, 29, new String[] {
                z[6], z[27], z[38]
            });
            EUC_KR = new c4(z[48], 26, 30, new String[] {
                z[46]
            });
            a = (new c4[] {
                Cp437, ISO8859_1, ISO8859_2, ISO8859_3, ISO8859_4, ISO8859_5, ISO8859_6, ISO8859_7, ISO8859_8, ISO8859_9, 
                ISO8859_10, ISO8859_11, ISO8859_13, ISO8859_14, ISO8859_15, ISO8859_16, SJIS, Cp1250, Cp1251, Cp1252, 
                Cp1256, UnicodeBigUnmarked, UTF8, ASCII, Big5, GB18030, EUC_KR
            });
            d = new HashMap();
            e = new HashMap();
            obj = values();
            i1 = obj.length;
            i = 0;
            break;
        }
_L10:
        c4 c4_1;
        if (i >= i1)
        {
            break MISSING_BLOCK_LABEL_2666;
        }
        c4_1 = obj[i];
        int ai[] = c4_1.b;
        j1 = ai.length;
        for (int k = 0; k < j1; k++)
        {
            int i2 = ai[k];
            d.put(Integer.valueOf(i2), c4_1);
        }

        break MISSING_BLOCK_LABEL_2599;
_L2:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 2548
    //                   0 2571
    //                   1 2578
    //                   2 2585
    //                   3 2592;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_2592;
_L3:
        i1 = 24;
_L9:
        obj[j1] = (char)(i1 ^ c1);
        j1++;
          goto _L8
_L4:
        i1 = 31;
          goto _L9
_L5:
        i1 = 81;
          goto _L9
_L6:
        i1 = 25;
          goto _L9
        i1 = 92;
          goto _L9
        e.put(c4_1.name(), c4_1);
        String as2[] = c4_1.c;
        int k1 = as2.length;
        for (int l = 0; l < k1; l++)
        {
            String s1 = as2[l];
            e.put(s1, c4_1);
        }

        i++;
          goto _L10
        if (true) goto _L12; else goto _L11
_L11:
    }
}
