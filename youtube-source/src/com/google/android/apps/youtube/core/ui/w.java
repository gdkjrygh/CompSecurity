// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.content.Context;
import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.core.ui:
//            u, v

final class w extends u
{

    private w(Context context, View view, v v)
    {
        super(context, v);
        a = view;
    }

    w(Context context, View view, v v, byte byte0)
    {
        this(context, view, v);
    }

    public final void a()
    {
        super.a();
        d();
    }

    protected final void c()
    {
        a.setVisibility(0);
    }

    protected final void d()
    {
        a.setVisibility(8);
    }
}
