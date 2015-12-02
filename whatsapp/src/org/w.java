// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org;


public final class w extends Enum
{

    public static final w ALL;
    public static final w BODY;
    public static final w BODYSTRUCTURE;
    public static final w ENVELOPE;
    public static final w FAST;
    public static final w FLAGS;
    public static final w FULL;
    public static final w INTERNALDATE;
    public static final w RFC822;
    public static final w UID;
    private static final w a[];
    private static final String z[];

    private w(String s, int i)
    {
        super(s, i);
    }

    public static w valueOf(String s)
    {
        return (w)Enum.valueOf(org/w, s);
    }

    public static w[] values()
    {
        return (w[])a.clone();
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "S}\022BcYc\001".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "Du\007?\035$".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 680
    //                   0 703
    //                   1 710
    //                   2 717
    //                   3 724;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_724;
_L1:
        byte0 = 47;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 22;
          goto _L7
_L3:
        byte0 = 51;
          goto _L7
_L4:
        byte0 = 68;
          goto _L7
        byte0 = 7;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "_}\020B}Xr\bCnBv".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 772
    //                   0 795
    //                   1 802
    //                   2 809
    //                   3 816;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_816;
_L8:
        byte1 = 47;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 22;
          goto _L14
_L10:
        byte1 = 51;
          goto _L14
_L11:
        byte1 = 68;
          goto _L14
        byte1 = 7;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "W\177\b".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 864
    //                   0 887
    //                   1 894
    //                   2 901
    //                   3 908;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_908;
_L15:
        byte2 = 47;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 22;
          goto _L21
_L17:
        byte2 = 51;
          goto _L21
_L18:
        byte2 = 68;
          goto _L21
        byte2 = 7;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "Pr\027S".toCharArray();
            j = obj4.length;
            i = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 956
    //                   0 979
    //                   1 986
    //                   2 993
    //                   3 1000;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_1000;
_L22:
        byte3 = 47;
_L28:
        obj3[i] = (char)(byte3 ^ c);
        i++;
          goto _L27
_L23:
        byte3 = 22;
          goto _L28
_L24:
        byte3 = 51;
          goto _L28
_L25:
        byte3 = 68;
          goto _L28
        byte3 = 7;
          goto _L28
_L34:
        byte byte3;
        if (j <= i)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            obj5 = "T|\000^".toCharArray();
            j = obj5.length;
            i = 0;
            break MISSING_BLOCK_LABEL_179;
        }
        c = obj4[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1048
    //                   0 1072
    //                   1 1079
    //                   2 1086
    //                   3 1093;
           goto _L29 _L30 _L31 _L32 _L33
_L33:
        break MISSING_BLOCK_LABEL_1093;
_L29:
        byte4 = 47;
_L35:
        obj4[i] = (char)(byte4 ^ c);
        i++;
          goto _L34
_L30:
        byte4 = 22;
          goto _L35
_L31:
        byte4 = 51;
          goto _L35
_L32:
        byte4 = 68;
          goto _L35
        byte4 = 7;
          goto _L35
_L41:
        byte byte4;
        if (j <= i)
        {
            obj5 = (new String(((char []) (obj5)))).intern();
            obj6 = "P\177\005@|".toCharArray();
            j = obj6.length;
            i = 0;
            break MISSING_BLOCK_LABEL_215;
        }
        c = obj5[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1140
    //                   0 1164
    //                   1 1171
    //                   2 1178
    //                   3 1185;
           goto _L36 _L37 _L38 _L39 _L40
_L40:
        break MISSING_BLOCK_LABEL_1185;
_L36:
        byte5 = 47;
_L42:
        obj5[i] = (char)(byte5 ^ c);
        i++;
          goto _L41
_L37:
        byte5 = 22;
          goto _L42
_L38:
        byte5 = 51;
          goto _L42
_L39:
        byte5 = 68;
          goto _L42
        byte5 = 7;
          goto _L42
_L48:
        byte byte5;
        if (j <= i)
        {
            obj6 = (new String(((char []) (obj6)))).intern();
            obj7 = "T|\000^|Ba\021D{Ca\001".toCharArray();
            j = obj7.length;
            i = 0;
            break MISSING_BLOCK_LABEL_251;
        }
        c = obj6[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1232
    //                   0 1256
    //                   1 1263
    //                   2 1270
    //                   3 1277;
           goto _L43 _L44 _L45 _L46 _L47
_L47:
        break MISSING_BLOCK_LABEL_1277;
_L43:
        byte6 = 47;
_L49:
        obj6[i] = (char)(byte6 ^ c);
        i++;
          goto _L48
_L44:
        byte6 = 22;
          goto _L49
_L45:
        byte6 = 51;
          goto _L49
_L46:
        byte6 = 68;
          goto _L49
        byte6 = 7;
          goto _L49
_L55:
        byte byte6;
        if (j <= i)
        {
            obj7 = (new String(((char []) (obj7)))).intern();
            obj8 = "Pf\bK".toCharArray();
            j = obj8.length;
            i = 0;
            break MISSING_BLOCK_LABEL_287;
        }
        c = obj7[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1324
    //                   0 1348
    //                   1 1355
    //                   2 1362
    //                   3 1369;
           goto _L50 _L51 _L52 _L53 _L54
_L54:
        break MISSING_BLOCK_LABEL_1369;
_L50:
        byte7 = 47;
_L56:
        obj7[i] = (char)(byte7 ^ c);
        i++;
          goto _L55
_L51:
        byte7 = 22;
          goto _L56
_L52:
        byte7 = 51;
          goto _L56
_L53:
        byte7 = 68;
          goto _L56
        byte7 = 7;
          goto _L56
_L62:
        byte byte7;
        if (j <= i)
        {
            obj8 = (new String(((char []) (obj8)))).intern();
            ac = "Cz\0".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_323;
        }
        c = obj8[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1416
    //                   0 1440
    //                   1 1447
    //                   2 1454
    //                   3 1461;
           goto _L57 _L58 _L59 _L60 _L61
_L61:
        break MISSING_BLOCK_LABEL_1461;
_L57:
        byte8 = 47;
_L63:
        obj8[i] = (char)(byte8 ^ c);
        i++;
          goto _L62
_L58:
        byte8 = 22;
          goto _L63
_L59:
        byte8 = 51;
          goto _L63
_L60:
        byte8 = 68;
          goto _L63
        byte8 = 7;
          goto _L63
_L70:
        byte byte8;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, (new String(ac)).intern()
            });
            ALL = new w(z[3], 0);
            FAST = new w(z[4], 1);
            FULL = new w(z[8], 2);
            BODY = new w(z[5], 3);
            BODYSTRUCTURE = new w(z[7], 4);
            ENVELOPE = new w(z[0], 5);
            FLAGS = new w(z[6], 6);
            INTERNALDATE = new w(z[2], 7);
            RFC822 = new w(z[1], 8);
            UID = new w(z[9], 9);
            a = (new w[] {
                ALL, FAST, FULL, BODY, BODYSTRUCTURE, ENVELOPE, FLAGS, INTERNALDATE, RFC822, UID
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1508
    //                   0 1532
    //                   1 1539
    //                   2 1546
    //                   3 1553;
           goto _L64 _L65 _L66 _L67 _L68
_L65:
        break; /* Loop/switch isn't completed */
_L68:
        break MISSING_BLOCK_LABEL_1553;
_L64:
        byte byte9 = 47;
_L71:
        ac[i] = (char)(byte9 ^ c);
        i++;
        if (true) goto _L70; else goto _L69
_L69:
        byte9 = 22;
          goto _L71
_L66:
        byte9 = 51;
          goto _L71
_L67:
        byte9 = 68;
          goto _L71
        byte9 = 7;
          goto _L71
    }
}
