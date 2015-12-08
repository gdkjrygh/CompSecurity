// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.j;

import android.view.View;
import android.widget.ProgressBar;

// Referenced classes of package com.jiubang.commerce.ad.j:
//            a

class b
    implements Runnable
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public void run()
    {
        byte byte0 = 8;
        Object obj = com.jiubang.commerce.ad.j.a.b(a);
        int i;
        if (com.jiubang.commerce.ad.j.a.a(a))
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((ProgressBar) (obj)).setVisibility(i);
        obj = com.jiubang.commerce.ad.j.a.c(a);
        if (com.jiubang.commerce.ad.j.a.a(a))
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        ((View) (obj)).setVisibility(i);
    }
}
