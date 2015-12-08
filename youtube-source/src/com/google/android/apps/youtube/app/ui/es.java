// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.app.remote.aw;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.youtube.g;
import com.google.android.youtube.h;
import com.google.android.youtube.j;
import com.google.android.youtube.l;

public final class es
    implements aw
{

    private final Analytics a;
    private final Toast b;
    private final ProgressBar c;
    private final ImageView d;
    private final int e;
    private int f;
    private RemoteControl g;

    public es(Context context, Analytics analytics, int i)
    {
        f = 0;
        a = (Analytics)com.google.android.apps.youtube.common.fromguava.c.a(analytics);
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "stepPercent must be strictly positive");
        e = Math.max(1, (i * 100) / 100);
        b = new Toast(context);
        analytics = LayoutInflater.from(context).inflate(l.bB, null);
        b.setView(analytics);
        b.setDuration(0);
        b.setGravity(48, 0, context.getResources().getDimensionPixelSize(g.ag));
        d = (ImageView)analytics.findViewById(j.gh);
        c = (ProgressBar)analytics.findViewById(j.et);
        c.setMax(100);
        d.setVisibility(0);
    }

    public final void a()
    {
        if (g != null)
        {
            g.b(this);
            g = null;
        }
    }

    public final void a(int i)
    {
        c.setProgress(i);
    }

    public final void a(RemoteControl remotecontrol)
    {
        a();
        g = (RemoteControl)com.google.android.apps.youtube.common.fromguava.c.a(remotecontrol);
        g.a(this);
    }

    public final boolean b(int i)
    {
        while (g == null || g.b() != com.google.android.apps.youtube.app.remote.RemoteControl.State.CONNECTED || i != 25 && i != 24) 
        {
            return false;
        }
        if (i == 25)
        {
            f = f - e;
        } else
        {
            f = f + e;
        }
        i = Math.min(100, Math.max(0, g.s() + f));
        c.setProgress(i);
        d.setImageResource(h.p);
        b.show();
        return true;
    }

    public final boolean c(int i)
    {
        while (g == null || g.b() != com.google.android.apps.youtube.app.remote.RemoteControl.State.CONNECTED || i != 25 && i != 24) 
        {
            return false;
        }
        if (f <= 0) goto _L2; else goto _L1
_L1:
        a.b("RemoteVolumeUp");
_L4:
        g.b(f);
        f = 0;
        return true;
_L2:
        if (f < 0)
        {
            a.b("RemoteVolumeDown");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
