// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.util.Pair;
import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            RemoteControlContextualMenuController

final class eg
    implements b
{

    private final Analytics a;
    private final RemoteControl b;
    private final WatchFeature c;
    private final aw d;

    private eg(Analytics analytics, RemoteControl remotecontrol, WatchFeature watchfeature, aw aw1)
    {
        a = analytics;
        b = remotecontrol;
        c = watchfeature;
        d = aw1;
    }

    eg(Analytics analytics, RemoteControl remotecontrol, WatchFeature watchfeature, aw aw1, byte byte0)
    {
        this(analytics, remotecontrol, watchfeature, aw1);
    }

    public final void a(Object obj, Exception exception)
    {
        d.a((String)d.b(exception).first);
    }

    public final volatile void a(Object obj, Object obj1)
    {
        obj = (Video)obj1;
        RemoteControlContextualMenuController.a(b, ((Video) (obj)), c, d, a);
    }
}
