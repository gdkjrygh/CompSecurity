// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import android.view.View;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.ui.YouTubeTextView;
import com.google.android.apps.youtube.datalib.innertube.model.s;
import com.google.android.apps.youtube.datalib.innertube.model.u;
import com.google.android.apps.youtube.uilib.a.a;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.i;
import com.google.android.youtube.l;

public final class aq extends a
{

    private final YouTubeTextView a;
    private final i b;

    public aq(Context context, i j, com.google.android.apps.youtube.datalib.d.a a1)
    {
        super(a1, j);
        c.a(context);
        b = (i)c.a(j);
        a = (YouTubeTextView)View.inflate(context, l.bp, null);
        j.a(a);
    }

    private View a(f f, s s1)
    {
        super.a(f, s1);
        a.setText(s1.a());
        return b.a(f);
    }

    public final volatile View a(f f, u u)
    {
        return a(f, (s)u);
    }

    public final volatile View a(f f, Object obj)
    {
        return a(f, (s)obj);
    }
}
