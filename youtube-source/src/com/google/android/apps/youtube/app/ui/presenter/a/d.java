// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter.a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.youtube.j;
import com.google.android.youtube.l;

public final class d
    implements g
{

    private final View a;
    private final TextView b;

    public d(Activity activity, ViewGroup viewgroup)
    {
        c.a(activity);
        c.a(viewgroup);
        a = activity.getLayoutInflater().inflate(l.ac, viewgroup, false);
        b = (TextView)a.findViewById(j.fF);
    }

    public final View a(f f, Object obj)
    {
        f = ((com.google.android.apps.youtube.datalib.innertube.model.a.g)obj).a();
        b.setText(f);
        return a;
    }
}
