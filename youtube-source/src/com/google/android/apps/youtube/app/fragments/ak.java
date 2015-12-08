// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.ui.ab;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            MyPlaylistsFragment

final class ak
    implements ab
{

    final MyPlaylistsFragment a;

    ak(MyPlaylistsFragment myplaylistsfragment)
    {
        a = myplaylistsfragment;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Playlist)obj;
        if (MyPlaylistsFragment.a(a) != null)
        {
            MyPlaylistsFragment.a(a).a(((Playlist) (obj)));
            MyPlaylistsFragment.a(a).a(a.c.c(), "DeletePlaylistDialogFragment");
        }
    }
}
