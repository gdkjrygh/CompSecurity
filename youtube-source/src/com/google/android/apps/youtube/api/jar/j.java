// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.youtube.core.player.overlay.ControlsState;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            ApiTvControlsOverlay

final class j extends Handler
{

    final ApiTvControlsOverlay a;

    j(ApiTvControlsOverlay apitvcontrolsoverlay)
    {
        a = apitvcontrolsoverlay;
        super();
    }

    public final void handleMessage(Message message)
    {
        if (ApiTvControlsOverlay.a(a) == ControlsState.PLAYING)
        {
            a.f();
        }
    }
}
