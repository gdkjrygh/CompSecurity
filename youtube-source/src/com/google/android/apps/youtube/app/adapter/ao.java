// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            g, ap, ae

public final class ao extends g
{

    private final Resources a;
    private final boolean b;

    public ao(Context context, boolean flag)
    {
        c.a(context);
        a = context.getResources();
        b = flag;
    }

    static boolean a(ao ao1)
    {
        return ao1.b;
    }

    static Resources b(ao ao1)
    {
        return ao1.a;
    }

    public final ae a(View view, ViewGroup viewgroup)
    {
        return new ap(this, view, viewgroup);
    }
}
