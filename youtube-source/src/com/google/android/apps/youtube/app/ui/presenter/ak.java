// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import android.view.View;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.ui.YouTubeTextView;
import com.google.android.apps.youtube.uilib.a.f;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.i;
import com.google.android.youtube.l;

public final class ak
    implements g
{

    private final YouTubeTextView a;
    private final i b;

    public ak(Context context, i j)
    {
        c.a(context);
        b = (i)c.a(j);
        a = (YouTubeTextView)View.inflate(context, l.aZ, null);
        j.a(a);
    }

    public final View a(f f, Object obj)
    {
        obj = (com.google.android.apps.youtube.uilib.innertube.l)obj;
        a.setText(((com.google.android.apps.youtube.uilib.innertube.l) (obj)).a());
        return b.a(f);
    }
}
