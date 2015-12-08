// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.layeredvideo;

import com.google.android.libraries.mediaframework.exoplayerextensions.ExoplayerUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.google.android.libraries.mediaframework.layeredvideo:
//            PlayerBusyLayer

class this._cls0
    implements com.google.android.libraries.mediaframework.exoplayerextensions.istener
{

    final PlayerBusyLayer this$0;

    public void onError(Exception exception)
    {
        PlayerBusyLayer.access$100(PlayerBusyLayer.this);
    }

    public void onStateChanged(boolean flag, int i)
    {
        LogUtil.d("PlayerBusyLayer", LoggingMetaTags.TWC_VIDEOS, "busy layer onStateChanged: player=%s, playWhenReady=%s, playbackState=%s", new Object[] {
            PlayerBusyLayer.access$000(PlayerBusyLayer.this), Boolean.valueOf(flag), ExoplayerUtil.getExoplayerStateString(i)
        });
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
        case 4: // '\004'
        case 5: // '\005'
            PlayerBusyLayer.access$100(PlayerBusyLayer.this);
            return;

        case 2: // '\002'
        case 3: // '\003'
            PlayerBusyLayer.access$200(PlayerBusyLayer.this);
            break;
        }
    }

    public void onVideoSizeChanged(int i, int j, int k, float f)
    {
    }

    il()
    {
        this$0 = PlayerBusyLayer.this;
        super();
    }
}
