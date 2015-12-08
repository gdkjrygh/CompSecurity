// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;


// Referenced classes of package com.wf.wellsfargomobile:
//            ba, BaseWebViewActivity

class bb
    implements Runnable
{

    final String a;
    final ba b;

    bb(ba ba1, String s)
    {
        b = ba1;
        a = s;
        super();
    }

    public void run()
    {
        ba.a(b).stopLoading();
        ba.a(b).a(a, "TimeOutTest");
    }
}
