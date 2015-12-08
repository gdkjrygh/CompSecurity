// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bc;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            eh, eb, ab

final class ea
    implements eh
{

    final Activity a;
    final Analytics b;
    final WatchFeature c;
    final aw d;
    final bc e;

    ea(Activity activity, Analytics analytics, WatchFeature watchfeature, aw aw, bc bc)
    {
        a = activity;
        b = analytics;
        c = watchfeature;
        d = aw;
        e = bc;
        super();
    }

    public final ab a(RemoteControl remotecontrol)
    {
        return new eb(this, remotecontrol);
    }
}
