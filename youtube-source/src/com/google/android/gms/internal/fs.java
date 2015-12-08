// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.os.IBinder;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.internal:
//            ft, fr, fl

final class fs
{

    final fr a;
    private final String b;
    private final ft c = new ft(this);
    private final HashSet d = new HashSet();
    private int e;
    private boolean f;
    private IBinder g;
    private ComponentName h;

    public fs(fr fr, String s)
    {
        a = fr;
        super();
        b = s;
        e = 0;
    }

    static int a(fs fs1, int i)
    {
        fs1.e = i;
        return i;
    }

    static ComponentName a(fs fs1, ComponentName componentname)
    {
        fs1.h = componentname;
        return componentname;
    }

    static IBinder a(fs fs1, IBinder ibinder)
    {
        fs1.g = ibinder;
        return ibinder;
    }

    static HashSet a(fs fs1)
    {
        return fs1.d;
    }

    public final ft a()
    {
        return c;
    }

    public final void a(fl fl)
    {
        d.add(fl);
    }

    public final void a(boolean flag)
    {
        f = flag;
    }

    public final String b()
    {
        return b;
    }

    public final void b(fl fl)
    {
        d.remove(fl);
    }

    public final boolean c()
    {
        return f;
    }

    public final boolean c(fl fl)
    {
        return d.contains(fl);
    }

    public final int d()
    {
        return e;
    }

    public final boolean e()
    {
        return d.isEmpty();
    }

    public final IBinder f()
    {
        return g;
    }

    public final ComponentName g()
    {
        return h;
    }
}
