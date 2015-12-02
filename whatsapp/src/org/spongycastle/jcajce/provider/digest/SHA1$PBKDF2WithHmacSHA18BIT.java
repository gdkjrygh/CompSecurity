// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;


public class z extends z
{

    private static final String z;

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "qF\023(T\023S1\030zii9\017AiEi-|E<:\005f".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 97
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 18;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 33;
          goto _L8
_L3:
        byte0 = 4;
          goto _L8
_L4:
        byte0 = 88;
          goto _L8
        byte0 = 108;
          goto _L8
    }

    public I()
    {
        super(z, 1);
    }
}
