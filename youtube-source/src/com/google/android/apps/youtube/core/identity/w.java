// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import com.google.android.apps.youtube.core.client.bc;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            y, o, x

final class w
    implements y
{

    final o a;

    private w(o o1)
    {
        a = o1;
        super();
    }

    w(o o1, byte byte0)
    {
        this(o1);
    }

    public final void a()
    {
        o.e(a).a(new x(this));
    }

    public final void a(Exception exception)
    {
        o.a(a, exception);
    }

    public final void b()
    {
        o.b(a);
    }
}
