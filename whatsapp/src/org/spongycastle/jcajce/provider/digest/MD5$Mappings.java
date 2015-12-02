// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            DigestAlgorithmProvider, MD5

public class rovider extends DigestAlgorithmProvider
{

    private static final String PREFIX;
    private static final String z[];

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm(z[2], (new StringBuilder()).append(PREFIX).append(z[3]).toString());
        addHMACAlgorithm(configurableprovider, z[0], (new StringBuilder()).append(PREFIX).append(z[4]).toString(), (new StringBuilder()).append(PREFIX).append(z[1]).toString());
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "jPf".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        Object obj2;
        Object obj3;
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "\003_6NYBz6E\177S{!".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_280;
_L1:
        byte0 = 30;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 39;
          goto _L7
_L3:
        byte0 = 20;
          goto _L7
_L4:
        byte0 = 83;
          goto _L7
        byte0 = 55;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "jq D\177@q\027^yBg'\031Sc!".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 328
    //                   0 351
    //                   1 358
    //                   2 365
    //                   3 372;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_372;
_L8:
        byte1 = 30;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 39;
          goto _L14
_L10:
        byte1 = 20;
          goto _L14
_L11:
        byte1 = 83;
          goto _L14
        byte1 = 55;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "\003P:P{T`".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 420
    //                   0 443
    //                   1 450
    //                   2 457
    //                   3 464;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_464;
_L15:
        byte2 = 30;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 39;
          goto _L21
_L17:
        byte2 = 20;
          goto _L21
_L18:
        byte2 = 83;
          goto _L21
        byte2 = 55;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            ac = "\003\\2Dvju0".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 512
    //                   0 535
    //                   1 542
    //                   2 549
    //                   3 556;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_556;
_L22:
        byte3 = 30;
_L28:
        obj3[i] = (char)(byte3 ^ c);
        i++;
          goto _L27
_L23:
        byte3 = 39;
          goto _L28
_L24:
        byte3 = 20;
          goto _L28
_L25:
        byte3 = 83;
          goto _L28
        byte3 = 55;
          goto _L28
_L35:
        byte byte3;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, (new String(ac)).intern()
            });
            PREFIX = org/spongycastle/jcajce/provider/digest/MD5.getName();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 604
    //                   0 628
    //                   1 635
    //                   2 642
    //                   3 649;
           goto _L29 _L30 _L31 _L32 _L33
_L30:
        break; /* Loop/switch isn't completed */
_L33:
        break MISSING_BLOCK_LABEL_649;
_L29:
        byte byte4 = 30;
_L36:
        ac[i] = (char)(byte4 ^ c);
        i++;
        if (true) goto _L35; else goto _L34
_L34:
        byte4 = 39;
          goto _L36
_L31:
        byte4 = 20;
          goto _L36
_L32:
        byte4 = 83;
          goto _L36
        byte4 = 55;
          goto _L36
    }

    public rovider()
    {
    }
}
