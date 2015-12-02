// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            BCMessageDigest

abstract class DigestAlgorithmProvider extends AlgorithmProvider
{

    private static final String z[];

    DigestAlgorithmProvider()
    {
    }

    protected void addHMACAlgorithm(ConfigurableProvider configurableprovider, String s, String s1, String s2)
    {
        int i = BCMessageDigest.a;
        String s3 = (new StringBuilder()).append(z[6]).append(s).toString();
        configurableprovider.addAlgorithm((new StringBuilder()).append(z[4]).append(s3).toString(), s1);
        configurableprovider.addAlgorithm((new StringBuilder()).append(z[3]).append(s).toString(), s3);
        configurableprovider.addAlgorithm((new StringBuilder()).append(z[5]).append(s).toString(), s3);
        configurableprovider.addAlgorithm((new StringBuilder()).append(z[2]).append(s3).toString(), s2);
        configurableprovider.addAlgorithm((new StringBuilder()).append(z[0]).append(s).toString(), s3);
        configurableprovider.addAlgorithm((new StringBuilder()).append(z[1]).append(s).toString(), s3);
        if (BaseKeyGenerator.a)
        {
            BCMessageDigest.a = i + 1;
        }
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "?u\020\001\r\022p\026\\b5|\016h)\020|\005N8\021kYg\001?ZZ".toCharArray();
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
            obj1 = "?u\020\001\r\022p\026\\b5|\016h)\020|\005N8\021kYg\001?ZX".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 312
    //                   0 335
    //                   1 342
    //                   2 349
    //                   3 356;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_356;
_L1:
        byte0 = 76;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 126;
          goto _L7
_L3:
        byte0 = 25;
          goto _L7
_L4:
        byte0 = 119;
          goto _L7
        byte0 = 47;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "5|\016h)\020|\005N8\021kY".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 404
    //                   0 427
    //                   1 434
    //                   2 441
    //                   3 448;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_448;
_L8:
        byte1 = 76;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 126;
          goto _L14
_L10:
        byte1 = 25;
          goto _L14
_L11:
        byte1 = 119;
          goto _L14
        byte1 = 47;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "?u\020\001\r\022p\026\\b3x\024\001\0043X4\002".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 496
    //                   0 519
    //                   1 526
    //                   2 533
    //                   3 540;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_540;
_L15:
        byte2 = 76;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 126;
          goto _L21
_L17:
        byte2 = 25;
          goto _L21
_L18:
        byte2 = 119;
          goto _L21
        byte2 = 47;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "3x\024\001".toCharArray();
            j = obj4.length;
            i = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 588
    //                   0 611
    //                   1 618
    //                   2 625
    //                   3 632;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_632;
_L22:
        byte3 = 76;
_L28:
        obj3[i] = (char)(byte3 ^ c);
        i++;
          goto _L27
_L23:
        byte3 = 126;
          goto _L28
_L24:
        byte3 = 25;
          goto _L28
_L25:
        byte3 = 119;
          goto _L28
        byte3 = 47;
          goto _L28
_L34:
        byte byte3;
        if (j <= i)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            obj5 = "?u\020\001\r\022p\026\\b3x\024\001\0043X4\0".toCharArray();
            j = obj5.length;
            i = 0;
            break MISSING_BLOCK_LABEL_179;
        }
        c = obj4[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 680
    //                   0 704
    //                   1 711
    //                   2 718
    //                   3 725;
           goto _L29 _L30 _L31 _L32 _L33
_L33:
        break MISSING_BLOCK_LABEL_725;
_L29:
        byte4 = 76;
_L35:
        obj4[i] = (char)(byte4 ^ c);
        i++;
          goto _L34
_L30:
        byte4 = 126;
          goto _L35
_L31:
        byte4 = 25;
          goto _L35
_L32:
        byte4 = 119;
          goto _L35
        byte4 = 47;
          goto _L35
_L41:
        byte byte4;
        if (j <= i)
        {
            obj5 = (new String(((char []) (obj5)))).intern();
            ac = "6T6l".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_215;
        }
        c = obj5[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 772
    //                   0 796
    //                   1 803
    //                   2 810
    //                   3 817;
           goto _L36 _L37 _L38 _L39 _L40
_L40:
        break MISSING_BLOCK_LABEL_817;
_L36:
        byte5 = 76;
_L42:
        obj5[i] = (char)(byte5 ^ c);
        i++;
          goto _L41
_L37:
        byte5 = 126;
          goto _L42
_L38:
        byte5 = 25;
          goto _L42
_L39:
        byte5 = 119;
          goto _L42
        byte5 = 47;
          goto _L42
_L49:
        byte byte5;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, obj4, obj5, (new String(ac)).intern()
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 864
    //                   0 888
    //                   1 895
    //                   2 902
    //                   3 909;
           goto _L43 _L44 _L45 _L46 _L47
_L44:
        break; /* Loop/switch isn't completed */
_L47:
        break MISSING_BLOCK_LABEL_909;
_L43:
        byte byte6 = 76;
_L50:
        ac[i] = (char)(byte6 ^ c);
        i++;
        if (true) goto _L49; else goto _L48
_L48:
        byte6 = 126;
          goto _L50
_L45:
        byte6 = 25;
          goto _L50
_L46:
        byte6 = 119;
          goto _L50
        byte6 = 47;
          goto _L50
    }
}
