// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.net.Uri;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.compat.o;
import com.google.android.apps.youtube.app.compat.q;
import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.apps.youtube.core.utils.e;
import com.google.android.youtube.j;
import com.google.android.youtube.m;
import com.google.android.youtube.p;

public abstract class bu
{

    private final am a;
    private String b;
    protected final YouTubeActivity f;
    protected final Analytics g;
    protected final o h;

    public bu(YouTubeActivity youtubeactivity, am am1, String s, o o1)
    {
        f = youtubeactivity;
        a = am1;
        g = ((YouTubeApplication)youtubeactivity.getApplication()).D();
        b = s;
        h = o1;
    }

    public final void a(String s)
    {
        b = s;
    }

    public boolean a(com.google.android.apps.youtube.app.compat.j j1)
    {
        h.a(m.c, j1);
        return true;
    }

    public final boolean a(q q1)
    {
        int i = q1.e();
        if (i == j.cx)
        {
            a.c();
            return true;
        }
        if (i == j.cy)
        {
            g.a("Search", f.getClass().getSimpleName());
            return true;
        }
        if (i == j.cB)
        {
            g.a("UploadFromMenu", f.getClass().getSimpleName());
            com.google.android.apps.youtube.core.utils.m.a(f);
            return true;
        }
        if (i == j.cz)
        {
            a.e();
            return true;
        }
        if (i == j.cw)
        {
            if (b != null)
            {
                q1 = com.google.android.apps.youtube.core.utils.m.a(f, p.gw, b);
            } else
            {
                q1 = com.google.android.apps.youtube.core.utils.m.a(f, p.gy);
            }
            com.google.android.apps.youtube.core.utils.m.a(f, Uri.parse(q1));
            return true;
        }
        if (i == j.cv)
        {
            if (e.a(f))
            {
                e.a(f);
            } else
            {
                com.google.android.apps.youtube.core.utils.m.a(f, Uri.parse(com.google.android.apps.youtube.core.utils.m.a(f, PackageUtil.f(f), p.gx)));
            }
            return true;
        } else
        {
            return false;
        }
    }
}
