// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.a.a.b;

import android.os.Handler;

// Referenced classes of package com.gau.a.a.b:
//            d

class i
    implements Runnable
{

    final d a;

    i(d d1)
    {
        a = d1;
        super();
    }

    public void run()
    {
        d.b(a);
        if (d.c(a) != null)
        {
            d.c(a).removeCallbacks(this);
        }
    }
}
