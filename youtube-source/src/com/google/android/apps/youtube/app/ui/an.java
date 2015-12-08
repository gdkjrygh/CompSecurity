// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.remote.ax;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ab

final class an
    implements ab
{

    final com.google.android.apps.youtube.app.remote.an a;
    final am b;
    final boolean c;
    final ax d;

    an(com.google.android.apps.youtube.app.remote.an an1, am am1, boolean flag, ax ax1)
    {
        a = an1;
        b = am1;
        c = flag;
        d = ax1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Playlist)obj;
        if (a.e() == null)
        {
            b.a(((Playlist) (obj)).contentUri, 0, c, WatchFeature.PLAYLISTS);
            return;
        } else
        {
            d.a(((Playlist) (obj)).id, 0, null);
            return;
        }
    }
}
