// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;


// Referenced classes of package com.wf.wellsfargomobile:
//            av, SignOnFragment

class aw
    implements Runnable
{

    final String a;
    final int b;
    final av c;

    aw(av av1, String s, int i)
    {
        c = av1;
        a = s;
        b = i;
        super();
    }

    public void run()
    {
        SignOnFragment.a(c.a, null, a, b);
    }
}
