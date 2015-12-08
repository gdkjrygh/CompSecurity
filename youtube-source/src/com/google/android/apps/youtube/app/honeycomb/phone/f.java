// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import com.google.android.apps.youtube.app.remote.aq;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            AutomaticPairingActivity

final class f
    implements aq
{

    final AutomaticPairingActivity a;

    private f(AutomaticPairingActivity automaticpairingactivity)
    {
        a = automaticpairingactivity;
        super();
    }

    f(AutomaticPairingActivity automaticpairingactivity, byte byte0)
    {
        this(automaticpairingactivity);
    }

    public final void a(com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState remoteplayerstate)
    {
    }

    public final void a(com.google.android.apps.youtube.app.remote.RemoteControl.State state)
    {
        if (com.google.android.apps.youtube.app.remote.RemoteControl.State.CONNECTED.equals(state))
        {
            AutomaticPairingActivity.e(a);
        }
    }

    public final void a(SubtitleTrack subtitletrack)
    {
    }

    public final void a(String s)
    {
    }

    public final void a(List list)
    {
    }

    public final void l_()
    {
    }
}
