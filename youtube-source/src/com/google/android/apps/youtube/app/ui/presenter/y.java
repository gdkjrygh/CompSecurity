// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.gr;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.innertube.model.i;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.youtube.j;

public final class y
    implements g
{

    private final gr a;
    private final TextView b;

    public y(bj bj, View view)
    {
        c.a(view);
        a = new gr(bj, (ImageView)view.findViewById(j.ah));
        b = (TextView)view.findViewById(j.bo);
    }

    public final View a(i k)
    {
        a.a(k.a());
        b.setText(k.c());
        return null;
    }

    public final volatile View a(f f, Object obj)
    {
        return a((i)obj);
    }
}
