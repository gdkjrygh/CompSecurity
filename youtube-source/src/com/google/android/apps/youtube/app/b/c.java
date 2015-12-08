// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.b;

import com.google.a.a.a.a.dt;
import com.google.android.apps.youtube.core.client.a.a;
import com.google.android.apps.youtube.core.client.a.g;
import com.google.android.apps.youtube.core.player.event.k;

public final class c extends a
{

    public c(int i, boolean flag, String s, dt dt)
    {
        super("watch", i, flag, s, dt);
    }

    protected final boolean a(g g)
    {
        boolean flag = super.a(g);
        if (flag && g.getClass() != com/google/android/apps/youtube/core/player/event/k)
        {
            a("watch_int");
        }
        return flag;
    }
}
