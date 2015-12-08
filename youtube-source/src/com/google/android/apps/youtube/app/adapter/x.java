// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            g, y, ae

public final class x extends g
{

    private final v a;

    public x(v v1)
    {
        a = (v)c.a(v1);
    }

    static v a(x x1)
    {
        return x1.a;
    }

    public final ae a(View view, ViewGroup viewgroup)
    {
        return new y(this, view);
    }
}
