// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            ARC4, AES

public class der extends AlgorithmProvider
{

    private static final String PREFIX;
    private static final String z[];

    public void configure(ConfigurableProvider configurableprovider)
    {
        int i = AES.a;
        configurableprovider.addAlgorithm(z[2], (new StringBuilder()).append(PREFIX).append(z[7]).toString());
        configurableprovider.addAlgorithm(z[4], z[8]);
        configurableprovider.addAlgorithm(z[3], z[1]);
        configurableprovider.addAlgorithm(z[9], (new StringBuilder()).append(PREFIX).append(z[6]).toString());
        configurableprovider.addAlgorithm(z[5], z[0]);
        if (BaseKeyGenerator.a)
        {
            AES.a = i + 1;
        }
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "!|sZ".toCharArray();
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
            obj1 = "!|sZ".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 448
    //                   0 471
    //                   1 478
    //                   2 485
    //                   3 492;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_492;
_L1:
        byte0 = 80;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 96;
          goto _L7
_L3:
        byte0 = 46;
          goto _L7
_L4:
        byte0 = 48;
          goto _L7
        byte0 = 110;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "#G@\0065\022\000q<\023T".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 540
    //                   0 563
    //                   1 570
    //                   2 577
    //                   3 584;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_584;
_L8:
        byte1 = 80;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 96;
          goto _L14
_L10:
        byte1 = 46;
          goto _L14
_L11:
        byte1 = 48;
          goto _L14
        byte1 = 110;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "!BW@\021\fGQ\035~#G@\0065\022\000b-d".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 632
    //                   0 655
    //                   1 662
    //                   2 669
    //                   3 676;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_676;
_L15:
        byte2 = 80;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 96;
          goto _L21
_L17:
        byte2 = 46;
          goto _L21
_L18:
        byte2 = 48;
          goto _L21
        byte2 = 110;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "!BW@\021\fGQ\035~#G@\0065\022\000q<\023&ae<".toCharArray();
            j = obj4.length;
            i = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 724
    //                   0 747
    //                   1 754
    //                   2 761
    //                   3 768;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_768;
_L22:
        byte3 = 80;
_L28:
        obj3[i] = (char)(byte3 ^ c);
        i++;
          goto _L27
_L23:
        byte3 = 96;
          goto _L28
_L24:
        byte3 = 46;
          goto _L28
_L25:
        byte3 = 48;
          goto _L28
        byte3 = 110;
          goto _L28
_L34:
        byte byte3;
        if (j <= i)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            obj5 = "!BW@\021\fGQ\035~+KI)5\016KB\017$\017\\\036<\023T".toCharArray();
            j = obj5.length;
            i = 0;
            break MISSING_BLOCK_LABEL_179;
        }
        c = obj4[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 816
    //                   0 840
    //                   1 847
    //                   2 854
    //                   3 861;
           goto _L29 _L30 _L31 _L32 _L33
_L33:
        break MISSING_BLOCK_LABEL_861;
_L29:
        byte4 = 80;
_L35:
        obj4[i] = (char)(byte4 ^ c);
        i++;
          goto _L34
_L30:
        byte4 = 96;
          goto _L35
_L31:
        byte4 = 46;
          goto _L35
_L32:
        byte4 = 48;
          goto _L35
        byte4 = 110;
          goto _L35
_L41:
        byte byte4;
        if (j <= i)
        {
            obj5 = (new String(((char []) (obj5)))).intern();
            obj6 = "DeU\027\027\005@".toCharArray();
            j = obj6.length;
            i = 0;
            break MISSING_BLOCK_LABEL_215;
        }
        c = obj5[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 908
    //                   0 932
    //                   1 939
    //                   2 946
    //                   3 953;
           goto _L36 _L37 _L38 _L39 _L40
_L40:
        break MISSING_BLOCK_LABEL_953;
_L36:
        byte5 = 80;
_L42:
        obj5[i] = (char)(byte5 ^ c);
        i++;
          goto _L41
_L37:
        byte5 = 96;
          goto _L42
_L38:
        byte5 = 46;
          goto _L42
_L39:
        byte5 = 48;
          goto _L42
        byte5 = 110;
          goto _L42
_L48:
        byte byte5;
        if (j <= i)
        {
            obj6 = (new String(((char []) (obj6)))).intern();
            obj7 = "DlQ\0355".toCharArray();
            j = obj7.length;
            i = 0;
            break MISSING_BLOCK_LABEL_251;
        }
        c = obj6[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1000
    //                   0 1024
    //                   1 1031
    //                   2 1038
    //                   3 1045;
           goto _L43 _L44 _L45 _L46 _L47
_L47:
        break MISSING_BLOCK_LABEL_1045;
_L43:
        byte6 = 80;
_L49:
        obj6[i] = (char)(byte6 ^ c);
        i++;
          goto _L48
_L44:
        byte6 = 96;
          goto _L49
_L45:
        byte6 = 46;
          goto _L49
_L46:
        byte6 = 48;
          goto _L49
        byte6 = 110;
          goto _L49
_L55:
        byte byte6;
        if (j <= i)
        {
            obj7 = (new String(((char []) (obj7)))).intern();
            obj8 = "!|sZ".toCharArray();
            j = obj8.length;
            i = 0;
            break MISSING_BLOCK_LABEL_287;
        }
        c = obj7[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1092
    //                   0 1116
    //                   1 1123
    //                   2 1130
    //                   3 1137;
           goto _L50 _L51 _L52 _L53 _L54
_L54:
        break MISSING_BLOCK_LABEL_1137;
_L50:
        byte7 = 80;
_L56:
        obj7[i] = (char)(byte7 ^ c);
        i++;
          goto _L55
_L51:
        byte7 = 96;
          goto _L56
_L52:
        byte7 = 46;
          goto _L56
_L53:
        byte7 = 48;
          goto _L56
        byte7 = 110;
          goto _L56
_L62:
        byte byte7;
        if (j <= i)
        {
            obj8 = (new String(((char []) (obj8)))).intern();
            ac = "+KI)5\016KB\017$\017\\\036/\002#\032".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_323;
        }
        c = obj8[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1184
    //                   0 1208
    //                   1 1215
    //                   2 1222
    //                   3 1229;
           goto _L57 _L58 _L59 _L60 _L61
_L61:
        break MISSING_BLOCK_LABEL_1229;
_L57:
        byte8 = 80;
_L63:
        obj8[i] = (char)(byte8 ^ c);
        i++;
          goto _L62
_L58:
        byte8 = 96;
          goto _L63
_L59:
        byte8 = 46;
          goto _L63
_L60:
        byte8 = 48;
          goto _L63
        byte8 = 110;
          goto _L63
_L70:
        byte byte8;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, (new String(ac)).intern()
            });
            PREFIX = org/spongycastle/jcajce/provider/symmetric/ARC4.getName();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1276
    //                   0 1300
    //                   1 1307
    //                   2 1314
    //                   3 1321;
           goto _L64 _L65 _L66 _L67 _L68
_L65:
        break; /* Loop/switch isn't completed */
_L68:
        break MISSING_BLOCK_LABEL_1321;
_L64:
        byte byte9 = 80;
_L71:
        ac[i] = (char)(byte9 ^ c);
        i++;
        if (true) goto _L70; else goto _L69
_L69:
        byte9 = 96;
          goto _L71
_L66:
        byte9 = 46;
          goto _L71
_L67:
        byte9 = 48;
          goto _L71
        byte9 = 110;
          goto _L71
    }

    public der()
    {
    }
}
