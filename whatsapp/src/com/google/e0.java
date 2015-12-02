// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            bv, et, ex, eX, 
//            eO, cM

public class e0 extends Enum
{

    public static final e0 BOOL;
    public static final e0 BYTES;
    public static final e0 DOUBLE;
    public static final e0 ENUM;
    public static final e0 FIXED32;
    public static final e0 FIXED64;
    public static final e0 FLOAT;
    public static final e0 GROUP;
    public static final e0 INT32;
    public static final e0 INT64;
    public static final e0 MESSAGE;
    public static final e0 SFIXED32;
    public static final e0 SFIXED64;
    public static final e0 SINT32;
    public static final e0 SINT64;
    public static final e0 STRING;
    public static final e0 UINT32;
    public static final e0 UINT64;
    private static final e0 a[];
    private static final String z[];
    private final bv b;
    private final int c;

    private e0(String s, int i, bv bv1, int j)
    {
        super(s, i);
        b = bv1;
        c = j;
    }

    e0(String s, int i, bv bv1, int j, cM cm)
    {
        this(s, i, bv1, j);
    }

    public static e0 valueOf(String s)
    {
        return (e0)Enum.valueOf(com/google/e0, s);
    }

    public static e0[] values()
    {
        return (e0[])a.clone();
    }

    public bv getJavaType()
    {
        return b;
    }

    public int getWireType()
    {
        return c;
    }

    public boolean isPackable()
    {
        return true;
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "l\037\033\001U\r".toCharArray();
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
        char c1;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "\177\037\r\020'\nd".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c1 = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1288
    //                   0 1311
    //                   1 1318
    //                   2 1325
    //                   3 1332;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_1332;
_L1:
        byte0 = 99;
_L7:
        obj[i] = (char)(byte0 ^ c1);
        i++;
          goto _L6
_L2:
        byte0 = 57;
          goto _L7
_L3:
        byte0 = 86;
          goto _L7
_L4:
        byte0 = 85;
          goto _L7
        byte0 = 85;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "j\002\007\034-~".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c1 = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1380
    //                   0 1403
    //                   1 1410
    //                   2 1417
    //                   3 1424;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_1424;
_L8:
        byte1 = 99;
_L14:
        obj1[i] = (char)(byte1 ^ c1);
        i++;
          goto _L13
_L9:
        byte1 = 57;
          goto _L14
_L10:
        byte1 = 86;
          goto _L14
_L11:
        byte1 = 85;
          goto _L14
        byte1 = 85;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "}\031\000\027/|".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c1 = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1472
    //                   0 1495
    //                   1 1502
    //                   2 1509
    //                   3 1516;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_1516;
_L15:
        byte2 = 99;
_L21:
        obj2[i] = (char)(byte2 ^ c1);
        i++;
          goto _L20
_L16:
        byte2 = 57;
          goto _L21
_L17:
        byte2 = 86;
          goto _L21
_L18:
        byte2 = 85;
          goto _L21
        byte2 = 85;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "t\023\006\006\"~\023".toCharArray();
            j = obj4.length;
            i = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c1 = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1564
    //                   0 1587
    //                   1 1594
    //                   2 1601
    //                   3 1608;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_1608;
_L22:
        byte3 = 99;
_L28:
        obj3[i] = (char)(byte3 ^ c1);
        i++;
          goto _L27
_L23:
        byte3 = 57;
          goto _L28
_L24:
        byte3 = 86;
          goto _L28
_L25:
        byte3 = 85;
          goto _L28
        byte3 = 85;
          goto _L28
_L34:
        byte byte3;
        if (j <= i)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            obj5 = "{\031\032\031".toCharArray();
            j = obj5.length;
            i = 0;
            break MISSING_BLOCK_LABEL_179;
        }
        c1 = obj4[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1656
    //                   0 1680
    //                   1 1687
    //                   2 1694
    //                   3 1701;
           goto _L29 _L30 _L31 _L32 _L33
_L33:
        break MISSING_BLOCK_LABEL_1701;
_L29:
        byte4 = 99;
_L35:
        obj4[i] = (char)(byte4 ^ c1);
        i++;
          goto _L34
_L30:
        byte4 = 57;
          goto _L35
_L31:
        byte4 = 86;
          goto _L35
_L32:
        byte4 = 85;
          goto _L35
        byte4 = 85;
          goto _L35
_L41:
        byte byte4;
        if (j <= i)
        {
            obj5 = (new String(((char []) (obj5)))).intern();
            obj6 = "p\030\001fQ".toCharArray();
            j = obj6.length;
            i = 0;
            break MISSING_BLOCK_LABEL_215;
        }
        c1 = obj5[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1748
    //                   0 1772
    //                   1 1779
    //                   2 1786
    //                   3 1793;
           goto _L36 _L37 _L38 _L39 _L40
_L40:
        break MISSING_BLOCK_LABEL_1793;
_L36:
        byte5 = 99;
_L42:
        obj5[i] = (char)(byte5 ^ c1);
        i++;
          goto _L41
_L37:
        byte5 = 57;
          goto _L42
_L38:
        byte5 = 86;
          goto _L42
_L39:
        byte5 = 85;
          goto _L42
        byte5 = 85;
          goto _L42
_L48:
        byte byte5;
        if (j <= i)
        {
            obj6 = (new String(((char []) (obj6)))).intern();
            obj7 = "\177\037\r\020'\017b".toCharArray();
            j = obj7.length;
            i = 0;
            break MISSING_BLOCK_LABEL_251;
        }
        c1 = obj6[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1840
    //                   0 1864
    //                   1 1871
    //                   2 1878
    //                   3 1885;
           goto _L43 _L44 _L45 _L46 _L47
_L47:
        break MISSING_BLOCK_LABEL_1885;
_L43:
        byte6 = 99;
_L49:
        obj6[i] = (char)(byte6 ^ c1);
        i++;
          goto _L48
_L44:
        byte6 = 57;
          goto _L49
_L45:
        byte6 = 86;
          goto _L49
_L46:
        byte6 = 85;
          goto _L49
        byte6 = 85;
          goto _L49
_L55:
        byte byte6;
        if (j <= i)
        {
            obj7 = (new String(((char []) (obj7)))).intern();
            obj8 = "j\020\034\r&}`a".toCharArray();
            j = obj8.length;
            i = 0;
            break MISSING_BLOCK_LABEL_287;
        }
        c1 = obj7[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1932
    //                   0 1956
    //                   1 1963
    //                   2 1970
    //                   3 1977;
           goto _L50 _L51 _L52 _L53 _L54
_L54:
        break MISSING_BLOCK_LABEL_1977;
_L50:
        byte7 = 99;
_L56:
        obj7[i] = (char)(byte7 ^ c1);
        i++;
          goto _L55
_L51:
        byte7 = 57;
          goto _L56
_L52:
        byte7 = 86;
          goto _L56
_L53:
        byte7 = 85;
          goto _L56
        byte7 = 85;
          goto _L56
_L62:
        byte byte7;
        if (j <= i)
        {
            obj8 = (new String(((char []) (obj8)))).intern();
            obj9 = "l\037\033\001P\013".toCharArray();
            j = obj9.length;
            i = 0;
            break MISSING_BLOCK_LABEL_323;
        }
        c1 = obj8[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2024
    //                   0 2048
    //                   1 2055
    //                   2 2062
    //                   3 2069;
           goto _L57 _L58 _L59 _L60 _L61
_L61:
        break MISSING_BLOCK_LABEL_2069;
_L57:
        byte8 = 99;
_L63:
        obj8[i] = (char)(byte8 ^ c1);
        i++;
          goto _L62
_L58:
        byte8 = 57;
          goto _L63
_L59:
        byte8 = 86;
          goto _L63
_L60:
        byte8 = 85;
          goto _L63
        byte8 = 85;
          goto _L63
_L69:
        byte byte8;
        if (j <= i)
        {
            obj9 = (new String(((char []) (obj9)))).intern();
            obj10 = "{\017\001\0200".toCharArray();
            j = obj10.length;
            i = 0;
            break MISSING_BLOCK_LABEL_359;
        }
        c1 = obj9[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2116
    //                   0 2140
    //                   1 2147
    //                   2 2154
    //                   3 2161;
           goto _L64 _L65 _L66 _L67 _L68
_L68:
        break MISSING_BLOCK_LABEL_2161;
_L64:
        byte9 = 99;
_L70:
        obj9[i] = (char)(byte9 ^ c1);
        i++;
          goto _L69
_L65:
        byte9 = 57;
          goto _L70
_L66:
        byte9 = 86;
          goto _L70
_L67:
        byte9 = 85;
          goto _L70
        byte9 = 85;
          goto _L70
_L76:
        byte byte9;
        if (j <= i)
        {
            obj10 = (new String(((char []) (obj10)))).intern();
            obj11 = "p\030\001cW".toCharArray();
            j = obj11.length;
            i = 0;
            break MISSING_BLOCK_LABEL_395;
        }
        c1 = obj10[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2208
    //                   0 2232
    //                   1 2239
    //                   2 2246
    //                   3 2253;
           goto _L71 _L72 _L73 _L74 _L75
_L75:
        break MISSING_BLOCK_LABEL_2253;
_L71:
        byte10 = 99;
_L77:
        obj10[i] = (char)(byte10 ^ c1);
        i++;
          goto _L76
_L72:
        byte10 = 57;
          goto _L77
_L73:
        byte10 = 86;
          goto _L77
_L74:
        byte10 = 85;
          goto _L77
        byte10 = 85;
          goto _L77
_L83:
        byte byte10;
        if (j <= i)
        {
            obj11 = (new String(((char []) (obj11)))).intern();
            obj12 = "\177\032\032\0247".toCharArray();
            j = obj12.length;
            i = 0;
            break MISSING_BLOCK_LABEL_431;
        }
        c1 = obj11[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2300
    //                   0 2324
    //                   1 2331
    //                   2 2338
    //                   3 2345;
           goto _L78 _L79 _L80 _L81 _L82
_L82:
        break MISSING_BLOCK_LABEL_2345;
_L78:
        byte11 = 99;
_L84:
        obj11[i] = (char)(byte11 ^ c1);
        i++;
          goto _L83
_L79:
        byte11 = 57;
          goto _L84
_L80:
        byte11 = 86;
          goto _L84
_L81:
        byte11 = 85;
          goto _L84
        byte11 = 85;
          goto _L84
_L90:
        byte byte11;
        if (j <= i)
        {
            obj12 = (new String(((char []) (obj12)))).intern();
            obj13 = "j\037\033\001P\013".toCharArray();
            j = obj13.length;
            i = 0;
            break MISSING_BLOCK_LABEL_467;
        }
        c1 = obj12[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2392
    //                   0 2416
    //                   1 2423
    //                   2 2430
    //                   3 2437;
           goto _L85 _L86 _L87 _L88 _L89
_L89:
        break MISSING_BLOCK_LABEL_2437;
_L85:
        byte12 = 99;
_L91:
        obj12[i] = (char)(byte12 ^ c1);
        i++;
          goto _L90
_L86:
        byte12 = 57;
          goto _L91
_L87:
        byte12 = 86;
          goto _L91
_L88:
        byte12 = 85;
          goto _L91
        byte12 = 85;
          goto _L91
_L97:
        byte byte12;
        if (j <= i)
        {
            obj13 = (new String(((char []) (obj13)))).intern();
            obj14 = "j\037\033\001U\r".toCharArray();
            j = obj14.length;
            i = 0;
            break MISSING_BLOCK_LABEL_503;
        }
        c1 = obj13[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2484
    //                   0 2508
    //                   1 2515
    //                   2 2522
    //                   3 2529;
           goto _L92 _L93 _L94 _L95 _L96
_L96:
        break MISSING_BLOCK_LABEL_2529;
_L92:
        byte13 = 99;
_L98:
        obj13[i] = (char)(byte13 ^ c1);
        i++;
          goto _L97
_L93:
        byte13 = 57;
          goto _L98
_L94:
        byte13 = 86;
          goto _L98
_L95:
        byte13 = 85;
          goto _L98
        byte13 = 85;
          goto _L98
_L104:
        byte byte13;
        if (j <= i)
        {
            obj14 = (new String(((char []) (obj14)))).intern();
            obj15 = "j\020\034\r&}eg".toCharArray();
            j = obj15.length;
            i = 0;
            break MISSING_BLOCK_LABEL_539;
        }
        c1 = obj14[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2576
    //                   0 2600
    //                   1 2607
    //                   2 2614
    //                   3 2621;
           goto _L99 _L100 _L101 _L102 _L103
_L103:
        break MISSING_BLOCK_LABEL_2621;
_L99:
        byte14 = 99;
_L105:
        obj14[i] = (char)(byte14 ^ c1);
        i++;
          goto _L104
_L100:
        byte14 = 57;
          goto _L105
_L101:
        byte14 = 86;
          goto _L105
_L102:
        byte14 = 85;
          goto _L105
        byte14 = 85;
          goto _L105
_L111:
        byte byte14;
        if (j <= i)
        {
            obj15 = (new String(((char []) (obj15)))).intern();
            obj16 = "~\004\032\0003".toCharArray();
            j = obj16.length;
            i = 0;
            break MISSING_BLOCK_LABEL_575;
        }
        c1 = obj15[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2668
    //                   0 2692
    //                   1 2699
    //                   2 2706
    //                   3 2713;
           goto _L106 _L107 _L108 _L109 _L110
_L110:
        break MISSING_BLOCK_LABEL_2713;
_L106:
        byte15 = 99;
_L112:
        obj15[i] = (char)(byte15 ^ c1);
        i++;
          goto _L111
_L107:
        byte15 = 57;
          goto _L112
_L108:
        byte15 = 86;
          goto _L112
_L109:
        byte15 = 85;
          goto _L112
        byte15 = 85;
          goto _L112
_L118:
        byte byte15;
        if (j <= i)
        {
            obj16 = (new String(((char []) (obj16)))).intern();
            ac = "|\030\000\030".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_611;
        }
        c1 = obj16[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2760
    //                   0 2784
    //                   1 2791
    //                   2 2798
    //                   3 2805;
           goto _L113 _L114 _L115 _L116 _L117
_L117:
        break MISSING_BLOCK_LABEL_2805;
_L113:
        byte16 = 99;
_L119:
        obj16[i] = (char)(byte16 ^ c1);
        i++;
          goto _L118
_L114:
        byte16 = 57;
          goto _L119
_L115:
        byte16 = 86;
          goto _L119
_L116:
        byte16 = 85;
          goto _L119
        byte16 = 85;
          goto _L119
_L126:
        byte byte16;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
                obj10, obj11, obj12, obj13, obj14, obj15, obj16, (new String(ac)).intern()
            });
            DOUBLE = new e0(z[3], 0, bv.DOUBLE, 1);
            FLOAT = new e0(z[12], 1, bv.FLOAT, 5);
            INT64 = new e0(z[11], 2, bv.LONG, 0);
            UINT64 = new e0(z[0], 3, bv.LONG, 0);
            INT32 = new e0(z[6], 4, bv.INT, 0);
            FIXED64 = new e0(z[7], 5, bv.LONG, 1);
            FIXED32 = new e0(z[1], 6, bv.INT, 5);
            BOOL = new e0(z[5], 7, bv.BOOLEAN, 0);
            STRING = new et(z[2], 8, bv.STRING, 2);
            GROUP = new ex(z[16], 9, bv.MESSAGE, 3);
            MESSAGE = new eX(z[4], 10, bv.MESSAGE, 2);
            BYTES = new eO(z[10], 11, bv.BYTE_STRING, 2);
            UINT32 = new e0(z[9], 12, bv.INT, 0);
            ENUM = new e0(z[17], 13, bv.ENUM, 0);
            SFIXED32 = new e0(z[15], 14, bv.INT, 5);
            SFIXED64 = new e0(z[8], 15, bv.LONG, 1);
            SINT32 = new e0(z[13], 16, bv.INT, 0);
            SINT64 = new e0(z[14], 17, bv.LONG, 0);
            a = (new e0[] {
                DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, 
                MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64
            });
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2852
    //                   0 2876
    //                   1 2883
    //                   2 2890
    //                   3 2897;
           goto _L120 _L121 _L122 _L123 _L124
_L121:
        break; /* Loop/switch isn't completed */
_L124:
        break MISSING_BLOCK_LABEL_2897;
_L120:
        byte byte17 = 99;
_L127:
        ac[i] = (char)(byte17 ^ c1);
        i++;
        if (true) goto _L126; else goto _L125
_L125:
        byte17 = 57;
          goto _L127
_L122:
        byte17 = 86;
          goto _L127
_L123:
        byte17 = 85;
          goto _L127
        byte17 = 85;
          goto _L127
    }
}
