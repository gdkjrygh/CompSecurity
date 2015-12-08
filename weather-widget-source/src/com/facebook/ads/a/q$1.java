// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import com.facebook.ads.ImpressionListener;

// Referenced classes of package com.facebook.ads.a:
//            q, k

class 
    implements 
{

    final q a;

    public boolean a()
    {
        return q.a(a);
    }

    public void b()
    {
        if (q.b(a) != null)
        {
            q.b(a).a("on imp sent");
        }
    }

    public void c()
    {
        if (q.c(a) != null)
        {
            q.c(a).onLoggingImpression(q.d(a));
        }
    }

    public boolean d()
    {
        return false;
    }

    sionListener(q q1)
    {
        a = q1;
        super();
    }
}
