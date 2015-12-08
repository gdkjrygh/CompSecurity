// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.res.Resources;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            aa, df

final class dm
    implements aa
{

    final df a;
    private final String b;
    private boolean c;

    public dm(df df1, int i)
    {
        a = df1;
        super();
        b = df.g(df1).getString(i);
    }

    public final void a(boolean flag)
    {
        c = flag;
    }

    public final boolean a()
    {
        return c;
    }

    public final String b()
    {
        return b;
    }

    public final int c()
    {
        return -1;
    }
}
