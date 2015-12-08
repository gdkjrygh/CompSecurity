// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.mrdc;

import com.wf.wellsfargomobile.BaseWebViewActivity;

// Referenced classes of package com.wf.wellsfargomobile.mrdc:
//            b, e

class c
    implements Runnable
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public void run()
    {
        if (b.a(a) instanceof BaseWebViewActivity)
        {
            e.c(b.a(a), b.b(a));
        }
    }
}
