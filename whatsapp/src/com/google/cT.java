// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            ap, fK

public final class cT extends Enum
{

    public static final cT BOOL;
    public static final cT BYTES;
    public static final cT DOUBLE;
    public static final cT ENUM;
    public static final cT FIXED32;
    public static final cT FIXED64;
    public static final cT FLOAT;
    public static final cT GROUP;
    public static final cT INT32;
    public static final cT INT64;
    public static final cT MESSAGE;
    public static final cT SFIXED32;
    public static final cT SFIXED64;
    public static final cT SINT32;
    public static final cT SINT64;
    public static final cT STRING;
    public static final cT UINT32;
    public static final cT UINT64;
    private static final cT a[];
    private static final String z[];
    private ap b;

    private cT(String s, int i, ap ap1)
    {
        super(s, i);
        b = ap1;
    }

    public static cT valueOf(fK fk)
    {
        return values()[fk.getNumber() - 1];
    }

    public static cT valueOf(String s)
    {
        return (cT)Enum.valueOf(com/google/cT, s);
    }

    public static cT[] values()
    {
        return (cT[])a.clone();
    }

    public ap getJavaType()
    {
        return b;
    }

    public fK toProto()
    {
        return fK.valueOf(ordinal() + 1);
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "R\032u_OX\032".toCharArray();
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
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "V\021r::".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1268
    //                   0 1291
    //                   1 1298
    //                   2 1305
    //                   3 1312;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_1312;
_L1:
        byte0 = 14;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 31;
          goto _L7
_L3:
        byte0 = 95;
          goto _L7
_L4:
        byte0 = 38;
          goto _L7
        byte0 = 12;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "Y\023iMZ".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1360
    //                   0 1383
    //                   1 1390
    //                   2 1397
    //                   3 1404;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_1404;
_L8:
        byte1 = 14;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 31;
          goto _L14
_L10:
        byte1 = 95;
          goto _L14
_L11:
        byte1 = 38;
          goto _L14
        byte1 = 12;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "J\026hX8+".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1452
    //                   0 1475
    //                   1 1482
    //                   2 1489
    //                   3 1496;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_1496;
_L15:
        byte2 = 14;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 31;
          goto _L21
_L17:
        byte2 = 95;
          goto _L21
_L18:
        byte2 = 38;
          goto _L21
        byte2 = 12;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "X\riY^".toCharArray();
            j = obj4.length;
            i = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1544
    //                   0 1567
    //                   1 1574
    //                   2 1581
    //                   3 1588;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_1588;
_L22:
        byte3 = 14;
_L28:
        obj3[i] = (char)(byte3 ^ c);
        i++;
          goto _L27
_L23:
        byte3 = 31;
          goto _L28
_L24:
        byte3 = 95;
          goto _L28
_L25:
        byte3 = 38;
          goto _L28
        byte3 = 12;
          goto _L28
_L34:
        byte byte3;
        if (j <= i)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            obj5 = "Y\026~IJ,m".toCharArray();
            j = obj5.length;
            i = 0;
            break MISSING_BLOCK_LABEL_179;
        }
        c = obj4[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1636
    //                   0 1660
    //                   1 1667
    //                   2 1674
    //                   3 1681;
           goto _L29 _L30 _L31 _L32 _L33
_L33:
        break MISSING_BLOCK_LABEL_1681;
_L29:
        byte4 = 14;
_L35:
        obj4[i] = (char)(byte4 ^ c);
        i++;
          goto _L34
_L30:
        byte4 = 31;
          goto _L35
_L31:
        byte4 = 95;
          goto _L35
_L32:
        byte4 = 38;
          goto _L35
        byte4 = 12;
          goto _L35
_L41:
        byte byte4;
        if (j <= i)
        {
            obj5 = (new String(((char []) (obj5)))).intern();
            obj6 = "L\031oTK[i\022".toCharArray();
            j = obj6.length;
            i = 0;
            break MISSING_BLOCK_LABEL_215;
        }
        c = obj5[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1728
    //                   0 1752
    //                   1 1759
    //                   2 1766
    //                   3 1773;
           goto _L36 _L37 _L38 _L39 _L40
_L40:
        break MISSING_BLOCK_LABEL_1773;
_L36:
        byte5 = 14;
_L42:
        obj5[i] = (char)(byte5 ^ c);
        i++;
          goto _L41
_L37:
        byte5 = 31;
          goto _L42
_L38:
        byte5 = 95;
          goto _L42
_L39:
        byte5 = 38;
          goto _L42
        byte5 = 12;
          goto _L42
_L48:
        byte byte5;
        if (j <= i)
        {
            obj6 = (new String(((char []) (obj6)))).intern();
            obj7 = "[\020sNBZ".toCharArray();
            j = obj7.length;
            i = 0;
            break MISSING_BLOCK_LABEL_251;
        }
        c = obj6[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1820
    //                   0 1844
    //                   1 1851
    //                   2 1858
    //                   3 1865;
           goto _L43 _L44 _L45 _L46 _L47
_L47:
        break MISSING_BLOCK_LABEL_1865;
_L43:
        byte6 = 14;
_L49:
        obj6[i] = (char)(byte6 ^ c);
        i++;
          goto _L48
_L44:
        byte6 = 31;
          goto _L49
_L45:
        byte6 = 95;
          goto _L49
_L46:
        byte6 = 38;
          goto _L49
        byte6 = 12;
          goto _L49
_L55:
        byte byte6;
        if (j <= i)
        {
            obj7 = (new String(((char []) (obj7)))).intern();
            obj8 = "]\020i@".toCharArray();
            j = obj8.length;
            i = 0;
            break MISSING_BLOCK_LABEL_287;
        }
        c = obj7[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1912
    //                   0 1936
    //                   1 1943
    //                   2 1950
    //                   3 1957;
           goto _L50 _L51 _L52 _L53 _L54
_L54:
        break MISSING_BLOCK_LABEL_1957;
_L50:
        byte7 = 14;
_L56:
        obj7[i] = (char)(byte7 ^ c);
        i++;
          goto _L55
_L51:
        byte7 = 31;
          goto _L56
_L52:
        byte7 = 95;
          goto _L56
_L53:
        byte7 = 38;
          goto _L56
        byte7 = 12;
          goto _L56
_L62:
        byte byte7;
        if (j <= i)
        {
            obj8 = (new String(((char []) (obj8)))).intern();
            obj9 = "L\026hX8+".toCharArray();
            j = obj9.length;
            i = 0;
            break MISSING_BLOCK_LABEL_323;
        }
        c = obj8[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2004
    //                   0 2028
    //                   1 2035
    //                   2 2042
    //                   3 2049;
           goto _L57 _L58 _L59 _L60 _L61
_L61:
        break MISSING_BLOCK_LABEL_2049;
_L57:
        byte8 = 14;
_L63:
        obj8[i] = (char)(byte8 ^ c);
        i++;
          goto _L62
_L58:
        byte8 = 31;
          goto _L63
_L59:
        byte8 = 95;
          goto _L63
_L60:
        byte8 = 38;
          goto _L63
        byte8 = 12;
          goto _L63
_L69:
        byte byte8;
        if (j <= i)
        {
            obj9 = (new String(((char []) (obj9)))).intern();
            obj10 = "Z\021sA".toCharArray();
            j = obj10.length;
            i = 0;
            break MISSING_BLOCK_LABEL_359;
        }
        c = obj9[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2096
    //                   0 2120
    //                   1 2127
    //                   2 2134
    //                   3 2141;
           goto _L64 _L65 _L66 _L67 _L68
_L68:
        break MISSING_BLOCK_LABEL_2141;
_L64:
        byte9 = 14;
_L70:
        obj9[i] = (char)(byte9 ^ c);
        i++;
          goto _L69
_L65:
        byte9 = 31;
          goto _L70
_L66:
        byte9 = 95;
          goto _L70
_L67:
        byte9 = 38;
          goto _L70
        byte9 = 12;
          goto _L70
_L76:
        byte byte9;
        if (j <= i)
        {
            obj10 = (new String(((char []) (obj10)))).intern();
            obj11 = "V\021r?<".toCharArray();
            j = obj11.length;
            i = 0;
            break MISSING_BLOCK_LABEL_395;
        }
        c = obj10[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2188
    //                   0 2212
    //                   1 2219
    //                   2 2226
    //                   3 2233;
           goto _L71 _L72 _L73 _L74 _L75
_L75:
        break MISSING_BLOCK_LABEL_2233;
_L71:
        byte10 = 14;
_L77:
        obj10[i] = (char)(byte10 ^ c);
        i++;
          goto _L76
_L72:
        byte10 = 31;
          goto _L77
_L73:
        byte10 = 95;
          goto _L77
_L74:
        byte10 = 38;
          goto _L77
        byte10 = 12;
          goto _L77
_L83:
        byte byte10;
        if (j <= i)
        {
            obj11 = (new String(((char []) (obj11)))).intern();
            obj12 = "Y\026~IJ)k".toCharArray();
            j = obj12.length;
            i = 0;
            break MISSING_BLOCK_LABEL_431;
        }
        c = obj11[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2280
    //                   0 2304
    //                   1 2311
    //                   2 2318
    //                   3 2325;
           goto _L78 _L79 _L80 _L81 _L82
_L82:
        break MISSING_BLOCK_LABEL_2325;
_L78:
        byte11 = 14;
_L84:
        obj11[i] = (char)(byte11 ^ c);
        i++;
          goto _L83
_L79:
        byte11 = 31;
          goto _L84
_L80:
        byte11 = 95;
          goto _L84
_L81:
        byte11 = 38;
          goto _L84
        byte11 = 12;
          goto _L84
_L90:
        byte byte11;
        if (j <= i)
        {
            obj12 = (new String(((char []) (obj12)))).intern();
            obj13 = "J\026hX=-".toCharArray();
            j = obj13.length;
            i = 0;
            break MISSING_BLOCK_LABEL_467;
        }
        c = obj12[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2372
    //                   0 2396
    //                   1 2403
    //                   2 2410
    //                   3 2417;
           goto _L85 _L86 _L87 _L88 _L89
_L89:
        break MISSING_BLOCK_LABEL_2417;
_L85:
        byte12 = 14;
_L91:
        obj12[i] = (char)(byte12 ^ c);
        i++;
          goto _L90
_L86:
        byte12 = 31;
          goto _L91
_L87:
        byte12 = 95;
          goto _L91
_L88:
        byte12 = 38;
          goto _L91
        byte12 = 12;
          goto _L91
_L97:
        byte byte12;
        if (j <= i)
        {
            obj13 = (new String(((char []) (obj13)))).intern();
            obj14 = "L\026hX=-".toCharArray();
            j = obj14.length;
            i = 0;
            break MISSING_BLOCK_LABEL_503;
        }
        c = obj13[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2464
    //                   0 2488
    //                   1 2495
    //                   2 2502
    //                   3 2509;
           goto _L92 _L93 _L94 _L95 _L96
_L96:
        break MISSING_BLOCK_LABEL_2509;
_L92:
        byte13 = 14;
_L98:
        obj13[i] = (char)(byte13 ^ c);
        i++;
          goto _L97
_L93:
        byte13 = 31;
          goto _L98
_L94:
        byte13 = 95;
          goto _L98
_L95:
        byte13 = 38;
          goto _L98
        byte13 = 12;
          goto _L98
_L104:
        byte byte13;
        if (j <= i)
        {
            obj14 = (new String(((char []) (obj14)))).intern();
            obj15 = "L\013tE@X".toCharArray();
            j = obj15.length;
            i = 0;
            break MISSING_BLOCK_LABEL_539;
        }
        c = obj14[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2556
    //                   0 2580
    //                   1 2587
    //                   2 2594
    //                   3 2601;
           goto _L99 _L100 _L101 _L102 _L103
_L103:
        break MISSING_BLOCK_LABEL_2601;
_L99:
        byte14 = 14;
_L105:
        obj14[i] = (char)(byte14 ^ c);
        i++;
          goto _L104
_L100:
        byte14 = 31;
          goto _L105
_L101:
        byte14 = 95;
          goto _L105
_L102:
        byte14 = 38;
          goto _L105
        byte14 = 12;
          goto _L105
_L111:
        byte byte14;
        if (j <= i)
        {
            obj15 = (new String(((char []) (obj15)))).intern();
            obj16 = "L\031oTK[l\024".toCharArray();
            j = obj16.length;
            i = 0;
            break MISSING_BLOCK_LABEL_575;
        }
        c = obj15[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2648
    //                   0 2672
    //                   1 2679
    //                   2 2686
    //                   3 2693;
           goto _L106 _L107 _L108 _L109 _L110
_L110:
        break MISSING_BLOCK_LABEL_2693;
_L106:
        byte15 = 14;
_L112:
        obj15[i] = (char)(byte15 ^ c);
        i++;
          goto _L111
_L107:
        byte15 = 31;
          goto _L112
_L108:
        byte15 = 95;
          goto _L112
_L109:
        byte15 = 38;
          goto _L112
        byte15 = 12;
          goto _L112
_L118:
        byte byte15;
        if (j <= i)
        {
            obj16 = (new String(((char []) (obj16)))).intern();
            ac = "]\006rI]".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_611;
        }
        c = obj16[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2740
    //                   0 2764
    //                   1 2771
    //                   2 2778
    //                   3 2785;
           goto _L113 _L114 _L115 _L116 _L117
_L117:
        break MISSING_BLOCK_LABEL_2785;
_L113:
        byte16 = 14;
_L119:
        obj16[i] = (char)(byte16 ^ c);
        i++;
          goto _L118
_L114:
        byte16 = 31;
          goto _L119
_L115:
        byte16 = 95;
          goto _L119
_L116:
        byte16 = 38;
          goto _L119
        byte16 = 12;
          goto _L119
_L126:
        byte byte16;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
                obj10, obj11, obj12, obj13, obj14, obj15, obj16, (new String(ac)).intern()
            });
            DOUBLE = new cT(z[7], 0, ap.DOUBLE);
            FLOAT = new cT(z[2], 1, ap.FLOAT);
            INT64 = new cT(z[1], 2, ap.LONG);
            UINT64 = new cT(z[3], 3, ap.LONG);
            INT32 = new cT(z[11], 4, ap.INT);
            FIXED64 = new cT(z[12], 5, ap.LONG);
            FIXED32 = new cT(z[5], 6, ap.INT);
            BOOL = new cT(z[8], 7, ap.BOOLEAN);
            STRING = new cT(z[15], 8, ap.STRING);
            GROUP = new cT(z[4], 9, ap.MESSAGE);
            MESSAGE = new cT(z[0], 10, ap.MESSAGE);
            BYTES = new cT(z[17], 11, ap.BYTE_STRING);
            UINT32 = new cT(z[13], 12, ap.INT);
            ENUM = new cT(z[10], 13, ap.ENUM);
            SFIXED32 = new cT(z[16], 14, ap.INT);
            SFIXED64 = new cT(z[6], 15, ap.LONG);
            SINT32 = new cT(z[14], 16, ap.INT);
            SINT64 = new cT(z[9], 17, ap.LONG);
            a = (new cT[] {
                DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, 
                MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2832
    //                   0 2856
    //                   1 2863
    //                   2 2870
    //                   3 2877;
           goto _L120 _L121 _L122 _L123 _L124
_L121:
        break; /* Loop/switch isn't completed */
_L124:
        break MISSING_BLOCK_LABEL_2877;
_L120:
        byte byte17 = 14;
_L127:
        ac[i] = (char)(byte17 ^ c);
        i++;
        if (true) goto _L126; else goto _L125
_L125:
        byte17 = 31;
          goto _L127
_L122:
        byte17 = 95;
          goto _L127
_L123:
        byte17 = 38;
          goto _L127
        byte17 = 12;
          goto _L127
    }
}
