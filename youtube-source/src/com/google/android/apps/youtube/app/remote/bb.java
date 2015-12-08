// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.core.player.notification.PlaybackControllerGroup;
import com.google.android.exoplayer.e.k;
import com.google.android.youtube.h;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            ap, be, bf, bc, 
//            RemoteControl, aq, bg

public final class bb
    implements ap
{

    private final PlaybackControllerGroup a;
    private final aq b = new bf(this, (byte)0);
    private final Resources c;
    private RemoteControl d;

    public bb(YouTubeApplication youtubeapplication)
    {
        ax ax1 = youtubeapplication.d();
        Context context = ax1.af();
        a = new PlaybackControllerGroup(context, ax1.f(), ax1.aw(), ax1.aT(), ax1.q(), ax1.aX(), ax1.aY(), com/google/android/apps/youtube/app/WatchWhileActivity, new be(this, (byte)0), null, h.M, youtubeapplication.d().W());
        c = context.getResources();
        a.b();
        if (k.a >= 18)
        {
            a.a(new bc(this));
        }
    }

    static RemoteControl a(bb bb1)
    {
        return bb1.d;
    }

    static PlaybackControllerGroup b(bb bb1)
    {
        return bb1.a;
    }

    public final void a(RemoteControl remotecontrol, boolean flag)
    {
        flag = true;
        if (d != null)
        {
            d.b(b);
            a.b();
        }
        d = remotecontrol;
        if (d != null)
        {
            d.a(b);
            d.c(b);
            b.a(d.b());
            remotecontrol = d.o();
            if (remotecontrol != null)
            {
                a.a(c.getString(p.de, new Object[] {
                    remotecontrol.getScreenName()
                }));
            }
        }
        if (d == null || d.o() == null || !d.o().mustShowLockScreenControls())
        {
            flag = false;
        }
        a.a(flag);
    }
}
