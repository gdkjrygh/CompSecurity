// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.view.View;
import com.google.android.apps.youtube.app.remote.ax;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            RemoteWatchDialogFragment

final class bi
    implements android.view.View.OnClickListener
{

    final Analytics a;
    final ax b;
    final PlayerResponse c;
    final RemoteWatchDialogFragment d;

    bi(RemoteWatchDialogFragment remotewatchdialogfragment, Analytics analytics, ax ax1, PlayerResponse playerresponse)
    {
        d = remotewatchdialogfragment;
        a = analytics;
        b = ax1;
        c = playerresponse;
        super();
    }

    public final void onClick(View view)
    {
        a.b("MdxModalPlay");
        if (RemoteWatchDialogFragment.b(d, RemoteWatchDialogFragment.d(d)))
        {
            b.a(RemoteWatchDialogFragment.d(d), RemoteWatchDialogFragment.e(d), c.getVideoId());
        } else
        if (RemoteWatchDialogFragment.f(d) != null)
        {
            b.a(RemoteWatchDialogFragment.f(d), 0);
        } else
        {
            L.b("No videoIds or playlistId. No idea what to play.");
        }
        d.a();
    }
}
