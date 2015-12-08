// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.content.Context;
import android.view.Window;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            w, a, z

final class y extends w
{

    private int f;

    public y(Context context, a a1, z z)
    {
        super(context, a1, z);
    }

    public final void d(boolean flag)
    {
    }

    public final void f()
    {
    }

    public final void g()
    {
    }

    final void h()
    {
        f = b.d().getAttributes().flags & 0x400;
        b.d().addFlags(1024);
    }

    final void i()
    {
        b.d().setFlags(f, 1024);
    }
}
