// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            AES

public class ider extends AlgorithmProvider
{

    private static final String PREFIX;
    private static final String z[];

    public void configure(ConfigurableProvider configurableprovider)
    {
        boolean flag = false;
        int i = AES.a;
        configurableprovider.addAlgorithm(z[7], (new StringBuilder()).append(PREFIX).append(z[4]).toString());
        configurableprovider.addAlgorithm(z[0], (new StringBuilder()).append(PREFIX).append(z[1]).toString());
        configurableprovider.addAlgorithm(z[6], (new StringBuilder()).append(PREFIX).append(z[2]).toString());
        configurableprovider.addAlgorithm(z[5], (new StringBuilder()).append(PREFIX).append(z[3]).toString());
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
        obj = "M\021\036=De\t\021?fm\017\030?Sx\030\013\025Sb\030\0133Bc\017W\023s_".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "(<\0255fm\017\030?qi\023".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 364
    //                   0 387
    //                   1 394
    //                   2 401
    //                   3 408;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_408;
_L1:
        byte0 = 54;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 12;
          goto _L7
_L3:
        byte0 = 125;
          goto _L7
_L4:
        byte0 = 121;
          goto _L7
        byte0 = 82;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "(8:\020".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 456
    //                   0 479
    //                   1 486
    //                   2 493
    //                   3 500;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_500;
_L8:
        byte1 = 54;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 12;
          goto _L14
_L10:
        byte1 = 125;
          goto _L14
_L11:
        byte1 = 121;
          goto _L14
        byte1 = 82;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "(6\034+qi\023".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 548
    //                   0 571
    //                   1 578
    //                   2 585
    //                   3 592;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_592;
_L15:
        byte2 = 54;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 12;
          goto _L21
_L17:
        byte2 = 125;
          goto _L21
_L18:
        byte2 = 121;
          goto _L21
        byte2 = 82;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "(<\0255fm\017\030?E".toCharArray();
            j = obj4.length;
            i = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 640
    //                   0 663
    //                   1 670
    //                   2 677
    //                   3 684;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_684;
_L22:
        byte3 = 54;
_L28:
        obj3[i] = (char)(byte3 ^ c);
        i++;
          goto _L27
_L23:
        byte3 = 12;
          goto _L28
_L24:
        byte3 = 125;
          goto _L28
_L25:
        byte3 = 121;
          goto _L28
        byte3 = 82;
          goto _L28
_L34:
        byte byte3;
        if (j <= i)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            obj5 = "G\030\000\025Sb\030\0133Bc\017W\023s_".toCharArray();
            j = obj5.length;
            i = 0;
            break MISSING_BLOCK_LABEL_179;
        }
        c = obj4[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 732
    //                   0 756
    //                   1 763
    //                   2 770
    //                   3 777;
           goto _L29 _L30 _L31 _L32 _L33
_L33:
        break MISSING_BLOCK_LABEL_777;
_L29:
        byte4 = 54;
_L35:
        obj4[i] = (char)(byte4 ^ c);
        i++;
          goto _L34
_L30:
        byte4 = 12;
          goto _L35
_L31:
        byte4 = 125;
          goto _L35
_L32:
        byte4 = 121;
          goto _L35
        byte4 = 82;
          goto _L35
_L41:
        byte byte4;
        if (j <= i)
        {
            obj5 = (new String(((char []) (obj5)))).intern();
            obj6 = "O\024\t:S~S8\027e".toCharArray();
            j = obj6.length;
            i = 0;
            break MISSING_BLOCK_LABEL_215;
        }
        c = obj5[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 824
    //                   0 848
    //                   1 855
    //                   2 862
    //                   3 869;
           goto _L36 _L37 _L38 _L39 _L40
_L40:
        break MISSING_BLOCK_LABEL_869;
_L36:
        byte5 = 54;
_L42:
        obj5[i] = (char)(byte5 ^ c);
        i++;
          goto _L41
_L37:
        byte5 = 12;
          goto _L42
_L38:
        byte5 = 125;
          goto _L42
_L39:
        byte5 = 121;
          goto _L42
        byte5 = 82;
          goto _L42
_L48:
        byte byte5;
        if (j <= i)
        {
            obj6 = (new String(((char []) (obj6)))).intern();
            ac = "M\021\036=De\t\021?fm\017\030?Sx\030\013!\030M8*".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_251;
        }
        c = obj6[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 916
    //                   0 940
    //                   1 947
    //                   2 954
    //                   3 961;
           goto _L43 _L44 _L45 _L46 _L47
_L47:
        break MISSING_BLOCK_LABEL_961;
_L43:
        byte6 = 54;
_L49:
        obj6[i] = (char)(byte6 ^ c);
        i++;
          goto _L48
_L44:
        byte6 = 12;
          goto _L49
_L45:
        byte6 = 125;
          goto _L49
_L46:
        byte6 = 121;
          goto _L49
        byte6 = 82;
          goto _L49
_L56:
        byte byte6;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, obj4, obj5, obj6, (new String(ac)).intern()
            });
            PREFIX = org/spongycastle/jcajce/provider/symmetric/AES.getName();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1008
    //                   0 1032
    //                   1 1039
    //                   2 1046
    //                   3 1053;
           goto _L50 _L51 _L52 _L53 _L54
_L51:
        break; /* Loop/switch isn't completed */
_L54:
        break MISSING_BLOCK_LABEL_1053;
_L50:
        byte byte7 = 54;
_L57:
        ac[i] = (char)(byte7 ^ c);
        i++;
        if (true) goto _L56; else goto _L55
_L55:
        byte7 = 12;
          goto _L57
_L52:
        byte7 = 125;
          goto _L57
_L53:
        byte7 = 121;
          goto _L57
        byte7 = 82;
          goto _L57
    }

    public ider()
    {
    }
}
