// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            aa

final class az
    implements aa
{

    private final String a;
    private boolean b;
    private int c;

    private az(Context context, int i)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        a = context.getResources().getString(i);
        b = true;
        c = 0;
    }

    az(Context context, int i, byte byte0)
    {
        this(context, i);
    }

    static void a(az az1, boolean flag)
    {
        az1.b = flag;
    }

    public final boolean a()
    {
        return b;
    }

    public final String b()
    {
        return a;
    }

    public final int c()
    {
        return c;
    }
}
