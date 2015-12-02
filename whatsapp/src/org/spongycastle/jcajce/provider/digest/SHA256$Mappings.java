// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            DigestAlgorithmProvider, SHA256

public class ider extends DigestAlgorithmProvider
{

    private static final String PREFIX;
    private static final String z[];

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm(z[5], (new StringBuilder()).append(PREFIX).append(z[1]).toString());
        configurableprovider.addAlgorithm(z[2], z[3]);
        addHMACAlgorithm(configurableprovider, z[0], (new StringBuilder()).append(PREFIX).append(z[4]).toString(), (new StringBuilder()).append(PREFIX).append(z[6]).toString());
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "x\016K\024;\035".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "\017\002cAkX2".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 320
    //                   0 343
    //                   1 350
    //                   2 357
    //                   3 364;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_364;
_L1:
        byte0 = 14;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 43;
          goto _L7
_L3:
        byte0 = 70;
          goto _L7
_L4:
        byte0 = 10;
          goto _L7
        byte0 = 38;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "j*m\bOG/kU f#yUoL#NOiN5~\b]c\0078\0238".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 412
    //                   0 435
    //                   1 442
    //                   2 449
    //                   3 456;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_456;
_L8:
        byte1 = 14;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 43;
          goto _L14
_L10:
        byte1 = 70;
          goto _L14
_L11:
        byte1 = 10;
          goto _L14
        byte1 = 38;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "x\016K\013<\036p".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 504
    //                   0 527
    //                   1 534
    //                   2 541
    //                   3 548;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_548;
_L15:
        byte2 = 14;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 43;
          goto _L21
_L17:
        byte2 = 70;
          goto _L21
_L18:
        byte2 = 10;
          goto _L21
        byte2 = 38;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "\017\016kUff'i".toCharArray();
            j = obj4.length;
            i = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 596
    //                   0 619
    //                   1 626
    //                   2 633
    //                   3 640;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_640;
_L22:
        byte3 = 14;
_L28:
        obj3[i] = (char)(byte3 ^ c);
        i++;
          goto _L27
_L23:
        byte3 = 43;
          goto _L28
_L24:
        byte3 = 70;
          goto _L28
_L25:
        byte3 = 10;
          goto _L28
        byte3 = 38;
          goto _L28
_L34:
        byte byte3;
        if (j <= i)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            obj5 = "f#yUoL#NOiN5~\b]c\007'\024;\035".toCharArray();
            j = obj5.length;
            i = 0;
            break MISSING_BLOCK_LABEL_179;
        }
        c = obj4[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 688
    //                   0 712
    //                   1 719
    //                   2 726
    //                   3 733;
           goto _L29 _L30 _L31 _L32 _L33
_L33:
        break MISSING_BLOCK_LABEL_733;
_L29:
        byte4 = 14;
_L35:
        obj4[i] = (char)(byte4 ^ c);
        i++;
          goto _L34
_L30:
        byte4 = 43;
          goto _L35
_L31:
        byte4 = 70;
          goto _L35
_L32:
        byte4 = 10;
          goto _L35
        byte4 = 38;
          goto _L35
_L41:
        byte byte4;
        if (j <= i)
        {
            obj5 = (new String(((char []) (obj5)))).intern();
            ac = "\017\ro_IN(oTo_)x".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_215;
        }
        c = obj5[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 780
    //                   0 804
    //                   1 811
    //                   2 818
    //                   3 825;
           goto _L36 _L37 _L38 _L39 _L40
_L40:
        break MISSING_BLOCK_LABEL_825;
_L36:
        byte5 = 14;
_L42:
        obj5[i] = (char)(byte5 ^ c);
        i++;
          goto _L41
_L37:
        byte5 = 43;
          goto _L42
_L38:
        byte5 = 70;
          goto _L42
_L39:
        byte5 = 10;
          goto _L42
        byte5 = 38;
          goto _L42
_L49:
        byte byte5;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, obj4, obj5, (new String(ac)).intern()
            });
            PREFIX = org/spongycastle/jcajce/provider/digest/SHA256.getName();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 872
    //                   0 896
    //                   1 903
    //                   2 910
    //                   3 917;
           goto _L43 _L44 _L45 _L46 _L47
_L44:
        break; /* Loop/switch isn't completed */
_L47:
        break MISSING_BLOCK_LABEL_917;
_L43:
        byte byte6 = 14;
_L50:
        ac[i] = (char)(byte6 ^ c);
        i++;
        if (true) goto _L49; else goto _L48
_L48:
        byte6 = 43;
          goto _L50
_L45:
        byte6 = 70;
          goto _L50
_L46:
        byte6 = 10;
          goto _L50
        byte6 = 38;
          goto _L50
    }

    public ider()
    {
    }
}
