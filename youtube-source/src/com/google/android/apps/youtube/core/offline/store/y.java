// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;

import com.google.android.apps.youtube.datalib.legacy.model.Playlist;

final class y
{

    private final Playlist a;

    private y(Playlist playlist)
    {
        a = playlist;
    }

    y(Playlist playlist, byte byte0)
    {
        this(playlist);
    }

    final Playlist a()
    {
        return a;
    }
}
