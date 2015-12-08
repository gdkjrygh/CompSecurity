// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import android.os.Handler;

// Referenced classes of package com.mapbar.android.location:
//            b, t

public class a
{

    public final b a;

    public void a(t t1, int i)
    {
        if (i != 200 && t1.e() > b.j(a))
        {
            b.c(a, null);
            b.d(a, null);
            b.k(a).sendEmptyMessage(0);
        }
    }

    public (b b1)
    {
        a = b1;
        super();
    }
}
