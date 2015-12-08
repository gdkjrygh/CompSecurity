// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.WatchFeature;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            eh, dz, ab

final class dy
    implements eh
{

    final WatchFeature a;
    final aw b;
    final Analytics c;

    dy(WatchFeature watchfeature, aw aw, Analytics analytics)
    {
        a = watchfeature;
        b = aw;
        c = analytics;
        super();
    }

    public final ab a(RemoteControl remotecontrol)
    {
        return new dz(this, remotecontrol);
    }
}
