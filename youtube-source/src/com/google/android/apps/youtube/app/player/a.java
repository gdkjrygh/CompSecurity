// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.player;

import android.content.SharedPreferences;
import com.google.android.apps.youtube.app.aw;
import com.google.android.apps.youtube.medialib.player.h;

public final class a
    implements h
{

    private final SharedPreferences a;
    private final aw b;

    public a(SharedPreferences sharedpreferences, aw aw1)
    {
        a = sharedpreferences;
        b = aw1;
    }

    public final boolean a()
    {
        return a.getBoolean("show_exo_player_debug_messages", false);
    }

    public final int b()
    {
        return b.u();
    }

    public final int c()
    {
        return b.v();
    }

    public final int d()
    {
        return b.w();
    }
}
