// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.app.remote.as;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.core.ui.v;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ei, eq

final class en
    implements v
{

    final ei a;

    en(ei ei1)
    {
        a = ei1;
        super();
    }

    public final void a()
    {
        boolean flag1 = true;
        if (ei.f(a) == null)
        {
            return;
        }
        boolean flag;
        if (ei.f(a).b() == com.google.android.apps.youtube.app.remote.RemoteControl.State.ERROR || ei.f(a).n() == com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.ERROR)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            flag = flag1;
            if (ei.f(a).n() != com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.ERROR)
            {
                if (ei.f(a).c().c)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            }
            if (flag)
            {
                if (ei.j(a) != null)
                {
                    ei.f(a).a(ei.j(a).getVideoId(), null, 0);
                    return;
                } else
                {
                    L.c("Should be flinging a video, but it's not loaded yet");
                    return;
                }
            } else
            {
                ei.l(a).I();
                return;
            }
        }
        if (ei.j(a) != null && !ei.m(a))
        {
            ei.l(a).I();
            return;
        }
        if (ei.f(a).b() != com.google.android.apps.youtube.app.remote.RemoteControl.State.CONNECTED)
        {
            a.a(ei.f(a).b());
        }
        if (!ei.e(a))
        {
            ei.a(a, ei.f(a).p());
        }
        if (ei.m(a))
        {
            ei.f(a).a(ei.j(a).getVideoId(), null, 0);
            return;
        }
        com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState remoteplayerstate = ei.f(a).n();
        if (remoteplayerstate == com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.UNCONFIRMED || remoteplayerstate == com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.UNSTARTED || remoteplayerstate == com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.BUFFERING)
        {
            if (ei.g(a))
            {
                ei.f(a).g();
                ei.a(a, false);
                return;
            } else
            {
                ei.l(a).I();
                return;
            }
        } else
        {
            ei ei1 = a;
            ei.f(a).p();
            ei1.a(remoteplayerstate);
            return;
        }
    }
}
