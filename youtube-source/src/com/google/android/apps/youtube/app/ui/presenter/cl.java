// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.datalib.innertube.model.al;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.youtube.j;
import com.google.android.youtube.l;

public final class cl
    implements g
{

    private final View a;
    private final TextView b;
    private final TextView c;
    private final TextView d;

    public cl(Context context)
    {
        a = View.inflate(context, l.bg, null);
        b = (TextView)a.findViewById(j.dO);
        c = (TextView)a.findViewById(j.cF);
        d = (TextView)a.findViewById(j.cJ);
    }

    public final View a(f f, Object obj)
    {
        f = (al)obj;
        d.setText(f.a());
        c.setText(f.b());
        b.setText(f.c());
        return a;
    }
}
