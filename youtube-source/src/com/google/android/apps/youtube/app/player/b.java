// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.player;

import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.core.player.a.g;
import com.google.android.apps.youtube.core.player.a.o;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import com.google.android.apps.youtube.medialib.player.m;
import com.google.android.apps.youtube.medialib.player.n;
import com.google.android.apps.youtube.medialib.player.t;

public final class b
    implements t
{

    private final ax a;

    public b(ax ax1)
    {
        a = ax1;
    }

    public final n a(FormatStream formatstream, boolean flag)
    {
        com.google.android.apps.youtube.core.player.a.l l = a.bd();
        if (formatstream.isFile())
        {
            if (l != null)
            {
                return new o(new m(), l);
            } else
            {
                throw new InstantiationException("Cannot create ProxyPlayer because MediaServer is null");
            }
        }
        if (a.aj() && !flag && formatstream.getContentLength() > 0L && formatstream.getVideoId() != null)
        {
            L.d("Using Regular Player with ExoProxy.");
            return new g(new m(), l, formatstream);
        } else
        {
            L.d("Using Regular Player.");
            return new m();
        }
    }
}
