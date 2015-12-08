// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.identity.v;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            MyPlaylistsFragment

final class al
    implements v
{

    final MyPlaylistsFragment a;

    al(MyPlaylistsFragment myplaylistsfragment)
    {
        a = myplaylistsfragment;
        super();
    }

    public final void a()
    {
        a.c.P().b("CreatePlaylist");
        MyPlaylistsFragment.b(a).a(a.k(), "CreatePlaylistDialogFragment");
    }

    public final void a(Exception exception)
    {
        MyPlaylistsFragment.c(a).c(exception);
    }

    public final void b()
    {
    }
}
