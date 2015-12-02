// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            fd, bx, dk, eJ

public abstract class fL extends fd
    implements bx
{

    private static final String z;
    private dk a;
    private boolean b;

    protected fL()
    {
        a = dk.c();
    }

    private dk a()
    {
        a.f();
        b = false;
        return a;
    }

    static dk a(fL fl)
    {
        return fl.a();
    }

    public eJ a()
    {
        return b();
    }

    public fd a()
    {
        return b();
    }

    public fL b()
    {
        throw new UnsupportedOperationException(z);
    }

    public Object clone()
    {
        return b();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "&%\003X\002\033>JXW\002=\005XG\026m\036D\002\020(JDT\027?\030BF\026(\004\013@\013m\031^@\021!\013XQ\027>D".toCharArray();
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
        byte byte0 = 34;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 114;
          goto _L8
_L3:
        byte0 = 77;
          goto _L8
_L4:
        byte0 = 106;
          goto _L8
        byte0 = 43;
          goto _L8
    }
}
