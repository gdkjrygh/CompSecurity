// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            eJ, dC, cR

public abstract class fd extends eJ
{

    private static final String z;

    protected fd()
    {
    }

    public eJ a()
    {
        return a();
    }

    public fd a()
    {
        throw new UnsupportedOperationException(z);
    }

    public abstract fd a(dC dc);

    public abstract dC b();

    public cR c()
    {
        return b();
    }

    public Object clone()
    {
        return a();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "W=@b\004j&\tbQs%FbAgu]~\004a0\t~Rf'[x@g0G1FzuZdF`9HbWf&\007".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 91
    //                   2 97
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 36;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 3;
          goto _L8
_L3:
        byte0 = 85;
          goto _L8
_L4:
        byte0 = 41;
          goto _L8
        byte0 = 17;
          goto _L8
    }
}
