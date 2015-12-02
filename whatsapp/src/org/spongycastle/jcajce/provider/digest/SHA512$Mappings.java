// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            DigestAlgorithmProvider, SHA512, BCMessageDigest

public class ider extends DigestAlgorithmProvider
{

    private static final String PREFIX;
    private static final String z[];

    public void configure(ConfigurableProvider configurableprovider)
    {
        boolean flag = false;
        int i = BCMessageDigest.a;
        configurableprovider.addAlgorithm(z[4], (new StringBuilder()).append(PREFIX).append(z[7]).toString());
        configurableprovider.addAlgorithm(z[2], z[17]);
        configurableprovider.addAlgorithm(z[14], (new StringBuilder()).append(PREFIX).append(z[0]).toString());
        configurableprovider.addAlgorithm(z[1], z[10]);
        configurableprovider.addAlgorithm(z[15], (new StringBuilder()).append(PREFIX).append(z[8]).toString());
        configurableprovider.addAlgorithm(z[6], z[9]);
        addHMACAlgorithm(configurableprovider, z[20], (new StringBuilder()).append(PREFIX).append(z[3]).toString(), (new StringBuilder()).append(PREFIX).append(z[12]).toString());
        addHMACAlgorithm(configurableprovider, z[13], (new StringBuilder()).append(PREFIX).append(z[18]).toString(), (new StringBuilder()).append(PREFIX).append(z[19]).toString());
        addHMACAlgorithm(configurableprovider, z[5], (new StringBuilder()).append(PREFIX).append(z[11]).toString(), (new StringBuilder()).append(PREFIX).append(z[16]).toString());
        if (i != 0)
        {
            if (!BaseKeyGenerator.a)
            {
                flag = true;
            }
            BaseKeyGenerator.a = flag;
        }
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "hyL=,?Iqh{x".toCharArray();
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
        Object obj17;
        Object obj18;
        Object obj19;
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "\rQBt\b TD)g\001XV)(+Xa3.)NQt\032\004|\020k{c\017\027n".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 908
    //                   0 931
    //                   1 938
    //                   2 945
    //                   3 952;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_952;
_L1:
        byte0 = 73;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 76;
          goto _L7
_L3:
        byte0 = 61;
          goto _L7
_L4:
        byte0 = 37;
          goto _L7
        byte0 = 90;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "\rQBt\b TD)g\001XV)(+Xa3.)NQt\032\004|\020k{".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1000
    //                   0 1023
    //                   1 1030
    //                   2 1037
    //                   3 1044;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_1044;
_L8:
        byte1 = 73;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 76;
          goto _L14
_L10:
        byte1 = 61;
          goto _L14
_L11:
        byte1 = 37;
          goto _L14
        byte1 = 90;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "huD)!\001\\F".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1092
    //                   0 1115
    //                   1 1122
    //                   2 1129
    //                   3 1136;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_1136;
_L15:
        byte2 = 73;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 76;
          goto _L21
_L17:
        byte2 = 61;
          goto _L21
_L18:
        byte2 = 37;
          goto _L21
        byte2 = 90;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "\001XV)(+Xa3.)NQt\032\004|\box~".toCharArray();
            j = obj4.length;
            i = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1184
    //                   0 1207
    //                   1 1214
    //                   2 1221
    //                   3 1228;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_1228;
_L22:
        byte3 = 73;
_L28:
        obj3[i] = (char)(byte3 ^ c);
        i++;
          goto _L27
_L23:
        byte3 = 76;
          goto _L28
_L24:
        byte3 = 61;
          goto _L28
_L25:
        byte3 = 37;
          goto _L28
        byte3 = 90;
          goto _L28
_L34:
        byte byte3;
        if (j <= i)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            obj5 = "\037udox~\022\027o\177".toCharArray();
            j = obj5.length;
            i = 0;
            break MISSING_BLOCK_LABEL_179;
        }
        c = obj4[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1276
    //                   0 1300
    //                   1 1307
    //                   2 1314
    //                   3 1321;
           goto _L29 _L30 _L31 _L32 _L33
_L33:
        break MISSING_BLOCK_LABEL_1321;
_L29:
        byte4 = 73;
_L35:
        obj4[i] = (char)(byte4 ^ c);
        i++;
          goto _L34
_L30:
        byte4 = 76;
          goto _L35
_L31:
        byte4 = 61;
          goto _L35
_L32:
        byte4 = 37;
          goto _L35
        byte4 = 90;
          goto _L35
_L41:
        byte byte4;
        if (j <= i)
        {
            obj5 = (new String(((char []) (obj5)))).intern();
            obj6 = "\rQBt\b TD)g\001XV)(+Xa3.)NQt\032\004|\020k{~\b\023".toCharArray();
            j = obj6.length;
            i = 0;
            break MISSING_BLOCK_LABEL_215;
        }
        c = obj5[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1368
    //                   0 1392
    //                   1 1399
    //                   2 1406
    //                   3 1413;
           goto _L36 _L37 _L38 _L39 _L40
_L40:
        break MISSING_BLOCK_LABEL_1413;
_L36:
        byte5 = 73;
_L42:
        obj5[i] = (char)(byte5 ^ c);
        i++;
          goto _L41
_L37:
        byte5 = 76;
          goto _L42
_L38:
        byte5 = 61;
          goto _L42
_L39:
        byte5 = 37;
          goto _L42
        byte5 = 90;
          goto _L42
_L48:
        byte byte5;
        if (j <= i)
        {
            obj6 = (new String(((char []) (obj6)))).intern();
            obj7 = "hyL=,?I".toCharArray();
            j = obj7.length;
            i = 0;
            break MISSING_BLOCK_LABEL_251;
        }
        c = obj6[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1460
    //                   0 1484
    //                   1 1491
    //                   2 1498
    //                   3 1505;
           goto _L43 _L44 _L45 _L46 _L47
_L47:
        break MISSING_BLOCK_LABEL_1505;
_L43:
        byte6 = 73;
_L49:
        obj6[i] = (char)(byte6 ^ c);
        i++;
          goto _L48
_L44:
        byte6 = 76;
          goto _L49
_L45:
        byte6 = 61;
          goto _L49
_L46:
        byte6 = 37;
          goto _L49
        byte6 = 90;
          goto _L49
_L55:
        byte byte6;
        if (j <= i)
        {
            obj7 = (new String(((char []) (obj7)))).intern();
            obj8 = "hyL=,?Iqh|z".toCharArray();
            j = obj8.length;
            i = 0;
            break MISSING_BLOCK_LABEL_287;
        }
        c = obj7[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1552
    //                   0 1576
    //                   1 1583
    //                   2 1590
    //                   3 1597;
           goto _L50 _L51 _L52 _L53 _L54
_L54:
        break MISSING_BLOCK_LABEL_1597;
_L50:
        byte7 = 73;
_L56:
        obj7[i] = (char)(byte7 ^ c);
        i++;
          goto _L55
_L51:
        byte7 = 76;
          goto _L56
_L52:
        byte7 = 61;
          goto _L56
_L53:
        byte7 = 37;
          goto _L56
        byte7 = 90;
          goto _L56
_L62:
        byte byte7;
        if (j <= i)
        {
            obj8 = (new String(((char []) (obj8)))).intern();
            obj9 = "\037udw|}\017\nh|z".toCharArray();
            j = obj9.length;
            i = 0;
            break MISSING_BLOCK_LABEL_323;
        }
        c = obj8[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1644
    //                   0 1668
    //                   1 1675
    //                   2 1682
    //                   3 1689;
           goto _L57 _L58 _L59 _L60 _L61
_L61:
        break MISSING_BLOCK_LABEL_1689;
_L57:
        byte8 = 73;
_L63:
        obj8[i] = (char)(byte8 ^ c);
        i++;
          goto _L62
_L58:
        byte8 = 76;
          goto _L63
_L59:
        byte8 = 61;
          goto _L63
_L60:
        byte8 = 37;
          goto _L63
        byte8 = 90;
          goto _L63
_L69:
        byte byte8;
        if (j <= i)
        {
            obj9 = (new String(((char []) (obj9)))).intern();
            obj10 = "\037udw|}\017\nh{x".toCharArray();
            j = obj10.length;
            i = 0;
            break MISSING_BLOCK_LABEL_359;
        }
        c = obj9[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1736
    //                   0 1760
    //                   1 1767
    //                   2 1774
    //                   3 1781;
           goto _L64 _L65 _L66 _L67 _L68
_L68:
        break MISSING_BLOCK_LABEL_1781;
_L64:
        byte9 = 73;
_L70:
        obj9[i] = (char)(byte9 ^ c);
        i++;
          goto _L69
_L65:
        byte9 = 76;
          goto _L70
_L66:
        byte9 = 61;
          goto _L70
_L67:
        byte9 = 37;
          goto _L70
        byte9 = 90;
          goto _L70
_L76:
        byte byte9;
        if (j <= i)
        {
            obj10 = (new String(((char []) (obj10)))).intern();
            obj11 = "huD)!\001\\F\016{y\013".toCharArray();
            j = obj11.length;
            i = 0;
            break MISSING_BLOCK_LABEL_395;
        }
        c = obj10[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1828
    //                   0 1852
    //                   1 1859
    //                   2 1866
    //                   3 1873;
           goto _L71 _L72 _L73 _L74 _L75
_L75:
        break MISSING_BLOCK_LABEL_1873;
_L71:
        byte10 = 73;
_L77:
        obj10[i] = (char)(byte10 ^ c);
        i++;
          goto _L76
_L72:
        byte10 = 76;
          goto _L77
_L73:
        byte10 = 61;
          goto _L77
_L74:
        byte10 = 37;
          goto _L77
        byte10 = 90;
          goto _L77
_L83:
        byte byte10;
        if (j <= i)
        {
            obj11 = (new String(((char []) (obj11)))).intern();
            obj12 = "hv@#\016)S@((8RW".toCharArray();
            j = obj12.length;
            i = 0;
            break MISSING_BLOCK_LABEL_431;
        }
        c = obj11[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1920
    //                   0 1944
    //                   1 1951
    //                   2 1958
    //                   3 1965;
           goto _L78 _L79 _L80 _L81 _L82
_L82:
        break MISSING_BLOCK_LABEL_1965;
_L78:
        byte11 = 73;
_L84:
        obj11[i] = (char)(byte11 ^ c);
        i++;
          goto _L83
_L79:
        byte11 = 76;
          goto _L84
_L80:
        byte11 = 61;
          goto _L84
_L81:
        byte11 = 37;
          goto _L84
        byte11 = 90;
          goto _L84
_L90:
        byte byte11;
        if (j <= i)
        {
            obj12 = (new String(((char []) (obj12)))).intern();
            obj13 = "\037udox~\022\027h}".toCharArray();
            j = obj13.length;
            i = 0;
            break MISSING_BLOCK_LABEL_467;
        }
        c = obj12[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2012
    //                   0 2036
    //                   1 2043
    //                   2 2050
    //                   3 2057;
           goto _L85 _L86 _L87 _L88 _L89
_L89:
        break MISSING_BLOCK_LABEL_2057;
_L85:
        byte12 = 73;
_L91:
        obj12[i] = (char)(byte12 ^ c);
        i++;
          goto _L90
_L86:
        byte12 = 76;
          goto _L91
_L87:
        byte12 = 61;
          goto _L91
_L88:
        byte12 = 37;
          goto _L91
        byte12 = 90;
          goto _L91
_L97:
        byte byte12;
        if (j <= i)
        {
            obj13 = (new String(((char []) (obj13)))).intern();
            obj14 = "\001XV)(+Xa3.)NQt\032\004|\box~\022\027h}".toCharArray();
            j = obj14.length;
            i = 0;
            break MISSING_BLOCK_LABEL_503;
        }
        c = obj13[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2104
    //                   0 2128
    //                   1 2135
    //                   2 2142
    //                   3 2149;
           goto _L92 _L93 _L94 _L95 _L96
_L96:
        break MISSING_BLOCK_LABEL_2149;
_L92:
        byte13 = 73;
_L98:
        obj13[i] = (char)(byte13 ^ c);
        i++;
          goto _L97
_L93:
        byte13 = 76;
          goto _L98
_L94:
        byte13 = 61;
          goto _L98
_L95:
        byte13 = 37;
          goto _L98
        byte13 = 90;
          goto _L98
_L104:
        byte byte13;
        if (j <= i)
        {
            obj14 = (new String(((char []) (obj14)))).intern();
            obj15 = "\001XV)(+Xa3.)NQt\032\004|\box~\022\027o\177".toCharArray();
            j = obj15.length;
            i = 0;
            break MISSING_BLOCK_LABEL_539;
        }
        c = obj14[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2196
    //                   0 2220
    //                   1 2227
    //                   2 2234
    //                   3 2241;
           goto _L99 _L100 _L101 _L102 _L103
_L103:
        break MISSING_BLOCK_LABEL_2241;
_L99:
        byte14 = 73;
_L105:
        obj14[i] = (char)(byte14 ^ c);
        i++;
          goto _L104
_L100:
        byte14 = 76;
          goto _L105
_L101:
        byte14 = 61;
          goto _L105
_L102:
        byte14 = 37;
          goto _L105
        byte14 = 90;
          goto _L105
_L111:
        byte byte14;
        if (j <= i)
        {
            obj15 = (new String(((char []) (obj15)))).intern();
            obj16 = "hv@#\016)S@((8RW\016{y\013".toCharArray();
            j = obj16.length;
            i = 0;
            break MISSING_BLOCK_LABEL_575;
        }
        c = obj15[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2288
    //                   0 2312
    //                   1 2319
    //                   2 2326
    //                   3 2333;
           goto _L106 _L107 _L108 _L109 _L110
_L110:
        break MISSING_BLOCK_LABEL_2333;
_L106:
        byte15 = 73;
_L112:
        obj15[i] = (char)(byte15 ^ c);
        i++;
          goto _L111
_L107:
        byte15 = 76;
          goto _L112
_L108:
        byte15 = 61;
          goto _L112
_L109:
        byte15 = 37;
          goto _L112
        byte15 = 90;
          goto _L112
_L118:
        byte byte15;
        if (j <= i)
        {
            obj16 = (new String(((char []) (obj16)))).intern();
            obj17 = "\037udw|}\017".toCharArray();
            j = obj17.length;
            i = 0;
            break MISSING_BLOCK_LABEL_611;
        }
        c = obj16[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2380
    //                   0 2404
    //                   1 2411
    //                   2 2418
    //                   3 2425;
           goto _L113 _L114 _L115 _L116 _L117
_L117:
        break MISSING_BLOCK_LABEL_2425;
_L113:
        byte16 = 73;
_L119:
        obj16[i] = (char)(byte16 ^ c);
        i++;
          goto _L118
_L114:
        byte16 = 76;
          goto _L119
_L115:
        byte16 = 61;
          goto _L119
_L116:
        byte16 = 37;
          goto _L119
        byte16 = 90;
          goto _L119
_L125:
        byte byte16;
        if (j <= i)
        {
            obj17 = (new String(((char []) (obj17)))).intern();
            obj18 = "huD)!\001\\F\016{~\t".toCharArray();
            j = obj18.length;
            i = 0;
            break MISSING_BLOCK_LABEL_647;
        }
        c = obj17[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2472
    //                   0 2496
    //                   1 2503
    //                   2 2510
    //                   3 2517;
           goto _L120 _L121 _L122 _L123 _L124
_L124:
        break MISSING_BLOCK_LABEL_2517;
_L120:
        byte17 = 73;
_L126:
        obj17[i] = (char)(byte17 ^ c);
        i++;
          goto _L125
_L121:
        byte17 = 76;
          goto _L126
_L122:
        byte17 = 61;
          goto _L126
_L123:
        byte17 = 37;
          goto _L126
        byte17 = 90;
          goto _L126
_L132:
        byte byte17;
        if (j <= i)
        {
            obj18 = (new String(((char []) (obj18)))).intern();
            obj19 = "hv@#\016)S@((8RW\016{~\t".toCharArray();
            j = obj19.length;
            i = 0;
            break MISSING_BLOCK_LABEL_683;
        }
        c = obj18[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2564
    //                   0 2588
    //                   1 2595
    //                   2 2602
    //                   3 2609;
           goto _L127 _L128 _L129 _L130 _L131
_L131:
        break MISSING_BLOCK_LABEL_2609;
_L127:
        byte18 = 73;
_L133:
        obj18[i] = (char)(byte18 ^ c);
        i++;
          goto _L132
_L128:
        byte18 = 76;
          goto _L133
_L129:
        byte18 = 61;
          goto _L133
_L130:
        byte18 = 37;
          goto _L133
        byte18 = 90;
          goto _L133
_L139:
        byte byte18;
        if (j <= i)
        {
            obj19 = (new String(((char []) (obj19)))).intern();
            ac = "\037udox~".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_719;
        }
        c = obj19[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2656
    //                   0 2680
    //                   1 2687
    //                   2 2694
    //                   3 2701;
           goto _L134 _L135 _L136 _L137 _L138
_L138:
        break MISSING_BLOCK_LABEL_2701;
_L134:
        byte19 = 73;
_L140:
        obj19[i] = (char)(byte19 ^ c);
        i++;
          goto _L139
_L135:
        byte19 = 76;
          goto _L140
_L136:
        byte19 = 61;
          goto _L140
_L137:
        byte19 = 37;
          goto _L140
        byte19 = 90;
          goto _L140
_L147:
        byte byte19;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
                obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, 
                (new String(ac)).intern()
            });
            PREFIX = org/spongycastle/jcajce/provider/digest/SHA512.getName();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2748
    //                   0 2772
    //                   1 2779
    //                   2 2786
    //                   3 2793;
           goto _L141 _L142 _L143 _L144 _L145
_L142:
        break; /* Loop/switch isn't completed */
_L145:
        break MISSING_BLOCK_LABEL_2793;
_L141:
        byte byte20 = 73;
_L148:
        ac[i] = (char)(byte20 ^ c);
        i++;
        if (true) goto _L147; else goto _L146
_L146:
        byte20 = 76;
          goto _L148
_L143:
        byte20 = 61;
          goto _L148
_L144:
        byte20 = 37;
          goto _L148
        byte20 = 90;
          goto _L148
    }

    public ider()
    {
    }
}
