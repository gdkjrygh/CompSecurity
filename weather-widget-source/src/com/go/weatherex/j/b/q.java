// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j.b;

import android.app.PendingIntent;
import android.content.Context;
import com.go.weatherex.j.af;
import com.go.weatherex.j.g;

// Referenced classes of package com.go.weatherex.j.b:
//            k, r

public class q extends af
{

    public q(g g1)
    {
        super(g1);
    }

    protected PendingIntent a(Context context, int j, int i1)
    {
        return com.go.weatherex.j.b.k.b(context, j, i1);
    }

    protected g e()
    {
        return ((r)aw).b;
    }

    protected g f()
    {
        return ((r)aw).c;
    }

    public PendingIntent g()
    {
        return null;
    }

    public PendingIntent h()
    {
        return com.go.weatherex.j.b.k.a(aw.n(), aw.o());
    }

    public PendingIntent i()
    {
        return com.go.weatherex.j.b.k.b(aw.n(), aw.o());
    }

    public PendingIntent k()
    {
        return com.go.weatherex.j.b.k.c(aw.n(), aw.o());
    }

    public PendingIntent l()
    {
        return null;
    }

    public PendingIntent m()
    {
        return com.go.weatherex.j.b.k.e(aw.n(), aw.o());
    }
}
