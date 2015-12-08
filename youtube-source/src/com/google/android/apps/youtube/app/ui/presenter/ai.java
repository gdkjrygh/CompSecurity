// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import android.view.View;
import com.google.android.apps.youtube.app.ui.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.model.k;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.g;

public final class ai
    implements g
{

    private final Context a;
    private final a b;
    private View c;

    public ai(Context context, a a1)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
    }

    public final View a(f f, Object obj)
    {
        f = (k)obj;
        com.google.android.apps.youtube.common.fromguava.c.a(f);
        b.a("FORECASTING_PROMOTED_VIDEO", f.a());
        if (c == null)
        {
            c = new View(a);
        }
        return c;
    }
}
