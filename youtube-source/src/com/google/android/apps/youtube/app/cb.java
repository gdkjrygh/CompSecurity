// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.core.client.am;
import com.google.android.apps.youtube.core.client.bt;
import com.google.android.apps.youtube.core.player.config.PlayerLibConfig;

// Referenced classes of package com.google.android.apps.youtube.app:
//            ax

final class cb extends f
{

    final ax a;

    cb(ax ax1)
    {
        a = ax1;
        super();
    }

    public final Object a()
    {
        if (a.h().a() != com.google.android.apps.youtube.core.player.config.PlayerLibConfig.PrecachedAdsLevel.NONE)
        {
            return new am(a.af(), a.aJ(), a.aP());
        } else
        {
            return new bt();
        }
    }
}
