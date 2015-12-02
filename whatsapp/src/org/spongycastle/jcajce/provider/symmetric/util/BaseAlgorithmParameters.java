// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;

public abstract class BaseAlgorithmParameters extends AlgorithmParametersSpi
{

    private static final String z;

    public BaseAlgorithmParameters()
    {
    }

    protected AlgorithmParameterSpec engineGetParameterSpec(Class class1)
    {
        if (class1 == null)
        {
            try
            {
                throw new NullPointerException(z);
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                throw class1;
            }
        } else
        {
            return localEngineGetParameterSpec(class1);
        }
    }

    protected abstract AlgorithmParameterSpec localEngineGetParameterSpec(Class class1);

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\034\006.,$\030\032=y=\022T.<=-\025;8$\030\000,+\032\r\021*y$\b\007=y'\022\000i;,]\032<5%".toCharArray();
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
        byte byte0 = 73;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 125;
          goto _L8
_L3:
        byte0 = 116;
          goto _L8
_L4:
        byte0 = 73;
          goto _L8
        byte0 = 89;
          goto _L8
    }
}
