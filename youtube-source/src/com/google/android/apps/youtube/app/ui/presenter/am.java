// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.youtube.app.ui.LoadingFrameLayout;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.ui.YouTubeTextView;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.i;
import com.google.android.apps.youtube.uilib.innertube.b;
import com.google.android.apps.youtube.uilib.innertube.d;
import com.google.android.apps.youtube.uilib.innertube.o;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

public final class am
    implements g
{

    private final LoadingFrameLayout a;
    private final YouTubeTextView b;
    private final i c;
    private final a d;
    private o e;

    public am(Context context, i j, a a1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        c = (i)com.google.android.apps.youtube.common.fromguava.c.a(j);
        d = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        a = new LoadingFrameLayout(context, l.aj, l.al);
        b = (YouTubeTextView)LayoutInflater.from(context).inflate(l.bp, null);
        a.addView(b);
        j.a(a);
    }

    public final View a(f f, o o1)
    {
        if (e == null || e.e() != o1.e())
        {
            d.b(this);
            d.a(this, o1.e());
        }
        e = o1;
        a.setOnRetryClickListener(o1.c());
        c.a(o1.b());
        if (o1.a() != null)
        {
            b.setText(o1.a());
        } else
        {
            b.setText(p.cv);
        }
        if (!(o1.d() instanceof b)) goto _L2; else goto _L1
_L1:
        onContentEvent((b)o1.d());
_L4:
        return c.a(f);
_L2:
        if (o1.d() instanceof d)
        {
            onLoadingEvent((d)o1.d());
        } else
        if (o1.d() instanceof com.google.android.apps.youtube.uilib.innertube.c)
        {
            onErrorEvent((com.google.android.apps.youtube.uilib.innertube.c)o1.d());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final volatile View a(f f, Object obj)
    {
        return a(f, (o)obj);
    }

    public final void onContentEvent(b b1)
    {
        a.b();
    }

    public final void onErrorEvent(com.google.android.apps.youtube.uilib.innertube.c c1)
    {
        a.a(c1.a(), c1.b());
    }

    public final void onLoadingEvent(d d1)
    {
        a.a();
    }
}
