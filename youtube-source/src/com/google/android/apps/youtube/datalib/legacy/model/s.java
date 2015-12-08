// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.apps.youtube.common.fromguava.c;
import java.util.Date;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            Playlist

public final class s
{

    private final Playlist a;
    private final int b;
    private final int c;
    private final boolean d;

    public s(Playlist playlist)
    {
        this(playlist, 0, 0, false);
    }

    public s(Playlist playlist, int i, int j, boolean flag)
    {
        a = (Playlist)com.google.android.apps.youtube.common.fromguava.c.a(playlist);
        b = i;
        c = j;
        d = flag;
    }

    public final String a()
    {
        return a.id;
    }

    public final boolean a(Playlist playlist)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(playlist);
        if (a.id.equals(playlist.id))
        {
            return a.updated.before(playlist.updated);
        } else
        {
            return false;
        }
    }

    public final Playlist b()
    {
        return a;
    }

    public final int c()
    {
        return a.size - b;
    }

    public final int d()
    {
        return a.size;
    }

    public final boolean e()
    {
        return b == 0;
    }

    public final int f()
    {
        return c;
    }

    public final boolean g()
    {
        return d;
    }
}
