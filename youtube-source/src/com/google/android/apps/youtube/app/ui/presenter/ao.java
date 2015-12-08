// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.model.r;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.i;
import com.google.android.youtube.j;
import com.google.android.youtube.l;

public final class ao
    implements g
{

    private final View a;
    private final TextView b;
    private final i c;

    public ao(Context context, i k)
    {
        c = (i)com.google.android.apps.youtube.common.fromguava.c.a(k);
        a = View.inflate(context, l.am, null);
        b = (TextView)a.findViewById(j.cE);
        k.a(a);
    }

    public final View a(f f, Object obj)
    {
        obj = (r)obj;
        b.setText(((r) (obj)).a());
        return c.a(f);
    }
}
