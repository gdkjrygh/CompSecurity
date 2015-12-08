// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.ui.YouTubeDialogFragment;
import com.google.android.apps.youtube.app.ui.bd;
import com.google.android.apps.youtube.app.ui.bg;
import com.google.android.apps.youtube.app.ui.do;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            MyPlaylistsFragment

public class  extends YouTubeDialogFragment
    implements bg
{

    private bd Y;
    private MyPlaylistsFragment Z;

    static MyPlaylistsFragment a( , MyPlaylistsFragment myplaylistsfragment)
    {
        .Z = myplaylistsfragment;
        return myplaylistsfragment;
    }

    public final void a(Playlist playlist)
    {
        if (Z != null)
        {
            MyPlaylistsFragment.g(Z).b(playlist);
        }
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = i();
        ax ax1 = ((YouTubeApplication)bundle.getApplication()).d();
        Y = new bd(bundle, ax1.f(), ax1.aO(), ax1.bf());
        return Y.a(this);
    }

    public ()
    {
    }
}
