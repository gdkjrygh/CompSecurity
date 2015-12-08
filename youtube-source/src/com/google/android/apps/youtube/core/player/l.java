// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.medialib.player.x;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            Director

final class l extends BroadcastReceiver
{

    final Director a;
    private boolean b;

    private l(Director director)
    {
        a = director;
        super();
    }

    l(Director director, byte byte0)
    {
        this(director);
    }

    public final void a()
    {
        if (!b)
        {
            Director.r(a).registerReceiver(this, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            b = true;
        }
    }

    public final void b()
    {
        if (b)
        {
            Director.r(a).unregisterReceiver(this);
            b = false;
        }
    }

    public final void onReceive(Context context, Intent intent)
    {
        L.e("Audio becoming noisy. Pausing if needed");
        if (Director.t(a) && Director.k(a).j())
        {
            Director.k(a).c();
        }
    }
}
