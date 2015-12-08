// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.a;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.core.a:
//            m, e

final class n extends m
{

    private final View b;
    private final boolean c;

    public n(View view, boolean flag)
    {
        super(e.a);
        b = (View)com.google.android.apps.youtube.common.fromguava.c.a(view);
        c = flag;
    }

    public final View a(int i, View view, ViewGroup viewgroup)
    {
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, (new StringBuilder("position must be zero and was ")).append(i).toString());
        return b;
    }

    public final boolean b(int i)
    {
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, (new StringBuilder("position must be zero and was ")).append(i).toString());
        return c;
    }
}
