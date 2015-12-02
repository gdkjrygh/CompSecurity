// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;

public class hmParameters extends IvAlgorithmParameters
{

    private static final String z;

    protected String engineToString()
    {
        return z;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "e\nw\006\007r".toCharArray();
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
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 78;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 36;
          goto _L8
_L3:
        byte0 = 79;
          goto _L8
_L4:
        byte0 = 36;
          goto _L8
        byte0 = 38;
          goto _L8
    }

    public hmParameters()
    {
    }
}
