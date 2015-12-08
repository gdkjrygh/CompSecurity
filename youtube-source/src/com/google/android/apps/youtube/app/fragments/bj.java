// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.view.View;
import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.app.remote.ax;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            RemoteWatchDialogFragment

final class bj
    implements android.view.View.OnClickListener
{

    final Analytics a;
    final ax b;
    final PlayerResponse c;
    final RemoteWatchDialogFragment d;

    bj(RemoteWatchDialogFragment remotewatchdialogfragment, Analytics analytics, ax ax1, PlayerResponse playerresponse)
    {
        d = remotewatchdialogfragment;
        a = analytics;
        b = ax1;
        c = playerresponse;
        super();
    }

    public final void onClick(View view)
    {
        a.b("MdxModalQueue");
        view = RemoteWatchDialogFragment.g(d);
        if (view != null)
        {
            if (RemoteWatchDialogFragment.c(d, RemoteWatchDialogFragment.d(d)))
            {
                b.a(RemoteWatchDialogFragment.d(d));
            } else
            {
                view.c(c.getVideoId());
            }
            ah.a(d.i(), p.gF, 0);
        } else
        {
            ah.a(d.i(), p.bh, 1);
        }
        d.a();
    }
}
