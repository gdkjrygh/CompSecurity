// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.security.AccessController;
import java.security.Provider;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

public final class BouncyCastleProvider extends Provider
    implements ConfigurableProvider
{

    private static final String DIGESTS[];
    private static final String DIGEST_PACKAGE;
    public static final String PROVIDER_NAME;
    private static final String SYMMETRIC_CIPHERS[];
    private static final String SYMMETRIC_PACKAGE;
    public static boolean a;
    private static String info;
    private static final String z[];

    public BouncyCastleProvider()
    {
        super(z[9], 1.51D, info);
        AccessController.doPrivileged(new _cls1());
    }

    private void loadAlgorithms(String s, String as[])
    {
        int i;
        boolean flag;
        flag = a;
        i = 0;
_L8:
        if (i == as.length) goto _L2; else goto _L1
_L1:
        Class class1 = null;
        Object obj = getClass().getClassLoader();
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj = ((ClassLoader) (obj)).loadClass((new StringBuilder()).append(s).append(as[i]).append(z[3]).toString());
        class1 = ((Class) (obj));
_L6:
        Class class2;
        if (class1 != null)
        {
            try
            {
                ((AlgorithmProvider)class1.newInstance()).configure(this);
            }
            catch (Exception exception)
            {
                throw new InternalError((new StringBuilder()).append(z[2]).append(s).append(as[i]).append(z[5]).append(exception).toString());
            }
        }
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        return;
_L4:
        class2 = Class.forName((new StringBuilder()).append(s).append(as[i]).append(z[4]).toString());
        class1 = class2;
        continue; /* Loop/switch isn't completed */
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        if (true) goto _L6; else goto _L5
_L5:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void setup()
    {
        loadAlgorithms(z[8], DIGESTS);
        loadAlgorithms(z[7], SYMMETRIC_CIPHERS);
    }

    public void addAlgorithm(String s, String s1)
    {
        boolean flag = false;
        boolean flag1 = a;
        try
        {
            if (containsKey(s))
            {
                throw new IllegalStateException((new StringBuilder()).append(z[0]).append(s).append(z[1]).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        boolean flag2;
        try
        {
            put(s, s1);
            flag2 = BaseKeyGenerator.a;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (flag2)
        {
            if (!flag1)
            {
                flag = true;
            }
            a = flag;
        }
    }

    public boolean hasAlgorithm(String s, String s1)
    {
        boolean flag1;
        boolean flag2;
        flag1 = false;
        flag2 = a;
        boolean flag = containsKey((new StringBuilder()).append(s).append(".").append(s1).toString());
        if (!flag)
        {
            try
            {
                flag = containsKey((new StringBuilder()).append(z[6]).append(s).append(".").append(s1).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_111;
            }
        }
        flag = true;
_L1:
        if (flag2)
        {
            try
            {
                flag2 = BaseKeyGenerator.a;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            if (!flag2)
            {
                flag1 = true;
            }
            BaseKeyGenerator.a = flag1;
        }
        return flag;
        s;
        throw s;
        flag = false;
          goto _L1
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "]Q\001@\035BL\b\t\027QB\025\032\002W\r\f\r\017X@\003@\036@L\020\007\nWQH\n\007UF\025\032@".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        Object obj2;
        char ac[];
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        char ac1[];
        char c;
        if (j <= i)
        {
            DIGEST_PACKAGE = (new String(((char []) (obj)))).intern();
            obj = "]Q\001@\035BL\b\t\027QB\025\032\002W\r\f\r\017X@\003@\036@L\020\007\nWQH\035\027_N\003\032\034[@H".toCharArray();
            j = obj.length;
            i = 0;
            break MISSING_BLOCK_LABEL_47;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 800
    //                   0 823
    //                   1 830
    //                   2 837
    //                   3 844;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_844;
_L1:
        byte0 = 110;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 50;
          goto _L7
_L3:
        byte0 = 35;
          goto _L7
_L4:
        byte0 = 102;
          goto _L7
        byte0 = 110;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            SYMMETRIC_PACKAGE = (new String(((char []) (obj)))).intern();
            obj = "a`".toCharArray();
            j = obj.length;
            i = 0;
            break MISSING_BLOCK_LABEL_81;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 892
    //                   0 915
    //                   1 922
    //                   2 929
    //                   3 936;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_936;
_L8:
        byte1 = 110;
_L14:
        obj[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 50;
          goto _L14
_L10:
        byte1 = 35;
          goto _L14
_L11:
        byte1 = 102;
          goto _L14
        byte1 = 110;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            PROVIDER_NAME = (new String(((char []) (obj)))).intern();
            obj = "VV\026\002\007QB\022\013NBQ\t\030\007VF\024N\005WZFF".toCharArray();
            j = obj.length;
            i = 0;
            break MISSING_BLOCK_LABEL_115;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 984
    //                   0 1007
    //                   1 1014
    //                   2 1021
    //                   3 1028;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_1028;
_L15:
        byte2 = 110;
_L21:
        obj[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 50;
          goto _L21
_L17:
        byte2 = 35;
          goto _L21
_L18:
        byte2 = 102;
          goto _L21
        byte2 = 110;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "\033\003\000\001\033\\G".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_147;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1076
    //                   0 1099
    //                   1 1106
    //                   2 1113
    //                   3 1120;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_1120;
_L22:
        byte3 = 110;
_L28:
        obj[i] = (char)(byte3 ^ c);
        i++;
          goto _L27
_L23:
        byte3 = 50;
          goto _L28
_L24:
        byte3 = 35;
          goto _L28
_L25:
        byte3 = 102;
          goto _L28
        byte3 = 110;
          goto _L28
_L34:
        byte byte3;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "QB\b\000\001F\003\005\034\013SW\003N\007\\P\022\017\000QFF\001\b\022".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_179;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1168
    //                   0 1191
    //                   1 1198
    //                   2 1205
    //                   3 1212;
           goto _L29 _L30 _L31 _L32 _L33
_L33:
        break MISSING_BLOCK_LABEL_1212;
_L29:
        byte4 = 110;
_L35:
        obj1[i] = (char)(byte4 ^ c);
        i++;
          goto _L34
_L30:
        byte4 = 50;
          goto _L35
_L31:
        byte4 = 35;
          goto _L35
_L32:
        byte4 = 102;
          goto _L35
        byte4 = 110;
          goto _L35
_L41:
        byte byte4;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            ac = "\026n\007\036\036[M\001\035".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_211;
        }
        c = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1260
    //                   0 1283
    //                   1 1290
    //                   2 1297
    //                   3 1304;
           goto _L36 _L37 _L38 _L39 _L40
_L40:
        break MISSING_BLOCK_LABEL_1304;
_L36:
        byte5 = 110;
_L42:
        obj2[i] = (char)(byte5 ^ c);
        i++;
          goto _L41
_L37:
        byte5 = 50;
          goto _L42
_L38:
        byte5 = 35;
          goto _L42
_L39:
        byte5 = 102;
          goto _L42
        byte5 = 110;
          goto _L42
_L48:
        byte byte5;
        if (j <= i)
        {
            ac = (new String(ac)).intern();
            obj3 = "\026n\007\036\036[M\001\035".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_245;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1352
    //                   0 1375
    //                   1 1382
    //                   2 1389
    //                   3 1396;
           goto _L43 _L44 _L45 _L46 _L47
_L47:
        break MISSING_BLOCK_LABEL_1396;
_L43:
        byte6 = 110;
_L49:
        ac[i] = (char)(byte6 ^ c);
        i++;
          goto _L48
_L44:
        byte6 = 50;
          goto _L49
_L45:
        byte6 = 35;
          goto _L49
_L46:
        byte6 = 102;
          goto _L49
        byte6 = 110;
          goto _L49
_L55:
        byte byte6;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "\026n\007\036\036[M\001\035N\b\003".toCharArray();
            j = obj4.length;
            i = 0;
            break MISSING_BLOCK_LABEL_281;
        }
        c = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1444
    //                   0 1468
    //                   1 1475
    //                   2 1482
    //                   3 1489;
           goto _L50 _L51 _L52 _L53 _L54
_L54:
        break MISSING_BLOCK_LABEL_1489;
_L50:
        byte7 = 110;
_L56:
        obj3[i] = (char)(byte7 ^ c);
        i++;
          goto _L55
_L51:
        byte7 = 50;
          goto _L56
_L52:
        byte7 = 35;
          goto _L56
_L53:
        byte7 = 102;
          goto _L56
        byte7 = 110;
          goto _L56
_L62:
        byte byte7;
        if (j <= i)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            obj5 = "sO\001@/^J\007\035@".toCharArray();
            j = obj5.length;
            i = 0;
            break MISSING_BLOCK_LABEL_317;
        }
        c = obj4[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1536
    //                   0 1560
    //                   1 1567
    //                   2 1574
    //                   3 1581;
           goto _L57 _L58 _L59 _L60 _L61
_L61:
        break MISSING_BLOCK_LABEL_1581;
_L57:
        byte8 = 110;
_L63:
        obj4[i] = (char)(byte8 ^ c);
        i++;
          goto _L62
_L58:
        byte8 = 50;
          goto _L63
_L59:
        byte8 = 35;
          goto _L63
_L60:
        byte8 = 102;
          goto _L63
        byte8 = 110;
          goto _L63
_L69:
        byte byte8;
        if (j <= i)
        {
            obj5 = (new String(((char []) (obj5)))).intern();
            obj6 = "]Q\001@\035BL\b\t\027QB\025\032\002W\r\f\r\017X@\003@\036@L\020\007\nWQH\035\027_N\003\032\034[@H".toCharArray();
            j = obj6.length;
            i = 0;
            break MISSING_BLOCK_LABEL_353;
        }
        c = obj5[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1628
    //                   0 1652
    //                   1 1659
    //                   2 1666
    //                   3 1673;
           goto _L64 _L65 _L66 _L67 _L68
_L68:
        break MISSING_BLOCK_LABEL_1673;
_L64:
        byte9 = 110;
_L70:
        obj5[i] = (char)(byte9 ^ c);
        i++;
          goto _L69
_L65:
        byte9 = 50;
          goto _L70
_L66:
        byte9 = 35;
          goto _L70
_L67:
        byte9 = 102;
          goto _L70
        byte9 = 110;
          goto _L70
_L76:
        byte byte9;
        if (j <= i)
        {
            obj6 = (new String(((char []) (obj6)))).intern();
            obj7 = "]Q\001@\035BL\b\t\027QB\025\032\002W\r\f\r\017X@\003@\036@L\020\007\nWQH\n\007UF\025\032@".toCharArray();
            j = obj7.length;
            i = 0;
            break MISSING_BLOCK_LABEL_389;
        }
        c = obj6[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1720
    //                   0 1744
    //                   1 1751
    //                   2 1758
    //                   3 1765;
           goto _L71 _L72 _L73 _L74 _L75
_L75:
        break MISSING_BLOCK_LABEL_1765;
_L71:
        byte10 = 110;
_L77:
        obj6[i] = (char)(byte10 ^ c);
        i++;
          goto _L76
_L72:
        byte10 = 50;
          goto _L77
_L73:
        byte10 = 35;
          goto _L77
_L74:
        byte10 = 102;
          goto _L77
        byte10 = 110;
          goto _L77
_L83:
        byte byte10;
        if (j <= i)
        {
            obj7 = (new String(((char []) (obj7)))).intern();
            ac1 = "a`".toCharArray();
            j = ac1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_425;
        }
        c = obj7[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1812
    //                   0 1836
    //                   1 1843
    //                   2 1850
    //                   3 1857;
           goto _L78 _L79 _L80 _L81 _L82
_L82:
        break MISSING_BLOCK_LABEL_1857;
_L78:
        byte11 = 110;
_L84:
        obj7[i] = (char)(byte11 ^ c);
        i++;
          goto _L83
_L79:
        byte11 = 50;
          goto _L84
_L80:
        byte11 = 35;
          goto _L84
_L81:
        byte11 = 102;
          goto _L84
        byte11 = 110;
          goto _L84
_L90:
        byte byte11;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, ac, obj3, obj4, obj5, obj6, obj7, (new String(ac1)).intern()
            });
            obj = "pL\023\000\rK`\007\035\032^FF=\013QV\024\007\032K\0036\034\001DJ\002\013\034\022UW@[\003".toCharArray();
            j = obj.length;
            i = 0;
            break MISSING_BLOCK_LABEL_513;
        }
        c = ac1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1904
    //                   0 1928
    //                   1 1935
    //                   2 1942
    //                   3 1949;
           goto _L85 _L86 _L87 _L88 _L89
_L89:
        break MISSING_BLOCK_LABEL_1949;
_L85:
        byte12 = 110;
_L91:
        ac1[i] = (char)(byte12 ^ c);
        i++;
          goto _L90
_L86:
        byte12 = 50;
          goto _L91
_L87:
        byte12 = 35;
          goto _L91
_L88:
        byte12 = 102;
          goto _L91
        byte12 = 110;
          goto _L91
_L97:
        byte byte12;
        if (j <= i)
        {
            info = (new String(((char []) (obj)))).intern();
            obj = "sf5".toCharArray();
            j = obj.length;
            i = 0;
            break MISSING_BLOCK_LABEL_547;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1996
    //                   0 2019
    //                   1 2026
    //                   2 2033
    //                   3 2040;
           goto _L92 _L93 _L94 _L95 _L96
_L96:
        break MISSING_BLOCK_LABEL_2040;
_L92:
        byte13 = 110;
_L98:
        obj[i] = (char)(byte13 ^ c);
        i++;
          goto _L97
_L93:
        byte13 = 50;
          goto _L98
_L94:
        byte13 = 35;
          goto _L98
_L95:
        byte13 = 102;
          goto _L98
        byte13 = 110;
          goto _L98
_L104:
        byte byte13;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "sq%Z".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_579;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2088
    //                   0 2111
    //                   1 2118
    //                   2 2125
    //                   3 2132;
           goto _L99 _L100 _L101 _L102 _L103
_L103:
        break MISSING_BLOCK_LABEL_2132;
_L99:
        byte14 = 110;
_L105:
        obj[i] = (char)(byte14 ^ c);
        i++;
          goto _L104
_L100:
        byte14 = 50;
          goto _L105
_L101:
        byte14 = 35;
          goto _L105
_L102:
        byte14 = 102;
          goto _L105
        byte14 = 110;
          goto _L105
_L111:
        byte byte14;
        if (j <= i)
        {
            SYMMETRIC_CIPHERS = (new String[] {
                obj, (new String(((char []) (obj1)))).intern()
            });
            obj = "\177gS".toCharArray();
            j = obj.length;
            i = 0;
            break MISSING_BLOCK_LABEL_624;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2180
    //                   0 2203
    //                   1 2210
    //                   2 2217
    //                   3 2224;
           goto _L106 _L107 _L108 _L109 _L110
_L110:
        break MISSING_BLOCK_LABEL_2224;
_L106:
        byte15 = 110;
_L112:
        obj1[i] = (char)(byte15 ^ c);
        i++;
          goto _L111
_L107:
        byte15 = 50;
          goto _L112
_L108:
        byte15 = 35;
          goto _L112
_L109:
        byte15 = 102;
          goto _L112
        byte15 = 110;
          goto _L112
_L118:
        byte byte15;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "ak'_".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_656;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2272
    //                   0 2295
    //                   1 2302
    //                   2 2309
    //                   3 2316;
           goto _L113 _L114 _L115 _L116 _L117
_L117:
        break MISSING_BLOCK_LABEL_2316;
_L113:
        byte16 = 110;
_L119:
        obj[i] = (char)(byte16 ^ c);
        i++;
          goto _L118
_L114:
        byte16 = 50;
          goto _L119
_L115:
        byte16 = 35;
          goto _L119
_L116:
        byte16 = 102;
          goto _L119
        byte16 = 110;
          goto _L119
_L125:
        byte byte16;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "ak'\\[\004".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_688;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2364
    //                   0 2387
    //                   1 2394
    //                   2 2401
    //                   3 2408;
           goto _L120 _L121 _L122 _L123 _L124
_L124:
        break MISSING_BLOCK_LABEL_2408;
_L120:
        byte17 = 110;
_L126:
        obj1[i] = (char)(byte17 ^ c);
        i++;
          goto _L125
_L121:
        byte17 = 50;
          goto _L126
_L122:
        byte17 = 35;
          goto _L126
_L123:
        byte17 = 102;
          goto _L126
        byte17 = 110;
          goto _L126
_L132:
        byte byte17;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            ac = "ak'[_\0".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_720;
        }
        c = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2456
    //                   0 2479
    //                   1 2486
    //                   2 2493
    //                   3 2500;
           goto _L127 _L128 _L129 _L130 _L131
_L131:
        break MISSING_BLOCK_LABEL_2500;
_L127:
        byte18 = 110;
_L133:
        obj2[i] = (char)(byte18 ^ c);
        i++;
          goto _L132
_L128:
        byte18 = 50;
          goto _L133
_L129:
        byte18 = 35;
          goto _L133
_L130:
        byte18 = 102;
          goto _L133
        byte18 = 110;
          goto _L133
_L140:
        byte byte18;
        if (j <= i)
        {
            DIGESTS = (new String[] {
                obj, obj1, obj2, (new String(ac)).intern()
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 2548
    //                   0 2571
    //                   1 2578
    //                   2 2585
    //                   3 2592;
           goto _L134 _L135 _L136 _L137 _L138
_L135:
        break; /* Loop/switch isn't completed */
_L138:
        break MISSING_BLOCK_LABEL_2592;
_L134:
        byte byte19 = 110;
_L141:
        ac[i] = (char)(byte19 ^ c);
        i++;
        if (true) goto _L140; else goto _L139
_L139:
        byte19 = 50;
          goto _L141
_L136:
        byte19 = 35;
          goto _L141
_L137:
        byte19 = 102;
          goto _L141
        byte19 = 110;
          goto _L141
    }


    private class _cls1
        implements PrivilegedAction
    {

        final BouncyCastleProvider this$0;

        public Object run()
        {
            setup();
            return null;
        }

        _cls1()
        {
            this$0 = BouncyCastleProvider.this;
            super();
        }
    }

}
