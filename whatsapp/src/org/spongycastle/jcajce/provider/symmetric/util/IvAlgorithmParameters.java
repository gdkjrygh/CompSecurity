// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric.util:
//            BaseAlgorithmParameters

public class IvAlgorithmParameters extends BaseAlgorithmParameters
{

    private static final String z[];
    private byte iv[];

    public IvAlgorithmParameters()
    {
    }

    protected byte[] engineGetEncoded()
    {
        return engineGetEncoded(z[4]);
    }

    protected byte[] engineGetEncoded(String s)
    {
        if (s.equals(z[5]))
        {
            return Arrays.clone(iv);
        } else
        {
            return null;
        }
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec)
    {
        if (!(algorithmparameterspec instanceof IvParameterSpec))
        {
            throw new InvalidParameterSpecException(z[1]);
        } else
        {
            iv = ((IvParameterSpec)algorithmparameterspec).getIV();
            return;
        }
    }

    protected void engineInit(byte abyte0[])
    {
        iv = Arrays.clone(abyte0);
    }

    protected void engineInit(byte abyte0[], String s)
    {
        if (s.equals(z[2]))
        {
            engineInit(abyte0);
            return;
        } else
        {
            throw new IOException(z[3]);
        }
    }

    protected String engineToString()
    {
        return z[6];
    }

    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class1)
    {
        if (class1 == javax/crypto/spec/IvParameterSpec)
        {
            return new IvParameterSpec(iv);
        } else
        {
            throw new InvalidParameterSpecException(z[0]);
        }
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "d\025\nV?f\025AH1c\032\f]$t\tAK t\030AH1b\b\004\\pe\024Aq\0061\013\000J1|\036\025]\"b[\016Z:t\030\025\026".toCharArray();
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
            obj1 = "X\r1Y\"p\026\004L5c(\021]31\t\004I%x\t\004\\pe\024AQ>x\017\bY<x\b\004\0301127\030 p\t\000U5e\036\023Kpp\027\006W\"x\017\tUpa\032\023Y=t\017\004J#1\024\003R5r\017".toCharArray();
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
        byte0 = 80;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 17;
          goto _L7
_L3:
        byte0 = 123;
          goto _L7
_L4:
        byte0 = 97;
          goto _L7
        byte0 = 56;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "C:6".toCharArray();
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
        byte1 = 80;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 17;
          goto _L14
_L10:
        byte1 = 123;
          goto _L14
_L11:
        byte1 = 97;
          goto _L14
        byte1 = 56;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "D\025\nV?f\025AH1c\032\f]$t\t\022\0306~\t\fY$1\022\017\030\031G[\021Y\"p\026\004L5c\bAW2{\036\002L".toCharArray();
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
        byte2 = 80;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 17;
          goto _L21
_L17:
        byte2 = 123;
          goto _L21
_L18:
        byte2 = 97;
          goto _L21
        byte2 = 56;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "P(/\026a".toCharArray();
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
        byte3 = 80;
_L28:
        obj3[i] = (char)(byte3 ^ c);
        i++;
          goto _L27
_L23:
        byte3 = 17;
          goto _L28
_L24:
        byte3 = 123;
          goto _L28
_L25:
        byte3 = 97;
          goto _L28
        byte3 = 56;
          goto _L28
_L34:
        byte byte3;
        if (j <= i)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            obj5 = "C:6".toCharArray();
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
        byte4 = 80;
_L35:
        obj4[i] = (char)(byte4 ^ c);
        i++;
          goto _L34
_L30:
        byte4 = 17;
          goto _L35
_L31:
        byte4 = 123;
          goto _L35
_L32:
        byte4 = 97;
          goto _L35
        byte4 = 56;
          goto _L35
_L41:
        byte byte4;
        if (j <= i)
        {
            obj5 = (new String(((char []) (obj5)))).intern();
            ac = "X-Ah1c\032\f]$t\t\022".toCharArray();
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
        byte5 = 80;
_L42:
        obj5[i] = (char)(byte5 ^ c);
        i++;
          goto _L41
_L37:
        byte5 = 17;
          goto _L42
_L38:
        byte5 = 123;
          goto _L42
_L39:
        byte5 = 97;
          goto _L42
        byte5 = 56;
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
        byte byte6 = 80;
_L50:
        ac[i] = (char)(byte6 ^ c);
        i++;
        if (true) goto _L49; else goto _L48
_L48:
        byte6 = 17;
          goto _L50
_L45:
        byte6 = 123;
          goto _L50
_L46:
        byte6 = 97;
          goto _L50
        byte6 = 56;
          goto _L50
    }
}
