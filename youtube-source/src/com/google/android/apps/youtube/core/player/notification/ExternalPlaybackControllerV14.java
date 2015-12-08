// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.notification;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import com.google.android.exoplayer.e.k;

// Referenced classes of package com.google.android.apps.youtube.core.player.notification:
//            i, a, c, b, 
//            j

public final class ExternalPlaybackControllerV14
    implements i
{

    private static j a;
    private final j b;
    private final c c;
    private final AudioManager d;
    private final RemoteControlClient e;
    private final ComponentName f;
    private android.media.RemoteControlClient.OnGetPlaybackPositionListener g;
    private boolean h;
    private Bitmap i;
    private Bitmap j;

    public ExternalPlaybackControllerV14(Context context, j j1, c c1)
    {
        b = j1;
        c = c1;
        d = (AudioManager)context.getSystemService("audio");
        f = new ComponentName(context.getPackageName(), com/google/android/apps/youtube/core/player/notification/ExternalPlaybackControllerV14$RemoteControlIntentReceiver.getName());
        j1 = new Intent("android.intent.action.MEDIA_BUTTON");
        j1.setComponent(f);
        e = new RemoteControlClient(PendingIntent.getBroadcast(context.getApplicationContext(), 0, j1, 0));
        if (k.a >= 18)
        {
            e.setPlaybackPositionUpdateListener(new a(this));
        }
    }

    static j a(ExternalPlaybackControllerV14 externalplaybackcontrollerv14)
    {
        return externalplaybackcontrollerv14.b;
    }

    static j b()
    {
        return a;
    }

    public final void a()
    {
        if (h)
        {
            e.setTransportControlFlags(0);
            e.editMetadata(true).apply();
            d.unregisterMediaButtonEventReceiver(f);
            d.unregisterRemoteControlClient(e);
            if (c != null)
            {
                c.b(e);
            }
            h = false;
        }
        a = null;
    }

    public final void a(android.media.RemoteControlClient.OnGetPlaybackPositionListener ongetplaybackpositionlistener)
    {
        g = ongetplaybackpositionlistener;
        e.setOnGetPlaybackPositionListener(ongetplaybackpositionlistener);
    }

    public final void a(PlaybackControllerGroup.PlaybackInfo playbackinfo)
    {
        PlaybackControllerGroup.PlaybackInfo.PlaybackState playbackstate;
        boolean flag;
        flag = true;
        if (!h)
        {
            d.registerMediaButtonEventReceiver(f);
            d.registerRemoteControlClient(e);
            if (c != null)
            {
                c.a(e);
            }
            h = true;
        }
        a = b;
        playbackstate = playbackinfo.c;
        b.a[playbackstate.ordinal()];
        JVM INSTR tableswitch 1 6: default 116
    //                   1 375
    //                   2 382
    //                   3 388
    //                   4 394
    //                   5 394
    //                   6 400;
           goto _L1 _L2 _L3 _L4 _L5 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_400;
_L1:
        int l = 1;
_L7:
        String s;
        Bitmap bitmap;
        int i1;
        long l1;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (k.a >= 18 && g != null)
        {
            e.setPlaybackState(l, g.onGetPlaybackPosition(), 1.0F);
        } else
        {
            e.setPlaybackState(l);
        }
        flag1 = playbackinfo.d;
        flag2 = playbackinfo.e;
        flag3 = playbackinfo.h;
        if (flag1)
        {
            i1 = 9;
        } else
        {
            i1 = 8;
        }
        l = i1;
        if (flag2)
        {
            l = i1 | 0x80;
        }
        i1 = l;
        if (k.a >= 18)
        {
            i1 = l;
            if (flag3)
            {
                i1 = l;
                if (g != null)
                {
                    i1 = l | 0x100;
                }
            }
        }
        e.setTransportControlFlags(i1);
        s = playbackinfo.b;
        bitmap = playbackinfo.f;
        l1 = playbackinfo.g;
        if (bitmap == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        playbackinfo = e.editMetadata(flag1);
        playbackinfo.putString(7, s);
        l = ((flag) ? 1 : 0);
        if (j != null)
        {
            if (j.isRecycled())
            {
                l = ((flag) ? 1 : 0);
            } else
            {
                l = 0;
            }
        }
        if (bitmap != null && (!bitmap.equals(i) || l != 0))
        {
            i = bitmap;
            j = bitmap.copy(bitmap.getConfig(), false);
            playbackinfo.putBitmap(100, j);
        }
        playbackinfo.putLong(9, l1);
        playbackinfo.apply();
        return;
_L2:
        l = 8;
          goto _L7
_L3:
        l = 2;
          goto _L7
_L4:
        l = 3;
          goto _L7
_L5:
        l = 1;
          goto _L7
        l = 9;
          goto _L7
    }

    public final void a(String s)
    {
    }
}
