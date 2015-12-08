// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.ads.a.a;
import java.util.Date;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            dn

public final class k
{

    public static final String a = com.google.android.gms.internal.dn.a("emulator");
    private final Date b;
    private final int c;
    private final Set d;
    private final Location e;
    private final boolean f;
    private final Map g;
    private final String h;
    private final com.google.android.gms.ads.search.a i;
    private final int j;
    private final Set k;

    public final a a(Class class1)
    {
        return (a)g.get(class1);
    }

    public final Date a()
    {
        return b;
    }

    public final boolean a(Context context)
    {
        return k.contains(com.google.android.gms.internal.dn.a(context));
    }

    public final int b()
    {
        return c;
    }

    public final Set c()
    {
        return d;
    }

    public final Location d()
    {
        return e;
    }

    public final boolean e()
    {
        return f;
    }

    public final String f()
    {
        return h;
    }

    public final com.google.android.gms.ads.search.a g()
    {
        return i;
    }

    public final int h()
    {
        return j;
    }

}
