// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            DigestAlgorithmProvider, SHA1

public class ovider extends DigestAlgorithmProvider
{

    private static final String PREFIX;
    private static final String z[];

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm(z[14], (new StringBuilder()).append(PREFIX).append(z[3]).toString());
        configurableprovider.addAlgorithm(z[0], z[1]);
        configurableprovider.addAlgorithm(z[6], z[10]);
        addHMACAlgorithm(configurableprovider, z[4], (new StringBuilder()).append(PREFIX).append(z[8]).toString(), (new StringBuilder()).append(PREFIX).append(z[12]).toString());
        configurableprovider.addAlgorithm(z[2], (new StringBuilder()).append(PREFIX).append(z[5]).toString());
        configurableprovider.addAlgorithm(z[13], z[9]);
        configurableprovider.addAlgorithm(z[11], (new StringBuilder()).append(PREFIX).append(z[7]).toString());
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "GNv\021 jKpLOKGbL\000aGUV\006cQe\0212Nc ".toCharArray();
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
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "UjP\022P".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 656
    //                   0 679
    //                   1 686
    //                   2 693
    //                   3 700;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_700;
_L1:
        byte0 = 97;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 6;
          goto _L7
_L3:
        byte0 = 34;
          goto _L7
_L4:
        byte0 = 17;
          goto _L7
        byte0 = 63;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "UGrM\004ritF'gAeP\023\177\fA}*Bd#h\brJYR\000eqY~P".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 748
    //                   0 771
    //                   1 778
    //                   2 785
    //                   3 792;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_792;
_L8:
        byte1 = 97;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 6;
          goto _L14
_L10:
        byte1 = 34;
          goto _L14
_L11:
        byte1 = 17;
          goto _L14
        byte1 = 63;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "\"fxX\004uV".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 840
    //                   0 863
    //                   1 870
    //                   2 877
    //                   3 884;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_884;
_L15:
        byte2 = 97;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 6;
          goto _L21
_L17:
        byte2 = 34;
          goto _L21
_L18:
        byte2 = 17;
          goto _L21
        byte2 = 63;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "UjP\016".toCharArray();
            j = obj4.length;
            i = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 932
    //                   0 955
    //                   1 962
    //                   2 969
    //                   3 976;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_976;
_L22:
        byte3 = 97;
_L28:
        obj3[i] = (char)(byte3 ^ c);
        i++;
          goto _L27
_L23:
        byte3 = 6;
          goto _L28
_L24:
        byte3 = 34;
          goto _L28
_L25:
        byte3 = 17;
          goto _L28
        byte3 = 63;
          goto _L28
_L34:
        byte byte3;
        if (j <= i)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            obj5 = "\"rSt%@\020FV\025nj|^\002UjP\0164Rd)".toCharArray();
            j = obj5.length;
            i = 0;
            break MISSING_BLOCK_LABEL_179;
        }
        c = obj4[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1024
    //                   0 1048
    //                   1 1055
    //                   2 1062
    //                   3 1069;
           goto _L29 _L30 _L31 _L32 _L33
_L33:
        break MISSING_BLOCK_LABEL_1069;
_L29:
        byte4 = 97;
_L35:
        obj4[i] = (char)(byte4 ^ c);
        i++;
          goto _L34
_L30:
        byte4 = 6;
          goto _L35
_L31:
        byte4 = 34;
          goto _L35
_L32:
        byte4 = 17;
          goto _L35
        byte4 = 63;
          goto _L35
_L41:
        byte byte4;
        if (j <= i)
        {
            obj5 = (new String(((char []) (obj5)))).intern();
            obj6 = "GNv\021 jKpLOKGbL\000aGUV\006cQe\0212Nc".toCharArray();
            j = obj6.length;
            i = 0;
            break MISSING_BLOCK_LABEL_215;
        }
        c = obj5[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1116
    //                   0 1140
    //                   1 1147
    //                   2 1154
    //                   3 1161;
           goto _L36 _L37 _L38 _L39 _L40
_L40:
        break MISSING_BLOCK_LABEL_1161;
_L36:
        byte5 = 97;
_L42:
        obj5[i] = (char)(byte5 ^ c);
        i++;
          goto _L41
_L37:
        byte5 = 6;
          goto _L42
_L38:
        byte5 = 34;
          goto _L42
_L39:
        byte5 = 17;
          goto _L42
        byte5 = 63;
          goto _L42
_L48:
        byte byte5;
        if (j <= i)
        {
            obj6 = (new String(((char []) (obj6)))).intern();
            obj7 = "\"rSt%@\020FV\025nj|^\002UjP\016YDkE".toCharArray();
            j = obj7.length;
            i = 0;
            break MISSING_BLOCK_LABEL_251;
        }
        c = obj6[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1208
    //                   0 1232
    //                   1 1239
    //                   2 1246
    //                   3 1253;
           goto _L43 _L44 _L45 _L46 _L47
_L47:
        break MISSING_BLOCK_LABEL_1253;
_L43:
        byte6 = 97;
_L49:
        obj6[i] = (char)(byte6 ^ c);
        i++;
          goto _L48
_L44:
        byte6 = 6;
          goto _L49
_L45:
        byte6 = 34;
          goto _L49
_L46:
        byte6 = 17;
          goto _L49
        byte6 = 63;
          goto _L49
_L55:
        byte byte6;
        if (j <= i)
        {
            obj7 = (new String(((char []) (obj7)))).intern();
            obj8 = "\"jpL\tKCr".toCharArray();
            j = obj8.length;
            i = 0;
            break MISSING_BLOCK_LABEL_287;
        }
        c = obj7[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1300
    //                   0 1324
    //                   1 1331
    //                   2 1338
    //                   3 1345;
           goto _L50 _L51 _L52 _L53 _L54
_L54:
        break MISSING_BLOCK_LABEL_1345;
_L50:
        byte7 = 97;
_L56:
        obj7[i] = (char)(byte7 ^ c);
        i++;
          goto _L55
_L51:
        byte7 = 6;
          goto _L56
_L52:
        byte7 = 34;
          goto _L56
_L53:
        byte7 = 17;
          goto _L56
        byte7 = 63;
          goto _L56
_L62:
        byte byte7;
        if (j <= i)
        {
            obj8 = (new String(((char []) (obj8)))).intern();
            obj9 = "V`Z{'4uxK\tNOp\\2Nc ".toCharArray();
            j = obj9.length;
            i = 0;
            break MISSING_BLOCK_LABEL_323;
        }
        c = obj8[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1392
    //                   0 1416
    //                   1 1423
    //                   2 1430
    //                   3 1437;
           goto _L57 _L58 _L59 _L60 _L61
_L61:
        break MISSING_BLOCK_LABEL_1437;
_L57:
        byte8 = 97;
_L63:
        obj8[i] = (char)(byte8 ^ c);
        i++;
          goto _L62
_L58:
        byte8 = 6;
          goto _L63
_L59:
        byte8 = 34;
          goto _L63
_L60:
        byte8 = 17;
          goto _L63
        byte8 = 63;
          goto _L63
_L69:
        byte byte8;
        if (j <= i)
        {
            obj9 = (new String(((char []) (obj9)))).intern();
            obj10 = "UjP\022P".toCharArray();
            j = obj10.length;
            i = 0;
            break MISSING_BLOCK_LABEL_359;
        }
        c = obj9[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1484
    //                   0 1508
    //                   1 1515
    //                   2 1522
    //                   3 1529;
           goto _L64 _L65 _L66 _L67 _L68
_L68:
        break MISSING_BLOCK_LABEL_1529;
_L64:
        byte9 = 97;
_L70:
        obj9[i] = (char)(byte9 ^ c);
        i++;
          goto _L69
_L65:
        byte9 = 6;
          goto _L70
_L66:
        byte9 = 34;
          goto _L70
_L67:
        byte9 = 17;
          goto _L70
        byte9 = 63;
          goto _L70
_L76:
        byte byte9;
        if (j <= i)
        {
            obj10 = (new String(((char []) (obj10)))).intern();
            obj11 = "UGrM\004ritF'gAeP\023\177\fA}*Bd#h\brJYR\000eqY~PGLu\007#Ov".toCharArray();
            j = obj11.length;
            i = 0;
            break MISSING_BLOCK_LABEL_395;
        }
        c = obj10[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1576
    //                   0 1600
    //                   1 1607
    //                   2 1614
    //                   3 1621;
           goto _L71 _L72 _L73 _L74 _L75
_L75:
        break MISSING_BLOCK_LABEL_1621;
_L71:
        byte10 = 97;
_L77:
        obj10[i] = (char)(byte10 ^ c);
        i++;
          goto _L76
_L72:
        byte10 = 6;
          goto _L77
_L73:
        byte10 = 34;
          goto _L77
_L74:
        byte10 = 17;
          goto _L77
        byte10 = 63;
          goto _L77
_L83:
        byte byte10;
        if (j <= i)
        {
            obj11 = (new String(((char []) (obj11)))).intern();
            obj12 = "\"itF&cLtM\000rMc".toCharArray();
            j = obj12.length;
            i = 0;
            break MISSING_BLOCK_LABEL_431;
        }
        c = obj11[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1668
    //                   0 1692
    //                   1 1699
    //                   2 1706
    //                   3 1713;
           goto _L78 _L79 _L80 _L81 _L82
_L82:
        break MISSING_BLOCK_LABEL_1713;
_L78:
        byte11 = 97;
_L84:
        obj11[i] = (char)(byte11 ^ c);
        i++;
          goto _L83
_L79:
        byte11 = 6;
          goto _L84
_L80:
        byte11 = 34;
          goto _L84
_L81:
        byte11 = 17;
          goto _L84
        byte11 = 63;
          goto _L84
_L90:
        byte byte11;
        if (j <= i)
        {
            obj12 = (new String(((char []) (obj12)))).intern();
            obj13 = "GNv\021 jKpLOUGrM\004ritF'gAeP\023\177\fA}*Bd#h\brJYR\000eqY~PGLuj5@\032".toCharArray();
            j = obj13.length;
            i = 0;
            break MISSING_BLOCK_LABEL_467;
        }
        c = obj12[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1760
    //                   0 1784
    //                   1 1791
    //                   2 1798
    //                   3 1805;
           goto _L85 _L86 _L87 _L88 _L89
_L89:
        break MISSING_BLOCK_LABEL_1805;
_L85:
        byte12 = 97;
_L91:
        obj12[i] = (char)(byte12 ^ c);
        i++;
          goto _L90
_L86:
        byte12 = 6;
          goto _L91
_L87:
        byte12 = 34;
          goto _L91
_L88:
        byte12 = 17;
          goto _L91
        byte12 = 63;
          goto _L91
_L97:
        byte byte12;
        if (j <= i)
        {
            obj13 = (new String(((char []) (obj13)))).intern();
            ac = "KGbL\000aGUV\006cQe\0212Nc<\016".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_503;
        }
        c = obj13[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1852
    //                   0 1876
    //                   1 1883
    //                   2 1890
    //                   3 1897;
           goto _L92 _L93 _L94 _L95 _L96
_L96:
        break MISSING_BLOCK_LABEL_1897;
_L92:
        byte13 = 97;
_L98:
        obj13[i] = (char)(byte13 ^ c);
        i++;
          goto _L97
_L93:
        byte13 = 6;
          goto _L98
_L94:
        byte13 = 34;
          goto _L98
_L95:
        byte13 = 17;
          goto _L98
        byte13 = 63;
          goto _L98
_L105:
        byte byte13;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
                obj10, obj11, obj12, obj13, (new String(ac)).intern()
            });
            PREFIX = org/spongycastle/jcajce/provider/digest/SHA1.getName();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1944
    //                   0 1968
    //                   1 1975
    //                   2 1982
    //                   3 1989;
           goto _L99 _L100 _L101 _L102 _L103
_L100:
        break; /* Loop/switch isn't completed */
_L103:
        break MISSING_BLOCK_LABEL_1989;
_L99:
        byte byte14 = 97;
_L106:
        ac[i] = (char)(byte14 ^ c);
        i++;
        if (true) goto _L105; else goto _L104
_L104:
        byte14 = 6;
          goto _L106
_L101:
        byte14 = 34;
          goto _L106
_L102:
        byte14 = 17;
          goto _L106
        byte14 = 63;
          goto _L106
    }

    public ovider()
    {
    }
}
