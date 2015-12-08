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
//            g, ai, ac, ae

public final class aa extends g
{

    private final Resources a;
    private final ai b;

    public aa(Context context, ai ai1)
    {
        c.a(context);
        a = context.getResources();
        b = (ai)c.a(ai1);
    }

    static ai a(aa aa1)
    {
        return aa1.b;
    }

    static Resources b(aa aa1)
    {
        return aa1.a;
    }

    public final ae a(View view, ViewGroup viewgroup)
    {
        return new ac(this, view, viewgroup, (byte)0);
    }
}
